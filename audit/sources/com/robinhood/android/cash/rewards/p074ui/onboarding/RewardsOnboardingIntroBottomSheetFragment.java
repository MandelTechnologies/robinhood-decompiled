package com.robinhood.android.cash.rewards.p074ui.onboarding;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import android.view.View;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.composables.IntroBottomSheetComposable;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RewardsOnboardingIntroBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\r\u0010\u000e\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0011H\u0096\u0001R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RewardsOnboardingIntroBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6(RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment, int i, Composer composer, int i2) {
        rewardsOnboardingIntroBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseBottomSheetDialogFragments.enforceMaxHeight$default(this, view, 0.0f, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-700736279);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-700736279, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroBottomSheetFragment.ComposeContent (RewardsOnboardingIntroBottomSheetFragment.kt:41)");
            }
            Companion companion = INSTANCE;
            String title = ((Args) companion.getArgs((Fragment) this)).getDisclosure().getTitle();
            String string2 = ((Args) companion.getArgs((Fragment) this)).getDisclosure().getContent().toString();
            String strStringResource = StringResources_androidKt.stringResource(C10176R.string.rewards_disclosure_got_it, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroBottomSheetFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsOnboardingIntroBottomSheetFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            String strValueOf = String.valueOf(((Args) companion.getArgs((Fragment) this)).getDisclosure().getButtonText());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroBottomSheetFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RewardsOnboardingIntroBottomSheetFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            IntroBottomSheetComposable.IntroBottomSheetComposable(title, string2, strStringResource, function0, strValueOf, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingIntroBottomSheetFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RewardsOnboardingIntroBottomSheetFragment.ComposeContent$lambda$6(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment) {
        rewardsOnboardingIntroBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment) {
        Object next;
        Iterator it = StringsKt.split$default((CharSequence) String.valueOf(((Args) INSTANCE.getArgs((Fragment) rewardsOnboardingIntroBottomSheetFragment)).getDisclosure().getAdditionalData()), new String[]{"="}, false, 0, 6, (Object) null).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Patterns.WEB_URL.matcher((String) next).find()) {
                break;
            }
        }
        String str = (String) next;
        if (str == null) {
            str = "";
        }
        String strDecode = Uri.decode(str);
        Navigator navigator = rewardsOnboardingIntroBottomSheetFragment.getNavigator();
        Context contextRequireContext = rewardsOnboardingIntroBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Intrinsics.checkNotNull(strDecode);
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, strDecode);
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsOnboardingIntroBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;", "Landroid/os/Parcelable;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent$Disclosure;", "<init>", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent$Disclosure;)V", "getDisclosure", "()Lcom/robinhood/android/cash/rewards/ui/onboarding/content/RewardsOnboardingContent$Disclosure;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RewardsOnboardingContent.Disclosure disclosure;

        /* compiled from: RewardsOnboardingIntroBottomSheetFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(RewardsOnboardingContent.Disclosure.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RewardsOnboardingContent.Disclosure disclosure, int i, Object obj) {
            if ((i & 1) != 0) {
                disclosure = args.disclosure;
            }
            return args.copy(disclosure);
        }

        /* renamed from: component1, reason: from getter */
        public final RewardsOnboardingContent.Disclosure getDisclosure() {
            return this.disclosure;
        }

        public final Args copy(RewardsOnboardingContent.Disclosure disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            return new Args(disclosure);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.disclosure, ((Args) other).disclosure);
        }

        public int hashCode() {
            return this.disclosure.hashCode();
        }

        public String toString() {
            return "Args(disclosure=" + this.disclosure + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.disclosure.writeToParcel(dest, flags);
        }

        public Args(RewardsOnboardingContent.Disclosure disclosure) {
            Intrinsics.checkNotNullParameter(disclosure, "disclosure");
            this.disclosure = disclosure;
        }

        public final RewardsOnboardingContent.Disclosure getDisclosure() {
            return this.disclosure;
        }
    }

    /* compiled from: RewardsOnboardingIntroBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;", "<init>", "()V", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RewardsOnboardingIntroBottomSheetFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, rewardsOnboardingIntroBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RewardsOnboardingIntroBottomSheetFragment newInstance(Args args) {
            return (RewardsOnboardingIntroBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RewardsOnboardingIntroBottomSheetFragment rewardsOnboardingIntroBottomSheetFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, rewardsOnboardingIntroBottomSheetFragment, args);
        }
    }
}
