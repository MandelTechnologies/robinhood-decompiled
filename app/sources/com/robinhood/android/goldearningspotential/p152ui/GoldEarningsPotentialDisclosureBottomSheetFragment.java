package com.robinhood.android.goldearningspotential.p152ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import com.robinhood.android.goldearningspotential.p152ui.GoldEarningsPotentialDisclosureBottomSheetFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldEarningsPotentialDisclosureBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\t\u001a\u00020\nH\u0017¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/ui/GoldEarningsPotentialDisclosureBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldEarningsPotentialDisclosureBottomSheetFragment extends GenericComposeBottomSheetDialogFragment implements AutoLoggableFragment {
    public static final String GOLD_EARNINGS_POTENTIAL_BOTTOM_SHEET_IDENTIFIER = "gold_earnings_in_first_deposit_bottom_sheet";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeBottomSheetDialogFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldEarningsPotentialDisclosureBottomSheetFragment goldEarningsPotentialDisclosureBottomSheetFragment, int i, Composer composer, int i2) {
        goldEarningsPotentialDisclosureBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, "gold_earnings_in_first_deposit_bottom_sheet_fragment", null, 11, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1498287602);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498287602, i2, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetFragment.ComposeContent (GoldEarningsPotentialDisclosureBottomSheetFragment.kt:26)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "gold_earnings_potential_calculator_disclosure", null, 4, null), null, 45, null), ComposableLambda3.rememberComposableLambda(-478064519, true, new C183231(), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldEarningsPotentialDisclosureBottomSheetFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldEarningsPotentialDisclosureBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetFragment$ComposeContent$1 */
    static final class C183231 implements Function2<Composer, Integer, Unit> {
        C183231() {
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
                ComposerKt.traceEventStart(-478064519, i, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetFragment.ComposeContent.<anonymous> (GoldEarningsPotentialDisclosureBottomSheetFragment.kt:36)");
            }
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null);
            GoldEarningsCalculatorAlertContentUiModel alert = ((GoldEarningsPotentialDisclosureBottomSheetKey) GoldEarningsPotentialDisclosureBottomSheetFragment.INSTANCE.getArgs((Fragment) GoldEarningsPotentialDisclosureBottomSheetFragment.this)).getAlert();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(GoldEarningsPotentialDisclosureBottomSheetFragment.this);
            final GoldEarningsPotentialDisclosureBottomSheetFragment goldEarningsPotentialDisclosureBottomSheetFragment = GoldEarningsPotentialDisclosureBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldEarningsPotentialDisclosureBottomSheetFragment.C183231.invoke$lambda$1$lambda$0(goldEarningsPotentialDisclosureBottomSheetFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldEarningsPotentialDisclosureBottomSheetComposable.GoldEarningsPotentialDisclosureBottomSheet(alert, (Function0) objRememberedValue, modifierAutoLogEvents$default, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GoldEarningsPotentialDisclosureBottomSheetFragment goldEarningsPotentialDisclosureBottomSheetFragment) {
            goldEarningsPotentialDisclosureBottomSheetFragment.dismiss();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GoldEarningsPotentialDisclosureBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/ui/GoldEarningsPotentialDisclosureBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/goldearningspotential/ui/GoldEarningsPotentialDisclosureBottomSheetFragment;", "Lcom/robinhood/android/goldearningspotential/ui/GoldEarningsPotentialDisclosureBottomSheetKey;", "<init>", "()V", "GOLD_EARNINGS_POTENTIAL_BOTTOM_SHEET_IDENTIFIER", "", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<GoldEarningsPotentialDisclosureBottomSheetFragment, GoldEarningsPotentialDisclosureBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public GoldEarningsPotentialDisclosureBottomSheetFragment createDialogFragment(GoldEarningsPotentialDisclosureBottomSheetKey goldEarningsPotentialDisclosureBottomSheetKey) {
            return (GoldEarningsPotentialDisclosureBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, goldEarningsPotentialDisclosureBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public GoldEarningsPotentialDisclosureBottomSheetKey getArgs(GoldEarningsPotentialDisclosureBottomSheetFragment goldEarningsPotentialDisclosureBottomSheetFragment) {
            return (GoldEarningsPotentialDisclosureBottomSheetKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, goldEarningsPotentialDisclosureBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldEarningsPotentialDisclosureBottomSheetFragment newInstance(GoldEarningsPotentialDisclosureBottomSheetKey goldEarningsPotentialDisclosureBottomSheetKey) {
            return (GoldEarningsPotentialDisclosureBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, goldEarningsPotentialDisclosureBottomSheetKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldEarningsPotentialDisclosureBottomSheetFragment goldEarningsPotentialDisclosureBottomSheetFragment, GoldEarningsPotentialDisclosureBottomSheetKey goldEarningsPotentialDisclosureBottomSheetKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, goldEarningsPotentialDisclosureBottomSheetFragment, goldEarningsPotentialDisclosureBottomSheetKey);
        }
    }
}
