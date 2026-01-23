package com.robinhood.feature.sweep.onboarding.fragments;

import android.R;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.R$attr;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.lib.sweep.SweepOnboardingEventLogger;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
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

/* compiled from: SweepOnboardingWelcomeFragment.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\r\u0010\u001a\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingWelcomeFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getAnalyticsScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "analyticsScreen$delegate", "Lkotlin/Lazy;", "toolbarOriginalBackgroundTint", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "onBackPressed", "onStart", "", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Args", "Companion", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SweepOnboardingWelcomeFragment extends GenericComposeFragment {
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;
    private ResourceReferences4<?> toolbarOriginalBackgroundTint;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean excludeFromAnalyticsLogging = true;

    /* renamed from: analyticsScreen$delegate, reason: from kotlin metadata */
    private final Lazy analyticsScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SweepOnboardingWelcomeFragment.analyticsScreen_delegate$lambda$0(this.f$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment, int i, Composer composer, int i2) {
        sweepOnboardingWelcomeFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
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

    private final Screen getAnalyticsScreen() {
        return (Screen) this.analyticsScreen.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen analyticsScreen_delegate$lambda$0(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment) {
        if (((Args) INSTANCE.getArgs((Fragment) sweepOnboardingWelcomeFragment)).isWelcomeGold()) {
            return new Screen(Screen.Name.SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD, null, null, null, 14, null);
        }
        return new Screen(Screen.Name.SWEEP_ONBOARDING_CONFIRMATION, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getSweepOnboardingEventLogger().logTap(getAnalyticsScreen(), UserInteractionEventData.Action.BACK);
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        this.toolbarOriginalBackgroundTint = ScarletManager2.getAttribute(rhToolbar, R$attr.backgroundTint);
        RhToolbar rhToolbar2 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar2);
        rhToolbar2.setUseDesignSystemTheme(true);
        RhToolbar rhToolbar3 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar3);
        ScarletManager2.overrideAttribute(rhToolbar3, R.attr.backgroundTint, new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C20690R.color.transparent));
        getSweepOnboardingEventLogger().logScreenAppear(getAnalyticsScreen());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getSweepOnboardingEventLogger().logScreenDisappear(getAnalyticsScreen());
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ScarletManager2.overrideAttribute(rhToolbar, R.attr.backgroundTint, this.toolbarOriginalBackgroundTint);
        super.onStop();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2112555696);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2112555696, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment.ComposeContent (SweepOnboardingWelcomeFragment.kt:75)");
            }
            Companion companion = INSTANCE;
            ApiSweepFlow.SweepWelcome sweepWelcome = ((Args) companion.getArgs((Fragment) this)).getSweepWelcome();
            ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold = ((Args) companion.getArgs((Fragment) this)).getSweepWelcomeGold();
            boolean zIsGold = ((Args) companion.getArgs((Fragment) this)).isGold();
            boolean zIsWelcomeGold = ((Args) companion.getArgs((Fragment) this)).isWelcomeGold();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SweepOnboardingWelcomeFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SweepOnboardingWelcomeFragment.ComposeContent$lambda$4$lambda$3(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SweepOnboardingWelcomeComposable2.SweepOnboardingWelcomeComposable(function0, (Function1) objRememberedValue2, sweepWelcome, sweepWelcomeGold, zIsGold, zIsWelcomeGold, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingWelcomeFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingWelcomeFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment) {
        sweepOnboardingWelcomeFragment.getSweepOnboardingEventLogger().logTap(sweepOnboardingWelcomeFragment.getAnalyticsScreen(), UserInteractionEventData.Action.DONE);
        sweepOnboardingWelcomeFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        sweepOnboardingWelcomeFragment.requireActivity().finish();
        Navigator navigator = sweepOnboardingWelcomeFragment.getNavigator();
        Context contextRequireContext = sweepOnboardingWelcomeFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(url), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: SweepOnboardingWelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingWelcomeFragment$Args;", "Landroid/os/Parcelable;", "sweepWelcome", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;", "sweepWelcomeGold", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;", "isGold", "", "isWelcomeGold", "<init>", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;ZZ)V", "getSweepWelcome", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcome;", "getSweepWelcomeGold", "()Lcom/robinhood/models/api/bonfire/ApiSweepFlow$SweepWelcomeGold;", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isGold;
        private final boolean isWelcomeGold;
        private final ApiSweepFlow.SweepWelcome sweepWelcome;
        private final ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold;

        /* compiled from: SweepOnboardingWelcomeFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiSweepFlow.SweepWelcome) parcel.readParcelable(Args.class.getClassLoader()), (ApiSweepFlow.SweepWelcomeGold) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiSweepFlow.SweepWelcome sweepWelcome, ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                sweepWelcome = args.sweepWelcome;
            }
            if ((i & 2) != 0) {
                sweepWelcomeGold = args.sweepWelcomeGold;
            }
            if ((i & 4) != 0) {
                z = args.isGold;
            }
            if ((i & 8) != 0) {
                z2 = args.isWelcomeGold;
            }
            return args.copy(sweepWelcome, sweepWelcomeGold, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiSweepFlow.SweepWelcome getSweepWelcome() {
            return this.sweepWelcome;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiSweepFlow.SweepWelcomeGold getSweepWelcomeGold() {
            return this.sweepWelcomeGold;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsWelcomeGold() {
            return this.isWelcomeGold;
        }

        public final Args copy(ApiSweepFlow.SweepWelcome sweepWelcome, ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, boolean isGold, boolean isWelcomeGold) {
            Intrinsics.checkNotNullParameter(sweepWelcome, "sweepWelcome");
            Intrinsics.checkNotNullParameter(sweepWelcomeGold, "sweepWelcomeGold");
            return new Args(sweepWelcome, sweepWelcomeGold, isGold, isWelcomeGold);
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
            return Intrinsics.areEqual(this.sweepWelcome, args.sweepWelcome) && Intrinsics.areEqual(this.sweepWelcomeGold, args.sweepWelcomeGold) && this.isGold == args.isGold && this.isWelcomeGold == args.isWelcomeGold;
        }

        public int hashCode() {
            return (((((this.sweepWelcome.hashCode() * 31) + this.sweepWelcomeGold.hashCode()) * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isWelcomeGold);
        }

        public String toString() {
            return "Args(sweepWelcome=" + this.sweepWelcome + ", sweepWelcomeGold=" + this.sweepWelcomeGold + ", isGold=" + this.isGold + ", isWelcomeGold=" + this.isWelcomeGold + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.sweepWelcome, flags);
            dest.writeParcelable(this.sweepWelcomeGold, flags);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.isWelcomeGold ? 1 : 0);
        }

        public Args(ApiSweepFlow.SweepWelcome sweepWelcome, ApiSweepFlow.SweepWelcomeGold sweepWelcomeGold, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(sweepWelcome, "sweepWelcome");
            Intrinsics.checkNotNullParameter(sweepWelcomeGold, "sweepWelcomeGold");
            this.sweepWelcome = sweepWelcome;
            this.sweepWelcomeGold = sweepWelcomeGold;
            this.isGold = z;
            this.isWelcomeGold = z2;
        }

        public final ApiSweepFlow.SweepWelcome getSweepWelcome() {
            return this.sweepWelcome;
        }

        public final ApiSweepFlow.SweepWelcomeGold getSweepWelcomeGold() {
            return this.sweepWelcomeGold;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean isWelcomeGold() {
            return this.isWelcomeGold;
        }
    }

    /* compiled from: SweepOnboardingWelcomeFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingWelcomeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingWelcomeFragment;", "Lcom/robinhood/feature/sweep/onboarding/fragments/SweepOnboardingWelcomeFragment$Args;", "<init>", "()V", "feature-sweep-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SweepOnboardingWelcomeFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sweepOnboardingWelcomeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SweepOnboardingWelcomeFragment newInstance(Args args) {
            return (SweepOnboardingWelcomeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SweepOnboardingWelcomeFragment sweepOnboardingWelcomeFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sweepOnboardingWelcomeFragment, args);
        }
    }
}
