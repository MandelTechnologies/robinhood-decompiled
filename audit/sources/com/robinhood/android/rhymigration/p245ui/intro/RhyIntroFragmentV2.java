package com.robinhood.android.rhymigration.p245ui.intro;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhymigration.model.UiRhyMigration;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdownUpsell;
import com.robinhood.android.rhymigration.p245ui.PageDataCallbacks;
import com.robinhood.android.rhymigration.p245ui.RhyOnboardingLoggingUtils;
import com.robinhood.android.rhymigration.p245ui.intro.RhyIntroFragmentV2;
import com.robinhood.android.rhymigration.p245ui.review.RhyReviewChangesFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: RhyIntroFragmentV2.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003#$%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0015\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\t\u0010\u001c\u001a\u00020\u001dH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "reviewChangesCallbacks", "Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "getReviewChangesCallbacks", "()Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", "reviewChangesCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Callbacks;", "callbacks$delegate", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "valPropIdToIndex", "", "valPropId", "", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RhyIntroFragmentV2 extends GenericComposeFragment implements RegionGated, AutoLoggableFragment {
    private static final String CASH_BACK_PROP_ID = "cash-back";
    public static final String DATE_PLACEHOLDER = "{{ .DATE }}";
    private static final String DIRECT_DEPOSIT_PROP_ID = "direct-deposit";
    private static final String ROUNDUP_PROP_ID = "roundup-rewards";
    private static final String SPLIT_PAYCHECK_PROP_ID = "split-paycheck";
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RhyIntroFragmentV2.class, "reviewChangesCallbacks", "getReviewChangesCallbacks()Lcom/robinhood/android/rhymigration/ui/review/RhyReviewChangesFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(RhyIntroFragmentV2.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: reviewChangesCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 reviewChangesCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(RhyReviewChangesFragment.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RhyReviewChangesFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof RhyIntroFragmentV2.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.RHY_MIGRATION_INTRO_LONG, null, null, null, 14, null);

    /* compiled from: RhyIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Callbacks;", "Lcom/robinhood/android/rhymigration/ui/PageDataCallbacks;", "onOptOutClicked", "", "onValuePropClicked", "valPropModelIndex", "", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends PageDataCallbacks {
        void onOptOutClicked();

        void onValuePropClicked(int valPropModelIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(RhyIntroFragmentV2 rhyIntroFragmentV2, int i, Composer composer, int i2) {
        rhyIntroFragmentV2.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhyReviewChangesFragment.Callbacks getReviewChangesCallbacks() {
        return (RhyReviewChangesFragment.Callbacks) this.reviewChangesCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1590654288);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590654288, i2, -1, "com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2.ComposeContent (RhyIntroFragmentV2.kt:44)");
            }
            UiRhyMigration migrationContent = ((Args) INSTANCE.getArgs((Fragment) this)).getMigrationContent();
            UiRhyMigrationCmShutdownUpsell upsellPage = migrationContent != null ? migrationContent.getUpsellPage() : null;
            if (upsellPage != null) {
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RhyOnboardingLoggingUtils.getEventContext$default(this, (AgreementContext) null, (String) null, 3, (Object) null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1859272094, true, new RhyIntroFragmentV22(upsellPage, this), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.RhyIntroFragmentV2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyIntroFragmentV2.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int valPropIdToIndex(String valPropId) {
        switch (valPropId.hashCode()) {
            case -2141479750:
                return !valPropId.equals(DIRECT_DEPOSIT_PROP_ID) ? 0 : 2;
            case 710259521:
                if (valPropId.equals(CASH_BACK_PROP_ID)) {
                    return 1;
                }
                break;
            case 870359731:
                if (valPropId.equals(SPLIT_PAYCHECK_PROP_ID)) {
                    return 2;
                }
                break;
            case 1948079616:
                valPropId.equals(ROUNDUP_PROP_ID);
                return 0;
        }
    }

    /* compiled from: RhyIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Args;", "Landroid/os/Parcelable;", "migrationContent", "Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "treatmentGroup", "Lcom/robinhood/librobinhood/CmSunsetVariant;", "shutdownDate", "", "migrationBlockReason", "<init>", "(Lcom/robinhood/android/rhymigration/model/UiRhyMigration;Lcom/robinhood/librobinhood/CmSunsetVariant;Ljava/lang/String;Ljava/lang/String;)V", "getMigrationContent", "()Lcom/robinhood/android/rhymigration/model/UiRhyMigration;", "getTreatmentGroup", "()Lcom/robinhood/librobinhood/CmSunsetVariant;", "getShutdownDate", "()Ljava/lang/String;", "getMigrationBlockReason", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String migrationBlockReason;
        private final UiRhyMigration migrationContent;
        private final String shutdownDate;
        private final CmSunsetExperiment4 treatmentGroup;

        /* compiled from: RhyIntroFragmentV2.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readInt() == 0 ? null : UiRhyMigration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CmSunsetExperiment4.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Args copy$default(Args args, UiRhyMigration uiRhyMigration, CmSunsetExperiment4 cmSunsetExperiment4, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                uiRhyMigration = args.migrationContent;
            }
            if ((i & 2) != 0) {
                cmSunsetExperiment4 = args.treatmentGroup;
            }
            if ((i & 4) != 0) {
                str = args.shutdownDate;
            }
            if ((i & 8) != 0) {
                str2 = args.migrationBlockReason;
            }
            return args.copy(uiRhyMigration, cmSunsetExperiment4, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final UiRhyMigration getMigrationContent() {
            return this.migrationContent;
        }

        /* renamed from: component2, reason: from getter */
        public final CmSunsetExperiment4 getTreatmentGroup() {
            return this.treatmentGroup;
        }

        /* renamed from: component3, reason: from getter */
        public final String getShutdownDate() {
            return this.shutdownDate;
        }

        /* renamed from: component4, reason: from getter */
        public final String getMigrationBlockReason() {
            return this.migrationBlockReason;
        }

        public final Args copy(UiRhyMigration migrationContent, CmSunsetExperiment4 treatmentGroup, String shutdownDate, String migrationBlockReason) {
            return new Args(migrationContent, treatmentGroup, shutdownDate, migrationBlockReason);
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
            return Intrinsics.areEqual(this.migrationContent, args.migrationContent) && this.treatmentGroup == args.treatmentGroup && Intrinsics.areEqual(this.shutdownDate, args.shutdownDate) && Intrinsics.areEqual(this.migrationBlockReason, args.migrationBlockReason);
        }

        public int hashCode() {
            UiRhyMigration uiRhyMigration = this.migrationContent;
            int iHashCode = (uiRhyMigration == null ? 0 : uiRhyMigration.hashCode()) * 31;
            CmSunsetExperiment4 cmSunsetExperiment4 = this.treatmentGroup;
            int iHashCode2 = (iHashCode + (cmSunsetExperiment4 == null ? 0 : cmSunsetExperiment4.hashCode())) * 31;
            String str = this.shutdownDate;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.migrationBlockReason;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(migrationContent=" + this.migrationContent + ", treatmentGroup=" + this.treatmentGroup + ", shutdownDate=" + this.shutdownDate + ", migrationBlockReason=" + this.migrationBlockReason + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            UiRhyMigration uiRhyMigration = this.migrationContent;
            if (uiRhyMigration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiRhyMigration.writeToParcel(dest, flags);
            }
            CmSunsetExperiment4 cmSunsetExperiment4 = this.treatmentGroup;
            if (cmSunsetExperiment4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(cmSunsetExperiment4.name());
            }
            dest.writeString(this.shutdownDate);
            dest.writeString(this.migrationBlockReason);
        }

        public Args(UiRhyMigration uiRhyMigration, CmSunsetExperiment4 cmSunsetExperiment4, String str, String str2) {
            this.migrationContent = uiRhyMigration;
            this.treatmentGroup = cmSunsetExperiment4;
            this.shutdownDate = str;
            this.migrationBlockReason = str2;
        }

        public final UiRhyMigration getMigrationContent() {
            return this.migrationContent;
        }

        public /* synthetic */ Args(UiRhyMigration uiRhyMigration, CmSunsetExperiment4 cmSunsetExperiment4, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uiRhyMigration, (i & 2) != 0 ? CmSunsetExperiment4.CONTROL : cmSunsetExperiment4, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        public final CmSunsetExperiment4 getTreatmentGroup() {
            return this.treatmentGroup;
        }

        public final String getShutdownDate() {
            return this.shutdownDate;
        }

        public final String getMigrationBlockReason() {
            return this.migrationBlockReason;
        }
    }

    /* compiled from: RhyIntroFragmentV2.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2;", "Lcom/robinhood/android/rhymigration/ui/intro/RhyIntroFragmentV2$Args;", "<init>", "()V", "DATE_PLACEHOLDER", "", "newInstance", "ROUNDUP_PROP_ID", "CASH_BACK_PROP_ID", "DIRECT_DEPOSIT_PROP_ID", "SPLIT_PAYCHECK_PROP_ID", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RhyIntroFragmentV2, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RhyIntroFragmentV2 rhyIntroFragmentV2) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rhyIntroFragmentV2);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RhyIntroFragmentV2 newInstance(Args args) {
            return (RhyIntroFragmentV2) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RhyIntroFragmentV2 rhyIntroFragmentV2, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rhyIntroFragmentV2, args);
        }

        public final RhyIntroFragmentV2 newInstance() {
            return new RhyIntroFragmentV2();
        }
    }
}
