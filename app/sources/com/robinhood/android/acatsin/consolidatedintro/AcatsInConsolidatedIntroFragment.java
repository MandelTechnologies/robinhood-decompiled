package com.robinhood.android.acatsin.consolidatedintro;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroContract;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment4;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.resource.StringResource;
import com.singular.sdk.internal.Constants;
import java.util.NoSuchElementException;
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

/* compiled from: AcatsInConsolidatedIntroFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepGenericActionHandlingFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInConsolidatedIntroFragment extends AcatsFlowStepFragment4 implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInConsolidatedIntroFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AcatsInConsolidatedIntroFragment acatsInConsolidatedIntroFragment, int i, Composer composer, int i2) {
        acatsInConsolidatedIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AcatsInConsolidatedIntroFragment() {
        super(null, AcatsFlowStep.INTRO_CONSOLIDATED, 1, null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInConsolidatedIntroContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInConsolidatedIntroContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_INTRO, ((AcatsInConsolidatedIntroContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().getSource(), Constants.SdidMigrationStatusCodes.MISSING_PARAMS, null, 8, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInConsolidatedIntroContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInConsolidatedIntroContract.Callbacks getCallbacks() {
        return (AcatsInConsolidatedIntroContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-711342835);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-711342835, i2, -1, "com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent (AcatsInConsolidatedIntroFragment.kt:38)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, getScreenEventContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(578882178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(578882178, i3, -1, "com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent.<anonymous> (AcatsInConsolidatedIntroFragment.kt:45)");
                    }
                    final AcatsInConsolidatedIntroFragment acatsInConsolidatedIntroFragment = AcatsInConsolidatedIntroFragment.this;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1206247539, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1206247539, i4, -1, "com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent.<anonymous>.<anonymous> (AcatsInConsolidatedIntroFragment.kt:46)");
                            }
                            AcatsInConsolidatedIntroViewState acatsInConsolidatedIntroViewState = new AcatsInConsolidatedIntroViewState(null, null, null, null, 15, null);
                            final AcatsInConsolidatedIntroFragment acatsInConsolidatedIntroFragment2 = acatsInConsolidatedIntroFragment;
                            AcatsInConsolidatedIntro2.AcatsInConsolidatedIntro(acatsInConsolidatedIntroViewState, new AcatsInConsolidatedIntro() { // from class: com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment.ComposeContent.1.1.1
                                @Override // com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntro
                                public void onBottomButtonClick() {
                                    acatsInConsolidatedIntroFragment2.getCallbacks().onForwardFromIntroConsolidated();
                                }
                            }, null, composer3, StringResource.$stable, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.consolidatedintro.AcatsInConsolidatedIntroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInConsolidatedIntroFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onBackFromIntroConsolidated();
        return false;
    }

    /* compiled from: AcatsInConsolidatedIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroFragment;", "Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInConsolidatedIntroFragment, AcatsInConsolidatedIntroContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInConsolidatedIntroContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInConsolidatedIntroContract.Key getArgs(AcatsInConsolidatedIntroFragment acatsInConsolidatedIntroFragment) {
            return (AcatsInConsolidatedIntroContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInConsolidatedIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInConsolidatedIntroFragment newInstance(AcatsInConsolidatedIntroContract.Key key) {
            return (AcatsInConsolidatedIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInConsolidatedIntroFragment acatsInConsolidatedIntroFragment, AcatsInConsolidatedIntroContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInConsolidatedIntroFragment, key);
        }
    }
}
