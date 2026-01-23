package com.robinhood.android.cash.rewards.p074ui.onboarding.composables;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.FabPosition;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.android.cash.rewards.p074ui.onboarding.OnboardingStep;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroBottomSheetFragment;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroFragmentV2;
import com.robinhood.android.cash.rewards.p074ui.onboarding.RewardsOnboardingIntroViewState;
import com.robinhood.android.cash.rewards.p074ui.onboarding.composables.RoundupOnboardingIntroComposable;
import com.robinhood.android.cash.rewards.p074ui.onboarding.content.RewardsOnboardingContent;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RoundupOnboardingIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"RoundupOnboardingIntroComposable", "", "brokerageAccountState", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;", "callbacks", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;", "disclosureClickAction", "Lkotlin/Function1;", "", "args", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Args;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "steps", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/OnboardingStep;", "launchBottomSheet", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroBottomSheetFragment$Args;", "(Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroViewState$BrokerageAccountState;Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$RewardsOnboardingV2Callbacks;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingIntroFragmentV2$Args;Landroidx/fragment/app/FragmentManager;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OnboardingSteps", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-cash-rewards_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RoundupOnboardingIntroComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingSteps$lambda$3(ImmutableList immutableList, Function1 function1, int i, Composer composer, int i2) {
        OnboardingSteps(immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RoundupOnboardingIntroComposable$lambda$0(RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState, RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks rewardsOnboardingV2Callbacks, Function1 function1, RewardsOnboardingIntroFragmentV2.Args args, FragmentManager fragmentManager, ImmutableList immutableList, Function1 function12, int i, Composer composer, int i2) {
        RoundupOnboardingIntroComposable(brokerageAccountState, rewardsOnboardingV2Callbacks, function1, args, fragmentManager, immutableList, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void RoundupOnboardingIntroComposable(final RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState, final RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks callbacks, final Function1<? super String, Unit> disclosureClickAction, final RewardsOnboardingIntroFragmentV2.Args args, final FragmentManager fragmentManager, final ImmutableList<OnboardingStep> steps, final Function1<? super RewardsOnboardingIntroBottomSheetFragment.Args, Unit> launchBottomSheet, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(brokerageAccountState, "brokerageAccountState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(disclosureClickAction, "disclosureClickAction");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(launchBottomSheet, "launchBottomSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(-265236019);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(brokerageAccountState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(disclosureClickAction) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(args) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fragmentManager) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(steps) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(launchBottomSheet) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-265236019, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposable (RoundupOnboardingIntroComposable.kt:47)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), null, null, null, null, ComposableLambda3.rememberComposableLambda(364872341, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt.RoundupOnboardingIntroComposable.1

                /* compiled from: RoundupOnboardingIntroComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$RoundupOnboardingIntroComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ RewardsOnboardingIntroViewState.BrokerageAccountState $brokerageAccountState;
                    final /* synthetic */ RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks $callbacks;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ FragmentManager $fragmentManager;

                    /* compiled from: RoundupOnboardingIntroComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$RoundupOnboardingIntroComposable$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[RewardsOnboardingIntroViewState.BrokerageAccountState.values().length];
                            try {
                                iArr[RewardsOnboardingIntroViewState.BrokerageAccountState.HAS_ACCOUNT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[RewardsOnboardingIntroViewState.BrokerageAccountState.HAS_APPLICATION.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[RewardsOnboardingIntroViewState.BrokerageAccountState.NO_ACCOUNT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    AnonymousClass1(Context context, RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState, RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks rewardsOnboardingV2Callbacks, FragmentManager fragmentManager) {
                        this.$context = context;
                        this.$brokerageAccountState = brokerageAccountState;
                        this.$callbacks = rewardsOnboardingV2Callbacks;
                        this.$fragmentManager = fragmentManager;
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
                            ComposerKt.traceEventStart(1623986464, i, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposable.<anonymous>.<anonymous> (RoundupOnboardingIntroComposable.kt:54)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String string2 = this.$context.getString(C10176R.string.rewards_intro_bottom_button);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$brokerageAccountState.ordinal()) | composer.changedInstance(this.$callbacks) | composer.changedInstance(this.$context) | composer.changedInstance(this.$fragmentManager);
                        final RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState = this.$brokerageAccountState;
                        final RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks rewardsOnboardingV2Callbacks = this.$callbacks;
                        final Context context = this.$context;
                        final FragmentManager fragmentManager = this.$fragmentManager;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$RoundupOnboardingIntroComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RoundupOnboardingIntroComposable.C102481.AnonymousClass1.invoke$lambda$1$lambda$0(brokerageAccountState, rewardsOnboardingV2Callbacks, context, fragmentManager);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, string2, modifierM5146paddingqDBjuR0$default, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(RewardsOnboardingIntroViewState.BrokerageAccountState brokerageAccountState, RewardsOnboardingIntroFragmentV2.RewardsOnboardingV2Callbacks rewardsOnboardingV2Callbacks, Context context, FragmentManager fragmentManager) {
                        int i = WhenMappings.$EnumSwitchMapping$0[brokerageAccountState.ordinal()];
                        if (i == 1) {
                            rewardsOnboardingV2Callbacks.onIntroComplete(false);
                        } else if (i == 2) {
                            RhDialogFragment.Builder.show$default(new RhDialogFragment.Builder(context).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setId(C10176R.id.dialog_id_rewards_onboarding_intro_application).setTitle(C10176R.string.rewards_onboarding_application_pending, new Object[0]).setMessage(C10176R.string.rewards_onboarding_application_review_message, new Object[0]).setPositiveButton(C11048R.string.general_label_ok, new Object[0]), fragmentManager, "pending_brokerage_application", false, 4, null);
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            rewardsOnboardingV2Callbacks.onIntroComplete(true);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(364872341, i3, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposable.<anonymous> (RoundupOnboardingIntroComposable.kt:53)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1623986464, true, new AnonymousClass1(context, brokerageAccountState, callbacks, fragmentManager), composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), FabPosition.INSTANCE.m5594getCenter5ygKITE(), false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-1977969269, true, new C102492(args, context, steps, launchBottomSheet, disclosureClickAction), composerStartRestartGroup, 54), composer2, 196608, 12582912, 98206);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RoundupOnboardingIntroComposable.RoundupOnboardingIntroComposable$lambda$0(brokerageAccountState, callbacks, disclosureClickAction, args, fragmentManager, steps, launchBottomSheet, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RoundupOnboardingIntroComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$RoundupOnboardingIntroComposable$2 */
    static final class C102492 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ RewardsOnboardingIntroFragmentV2.Args $args;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<String, Unit> $disclosureClickAction;
        final /* synthetic */ Function1<RewardsOnboardingIntroBottomSheetFragment.Args, Unit> $launchBottomSheet;
        final /* synthetic */ ImmutableList<OnboardingStep> $steps;

        /* JADX WARN: Multi-variable type inference failed */
        C102492(RewardsOnboardingIntroFragmentV2.Args args, Context context, ImmutableList<OnboardingStep> immutableList, Function1<? super RewardsOnboardingIntroBottomSheetFragment.Args, Unit> function1, Function1<? super String, Unit> function12) {
            this.$args = args;
            this.$context = context;
            this.$steps = immutableList;
            this.$launchBottomSheet = function1;
            this.$disclosureClickAction = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues unused$var$, Composer composer, int i) {
            String title;
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1977969269, i, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposable.<anonymous> (RoundupOnboardingIntroComposable.kt:89)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 7, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final RewardsOnboardingIntroFragmentV2.Args args = this.$args;
            Context context = this.$context;
            ImmutableList<OnboardingStep> immutableList = this.$steps;
            Function1<RewardsOnboardingIntroBottomSheetFragment.Args, Unit> function1 = this.$launchBottomSheet;
            final Function1<String, Unit> function12 = this.$disclosureClickAction;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            RewardsOnboardingContent introTitleContent = args.getIntroTitleContent();
            if (introTitleContent == null || (title = introTitleContent.getTitle()) == null) {
                title = "";
            }
            String str = title;
            RewardsOnboardingContent bonus = args.getBonus();
            String strReplace$default = StringsKt.replace$default(str, "{{ .PERCENTAGE }}", String.valueOf(bonus != null ? bonus.getContent() : null), false, 4, (Object) null);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strReplace$default, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
            ImageKt.Image(PainterResources_androidKt.painterResource(C10176R.drawable.rewards_onboarding_coffee_cup, composer, 0), context.getString(C10176R.string.rewards_intro_image_description), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            RewardsOnboardingContent introTitleContent2 = args.getIntroTitleContent();
            BentoText2.m20747BentoText38GnDrw(String.valueOf(introTitleContent2 != null ? introTitleContent2.getContent() : null), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            RoundupOnboardingIntroComposable.OnboardingSteps(immutableList, function1, composer, 0);
            RewardsOnboardingContent bottomDisclosure = args.getBottomDisclosure();
            CharSequence content = bottomDisclosure != null ? bottomDisclosure.getContent() : null;
            composer.startReplaceGroup(-1244135093);
            if (content != null) {
                RewardsOnboardingContent.Disclosure disclosure = args.getBottomDisclosure().getDisclosure();
                if ((disclosure != null ? disclosure.getContent() : null) != null) {
                    composer.startReplaceGroup(567448566);
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 7, null);
                    String string2 = content.toString();
                    String strValueOf = String.valueOf(args.getBottomDisclosure().getDisclosure().getButtonText());
                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
                    TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function12) | composer.changedInstance(args);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$RoundupOnboardingIntroComposable$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RoundupOnboardingIntroComposable.C102492.invoke$lambda$3$lambda$2$lambda$1$lambda$0(function12, args);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(string2, strValueOf, (Function0) objRememberedValue, modifierM5146paddingqDBjuR0$default3, jM21426getFg20d7_KjU, 0L, textS, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(568147027);
                    BentoText2.m20747BentoText38GnDrw(content.toString(), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8184);
                    composer.endReplaceGroup();
                }
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, RewardsOnboardingIntroFragmentV2.Args args) {
            function1.invoke(args.getBottomDisclosure().getDisclosure().getContent().toString());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnboardingSteps(final ImmutableList<OnboardingStep> immutableList, final Function1<? super RewardsOnboardingIntroBottomSheetFragment.Args, Unit> function1, Composer composer, final int i) {
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763142338);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1763142338, i2, -1, "com.robinhood.android.cash.rewards.ui.onboarding.composables.OnboardingSteps (RoundupOnboardingIntroComposable.kt:152)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            int i3 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(332164935);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            for (OnboardingStep onboardingStep : immutableList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                OnboardingStep onboardingStep2 = onboardingStep;
                if (onboardingStep2.getAction() != null) {
                    composerStartRestartGroup.startReplaceGroup(1895580860);
                    composer3 = composerStartRestartGroup;
                    BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(onboardingStep2.getTitle(), ComposableLambda3.rememberComposableLambda(-1300721426, true, new RoundupOnboardingIntroComposable2(onboardingStep2, function1), composerStartRestartGroup, 54), new BentoValuePropRow2.Number(i4), BentoValuePropRow.Top, null, null, composer3, (BentoValuePropRow2.Number.$stable << 6) | 3120, 48);
                    composer3.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1896391696);
                    BentoValuePropRow3.BentoValuePropRow(onboardingStep2.getTitle(), onboardingStep2.getBody(), new BentoValuePropRow2.Number(i4), BentoValuePropRow.Top, (Modifier) null, composerStartRestartGroup, (BentoValuePropRow2.Number.$stable << 6) | 3072, 16);
                    composer3 = composerStartRestartGroup;
                    composer3.endReplaceGroup();
                }
                arrayList.add(Unit.INSTANCE);
                composerStartRestartGroup = composer3;
                i3 = i4;
            }
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.composables.RoundupOnboardingIntroComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RoundupOnboardingIntroComposable.OnboardingSteps$lambda$3(immutableList, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
