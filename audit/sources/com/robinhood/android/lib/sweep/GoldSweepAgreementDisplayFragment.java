package com.robinhood.android.lib.sweep;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.gold.ToolbarExt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: GoldSweepAgreementDisplayFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "sweepOnboardingEventLogger", "Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "getSweepOnboardingEventLogger", "()Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;", "setSweepOnboardingEventLogger", "(Lcom/robinhood/android/lib/sweep/SweepOnboardingEventLogger;)V", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "closeAgreementPage", "onStart", "onStop", "Args", "Companion", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GoldSweepAgreementDisplayFragment extends GenericComposeFragment {
    private final boolean excludeFromAnalyticsLogging = true;
    public SweepOnboardingEventLogger sweepOnboardingEventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(GoldSweepAgreementDisplayFragment goldSweepAgreementDisplayFragment, int i, Composer composer, int i2) {
        goldSweepAgreementDisplayFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ApiGoldAgreementsProgressBar titleProgressBar = ((Args) INSTANCE.getArgs((Fragment) this)).getTitleProgressBar();
        if (titleProgressBar != null) {
            ToolbarExt.configureToolbarWithSegmentProgress$default(toolbar, titleProgressBar.getProgressBarSegmentIdx(), titleProgressBar.getProgressBarSegmentProgress(), titleProgressBar.getTitle(), false, 8, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654694770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654694770, i2, -1, "com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment.ComposeContent (GoldSweepAgreementDisplayFragment.kt:36)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new GoldSweepAgreementDisplayFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(fragmentActivityRequireActivity);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new GoldSweepAgreementDisplayFragment3(fragmentActivityRequireActivity);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            GoldSweepAgreementDisplayComposable.GoldSweepAgreementDisplayComposable(function0, (Function0) ((KFunction) objRememberedValue2), null, null, getRhToolbar(), composerStartRestartGroup, RhToolbar.$stable << 12, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSweepAgreementDisplayFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeAgreementPage() {
        Fragment parentFragment = getParentFragment();
        BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        if (baseFragment != null ? baseFragment.onBackPressed() : false) {
            return;
        }
        requireActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Screen analyticsScreen = ((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsScreen();
        if (analyticsScreen != null) {
            getSweepOnboardingEventLogger().logScreenAppear(analyticsScreen);
        }
        ScarletManager scarletManager = getScarletManager();
        int priority = AchromaticOverlay.INSTANCE.getPriority();
        Boolean bool = Boolean.FALSE;
        scarletManager.removeOverlay(priority, bool);
        getScarletManager().putOverlay(GoldOverlay.INSTANCE, bool);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        ScarletManager scarletManager = getScarletManager();
        int priority = GoldOverlay.INSTANCE.getPriority();
        Boolean bool = Boolean.FALSE;
        scarletManager.removeOverlay(priority, bool);
        getScarletManager().putOverlay(AchromaticOverlay.INSTANCE, bool);
        Screen analyticsScreen = ((Args) INSTANCE.getArgs((Fragment) this)).getAnalyticsScreen();
        if (analyticsScreen != null) {
            getSweepOnboardingEventLogger().logScreenDisappear(analyticsScreen);
        }
        super.onStop();
    }

    /* compiled from: GoldSweepAgreementDisplayFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayFragment$Args;", "Landroid/os/Parcelable;", "agreementType", "", "agreementTitle", "analyticsScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "titleProgressBar", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;)V", "getAgreementType", "()Ljava/lang/String;", "getAgreementTitle", "getAnalyticsScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getTitleProgressBar", "()Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldAgreementsProgressBar;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String agreementTitle;
        private final String agreementType;
        private final Screen analyticsScreen;
        private final ApiGoldAgreementsProgressBar titleProgressBar;

        /* compiled from: GoldSweepAgreementDisplayFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(parcel.readString(), parcel.readString(), (Screen) parcel.readSerializable(), (ApiGoldAgreementsProgressBar) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, String str2, Screen screen, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.agreementType;
            }
            if ((i & 2) != 0) {
                str2 = args.agreementTitle;
            }
            if ((i & 4) != 0) {
                screen = args.analyticsScreen;
            }
            if ((i & 8) != 0) {
                apiGoldAgreementsProgressBar = args.titleProgressBar;
            }
            return args.copy(str, str2, screen, apiGoldAgreementsProgressBar);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAgreementTitle() {
            return this.agreementTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final Screen getAnalyticsScreen() {
            return this.analyticsScreen;
        }

        /* renamed from: component4, reason: from getter */
        public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
            return this.titleProgressBar;
        }

        public final Args copy(String agreementType, String agreementTitle, Screen analyticsScreen, ApiGoldAgreementsProgressBar titleProgressBar) {
            Intrinsics.checkNotNullParameter(agreementType, "agreementType");
            Intrinsics.checkNotNullParameter(agreementTitle, "agreementTitle");
            return new Args(agreementType, agreementTitle, analyticsScreen, titleProgressBar);
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
            return Intrinsics.areEqual(this.agreementType, args.agreementType) && Intrinsics.areEqual(this.agreementTitle, args.agreementTitle) && Intrinsics.areEqual(this.analyticsScreen, args.analyticsScreen) && Intrinsics.areEqual(this.titleProgressBar, args.titleProgressBar);
        }

        public int hashCode() {
            int iHashCode = ((this.agreementType.hashCode() * 31) + this.agreementTitle.hashCode()) * 31;
            Screen screen = this.analyticsScreen;
            int iHashCode2 = (iHashCode + (screen == null ? 0 : screen.hashCode())) * 31;
            ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar = this.titleProgressBar;
            return iHashCode2 + (apiGoldAgreementsProgressBar != null ? apiGoldAgreementsProgressBar.hashCode() : 0);
        }

        public String toString() {
            return "Args(agreementType=" + this.agreementType + ", agreementTitle=" + this.agreementTitle + ", analyticsScreen=" + this.analyticsScreen + ", titleProgressBar=" + this.titleProgressBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.agreementType);
            dest.writeString(this.agreementTitle);
            dest.writeSerializable(this.analyticsScreen);
            dest.writeParcelable(this.titleProgressBar, flags);
        }

        public Args(String agreementType, String agreementTitle, Screen screen, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar) {
            Intrinsics.checkNotNullParameter(agreementType, "agreementType");
            Intrinsics.checkNotNullParameter(agreementTitle, "agreementTitle");
            this.agreementType = agreementType;
            this.agreementTitle = agreementTitle;
            this.analyticsScreen = screen;
            this.titleProgressBar = apiGoldAgreementsProgressBar;
        }

        public /* synthetic */ Args(String str, String str2, Screen screen, ApiGoldAgreementsProgressBar apiGoldAgreementsProgressBar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, screen, (i & 8) != 0 ? null : apiGoldAgreementsProgressBar);
        }

        public final String getAgreementType() {
            return this.agreementType;
        }

        public final String getAgreementTitle() {
            return this.agreementTitle;
        }

        public final Screen getAnalyticsScreen() {
            return this.analyticsScreen;
        }

        public final ApiGoldAgreementsProgressBar getTitleProgressBar() {
            return this.titleProgressBar;
        }
    }

    /* compiled from: GoldSweepAgreementDisplayFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayFragment;", "Lcom/robinhood/android/lib/sweep/GoldSweepAgreementDisplayFragment$Args;", "<init>", "()V", "feature-lib-sweep_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldSweepAgreementDisplayFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(GoldSweepAgreementDisplayFragment goldSweepAgreementDisplayFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldSweepAgreementDisplayFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldSweepAgreementDisplayFragment newInstance(Args args) {
            return (GoldSweepAgreementDisplayFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldSweepAgreementDisplayFragment goldSweepAgreementDisplayFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldSweepAgreementDisplayFragment, args);
        }
    }
}
