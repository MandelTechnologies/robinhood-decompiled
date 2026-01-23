package com.robinhood.android.jointaccounts.onboarding.intro.secondary;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset2;
import com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreen;
import com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountSecondaryIntroViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.responsive.WindowSize;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: JointAccountOnboardingSecondaryUserIntroScreen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a1\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\"\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0011²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"SecondaryUserIntroScreen", "", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryUserIntroScreenCallbacks;", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState;Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryUserIntroScreenCallbacks;Landroidx/compose/runtime/Composer;I)V", "SecondaryIntroAssetMaxHeight", "Landroidx/compose/ui/unit/Dp;", "F", "LoadedScreen", "Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loaded;", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/JointAccountSecondaryIntroViewState$Loaded;Lcom/robinhood/android/jointaccounts/onboarding/intro/secondary/SecondaryUserIntroScreenCallbacks;Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-joint-account-onboarding_externalDebug", "lottieProgress", "", "foregroundOpacity"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountOnboardingSecondaryUserIntroScreen {
    private static final float SecondaryIntroAssetMaxHeight = C2002Dp.m7995constructorimpl(400);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedScreen$lambda$5(JointAccountSecondaryIntroViewState.Loaded loaded, JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, LottieComposition lottieComposition, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedScreen(loaded, jointAccountOnboardingSecondaryUserIntroScreen5, lottieComposition, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryUserIntroScreen$lambda$1(JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewState, JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, int i, Composer composer, int i2) {
        SecondaryUserIntroScreen(jointAccountSecondaryIntroViewState, jointAccountOnboardingSecondaryUserIntroScreen5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ float access$LoadedScreen$lambda$2(LottieAnimationState lottieAnimationState) {
        return LoadedScreen$lambda$2(lottieAnimationState);
    }

    public static final void SecondaryUserIntroScreen(final JointAccountSecondaryIntroViewState viewState, final JointAccountOnboardingSecondaryUserIntroScreen5 callbacks, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1280700913);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1280700913, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.SecondaryUserIntroScreen (JointAccountOnboardingSecondaryUserIntroScreen.kt:59)");
            }
            final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(JointAccountOnboardingAsset2.getSecondaryIntroLottie(), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Components5.JointAccountStatusBarWrapper(false, ComposableLambda3.rememberComposableLambda(-346590860, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt.SecondaryUserIntroScreen.1
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
                        ComposerKt.traceEventStart(-346590860, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.SecondaryUserIntroScreen.<anonymous> (JointAccountOnboardingSecondaryUserIntroScreen.kt:62)");
                    }
                    JointAccountSecondaryIntroViewState jointAccountSecondaryIntroViewState = viewState;
                    if (jointAccountSecondaryIntroViewState instanceof JointAccountSecondaryIntroViewState.Loading) {
                        composer2.startReplaceGroup(-186836000);
                        JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(jointAccountOnboardingSecondaryUserIntroScreen5);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountOnboardingSecondaryUserIntroScreen3(jointAccountOnboardingSecondaryUserIntroScreen5);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        JointAccountOnboardingPrimaryUserIntroScreenKt.JointAccountPromoLoadingScreen(null, (Function0) ((KFunction) objRememberedValue), composer2, 0, 1);
                        composer2.endReplaceGroup();
                    } else if (jointAccountSecondaryIntroViewState instanceof JointAccountSecondaryIntroViewState.Error) {
                        composer2.startReplaceGroup(1933642166);
                        JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen52 = callbacks;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(jointAccountOnboardingSecondaryUserIntroScreen52);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new JointAccountOnboardingSecondaryUserIntroScreen4(jointAccountOnboardingSecondaryUserIntroScreen52);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue2), 0, null, null, null, null, false, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(jointAccountSecondaryIntroViewState instanceof JointAccountSecondaryIntroViewState.Loaded)) {
                            composer2.startReplaceGroup(1933633564);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1933647380);
                        JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen((JointAccountSecondaryIntroViewState.Loaded) viewState, callbacks, JointAccountOnboardingSecondaryUserIntroScreen.SecondaryUserIntroScreen$lambda$0(lottieCompositionResultRememberLottieComposition), null, composer2, 0, 8);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingSecondaryUserIntroScreen.SecondaryUserIntroScreen$lambda$1(viewState, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadedScreen$lambda$2(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LoadedScreen$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieComposition SecondaryUserIntroScreen$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedScreen(final JointAccountSecondaryIntroViewState.Loaded loaded, final JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, final LottieComposition lottieComposition, Modifier modifier, Composer composer, final int i, final int i2) {
        JointAccountSecondaryIntroViewState.Loaded loaded2;
        int i3;
        JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen52;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1947523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else {
            loaded2 = loaded;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            jointAccountOnboardingSecondaryUserIntroScreen52 = jointAccountOnboardingSecondaryUserIntroScreen5;
        } else {
            jointAccountOnboardingSecondaryUserIntroScreen52 = jointAccountOnboardingSecondaryUserIntroScreen5;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(jointAccountOnboardingSecondaryUserIntroScreen52) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(lottieComposition) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1947523, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.LoadedScreen (JointAccountOnboardingSecondaryUserIntroScreen.kt:90)");
                }
                final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, false, false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, ((i3 >> 6) & 14) | 1573248, 954);
                Float fValueOf = lottieComposition == null ? Float.valueOf(lottieComposition.getFrameForProgress(LoadedScreen$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState))) : null;
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState((fValueOf != null || fValueOf.floatValue() > 10.0f) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "secondary_intro_fg", null, composerStartRestartGroup, 3120, 20);
                final JointAccountSecondaryIntroViewState.Loaded loaded3 = loaded2;
                final JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen53 = jointAccountOnboardingSecondaryUserIntroScreen52;
                final Modifier modifier4 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_INTRO, null, loaded2.getLoggingIdentifier(), null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(759513960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt.LoadedScreen.1

                    /* compiled from: JointAccountOnboardingSecondaryUserIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ JointAccountOnboardingSecondaryUserIntroScreen5 $callbacks;
                        final /* synthetic */ SnapshotState4<Float> $foregroundOpacity$delegate;
                        final /* synthetic */ LottieComposition $lottieComposition;
                        final /* synthetic */ LottieAnimationState $lottieProgress$delegate;
                        final /* synthetic */ JointAccountSecondaryIntroViewState.Loaded $viewState;

                        /* compiled from: JointAccountOnboardingSecondaryUserIntroScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[WindowSize.values().length];
                                try {
                                    iArr[WindowSize.Compact.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[WindowSize.Medium.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[WindowSize.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass2(JointAccountSecondaryIntroViewState.Loaded loaded, LottieComposition lottieComposition, LottieAnimationState lottieAnimationState, JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, SnapshotState4<Float> snapshotState4) {
                            this.$viewState = loaded;
                            this.$lottieComposition = lottieComposition;
                            this.$lottieProgress$delegate = lottieAnimationState;
                            this.$callbacks = jointAccountOnboardingSecondaryUserIntroScreen5;
                            this.$foregroundOpacity$delegate = snapshotState4;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            ContentScale fillWidth;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(577261149, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.LoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingSecondaryUserIntroScreen.kt:126)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(Components5.gradientBackground(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null)), paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                            final JointAccountSecondaryIntroViewState.Loaded loaded = this.$viewState;
                            LottieComposition lottieComposition = this.$lottieComposition;
                            final LottieAnimationState lottieAnimationState = this.$lottieProgress$delegate;
                            final JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5 = this.$callbacks;
                            SnapshotState4<Float> snapshotState4 = this.$foregroundOpacity$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, centerHorizontally, composer, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImmutableList3 persistentList = extensions2.toPersistentList(loaded.getViewModel().getBody_content());
                            Modifier modifierAlpha = Alpha.alpha(companion2, JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen$lambda$4(snapshotState4));
                            composer.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierAlpha, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer, 0, 0);
                            composer.endReplaceGroup();
                            int i3 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer, 6).ordinal()];
                            if (i3 == 1) {
                                fillWidth = ContentScale.INSTANCE.getFillWidth();
                            } else {
                                if (i3 != 2 && i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fillWidth = ContentScale.INSTANCE.getFit();
                            }
                            ContentScale contentScale = fillWidth;
                            Alignment center = companion.getCenter();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), 0.0f, JointAccountOnboardingSecondaryUserIntroScreen.SecondaryIntroAssetMaxHeight, 1, null), 1.0f, false, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(lottieAnimationState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(JointAccountOnboardingSecondaryUserIntroScreen.access$LoadedScreen$lambda$2(lottieAnimationState));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierAspectRatio$default, false, false, false, null, false, null, center, contentScale, false, false, null, null, false, composer, 805306368, 0, 63992);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer.changed(jointAccountOnboardingSecondaryUserIntroScreen5) | composer.changedInstance(loaded);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return JointAccountOnboardingSecondaryUserIntroScreen.C200881.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(jointAccountOnboardingSecondaryUserIntroScreen5, loaded);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, loaded.getViewModel().getButton_text(), UtilKt.autoLogEvents(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Alpha.alpha(companion2, JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen$lambda$4(snapshotState4)), 0.0f, 1, null), bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), Component.ComponentType.BUTTON, loaded.getViewModel().getButton_logging_identifier(), false, composer, 48, 4), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, JointAccountSecondaryIntroViewState.Loaded loaded) {
                            jointAccountOnboardingSecondaryUserIntroScreen5.onContinueClick(loaded.getViewModel().getIneligible_bottom_sheet());
                            return Unit.INSTANCE;
                        }
                    }

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
                            ComposerKt.traceEventStart(759513960, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.LoadedScreen.<anonymous> (JointAccountOnboardingSecondaryUserIntroScreen.kt:121)");
                        }
                        JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen54 = jointAccountOnboardingSecondaryUserIntroScreen53;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(jointAccountOnboardingSecondaryUserIntroScreen54);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountOnboardingSecondaryUserIntroScreen2(jointAccountOnboardingSecondaryUserIntroScreen54);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue), modifier4, false, 0L, 0L, true, 0L, ComposableLambda3.rememberComposableLambda(577261149, true, new AnonymousClass2(loaded3, lottieComposition, lottieAnimationStateAnimateLottieCompositionAsState, jointAccountOnboardingSecondaryUserIntroScreen53, snapshotState4AnimateFloatAsState), composer2, 54), composer2, 12779520, 92);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen$lambda$5(loaded, jointAccountOnboardingSecondaryUserIntroScreen5, lottieComposition, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(lottieComposition, false, false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, ((i3 >> 6) & 14) | 1573248, 954);
            if (lottieComposition == null) {
            }
            if (fValueOf != null) {
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState((fValueOf != null || fValueOf.floatValue() > 10.0f) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "secondary_intro_fg", null, composerStartRestartGroup, 3120, 20);
                final JointAccountSecondaryIntroViewState.Loaded loaded32 = loaded2;
                final JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen532 = jointAccountOnboardingSecondaryUserIntroScreen52;
                final Modifier modifier42 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_SECONDARY_INTRO, null, loaded2.getLoggingIdentifier(), null, 10, null), null, null, null, null, 61, null)), ComposableLambda3.rememberComposableLambda(759513960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt.LoadedScreen.1

                    /* compiled from: JointAccountOnboardingSecondaryUserIntroScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ JointAccountOnboardingSecondaryUserIntroScreen5 $callbacks;
                        final /* synthetic */ SnapshotState4<Float> $foregroundOpacity$delegate;
                        final /* synthetic */ LottieComposition $lottieComposition;
                        final /* synthetic */ LottieAnimationState $lottieProgress$delegate;
                        final /* synthetic */ JointAccountSecondaryIntroViewState.Loaded $viewState;

                        /* compiled from: JointAccountOnboardingSecondaryUserIntroScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[WindowSize.values().length];
                                try {
                                    iArr[WindowSize.Compact.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[WindowSize.Medium.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[WindowSize.Expanded.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass2(JointAccountSecondaryIntroViewState.Loaded loaded, LottieComposition lottieComposition, LottieAnimationState lottieAnimationState, JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, SnapshotState4<Float> snapshotState4) {
                            this.$viewState = loaded;
                            this.$lottieComposition = lottieComposition;
                            this.$lottieProgress$delegate = lottieAnimationState;
                            this.$callbacks = jointAccountOnboardingSecondaryUserIntroScreen5;
                            this.$foregroundOpacity$delegate = snapshotState4;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            ContentScale fillWidth;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(577261149, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.LoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingSecondaryUserIntroScreen.kt:126)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(Components5.gradientBackground(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null)), paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                            final JointAccountSecondaryIntroViewState.Loaded loaded = this.$viewState;
                            LottieComposition lottieComposition = this.$lottieComposition;
                            final LottieAnimationState lottieAnimationState = this.$lottieProgress$delegate;
                            final JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5 = this.$callbacks;
                            SnapshotState4<Float> snapshotState4 = this.$foregroundOpacity$delegate;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, centerHorizontally, composer, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImmutableList3 persistentList = extensions2.toPersistentList(loaded.getViewModel().getBody_content());
                            Modifier modifierAlpha = Alpha.alpha(companion2, JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen$lambda$4(snapshotState4));
                            composer.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierAlpha, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer, 0, 0);
                            composer.endReplaceGroup();
                            int i3 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composer, 6).ordinal()];
                            if (i3 == 1) {
                                fillWidth = ContentScale.INSTANCE.getFillWidth();
                            } else {
                                if (i3 != 2 && i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fillWidth = ContentScale.INSTANCE.getFit();
                            }
                            ContentScale contentScale = fillWidth;
                            Alignment center = companion.getCenter();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i4 = BentoTheme.$stable;
                            Modifier modifierAspectRatio$default = AspectRatio3.aspectRatio$default(SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM()), 0.0f, JointAccountOnboardingSecondaryUserIntroScreen.SecondaryIntroAssetMaxHeight, 1, null), 1.0f, false, 2, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(lottieAnimationState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(JointAccountOnboardingSecondaryUserIntroScreen.access$LoadedScreen$lambda$2(lottieAnimationState));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LottieAnimation2.LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifierAspectRatio$default, false, false, false, null, false, null, center, contentScale, false, false, null, null, false, composer, 805306368, 0, 63992);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer.changed(jointAccountOnboardingSecondaryUserIntroScreen5) | composer.changedInstance(loaded);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.secondary.JointAccountOnboardingSecondaryUserIntroScreenKt$LoadedScreen$1$2$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return JointAccountOnboardingSecondaryUserIntroScreen.C200881.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(jointAccountOnboardingSecondaryUserIntroScreen5, loaded);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, loaded.getViewModel().getButton_text(), UtilKt.autoLogEvents(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Alpha.alpha(companion2, JointAccountOnboardingSecondaryUserIntroScreen.LoadedScreen$lambda$4(snapshotState4)), 0.0f, 1, null), bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM()), Component.ComponentType.BUTTON, loaded.getViewModel().getButton_logging_identifier(), false, composer, 48, 4), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3$lambda$2(JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen5, JointAccountSecondaryIntroViewState.Loaded loaded) {
                            jointAccountOnboardingSecondaryUserIntroScreen5.onContinueClick(loaded.getViewModel().getIneligible_bottom_sheet());
                            return Unit.INSTANCE;
                        }
                    }

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
                            ComposerKt.traceEventStart(759513960, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.secondary.LoadedScreen.<anonymous> (JointAccountOnboardingSecondaryUserIntroScreen.kt:121)");
                        }
                        JointAccountOnboardingSecondaryUserIntroScreen5 jointAccountOnboardingSecondaryUserIntroScreen54 = jointAccountOnboardingSecondaryUserIntroScreen532;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged = composer2.changed(jointAccountOnboardingSecondaryUserIntroScreen54);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new JointAccountOnboardingSecondaryUserIntroScreen2(jointAccountOnboardingSecondaryUserIntroScreen54);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Components5.m15755JointAccountOnboardingScaffoldzcDBAo0((Function0) ((KFunction) objRememberedValue), modifier42, false, 0L, 0L, true, 0L, ComposableLambda3.rememberComposableLambda(577261149, true, new AnonymousClass2(loaded32, lottieComposition, lottieAnimationStateAnimateLottieCompositionAsState2, jointAccountOnboardingSecondaryUserIntroScreen532, snapshotState4AnimateFloatAsState2), composer2, 54), composer2, 12779520, 92);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
