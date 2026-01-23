package com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.extensions.BaseFragments2;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferInfoSheet;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ReferralOfferInfoSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\r\u0010\b\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/infoSheet/ReferralOfferInfoSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "onStop", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ReferralOfferInfoSheetFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment, int i, Composer composer, int i2) {
        referralOfferInfoSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(375499776);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(375499776, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment.ComposeContent (ReferralOfferInfoSheetFragment.kt:27)");
            }
            SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1).setStatusBarDarkContentEnabled(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay());
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(463468430, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment.ComposeContent.1

                /* compiled from: ReferralOfferInfoSheetFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ReferralOfferInfoSheetFragment this$0;

                    AnonymousClass1(ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment) {
                        this.this$0 = referralOfferInfoSheetFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(213429347, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment.ComposeContent.<anonymous>.<anonymous> (ReferralOfferInfoSheetFragment.kt:32)");
                        }
                        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        DisplayMetrics displayMetrics = Activity.getDisplayMetrics(fragmentActivityRequireActivity);
                        ReferralOfferInfoSheet referralOfferInfoSheet = (ReferralOfferInfoSheet) ReferralOfferInfoSheetFragment.INSTANCE.getArgs((Fragment) this.this$0);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferInfoSheetFragment.C268921.AnonymousClass1.invoke$lambda$1$lambda$0(referralOfferInfoSheetFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        ReferralInfoSheetComposable.ReferralInfoSheetComposable(displayMetrics, referralOfferInfoSheet, (Function0) objRememberedValue, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment) {
                        FragmentActivity activity = referralOfferInfoSheetFragment.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(463468430, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment.ComposeContent.<anonymous> (ReferralOfferInfoSheetFragment.kt:31)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(213429347, true, new AnonymousClass1(ReferralOfferInfoSheetFragment.this), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferInfoSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        BaseFragments2.setFullScreenWithSystemUiFlags(this);
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.infoSheet.ReferralOfferInfoSheetFragment.onStart.1
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    ViewsKt.setMarginTop(v, insets.getSystemWindowInsetTop());
                    return insets.consumeSystemWindowInsets();
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        requireActivity().getWindow().getDecorView().setSystemUiVisibility(0);
        super.onStop();
    }

    /* compiled from: ReferralOfferInfoSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/infoSheet/ReferralOfferInfoSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/infoSheet/ReferralOfferInfoSheetFragment;", "Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReferralOfferInfoSheetFragment, ReferralOfferInfoSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReferralOfferInfoSheet getArgs(ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment) {
            return (ReferralOfferInfoSheet) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, referralOfferInfoSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReferralOfferInfoSheetFragment newInstance(ReferralOfferInfoSheet referralOfferInfoSheet) {
            return (ReferralOfferInfoSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, referralOfferInfoSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReferralOfferInfoSheetFragment referralOfferInfoSheetFragment, ReferralOfferInfoSheet referralOfferInfoSheet) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, referralOfferInfoSheetFragment, referralOfferInfoSheet);
        }
    }
}
