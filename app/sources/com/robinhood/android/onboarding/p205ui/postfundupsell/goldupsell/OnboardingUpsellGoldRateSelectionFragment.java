package com.robinhood.android.onboarding.p205ui.postfundupsell.goldupsell;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.onboarding.C22739R;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellGoldRateSelectionFragmentContract;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
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
import kotlin.reflect.KProperty;

/* compiled from: OnboardingUpsellGoldRateSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\r\u0010%\u001a\u00020\"H\u0017¢\u0006\u0002\u0010&R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R;\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/goldupsell/OnboardingUpsellGoldRateSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "bottomSheet", "getBottomSheet", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setBottomSheet", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "bottomSheet$delegate", "Landroidx/compose/runtime/MutableState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OnboardingUpsellGoldRateSelectionFragment extends GenericComposeFragment implements AutoLoggableFragment {
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OnboardingUpsellGoldRateSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: bottomSheet$delegate, reason: from kotlin metadata */
    private final SnapshotState bottomSheet = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    private final SduiActionHandler<OnboardingFundingUpsellAction> actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$actionHandler$1

        /* compiled from: OnboardingUpsellGoldRateSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$actionHandler$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                try {
                    iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
        public final boolean mo15941handle(OnboardingFundingUpsellAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if ((action instanceof OnboardingFundingUpsellAction.Skip) || (action instanceof OnboardingFundingUpsellAction.Dismiss)) {
                this.this$0.setBottomSheet(null);
                this.this$0.getCallbacks().onOnboardingUpsellAction(action);
            } else if (!(action instanceof OnboardingFundingUpsellAction.InfoAlert)) {
                this.this$0.getCallbacks().onOnboardingUpsellAction(action);
            } else {
                OnboardingFundingUpsellAction.InfoAlert infoAlert = (OnboardingFundingUpsellAction.InfoAlert) action;
                int i = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.this$0.setBottomSheet(infoAlert.getValue2().getAlert());
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return true;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(OnboardingUpsellGoldRateSelectionFragment onboardingUpsellGoldRateSelectionFragment, int i, Composer composer, int i2) {
        onboardingUpsellGoldRateSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, ((OnboardingUpsellGoldRateSelectionFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getAccountSelection().getScreen_name(), null, 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks getCallbacks() {
        return (OnboardingUpsellGoldRateSelectionFragmentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GenericAlertContent<OnboardingFundingUpsellAction> getBottomSheet() {
        return (GenericAlertContent) this.bottomSheet.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBottomSheet(GenericAlertContent<? extends OnboardingFundingUpsellAction> genericAlertContent) {
        this.bottomSheet.setValue(genericAlertContent);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        OnboardingProgress onboardingProgress = OnboardingProgress.FUND_ACCOUNT_NATIVE_GOLD_UPSELL;
        Companion companion = INSTANCE;
        ToolbarExt2.configureMaxActivity(toolbar, onboardingProgress, ((OnboardingUpsellGoldRateSelectionFragmentContract.Key) companion.getArgs((Fragment) this)).isRhfMaxOnboardingStyle());
        ToolbarExt2.configureMaxFragment(toolbar, onboardingProgress, Integer.valueOf(C22739R.string.post_sign_up_toolbar_title), ((OnboardingUpsellGoldRateSelectionFragmentContract.Key) companion.getArgs((Fragment) this)).isRhfMaxOnboardingStyle());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1863958861);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863958861, i2, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent (OnboardingUpsellGoldRateSelectionFragment.kt:82)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1599563870, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1599563870, i3, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent.<anonymous> (OnboardingUpsellGoldRateSelectionFragment.kt:84)");
                    }
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final OnboardingUpsellGoldRateSelectionFragment onboardingUpsellGoldRateSelectionFragment = OnboardingUpsellGoldRateSelectionFragment.this;
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(1128662564, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i4 & 6) == 0) {
                                i4 |= composer3.changed(paddingValues) ? 4 : 2;
                            }
                            if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1128662564, i4, -1, "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent.<anonymous>.<anonymous> (OnboardingUpsellGoldRateSelectionFragment.kt:87)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                            Companion companion = OnboardingUpsellGoldRateSelectionFragment.INSTANCE;
                            OnboardingUpsellGoldRateSelectionComposable.OnboardingUpsellGoldRateSelectionComposable(((OnboardingUpsellGoldRateSelectionFragmentContract.Key) companion.getArgs((Fragment) onboardingUpsellGoldRateSelectionFragment)).getAccountSelection(), onboardingUpsellGoldRateSelectionFragment.actionHandler, ((OnboardingUpsellGoldRateSelectionFragmentContract.Key) companion.getArgs((Fragment) onboardingUpsellGoldRateSelectionFragment)).isRhfMaxOnboardingStyle(), modifierPadding, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 0, 12582912, 98303);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            GenericAlertContent<OnboardingFundingUpsellAction> bottomSheet = getBottomSheet();
            if (bottomSheet != null) {
                Markwon markwon = getMarkwon();
                SduiActionHandler<OnboardingFundingUpsellAction> sduiActionHandler = this.actionHandler;
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OnboardingUpsellGoldRateSelectionFragment.ComposeContent$lambda$2$lambda$1$lambda$0(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SduiAlertKt.presentSduiAlertSheet(this, markwon, bottomSheet, sduiActionHandler, (1016 & 8) != 0 ? 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0088: INVOKE 
                      (r15v0 'this' com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment A[IMMUTABLE_TYPE, THIS])
                      (r1v4 'markwon' io.noties.markwon.Markwon)
                      (r2v6 'bottomSheet' com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction>)
                      (r3v3 'sduiActionHandler' com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction>)
                      (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                      (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                      (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x0078: CHECK_CAST (kotlin.jvm.functions.Function0) (r5v2 'objRememberedValue' java.lang.Object)))
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : true)
                      (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
                      (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (wrap:com.robinhood.android.common.ui.RhButtonType:0x007d: SGET  A[WRAPPED] (LINE:103) com.robinhood.android.common.ui.RhButtonType.SECONDARY com.robinhood.android.common.ui.RhButtonType))
                     STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent(androidx.compose.runtime.Composer, int):void, file: classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 27 more
                    */
                /*
                    this = this;
                    r13 = r17
                    r1 = 1863958861(0x6f19c14d, float:4.7584893E28)
                    r2 = r16
                    androidx.compose.runtime.Composer r14 = r2.startRestartGroup(r1)
                    r2 = r13 & 6
                    r3 = 2
                    if (r2 != 0) goto L1b
                    boolean r2 = r14.changedInstance(r15)
                    if (r2 == 0) goto L18
                    r2 = 4
                    goto L19
                L18:
                    r2 = r3
                L19:
                    r2 = r2 | r13
                    goto L1c
                L1b:
                    r2 = r13
                L1c:
                    r4 = r2 & 3
                    if (r4 != r3) goto L2b
                    boolean r3 = r14.getSkipping()
                    if (r3 != 0) goto L27
                    goto L2b
                L27:
                    r14.skipToGroupEnd()
                    goto L94
                L2b:
                    boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r3 == 0) goto L37
                    r3 = -1
                    java.lang.String r4 = "com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent (OnboardingUpsellGoldRateSelectionFragment.kt:82)"
                    androidx.compose.runtime.ComposerKt.traceEventStart(r1, r2, r3, r4)
                L37:
                    com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$ComposeContent$1 r1 = new com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$ComposeContent$1
                    r1.<init>()
                    r2 = 54
                    r3 = -1599563870(0xffffffffa0a897a2, float:-2.856065E-19)
                    r4 = 1
                    androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambda3.rememberComposableLambda(r3, r4, r1, r14, r2)
                    r2 = 6
                    com.robinhood.compose.bento.theme.BentoThemeOverlays.AchromaticThemeOverlay(r1, r14, r2)
                    com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r2 = r15.getBottomSheet()
                    if (r2 != 0) goto L51
                    goto L8b
                L51:
                    io.noties.markwon.Markwon r1 = r15.getMarkwon()
                    com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction> r3 = r15.actionHandler
                    r4 = 5004770(0x4c5de2, float:7.013177E-39)
                    r14.startReplaceGroup(r4)
                    boolean r4 = r14.changedInstance(r15)
                    java.lang.Object r5 = r14.rememberedValue()
                    if (r4 != 0) goto L6f
                    androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                    java.lang.Object r4 = r4.getEmpty()
                    if (r5 != r4) goto L77
                L6f:
                    com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$$ExternalSyntheticLambda0 r5 = new com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$$ExternalSyntheticLambda0
                    r5.<init>()
                    r14.updateRememberedValue(r5)
                L77:
                    r6 = r5
                    kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                    r14.endReplaceGroup()
                    com.robinhood.android.common.ui.RhButtonType r10 = com.robinhood.android.common.p088ui.RhButtonType.SECONDARY
                    r11 = 344(0x158, float:4.82E-43)
                    r12 = 0
                    r4 = 0
                    r5 = 0
                    r7 = 0
                    r8 = 1
                    r9 = 0
                    r0 = r15
                    com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                L8b:
                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    if (r1 == 0) goto L94
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                L94:
                    androidx.compose.runtime.ScopeUpdateScope r1 = r14.endRestartGroup()
                    if (r1 == 0) goto La2
                    com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$$ExternalSyntheticLambda1 r2 = new com.robinhood.android.onboarding.ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment$$ExternalSyntheticLambda1
                    r2.<init>()
                    r1.updateScope(r2)
                La2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.goldupsell.OnboardingUpsellGoldRateSelectionFragment.ComposeContent(androidx.compose.runtime.Composer, int):void");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit ComposeContent$lambda$2$lambda$1$lambda$0(OnboardingUpsellGoldRateSelectionFragment onboardingUpsellGoldRateSelectionFragment) {
                onboardingUpsellGoldRateSelectionFragment.setBottomSheet(null);
                return Unit.INSTANCE;
            }

            /* compiled from: OnboardingUpsellGoldRateSelectionFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/goldupsell/OnboardingUpsellGoldRateSelectionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/goldupsell/OnboardingUpsellGoldRateSelectionFragment;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellGoldRateSelectionFragmentContract$Key;", "<init>", "()V", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements FragmentResolverWithArgsCompanion<OnboardingUpsellGoldRateSelectionFragment, OnboardingUpsellGoldRateSelectionFragmentContract.Key> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
                public Fragment createFragment(OnboardingUpsellGoldRateSelectionFragmentContract.Key key) {
                    return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
                public OnboardingUpsellGoldRateSelectionFragmentContract.Key getArgs(OnboardingUpsellGoldRateSelectionFragment onboardingUpsellGoldRateSelectionFragment) {
                    return (OnboardingUpsellGoldRateSelectionFragmentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, onboardingUpsellGoldRateSelectionFragment);
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
                public OnboardingUpsellGoldRateSelectionFragment newInstance(OnboardingUpsellGoldRateSelectionFragmentContract.Key key) {
                    return (OnboardingUpsellGoldRateSelectionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
                }

                @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
                public void setArgs(OnboardingUpsellGoldRateSelectionFragment onboardingUpsellGoldRateSelectionFragment, OnboardingUpsellGoldRateSelectionFragmentContract.Key key) {
                    FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, onboardingUpsellGoldRateSelectionFragment, key);
                }
            }
        }
