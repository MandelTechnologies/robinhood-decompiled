package com.robinhood.android.margin.upgrade.agreements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.agreements.models.ApiAgreement;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment6;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementState3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.util.Money;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* compiled from: MarginUpgradeAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\n26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\r2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001a\u001a\b\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\b\u0010\u001d\u001a\u00020\u0011H\u0002\u001a\b\u0010\u001e\u001a\u00020\u001fH\u0002¨\u0006 "}, m3636d2 = {"MarginUpgradeAgreementScreen", "", "state", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "isGold", "", "isUk", "callbacks", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "onToggleFirstCheckbox", "Lkotlin/Function1;", "onToggleSecondCheckbox", "enableMarginInvesting", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isJointAccount", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "agreement", "Lkotlinx/coroutines/Job;", "onError", "", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "(Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;ZZLcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;Landroidx/compose/runtime/Composer;I)V", "PreviewMarginUpgradeAgreementScreen", "(Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;Landroidx/compose/runtime/Composer;I)V", "loremIpsum", "", "mockAgreement", "mockIndividualAgreementLoadedState", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState$IndividualAgreementLoaded;", "feature-margin-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarginUpgradeAgreementFragment6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeAgreementScreen$lambda$4(MarginUpgradeAgreementState3 marginUpgradeAgreementState3, boolean z, boolean z2, MarginUpgradeCallbacks marginUpgradeCallbacks, Function1 function1, Function1 function12, Function2 function2, Function1 function13, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, Composer composer, int i2) {
        MarginUpgradeAgreementScreen(marginUpgradeAgreementState3, z, z2, marginUpgradeCallbacks, function1, function12, function2, function13, marginEligibilityChecklistViewState4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarginUpgradeAgreementScreen$lambda$5(MarginUpgradeAgreementState3 marginUpgradeAgreementState3, int i, Composer composer, int i2) {
        PreviewMarginUpgradeAgreementScreen(marginUpgradeAgreementState3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MarginUpgradeAgreementScreen(final MarginUpgradeAgreementState3 marginUpgradeAgreementState3, boolean z, boolean z2, final MarginUpgradeCallbacks marginUpgradeCallbacks, final Function1<? super Boolean, Unit> function1, final Function1<? super Boolean, Unit> function12, final Function2<? super Boolean, ? super UiAgreementWithContent, ? extends Job> function2, final Function1<? super Throwable, Unit> function13, final MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, Composer composer, final int i) {
        int i2;
        final boolean z3;
        boolean z4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1629969054);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(marginUpgradeAgreementState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(marginUpgradeCallbacks) : composerStartRestartGroup.changedInstance(marginUpgradeCallbacks) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? composerStartRestartGroup.changed(marginEligibilityChecklistViewState4) : composerStartRestartGroup.changedInstance(marginEligibilityChecklistViewState4) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1629969054, i2, -1, "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementScreen (MarginUpgradeAgreementFragment.kt:93)");
            }
            if (marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.IndividualAgreementLoaded) {
                composerStartRestartGroup.startReplaceGroup(492688453);
                MarginUpgradeAgreementState3.IndividualAgreementLoaded individualAgreementLoaded = (MarginUpgradeAgreementState3.IndividualAgreementLoaded) marginUpgradeAgreementState3;
                String markdown = individualAgreementLoaded.getMarkdown();
                int disclaimerStringRes = individualAgreementLoaded.getDisclaimerStringRes();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z5 = ((i2 & 3670016) == 1048576) | ((i2 & 14) == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeAgreementFragment6.MarginUpgradeAgreementScreen$lambda$1$lambda$0(function2, marginUpgradeAgreementState3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                MarginUpgradeIndividualAgreementComposable.MarginUpgradeIndividualAgreementComposable(markdown, z, z2, disclaimerStringRes, (Function0) objRememberedValue, null, composerStartRestartGroup, i2 & 1008, 32);
                composerStartRestartGroup.endReplaceGroup();
                z3 = z;
                z4 = z2;
            } else if (marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.JointAccountAgreementLoaded) {
                composerStartRestartGroup.startReplaceGroup(493045511);
                MarginUpgradeAgreementState3.JointAccountAgreementLoaded jointAccountAgreementLoaded = (MarginUpgradeAgreementState3.JointAccountAgreementLoaded) marginUpgradeAgreementState3;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z6 = ((i2 & 3670016) == 1048576) | ((i2 & 14) == 4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeAgreementFragment6.MarginUpgradeAgreementScreen$lambda$3$lambda$2(function2, marginUpgradeAgreementState3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                int i3 = i2 >> 6;
                z4 = z2;
                MarginUpgradeJointAccountAgreementComposable.MarginUpgradeJointAccountAgreementComposable(jointAccountAgreementLoaded, z, function1, function12, function0, null, composerStartRestartGroup, (i2 & 112) | (i3 & 896) | (i3 & 7168), 32);
                z3 = z;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z3 = z;
                z4 = z2;
                if (marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.Loading) {
                    composerStartRestartGroup.startReplaceGroup(1262842503);
                    LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(1167722514, true, new C211503(z3, z4), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.UpgradeSuccess) {
                    composerStartRestartGroup.startReplaceGroup(1262855080);
                    composerStartRestartGroup.endReplaceGroup();
                    MarginUpgradeAgreementState3.UpgradeSuccess upgradeSuccess = (MarginUpgradeAgreementState3.UpgradeSuccess) marginUpgradeAgreementState3;
                    marginUpgradeCallbacks.onMarginUpgradeSuccess(upgradeSuccess.getNewBuyingPower(), marginEligibilityChecklistViewState4, upgradeSuccess.getDisplayName());
                } else if (marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.UpgradeError) {
                    composerStartRestartGroup.startReplaceGroup(1262862609);
                    composerStartRestartGroup.endReplaceGroup();
                    MarginUpgradeAgreementState3.UpgradeError upgradeError = (MarginUpgradeAgreementState3.UpgradeError) marginUpgradeAgreementState3;
                    marginUpgradeCallbacks.onMarginUpgradeError(upgradeError.getResult(), upgradeError.getErrorReason());
                } else {
                    if (!(marginUpgradeAgreementState3 instanceof MarginUpgradeAgreementState3.GenericError)) {
                        composerStartRestartGroup.startReplaceGroup(1262817750);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1262868026);
                    composerStartRestartGroup.endReplaceGroup();
                    function13.invoke(((MarginUpgradeAgreementState3.GenericError) marginUpgradeAgreementState3).getThrowable());
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z;
            z4 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z7 = z4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeAgreementFragment6.MarginUpgradeAgreementScreen$lambda$4(marginUpgradeAgreementState3, z3, z7, marginUpgradeCallbacks, function1, function12, function2, function13, marginEligibilityChecklistViewState4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeAgreementScreen$lambda$1$lambda$0(Function2 function2, MarginUpgradeAgreementState3 marginUpgradeAgreementState3) {
        function2.invoke(Boolean.FALSE, ((MarginUpgradeAgreementState3.IndividualAgreementLoaded) marginUpgradeAgreementState3).getAgreement());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeAgreementScreen$lambda$3$lambda$2(Function2 function2, MarginUpgradeAgreementState3 marginUpgradeAgreementState3) {
        function2.invoke(Boolean.TRUE, ((MarginUpgradeAgreementState3.JointAccountAgreementLoaded) marginUpgradeAgreementState3).getAgreement());
        return Unit.INSTANCE;
    }

    /* compiled from: MarginUpgradeAgreementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$MarginUpgradeAgreementScreen$3 */
    static final class C211503 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $isGold;
        final /* synthetic */ boolean $isUk;

        C211503(boolean z, boolean z2) {
            this.$isGold = z;
            this.$isUk = z2;
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
                ComposerKt.traceEventStart(1167722514, i, -1, "com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementScreen.<anonymous> (MarginUpgradeAgreementFragment.kt:112)");
            }
            String strLoremIpsum = MarginUpgradeAgreementFragment6.loremIpsum();
            boolean z = this.$isGold;
            boolean z2 = this.$isUk;
            int i2 = C11048R.string.general_action_learn_more;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$MarginUpgradeAgreementScreen$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            MarginUpgradeIndividualAgreementComposable.MarginUpgradeIndividualAgreementComposable(strLoremIpsum, z, z2, i2, (Function0) objRememberedValue, null, composer, 24576, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: MarginUpgradeAgreementFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$PreviewMarginUpgradeAgreementScreen$1 */
    static final class C211511 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MarginUpgradeAgreementState3 $state;

        C211511(MarginUpgradeAgreementState3 marginUpgradeAgreementState3) {
            this.$state = marginUpgradeAgreementState3;
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
                ComposerKt.traceEventStart(-796211545, i, -1, "com.robinhood.android.margin.upgrade.agreements.PreviewMarginUpgradeAgreementScreen.<anonymous> (MarginUpgradeAgreementFragment.kt:142)");
            }
            MarginUpgradeAgreementState3 marginUpgradeAgreementState3 = this.$state;
            MarginUpgradeCallbacks marginUpgradeCallbacks = new MarginUpgradeCallbacks() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt.PreviewMarginUpgradeAgreementScreen.1.1
                @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
                public void onMarginUpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    Intrinsics.checkNotNullParameter(errorReason, "errorReason");
                }

                @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
                public void onMarginUpgradeSuccess(Money newBuyingPower, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName) {
                    Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
                    Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
                    Intrinsics.checkNotNullParameter(displayName, "displayName");
                }
            };
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$PreviewMarginUpgradeAgreementScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeAgreementFragment6.C211511.invoke$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$PreviewMarginUpgradeAgreementScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeAgreementFragment6.C211511.invoke$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function2() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$PreviewMarginUpgradeAgreementScreen$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarginUpgradeAgreementFragment6.C211511.invoke$lambda$5$lambda$4(((Boolean) obj).booleanValue(), (UiAgreementWithContent) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function2 function2 = (Function2) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$PreviewMarginUpgradeAgreementScreen$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarginUpgradeAgreementFragment6.C211511.invoke$lambda$7$lambda$6((Throwable) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            MarginUpgradeAgreementFragment6.MarginUpgradeAgreementScreen(marginUpgradeAgreementState3, false, false, marginUpgradeCallbacks, function1, function12, function2, (Function1) objRememberedValue4, MarginEligibilityChecklistViewState4.Default.INSTANCE, composer, (MarginEligibilityChecklistViewState4.Default.$stable << 24) | 14377392);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Job invoke$lambda$5$lambda$4(boolean z, UiAgreementWithContent uiAgreementWithContent) {
            Intrinsics.checkNotNullParameter(uiAgreementWithContent, "<unused var>");
            return CompletableDeferred3.CompletableDeferred(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewMarginUpgradeAgreementScreen(final MarginUpgradeAgreementState3 marginUpgradeAgreementState3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(928038127);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(marginUpgradeAgreementState3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(928038127, i2, -1, "com.robinhood.android.margin.upgrade.agreements.PreviewMarginUpgradeAgreementScreen (MarginUpgradeAgreementFragment.kt:140)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-796211545, true, new C211511(marginUpgradeAgreementState3), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeAgreementFragment6.PreviewMarginUpgradeAgreementScreen$lambda$5(marginUpgradeAgreementState3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String loremIpsum() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, 100), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, new Function1() { // from class: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragmentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarginUpgradeAgreementFragment6.loremIpsum$lambda$6(((Integer) obj).intValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence loremIpsum$lambda$6(int i) {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiAgreementWithContent mockAgreement() {
        return new UiAgreementWithContent(new ApiAgreement(new UUID(0L, 0L), HttpUrl.INSTANCE.get("https://127.0.0.1")), loremIpsum());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarginUpgradeAgreementState3.IndividualAgreementLoaded mockIndividualAgreementLoadedState() {
        return new MarginUpgradeAgreementState3.IndividualAgreementLoaded(loremIpsum(), mockAgreement(), C11048R.string.general_action_learn_more);
    }
}
