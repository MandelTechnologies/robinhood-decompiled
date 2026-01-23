package com.robinhood.android.investorprofile.p162ui.questionnaire.completed;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: QuestionnaireCompletedFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\r\u0010\u001a\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001cR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedCallbacks;", "getCallbacks", "()Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "onBackPressed", "", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class QuestionnaireCompletedFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(QuestionnaireCompletedCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    private final Screen eventScreen = new Screen(Screen.Name.INVESTOR_PROFILE_COMPLETE, null, null, null, 14, null);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionnaireCompletedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(QuestionnaireCompletedFragment questionnaireCompletedFragment, int i, Composer composer, int i2) {
        questionnaireCompletedFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final QuestionnaireCompletedCallbacks getCallbacks() {
        return (QuestionnaireCompletedCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final Context getEventContext() {
        return QuestionnaireLoggingInfo.toEventContext$default((QuestionnaireLoggingInfo) INSTANCE.getArgs((Fragment) this), null, 1, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, getEventContext(), null, null, 109, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onQuestionnaireFlowCompleted();
        return true;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1357658216);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1357658216, i2, -1, "com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment.ComposeContent (QuestionnaireCompletedFragment.kt:36)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-504216752, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-504216752, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment.ComposeContent.<anonymous> (QuestionnaireCompletedFragment.kt:38)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    QuestionnaireCompletedCallbacks callbacks = QuestionnaireCompletedFragment.this.getCallbacks();
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(callbacks);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new QuestionnaireCompletedFragment2(callbacks);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    QuestionnaireCompletedScreen3.QuestionnaireCompletedScreen(modifierFillMaxSize$default, (Function0) ((KFunction) objRememberedValue), composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.completed.QuestionnaireCompletedFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireCompletedFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: QuestionnaireCompletedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/completed/QuestionnaireCompletedFragment;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<QuestionnaireCompletedFragment, QuestionnaireLoggingInfo> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public QuestionnaireLoggingInfo getArgs(QuestionnaireCompletedFragment questionnaireCompletedFragment) {
            return (QuestionnaireLoggingInfo) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, questionnaireCompletedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public QuestionnaireCompletedFragment newInstance(QuestionnaireLoggingInfo questionnaireLoggingInfo) {
            return (QuestionnaireCompletedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, questionnaireLoggingInfo);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(QuestionnaireCompletedFragment questionnaireCompletedFragment, QuestionnaireLoggingInfo questionnaireLoggingInfo) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, questionnaireCompletedFragment, questionnaireLoggingInfo);
        }
    }
}
