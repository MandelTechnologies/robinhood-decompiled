package com.robinhood.android.individualaccounts.onboarding.funding;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingBottomSheetDialogFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndividualAccountFundingBottomSheetDialogFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment, int i, Composer composer, int i2) {
        individualAccountFundingBottomSheetDialogFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-163743836);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163743836, i2, -1, "com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment.ComposeContent (IndividualAccountFundingBottomSheetDialogFragment.kt:47)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1745349319, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1745349319, i3, -1, "com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment.ComposeContent.<anonymous> (IndividualAccountFundingBottomSheetDialogFragment.kt:52)");
                    }
                    Screen screen = new Screen(null, null, "individual_self_directed", null, 11, null);
                    String source = ((IndividualAccountFundingBottomSheetKey) IndividualAccountFundingBottomSheetDialogFragment.INSTANCE.getArgs((Fragment) IndividualAccountFundingBottomSheetDialogFragment.this)).getSource();
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, source != null ? new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(-1318292754, true, new AnonymousClass2(IndividualAccountFundingBottomSheetDialogFragment.this, navigator, context), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ IndividualAccountFundingBottomSheetDialogFragment this$0;

                    AnonymousClass2(IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment, Navigator navigator, Context context) {
                        this.this$0 = individualAccountFundingBottomSheetDialogFragment;
                        this.$navigator = navigator;
                        this.$context = context;
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
                            ComposerKt.traceEventStart(-1318292754, i, -1, "com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment.ComposeContent.<anonymous>.<anonymous> (IndividualAccountFundingBottomSheetDialogFragment.kt:64)");
                        }
                        Companion companion = IndividualAccountFundingBottomSheetDialogFragment.INSTANCE;
                        String accountNumber = ((IndividualAccountFundingBottomSheetKey) companion.getArgs((Fragment) this.this$0)).getAccountNumber();
                        String source = ((IndividualAccountFundingBottomSheetKey) companion.getArgs((Fragment) this.this$0)).getSource();
                        IndividualAccountFundingBottomSheetKey2 type2 = ((IndividualAccountFundingBottomSheetKey) companion.getArgs((Fragment) this.this$0)).getType();
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.this$0);
                        Navigator navigator = this.$navigator;
                        Context context = this.$context;
                        IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new IndividualAccountFundingBottomSheetDialogFragment5(navigator, context, individualAccountFundingBottomSheetDialogFragment, null);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function2 function2 = (Function2) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IndividualAccountFundingBottomSheetDialogFragment.C189081.AnonymousClass2.invoke$lambda$2$lambda$1(individualAccountFundingBottomSheetDialogFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent(accountNumber, source, type2, function2, (Function0) objRememberedValue2, null, composer, 0, 32);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment) {
                        individualAccountFundingBottomSheetDialogFragment.dismiss();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndividualAccountFundingBottomSheetDialogFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingBottomSheetDialogFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingBottomSheetDialogFragment;", "Lcom/robinhood/android/individualaccounts/onboarding/funding/IndividualAccountFundingBottomSheetKey;", "<init>", "()V", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<IndividualAccountFundingBottomSheetDialogFragment, IndividualAccountFundingBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public IndividualAccountFundingBottomSheetDialogFragment createDialogFragment(IndividualAccountFundingBottomSheetKey individualAccountFundingBottomSheetKey) {
            return (IndividualAccountFundingBottomSheetDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, individualAccountFundingBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IndividualAccountFundingBottomSheetKey getArgs(IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment) {
            return (IndividualAccountFundingBottomSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, individualAccountFundingBottomSheetDialogFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndividualAccountFundingBottomSheetDialogFragment newInstance(IndividualAccountFundingBottomSheetKey individualAccountFundingBottomSheetKey) {
            return (IndividualAccountFundingBottomSheetDialogFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, individualAccountFundingBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndividualAccountFundingBottomSheetDialogFragment individualAccountFundingBottomSheetDialogFragment, IndividualAccountFundingBottomSheetKey individualAccountFundingBottomSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, individualAccountFundingBottomSheetDialogFragment, individualAccountFundingBottomSheetKey);
        }
    }
}
