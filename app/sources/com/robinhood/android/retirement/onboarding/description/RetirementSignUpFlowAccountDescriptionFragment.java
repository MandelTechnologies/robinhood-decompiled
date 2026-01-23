package com.robinhood.android.retirement.onboarding.description;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.viewinterop.AndroidViewBinding;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.daynight.NightModeManager;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionConfig;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.onboarding.RetirementOnboardingOverlays;
import com.robinhood.android.retirement.onboarding.RetirementOnboardingOverlays2;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStep;
import com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment;
import com.robinhood.android.retirement.onboarding.UtilsKt;
import com.robinhood.android.retirement.onboarding.databinding.IncludeComparisonInlineDefinitionBinding;
import com.robinhood.android.retirement.onboarding.description.AccountDescriptionViewState;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0003VWXB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u0002022\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000202H\u0016J\b\u0010;\u001a\u000202H\u0016J\r\u0010<\u001a\u000202H\u0017¢\u0006\u0002\u0010=J\u001f\u0010>\u001a\u0002022\b\b\u0002\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0003¢\u0006\u0002\u0010CJ\u001f\u0010D\u001a\u0002022\b\b\u0002\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020EH\u0003¢\u0006\u0002\u0010FJ;\u0010G\u001a\u0002022\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0012\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020M0L0\u00162\u0006\u0010N\u001a\u00020OH\u0003¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020T2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020IH\u0003¢\u0006\u0002\u0010UR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u0010.¨\u0006Y²\u0006\n\u0010A\u001a\u00020BX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStepComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "nightModeManager", "Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "getNightModeManager", "()Lcom/robinhood/android/common/ui/daynight/NightModeManager;", "setNightModeManager", "(Lcom/robinhood/android/common/ui/daynight/NightModeManager;)V", "step", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "getStep", "()Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "steps", "", "getSteps", "()Ljava/util/List;", "hideProgressBar", "", "getHideProgressBar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getScreenEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpAccountDescriptionDuxo;", "getDuxo", "()Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpAccountDescriptionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onStop", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "AccountDescription", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState;Landroidx/compose/runtime/Composer;II)V", "AccountDescriptionScreen", "Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/retirement/onboarding/description/AccountDescriptionViewState$Loaded;Landroidx/compose/runtime/Composer;II)V", "Header", "title", "", "subtitle", "learnMore", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "bgColor", "Landroidx/compose/ui/graphics/Color;", "Header-Bx497Mc", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLandroidx/compose/runtime/Composer;I)V", "ValueProp", "pictogram", "Lcom/robinhood/models/serverdriven/experimental/api/Pictogram;", "(Lcom/robinhood/models/serverdriven/experimental/api/Pictogram;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Callbacks", "Args", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowAccountDescriptionFragment extends RetirementSignUpStepComposeFragment implements AutoLoggableFragment {
    public NightModeManager nightModeManager;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RetirementSignUpFlowAccountDescriptionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final RetirementSignUpStep step = RetirementSignUpStep.ACCOUNT_DESCRIPTION;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, RetirementSignUpAccountDescriptionDuxo.class);

    /* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Callbacks;", "", "onConfirmAccountDescription", "", "showAccountComparison", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onConfirmAccountDescription();

        void showAccountComparison();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDescription$lambda$4(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, Modifier modifier, AccountDescriptionViewState accountDescriptionViewState, int i, int i2, Composer composer, int i3) {
        retirementSignUpFlowAccountDescriptionFragment.AccountDescription(modifier, accountDescriptionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDescriptionScreen$lambda$10(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, Modifier modifier, AccountDescriptionViewState.Loaded loaded, int i, int i2, Composer composer, int i3) {
        retirementSignUpFlowAccountDescriptionFragment.AccountDescriptionScreen(modifier, loaded, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, int i, Composer composer, int i2) {
        retirementSignUpFlowAccountDescriptionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header_Bx497Mc$lambda$11(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, String str, String str2, List list, long j, int i, Composer composer, int i2) {
        retirementSignUpFlowAccountDescriptionFragment.m18169HeaderBx497Mc(str, str2, list, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ValueProp$lambda$17(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, Pictogram pictogram, String str, String str2, int i, Composer composer, int i2) {
        retirementSignUpFlowAccountDescriptionFragment.ValueProp(pictogram, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public static final AccountDescriptionViewState ComposeContent$lambda$1(SnapshotState4<? extends AccountDescriptionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    public final NightModeManager getNightModeManager() {
        NightModeManager nightModeManager = this.nightModeManager;
        if (nightModeManager != null) {
            return nightModeManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("nightModeManager");
        return null;
    }

    public final void setNightModeManager(NightModeManager nightModeManager) {
        Intrinsics.checkNotNullParameter(nightModeManager, "<set-?>");
        this.nightModeManager = nightModeManager;
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public RetirementSignUpStep getStep() {
        return this.step;
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public List<RetirementSignUpStep> getSteps() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getSteps();
    }

    @Override // com.robinhood.android.retirement.onboarding.RetirementSignUpStepComposeFragment
    public boolean getHideProgressBar() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getHideProgressBar();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.RETIREMENT_ACCOUNT_DESCRIPTION, null, ((Args) INSTANCE.getArgs((Fragment) this)).getLoggingIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return new UserInteractionEventData(null, getEventScreen(), null, null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 109, null);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final RetirementSignUpAccountDescriptionDuxo getDuxo() {
        return (RetirementSignUpAccountDescriptionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getUserLeapManager().track(TrackingEvent.SAW_RET_ACCOUNT_DESCRIPTION_SCREEN);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        ScarletOverlay scarletOverlay;
        super.onStart();
        ScarletManager scarletManager = getScarletManager();
        if (((Args) INSTANCE.getArgs((Fragment) this)).getAccountType() == BrokerageAccountType.IRA_ROTH) {
            scarletOverlay = RetirementOnboardingOverlays.INSTANCE;
        } else {
            scarletOverlay = RetirementOnboardingOverlays2.INSTANCE;
        }
        scarletManager.putOverlay(scarletOverlay, Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        int priority;
        super.onStop();
        ScarletManager scarletManager = getScarletManager();
        if (((Args) INSTANCE.getArgs((Fragment) this)).getAccountType() == BrokerageAccountType.IRA_ROTH) {
            priority = RetirementOnboardingOverlays.INSTANCE.getPriority();
        } else {
            priority = RetirementOnboardingOverlays2.INSTANCE.getPriority();
        }
        ScarletManager.removeOverlay$default(scarletManager, priority, null, 2, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(215091605);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(215091605, i2, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.ComposeContent (RetirementSignUpFlowAccountDescriptionFragment.kt:147)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1816941206, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1816941206, i3, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.ComposeContent.<anonymous> (RetirementSignUpFlowAccountDescriptionFragment.kt:150)");
                    }
                    RetirementSignUpFlowAccountDescriptionFragment.this.AccountDescription(null, RetirementSignUpFlowAccountDescriptionFragment.ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle), composer2, 0, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountDescriptionFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AccountDescription(Modifier modifier, final AccountDescriptionViewState accountDescriptionViewState, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-900697259);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(accountDescriptionViewState) : composerStartRestartGroup.changedInstance(accountDescriptionViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900697259, i3, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescription (RetirementSignUpFlowAccountDescriptionFragment.kt:158)");
            }
            if (accountDescriptionViewState instanceof AccountDescriptionViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(2013335017);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-997877427, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescription.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-997877427, i5, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescription.<anonymous> (RetirementSignUpFlowAccountDescriptionFragment.kt:161)");
                        }
                        RetirementSignUpFlowAccountDescriptionFragment.this.AccountDescriptionScreen(modifier3, AccountDescriptionViewState.INSTANCE.getLoadingMock(), composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (accountDescriptionViewState instanceof AccountDescriptionViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(2013343734);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, RetirementLastKnownEntryPointManager.INSTANCE.getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(1927400585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescription.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1927400585, i5, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescription.<anonymous> (RetirementSignUpFlowAccountDescriptionFragment.kt:173)");
                        }
                        RetirementSignUpFlowAccountDescriptionFragment.this.AccountDescriptionScreen(modifier3, (AccountDescriptionViewState.Loaded) accountDescriptionViewState, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(accountDescriptionViewState instanceof AccountDescriptionViewState.Failure)) {
                    composerStartRestartGroup.startReplaceGroup(2013333521);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(2013357598);
                RetirementSignUpAccountDescriptionDuxo duxo = getDuxo();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new RetirementSignUpFlowAccountDescriptionFragment2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                ErrorScreenComposable.ErrorScreenComposable(modifier2, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composerStartRestartGroup, i3 & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            modifier2 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier4 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountDescriptionFragment.AccountDescription$lambda$4(this.f$0, modifier4, accountDescriptionViewState, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AccountDescriptionScreen(Modifier modifier, final AccountDescriptionViewState.Loaded loaded, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        AccountDescriptionViewState.Loaded loaded2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(493565389);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            loaded2 = loaded;
        } else {
            loaded2 = loaded;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(loaded2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(493565389, i5, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.AccountDescriptionScreen (RetirementSignUpFlowAccountDescriptionFragment.kt:190)");
            }
            ApiRetirementSignUpFlow.AccountDescriptionViewModel viewModel = loaded2.getViewModel();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i6 = BentoTheme.$stable;
            Modifier modifier5 = modifier4;
            Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(Background3.m4872backgroundbw27NRU$default(modifier4, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            m18169HeaderBx497Mc(viewModel.getTitle(), viewModel.getSubtitle(), CollectionsKt.listOf(viewModel.getLearn_more_component()), UtilsKt.getUpsellColor(loaded2.getAccountType(), composerStartRestartGroup, 0), composerStartRestartGroup, (i5 << 6) & 57344);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            composerStartRestartGroup.startReplaceGroup(-1655220864);
            for (ApiRetirementSignUpFlow.AccountDescriptionValueProp accountDescriptionValueProp : viewModel.getValue_props()) {
                ValueProp(accountDescriptionValueProp.getPictogram(), accountDescriptionValueProp.getTitle(), accountDescriptionValueProp.getSubtitle_markdown(), composerStartRestartGroup, (i5 << 3) & 7168);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            String disclosure = loaded.getDisclosure();
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            TextStyle textS = bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextS();
            long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(disclosure, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 0, 0, 8120);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RetirementSignUpFlowAccountDescriptionFragment.AccountDescriptionScreen$lambda$9$lambda$8$lambda$7(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountDescriptionFragment.AccountDescriptionScreen$lambda$10(this.f$0, modifier3, loaded, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountDescriptionScreen$lambda$9$lambda$8$lambda$7(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment) {
        retirementSignUpFlowAccountDescriptionFragment.getCallbacks().onConfirmAccountDescription();
        return Unit.INSTANCE;
    }

    /* renamed from: Header-Bx497Mc, reason: not valid java name */
    private final void m18169HeaderBx497Mc(final String str, final String str2, final List<? extends UIComponent<? extends GenericAction>> list, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1730781638);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1730781638, i2, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.Header (RetirementSignUpFlowAccountDescriptionFragment.kt:269)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composerStartRestartGroup, i3).getJet(), bentoTheme.getColors(composerStartRestartGroup, i3).getJet(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-915395176, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$Header$1
                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-915395176, i4, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.Header.<anonymous> (RetirementSignUpFlowAccountDescriptionFragment.kt:275)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composer3, i5).m21595getXsmallD9Ej5fM());
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), j, null, 2, null), 0.0f, bentoTheme2.getSpacing(composer3, i5).m21591getLargeD9Ej5fM(), 1, null);
                    String str3 = str;
                    String str4 = str2;
                    List<UIComponent<GenericAction>> list2 = list;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment = this;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i5).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(str4, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16380);
                    ImmutableList3 persistentList = extensions2.toPersistentList(list2);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer3.changedInstance(coroutineScope2) | composer3.changedInstance(retirementSignUpFlowAccountDescriptionFragment);
                    Object objRememberedValue2 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$Header$1$1$1$1

                            /* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$Header$1$1$1$1$1", m3645f = "RetirementSignUpFlowAccountDescriptionFragment.kt", m3646l = {EnumC7081g.f2774x74902ae0}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$Header$1$1$1$1$1 */
                            static final class C270911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ GenericAction $action;
                                int label;
                                final /* synthetic */ RetirementSignUpFlowAccountDescriptionFragment this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C270911(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, GenericAction genericAction, Continuation<? super C270911> continuation) {
                                    super(2, continuation);
                                    this.this$0 = retirementSignUpFlowAccountDescriptionFragment;
                                    this.$action = genericAction;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C270911(this.this$0, this.$action, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C270911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        Navigator navigator = this.this$0.getNavigator();
                                        android.content.Context contextRequireContext = this.this$0.requireContext();
                                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                        Uri uri = Uri.parse(((GenericAction.Deeplink) this.$action).getValue2().getUri());
                                        this.label = 1;
                                        if (Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, uri, false, false, null, this, 28, null) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(GenericAction action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                if (!(action instanceof GenericAction.Deeplink)) {
                                    return true;
                                }
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C270911(retirementSignUpFlowAccountDescriptionFragment, action, null), 3, null);
                                return true;
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierAutoLogEvents$default, null, (SduiActionHandler) objRememberedValue2, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composer3, 100663296, 0);
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 805306368, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountDescriptionFragment.Header_Bx497Mc$lambda$11(this.f$0, str, str2, list, j, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void ValueProp(final Pictogram pictogram, final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(851684110);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pictogram.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851684110, i2, -1, "com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment.ValueProp (RetirementSignUpFlowAccountDescriptionFragment.kt:332)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical top = companion.getTop();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), top, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(pictogram.getServerValue());
            if (serverToBentoAssetMapper3FromServerValue == null) {
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
            }
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(serverToBentoAssetMapper3FromServerValue.getResourceId(), null, false, null, null, null, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, ((i2 >> 3) & 14) | 24576, 0, 16366);
            composerStartRestartGroup = composerStartRestartGroup;
            final Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(str2, composerStartRestartGroup, (i2 >> 6) & 14);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(spannedRememberMarkdown);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function3() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return RetirementSignUpFlowAccountDescriptionFragment.ValueProp$lambda$16$lambda$15$lambda$14$lambda$13(spannedRememberMarkdown, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidViewBinding.AndroidViewBinding((Function3) objRememberedValue, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.description.RetirementSignUpFlowAccountDescriptionFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowAccountDescriptionFragment.ValueProp$lambda$17(this.f$0, pictogram, str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncludeComparisonInlineDefinitionBinding ValueProp$lambda$16$lambda$15$lambda$14$lambda$13(Spanned spanned, LayoutInflater inflater, ViewGroup parent, boolean z) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        IncludeComparisonInlineDefinitionBinding includeComparisonInlineDefinitionBindingInflate = IncludeComparisonInlineDefinitionBinding.inflate(inflater, parent, z);
        Intrinsics.checkNotNullExpressionValue(includeComparisonInlineDefinitionBindingInflate, "inflate(...)");
        RdsInlineDefinitionTextView root = includeComparisonInlineDefinitionBindingInflate.getRoot();
        root.setSpannableString(new SpannableString(spanned));
        root.setConfig(new RdsInlineDefinitionConfig(null, false, null, 5, null));
        return includeComparisonInlineDefinitionBindingInflate;
    }

    /* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Args;", "Landroid/os/Parcelable;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "loggingIdentifier", "", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "hideProgressBar", "", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Ljava/util/List;Z)V", "getAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getLoggingIdentifier", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "getHideProgressBar", "()Z", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BrokerageAccountType accountType;
        private final boolean hideProgressBar;
        private final String loggingIdentifier;
        private final List<RetirementSignUpStep> steps;

        /* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                BrokerageAccountType brokerageAccountTypeValueOf = BrokerageAccountType.valueOf(parcel.readString());
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(RetirementSignUpStep.valueOf(parcel.readString()));
                }
                return new Args(brokerageAccountTypeValueOf, string2, arrayList, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, BrokerageAccountType brokerageAccountType, String str, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                brokerageAccountType = args.accountType;
            }
            if ((i & 2) != 0) {
                str = args.loggingIdentifier;
            }
            if ((i & 4) != 0) {
                list = args.steps;
            }
            if ((i & 8) != 0) {
                z = args.hideProgressBar;
            }
            return args.copy(brokerageAccountType, str, list, z);
        }

        /* renamed from: component1, reason: from getter */
        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final List<RetirementSignUpStep> component3() {
            return this.steps;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }

        public final Args copy(BrokerageAccountType accountType, String loggingIdentifier, List<? extends RetirementSignUpStep> steps, boolean hideProgressBar) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(steps, "steps");
            return new Args(accountType, loggingIdentifier, steps, hideProgressBar);
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
            return this.accountType == args.accountType && Intrinsics.areEqual(this.loggingIdentifier, args.loggingIdentifier) && Intrinsics.areEqual(this.steps, args.steps) && this.hideProgressBar == args.hideProgressBar;
        }

        public int hashCode() {
            return (((((this.accountType.hashCode() * 31) + this.loggingIdentifier.hashCode()) * 31) + this.steps.hashCode()) * 31) + Boolean.hashCode(this.hideProgressBar);
        }

        public String toString() {
            return "Args(accountType=" + this.accountType + ", loggingIdentifier=" + this.loggingIdentifier + ", steps=" + this.steps + ", hideProgressBar=" + this.hideProgressBar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountType.name());
            dest.writeString(this.loggingIdentifier);
            List<RetirementSignUpStep> list = this.steps;
            dest.writeInt(list.size());
            Iterator<RetirementSignUpStep> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.hideProgressBar ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(BrokerageAccountType accountType, String loggingIdentifier, List<? extends RetirementSignUpStep> steps, boolean z) {
            Intrinsics.checkNotNullParameter(accountType, "accountType");
            Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
            Intrinsics.checkNotNullParameter(steps, "steps");
            this.accountType = accountType;
            this.loggingIdentifier = loggingIdentifier;
            this.steps = steps;
            this.hideProgressBar = z;
        }

        public /* synthetic */ Args(BrokerageAccountType brokerageAccountType, String str, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(brokerageAccountType, str, list, (i & 8) != 0 ? false : z);
        }

        public final BrokerageAccountType getAccountType() {
            return this.accountType;
        }

        public final String getLoggingIdentifier() {
            return this.loggingIdentifier;
        }

        public final List<RetirementSignUpStep> getSteps() {
            return this.steps;
        }

        public final boolean getHideProgressBar() {
            return this.hideProgressBar;
        }
    }

    /* compiled from: RetirementSignUpFlowAccountDescriptionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment;", "Lcom/robinhood/android/retirement/onboarding/description/RetirementSignUpFlowAccountDescriptionFragment$Args;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<RetirementSignUpFlowAccountDescriptionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, retirementSignUpFlowAccountDescriptionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RetirementSignUpFlowAccountDescriptionFragment newInstance(Args args) {
            return (RetirementSignUpFlowAccountDescriptionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RetirementSignUpFlowAccountDescriptionFragment retirementSignUpFlowAccountDescriptionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, retirementSignUpFlowAccountDescriptionFragment, args);
        }
    }
}
