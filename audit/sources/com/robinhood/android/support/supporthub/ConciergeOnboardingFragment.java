package com.robinhood.android.support.supporthub;

import android.R;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.support.supporthub.ConciergeOnboardingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.shared.support.contracts.ConciergeOnboardingFragmentKey;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeOnboardingFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;", "getDuxo", "()Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ConciergeOnboardingFragment extends GenericComposeFragment implements AutoLoggableFragment {
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;
    private final Screen eventScreen = new Screen(Screen.Name.CX_CONCIERGE_ONBOARDING, null, null, null, 14, null);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ConciergeOnboardingDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ConciergeOnboardingFragment conciergeOnboardingFragment, int i, Composer composer, int i2) {
        conciergeOnboardingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConciergeOnboardingDuxo getDuxo() {
        return (ConciergeOnboardingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScarletManager.overrideActivityAttribute$default(ScarletManager2.getScarletManager(requireToolbar()), R.attr.windowBackground, new DirectResourceReference(ResourceType.COLOR.INSTANCE, C20690R.color.mobius_jet), null, 4, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1598200592);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1598200592, i2, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingFragment.ComposeContent (ConciergeOnboardingFragment.kt:46)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(458773211, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(458773211, i3, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingFragment.ComposeContent.<anonymous> (ConciergeOnboardingFragment.kt:52)");
                    }
                    BentoColor bentoColor = BentoColor.INSTANCE;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoColor.m21166getDayBg0d7_KjU(), bentoColor.m21305getNightFg0d7_KjU(), bentoColor.m21208getDayFg30d7_KjU(), bentoColor.m21306getNightFg20d7_KjU(), bentoColor.m21220getDayJet0d7_KjU(), bentoColor.m21260getNightBg20d7_KjU(), bentoColor.m21261getNightBg30d7_KjU(), 0L, 0L, ComposableLambda3.rememberComposableLambda(432113709, true, new AnonymousClass1(ConciergeOnboardingFragment.this), composer2, 54), composer2, 805306368, 384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: ConciergeOnboardingFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ConciergeOnboardingFragment this$0;

                    AnonymousClass1(ConciergeOnboardingFragment conciergeOnboardingFragment) {
                        this.this$0 = conciergeOnboardingFragment;
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
                            ComposerKt.traceEventStart(432113709, i, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingFragment.ComposeContent.<anonymous>.<anonymous> (ConciergeOnboardingFragment.kt:61)");
                        }
                        ConciergeOnboardingDuxo duxo = this.this$0.getDuxo();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final ConciergeOnboardingFragment conciergeOnboardingFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConciergeOnboardingFragment.C290541.AnonymousClass1.invoke$lambda$1$lambda$0(conciergeOnboardingFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final ConciergeOnboardingFragment conciergeOnboardingFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ConciergeOnboardingFragment.C290541.AnonymousClass1.invoke$lambda$3$lambda$2(conciergeOnboardingFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        ConciergeOnboardingComposableKt.ConciergeOnboardingComposable(duxo, function0, (Function0) objRememberedValue2, null, composer, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(ConciergeOnboardingFragment conciergeOnboardingFragment) {
                        if (conciergeOnboardingFragment.getDuxo().handleBackward()) {
                            return Unit.INSTANCE;
                        }
                        conciergeOnboardingFragment.requireActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(ConciergeOnboardingFragment conciergeOnboardingFragment) {
                        conciergeOnboardingFragment.requireActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ConciergeOnboardingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingFragment;", "Lcom/robinhood/shared/support/contracts/ConciergeOnboardingFragmentKey;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ConciergeOnboardingFragment, ConciergeOnboardingFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ConciergeOnboardingFragmentKey conciergeOnboardingFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, conciergeOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ConciergeOnboardingFragmentKey getArgs(ConciergeOnboardingFragment conciergeOnboardingFragment) {
            return (ConciergeOnboardingFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, conciergeOnboardingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ConciergeOnboardingFragment newInstance(ConciergeOnboardingFragmentKey conciergeOnboardingFragmentKey) {
            return (ConciergeOnboardingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, conciergeOnboardingFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ConciergeOnboardingFragment conciergeOnboardingFragment, ConciergeOnboardingFragmentKey conciergeOnboardingFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, conciergeOnboardingFragment, conciergeOnboardingFragmentKey);
        }
    }
}
