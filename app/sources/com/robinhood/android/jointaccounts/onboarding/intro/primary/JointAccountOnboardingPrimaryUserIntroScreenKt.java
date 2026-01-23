package com.robinhood.android.jointaccounts.onboarding.intro.primary;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.jointaccounts.onboarding.Components5;
import com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainer;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.jointaccounts.onboarding.JointAccountStaticContainer;
import com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt;
import com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPrimaryIntroViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a;\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u001a\u001a%\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a1\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u0015H\u0001¢\u0006\u0002\u0010\"\u001a1\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010$\u001a#\u0010%\u001a\u00020&*\u00020&2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010*\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020\u0015X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0004X\u008a\u0084\u0002"}, m3636d2 = {"PrimaryIntroLoadingTag", "", "PrimaryIntroContinueButtonTag", "ShowFooterFrame", "", "FooterDuration", "", "PositionEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "OpacityEasing", "PrimaryUserIntroScreen", "", "viewState", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/PrimaryUserIntroScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "verticalScroll", "Landroidx/compose/foundation/ScrollState;", "isEmbedded", "", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/PrimaryUserIntroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;II)V", "PreviewPrimaryUserIntroScreen", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState;Landroidx/compose/runtime/Composer;I)V", "EmbeddedJointAccountPromoLoadingScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "JointAccountPromoLoadingScreen", "onCloseClicked", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AnimatedLoadedScreen", "Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loaded;", "isUiTest", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loaded;Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/PrimaryUserIntroScreenCallbacks;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "StaticLoadedScreen", "(Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/JointAccountPrimaryIntroViewState$Loaded;Lcom/robinhood/android/jointaccounts/onboarding/intro/primary/PrimaryUserIntroScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "copy", "Landroidx/compose/ui/graphics/Color;", "alpha", "lightness", "copy-ek8zF_U", "(JFF)J", "feature-joint-account-onboarding_externalDebug", "showText", "showFooter", "footerOpacity"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class JointAccountOnboardingPrimaryUserIntroScreenKt {
    private static final int FooterDuration = 800;
    public static final String PrimaryIntroContinueButtonTag = "continue_button";
    public static final String PrimaryIntroLoadingTag = "loading";
    private static final float ShowFooterFrame = 140.0f;
    private static final CubicBezierEasing PositionEasing = new CubicBezierEasing(0.43f, 0.0f, 0.48f, 1.0f);
    private static final CubicBezierEasing OpacityEasing = new CubicBezierEasing(0.17f, 0.17f, 0.83f, 0.83f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedLoadedScreen$lambda$14(JointAccountPrimaryIntroViewState.Loaded loaded, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        AnimatedLoadedScreen(loaded, primaryUserIntroScreenCallbacks, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmbeddedJointAccountPromoLoadingScreen$lambda$2(Modifier modifier, int i, int i2, Composer composer, int i3) {
        EmbeddedJointAccountPromoLoadingScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountPromoLoadingScreen$lambda$4(Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        JointAccountPromoLoadingScreen(modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPrimaryUserIntroScreen$lambda$1(JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState, int i, Composer composer, int i2) {
        PreviewPrimaryUserIntroScreen(jointAccountPrimaryIntroViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryUserIntroScreen$lambda$0(JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, Modifier modifier, ScrollState scrollState, boolean z, int i, int i2, Composer composer, int i3) {
        PrimaryUserIntroScreen(jointAccountPrimaryIntroViewState, primaryUserIntroScreenCallbacks, modifier, scrollState, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaticLoadedScreen$lambda$15(JointAccountPrimaryIntroViewState.Loaded loaded, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, Modifier modifier, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        StaticLoadedScreen(loaded, primaryUserIntroScreenCallbacks, modifier, scrollState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnimatedLoadedScreen$lambda$11(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AnimatedLoadedScreen$lambda$13(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AnimatedLoadedScreen$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrimaryUserIntroScreen(final JointAccountPrimaryIntroViewState viewState, final PrimaryUserIntroScreenCallbacks callbacks, Modifier modifier, ScrollState scrollState, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollStateRememberScrollState;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final ScrollState scrollState2;
        final boolean z3;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1609787002);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i6 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i3 |= i6;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        scrollState2 = scrollStateRememberScrollState;
                        if (i4 == 0) {
                            z3 = false;
                        }
                        int i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1609787002, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:91)");
                        }
                        Components5.JointAccountStatusBarWrapper(z3, ComposableLambda3.rememberComposableLambda(142359063, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(142359063, i8, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:93)");
                                }
                                JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState = viewState;
                                if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loading) {
                                    composer2.startReplaceGroup(1886222023);
                                    if (z3) {
                                        composer2.startReplaceGroup(1886249179);
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.EmbeddedJointAccountPromoLoadingScreen(null, composer2, 0, 1);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(1886336909);
                                        PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                                        composer2.startReplaceGroup(5004770);
                                        boolean zChanged = composer2.changed(primaryUserIntroScreenCallbacks);
                                        Object objRememberedValue = composer2.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new C20070x869f2564(primaryUserIntroScreenCallbacks);
                                            composer2.updateRememberedValue(objRememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.JointAccountPromoLoadingScreen(null, (Function0) ((KFunction) objRememberedValue), composer2, 0, 1);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endReplaceGroup();
                                } else if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Error) {
                                    composer2.startReplaceGroup(1886571362);
                                    PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks2 = callbacks;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged2 = composer2.changed(primaryUserIntroScreenCallbacks2);
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new C20071x869f2925(primaryUserIntroScreenCallbacks2);
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceGroup();
                                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                                    final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks3 = callbacks;
                                    Components5.m15755JointAccountOnboardingScaffoldzcDBAo0(function0, null, false, 0L, 0L, false, 0L, ComposableLambda3.rememberComposableLambda(1400504203, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                            invoke(paddingValues, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(PaddingValues it, Composer composer3, int i9) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1400504203, i9, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:108)");
                                            }
                                            PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks4 = primaryUserIntroScreenCallbacks3;
                                            composer3.startReplaceGroup(5004770);
                                            boolean zChanged3 = composer3.changed(primaryUserIntroScreenCallbacks4);
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = new C20072x5b878ff3(primaryUserIntroScreenCallbacks4);
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer3.endReplaceGroup();
                                            ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue3), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer2, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loaded)) {
                                        composer2.startReplaceGroup(-631892303);
                                        composer2.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer2.startReplaceGroup(1886933008);
                                    if (z3) {
                                        composer2.startReplaceGroup(1886959575);
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, modifier3, scrollState2, composer2, 0, 0);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2.startReplaceGroup(1887236250);
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, null, false, composer2, 0, 12);
                                        composer2.endReplaceGroup();
                                    }
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 >> 12) & 14) | 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        scrollState3 = scrollState2;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                    z3 = z2;
                    int i72 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Components5.JointAccountStatusBarWrapper(z3, ComposableLambda3.rememberComposableLambda(142359063, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(142359063, i8, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:93)");
                            }
                            JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState = viewState;
                            if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loading) {
                                composer2.startReplaceGroup(1886222023);
                                if (z3) {
                                    composer2.startReplaceGroup(1886249179);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.EmbeddedJointAccountPromoLoadingScreen(null, composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1886336909);
                                    PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(primaryUserIntroScreenCallbacks);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new C20070x869f2564(primaryUserIntroScreenCallbacks);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.JointAccountPromoLoadingScreen(null, (Function0) ((KFunction) objRememberedValue), composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            } else if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Error) {
                                composer2.startReplaceGroup(1886571362);
                                PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks2 = callbacks;
                                composer2.startReplaceGroup(5004770);
                                boolean zChanged2 = composer2.changed(primaryUserIntroScreenCallbacks2);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C20071x869f2925(primaryUserIntroScreenCallbacks2);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                                final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks3 = callbacks;
                                Components5.m15755JointAccountOnboardingScaffoldzcDBAo0(function0, null, false, 0L, 0L, false, 0L, ComposableLambda3.rememberComposableLambda(1400504203, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues it, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1400504203, i9, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:108)");
                                        }
                                        PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks4 = primaryUserIntroScreenCallbacks3;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer3.changed(primaryUserIntroScreenCallbacks4);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new C20072x5b878ff3(primaryUserIntroScreenCallbacks4);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceGroup();
                                        ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue3), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loaded)) {
                                    composer2.startReplaceGroup(-631892303);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1886933008);
                                if (z3) {
                                    composer2.startReplaceGroup(1886959575);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, modifier3, scrollState2, composer2, 0, 0);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1887236250);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, null, false, composer2, 0, 12);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i72 >> 12) & 14) | 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    scrollState3 = scrollState2;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    scrollState3 = scrollStateRememberScrollState;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen$lambda$0(viewState, callbacks, modifier4, scrollState3, z4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    scrollState2 = scrollStateRememberScrollState;
                    if (i4 == 0) {
                        z3 = z2;
                    }
                    int i722 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Components5.JointAccountStatusBarWrapper(z3, ComposableLambda3.rememberComposableLambda(142359063, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(142359063, i8, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:93)");
                            }
                            JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState = viewState;
                            if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loading) {
                                composer2.startReplaceGroup(1886222023);
                                if (z3) {
                                    composer2.startReplaceGroup(1886249179);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.EmbeddedJointAccountPromoLoadingScreen(null, composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1886336909);
                                    PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChanged = composer2.changed(primaryUserIntroScreenCallbacks);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new C20070x869f2564(primaryUserIntroScreenCallbacks);
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.JointAccountPromoLoadingScreen(null, (Function0) ((KFunction) objRememberedValue), composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            } else if (jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Error) {
                                composer2.startReplaceGroup(1886571362);
                                PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks2 = callbacks;
                                composer2.startReplaceGroup(5004770);
                                boolean zChanged2 = composer2.changed(primaryUserIntroScreenCallbacks2);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new C20071x869f2925(primaryUserIntroScreenCallbacks2);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                                final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks3 = callbacks;
                                Components5.m15755JointAccountOnboardingScaffoldzcDBAo0(function0, null, false, 0L, 0L, false, 0L, ComposableLambda3.rememberComposableLambda(1400504203, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                        invoke(paddingValues, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(PaddingValues it, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        if ((i9 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1400504203, i9, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:108)");
                                        }
                                        PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks4 = primaryUserIntroScreenCallbacks3;
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChanged3 = composer3.changed(primaryUserIntroScreenCallbacks4);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new C20072x5b878ff3(primaryUserIntroScreenCallbacks4);
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceGroup();
                                        ErrorScreenComposable.ErrorScreenComposable(null, (Function0) ((KFunction) objRememberedValue3), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, 12582912, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(jointAccountPrimaryIntroViewState instanceof JointAccountPrimaryIntroViewState.Loaded)) {
                                    composer2.startReplaceGroup(-631892303);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(1886933008);
                                if (z3) {
                                    composer2.startReplaceGroup(1886959575);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, modifier3, scrollState2, composer2, 0, 0);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1887236250);
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen((JointAccountPrimaryIntroViewState.Loaded) viewState, callbacks, null, false, composer2, 0, 12);
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i722 >> 12) & 14) | 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    scrollState3 = scrollState2;
                    z4 = z3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewPrimaryUserIntroScreen(final JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(627380782);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(jointAccountPrimaryIntroViewState) : composerStartRestartGroup.changedInstance(jointAccountPrimaryIntroViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(627380782, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PreviewPrimaryUserIntroScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:138)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(-896199314, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PreviewPrimaryUserIntroScreen.1
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
                        ComposerKt.traceEventStart(-896199314, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PreviewPrimaryUserIntroScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:142)");
                    }
                    final JointAccountPrimaryIntroViewState jointAccountPrimaryIntroViewState2 = jointAccountPrimaryIntroViewState;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(685404854, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PreviewPrimaryUserIntroScreen.1.1
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
                                ComposerKt.traceEventStart(685404854, i4, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.PreviewPrimaryUserIntroScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:143)");
                            }
                            JointAccountOnboardingPrimaryUserIntroScreenKt.PrimaryUserIntroScreen(jointAccountPrimaryIntroViewState2, new PrimaryUserIntroScreenCallbacks() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.PreviewPrimaryUserIntroScreen.1.1.1
                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
                                public void onContinueClick(AlertAction<? extends GenericAction> ineligibleBottomSheet) {
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
                                public void onExitClick() {
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.intro.primary.PrimaryUserIntroScreenCallbacks
                                public void onTryAgainClick() {
                                }
                            }, null, null, false, composer3, 0, 28);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingPrimaryUserIntroScreenKt.PreviewPrimaryUserIntroScreen$lambda$1(jointAccountPrimaryIntroViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void EmbeddedJointAccountPromoLoadingScreen(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(211272799);
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
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(211272799, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.EmbeddedJointAccountPromoLoadingScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:182)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(311024551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.EmbeddedJointAccountPromoLoadingScreen.1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(311024551, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.EmbeddedJointAccountPromoLoadingScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:184)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), "loading");
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierTestTag);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    LocalShowPlaceholder.Loadable(true, BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, companion.getBottomCenter()), null, C20045x39cb1e41.INSTANCE.m2145x5c8f222e(), composer2, 3078, 4);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingPrimaryUserIntroScreenKt.EmbeddedJointAccountPromoLoadingScreen$lambda$2(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void JointAccountPromoLoadingScreen(Modifier modifier, final Function0<Unit> onCloseClicked, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        final Composer composerStartRestartGroup = composer.startRestartGroup(1448729705);
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
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1448729705, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:223)");
            }
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxSize$default(Components5.gradientBackground(modifier3), 0.0f, 1, null), "loading");
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Components5.m15754JointAccountOnboardingAppBaruDo3WH8(onCloseClicked, boxScopeInstance.align(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), companion.getTopCenter()), false, 0L, true, composerStartRestartGroup, ((i3 >> 3) & 14) | 24576, 12);
            final PlaceholderStyle placeholderStyle = new PlaceholderStyle(m15775copyek8zF_U(Components5.getGradientStop100(), 0.5f, 0.5f), m15775copyek8zF_U(Components5.getGradientStop0(), 0.8f, 0.9f), null);
            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles(composerStartRestartGroup, placeholderStyle) { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$JointAccountPromoLoadingScreen$1$styles$1
                private final /* synthetic */ Styles $$delegate_0;
                final /* synthetic */ PlaceholderStyle $placeholderStyle;

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public AppBarStyle getAppBar(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1362537773);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1362537773, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-appBar> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return appBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonStyle getButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(382055891);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(382055891, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-button> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ButtonStyle button = this.$$delegate_0.getButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return button;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonBarStyle getButtonBar(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1356432018);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1356432018, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-buttonBar> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CardStackStyle getCardStackStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(250346091);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(250346091, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-cardStackStyle> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return cardStackStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ChartStyle getChart(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-37345329);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-37345329, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-chart> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ChartStyle chart = this.$$delegate_0.getChart(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return chart;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CheckboxStyle getCheckBox(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1880866114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1880866114, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-checkBox> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return checkBox;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1791469740);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1791469740, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-circularProgressIndicator> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return circularProgressIndicator;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CommunicationCardStyle getCommunicationCard(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1215051529);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1215051529, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-communicationCard> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return communicationCard;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1598406505);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1598406505, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-expandableButtonTray> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return expandableButtonTray;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public IconButtonStyle getIconButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1591337286);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1591337286, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-iconButton> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return iconButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public InfoBannerStyle getInfoBanner(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1605597301);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1605597301, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-infoBanner> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return infoBanner;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1351587912);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1351587912, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return loadingPlaceholderStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-2127264206);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2127264206, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-markdownSpannedText> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return markdownSpannedText;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-1512156654);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1512156654, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-navigationBarStyle> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return navigationBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NumpadStyle getNumpad(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-472295048);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-472295048, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-numpad> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    NumpadStyle numpad = this.$$delegate_0.getNumpad(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return numpad;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PogStyle getPog(Composer composer2, int i5) {
                    composer2.startReplaceGroup(4785017);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(4785017, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-pog> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return pog;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ProgressBarStyle getProgressBarStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(158425849);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(158425849, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-progressBarStyle> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return progressBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RadioButtonStyle getRadioButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(336118878);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(336118878, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-radioButton> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return radioButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RowStyle getRow(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-908125621);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-908125621, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-row> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    RowStyle row = this.$$delegate_0.getRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return row;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i5) {
                    composer2.startReplaceGroup(2050321573);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2050321573, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-selectionRowStyle> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return selectionRowStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public SpanButtonStyle getSpanButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-28952727);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-28952727, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-spanButton> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spanButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextStyle getText(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-762001064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-762001064, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-text> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    TextStyle text = this.$$delegate_0.getText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return text;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextButtonStyle getTextButton(Composer composer2, int i5) {
                    composer2.startReplaceGroup(1595403270);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1595403270, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-textButton> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextInputStyle getTextInput(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-631088082);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-631088082, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-textInput> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textInput;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ToggleRowStyle getToggleRow(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-313535785);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-313535785, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-toggleRow> (JointAccountOnboardingPrimaryUserIntroScreen.kt:0)");
                    }
                    ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return toggleRow;
                }

                {
                    this.$placeholderStyle = placeholderStyle;
                    this.$$delegate_0 = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PlaceholderStyle getPlaceholder(Composer composer2, int i5) {
                    composer2.startReplaceGroup(-571026300);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-571026300, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<no name provided>.<get-placeholder> (JointAccountOnboardingPrimaryUserIntroScreen.kt:246)");
                    }
                    PlaceholderStyle placeholderStyle2 = this.$placeholderStyle;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return placeholderStyle2;
                }
            }), ComposableLambda3.rememberComposableLambda(1423723491, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$JointAccountPromoLoadingScreen$1$1
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
                        ComposerKt.traceEventStart(1423723491, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountPromoLoadingScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:251)");
                    }
                    LocalShowPlaceholder.Loadable(true, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), null, C20045x39cb1e41.INSTANCE.m2144xe60b5bcd(), composer2, 3078, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountOnboardingPrimaryUserIntroScreenKt.JointAccountPromoLoadingScreen$lambda$4(modifier3, onCloseClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedLoadedScreen(final JointAccountPrimaryIntroViewState.Loaded viewState, final PrimaryUserIntroScreenCallbacks callbacks, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        boolean z4;
        Object objRememberedValue;
        boolean z5;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1758584269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1758584269, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:287)");
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    final JointAccountOnboardingAsset.Fullscreen asset = viewState.getAsset();
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i6 = i3 & 7168;
                    z4 = i6 != 2048;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$6$lambda$5(z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z5 = i6 != 2048;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$10$lambda$9(z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                    final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!AnimatedLoadedScreen$lambda$11(snapshotState2) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(FooterDuration, 0, OpacityEasing, 2, null), 0.0f, "footer_appearance", null, composerStartRestartGroup, 3120, 20);
                    composerStartRestartGroup = composerStartRestartGroup;
                    z2 = z3;
                    modifier3 = modifier4;
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_INTRO, null, asset.getIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1270352968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1270352968, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:320)");
                            }
                            JointAccountOnboardingAsset.Fullscreen fullscreen = asset;
                            PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged = composer2.changed(primaryUserIntroScreenCallbacks);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new C20064x3050ce6d(primaryUserIntroScreenCallbacks);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            JointAccountMotionContainer.JointAccountMotionContainer(fullscreen, true, (Function0) ((KFunction) objRememberedValue3), ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), null, null, ComposableLambda3.rememberComposableLambda(248306411, true, new AnonymousClass2(asset, snapshotState, viewState, snapshotState4AnimateFloatAsState, callbacks, snapshotState2), composer2, 54), composer2, 1572912, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function4<Column5, Float, Composer, Integer, Unit> {
                            final /* synthetic */ JointAccountOnboardingAsset.Fullscreen $asset;
                            final /* synthetic */ PrimaryUserIntroScreenCallbacks $callbacks;
                            final /* synthetic */ SnapshotState4<Float> $footerOpacity$delegate;
                            final /* synthetic */ SnapshotState<Boolean> $showFooter$delegate;
                            final /* synthetic */ SnapshotState<Boolean> $showText$delegate;
                            final /* synthetic */ JointAccountPrimaryIntroViewState.Loaded $viewState;

                            AnonymousClass2(JointAccountOnboardingAsset.Fullscreen fullscreen, SnapshotState<Boolean> snapshotState, JointAccountPrimaryIntroViewState.Loaded loaded, SnapshotState4<Float> snapshotState4, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, SnapshotState<Boolean> snapshotState2) {
                                this.$asset = fullscreen;
                                this.$showText$delegate = snapshotState;
                                this.$viewState = loaded;
                                this.$footerOpacity$delegate = snapshotState4;
                                this.$callbacks = primaryUserIntroScreenCallbacks;
                                this.$showFooter$delegate = snapshotState2;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final int invoke$lambda$1$lambda$0(int i) {
                                return i;
                            }

                            @Override // kotlin.jvm.functions.Function4
                            public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Float f, Composer composer, Integer num) {
                                invoke(column5, f, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$4$lambda$3$lambda$2(PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, JointAccountPrimaryIntroViewState.Loaded loaded) {
                                primaryUserIntroScreenCallbacks.onContinueClick(loaded.getIneligibleBottomSheet());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Column5 JointAccountMotionContainer, Float f, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(JointAccountMotionContainer, "$this$JointAccountMotionContainer");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(JointAccountMotionContainer) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i & 48) == 0) {
                                    i2 |= composer.changed(f) ? 32 : 16;
                                }
                                int i3 = i2;
                                if ((i3 & 147) == 146 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(248306411, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:326)");
                                }
                                boolean zAnimatedLoadedScreen$lambda$7 = JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$7(this.$showText$delegate);
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(this.$asset.getBodyAnimationDuration(), 0, JointAccountOnboardingPrimaryUserIntroScreenKt.PositionEasing, 2, null);
                                composer.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Integer.valueOf(JointAccountOnboardingPrimaryUserIntroScreenKt.C200631.AnonymousClass2.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(this.$asset.getBodyAnimationDuration(), 0, JointAccountOnboardingPrimaryUserIntroScreenKt.OpacityEasing, 2, null), 0.0f, 2, null));
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i4 = BentoTheme.$stable;
                                Modifier modifierWeight$default = Column5.weight$default(JointAccountMotionContainer, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
                                final JointAccountPrimaryIntroViewState.Loaded loaded = this.$viewState;
                                AnimatedVisibilityKt.AnimatedVisibility(JointAccountMotionContainer, zAnimatedLoadedScreen$lambda$7, modifierWeight$default, enterTransitionPlus, (ExitTransition) null, "text_appearance", ComposableLambda3.rememberComposableLambda(1920815891, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen.1.2.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                        invoke(animatedVisibilityScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1920815891, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:344)");
                                        }
                                        ImmutableList<UIComponent<GenericAction>> bodyComponents = loaded.getBodyComponents();
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                        composer2.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(bodyComponents, GenericAction.class, modifierVerticalScroll$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                                        composer2.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer, 54), composer, (i3 & 14) | 1769472, 8);
                                Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 1, null), JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$13(this.$footerOpacity$delegate));
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
                                final JointAccountPrimaryIntroViewState.Loaded loaded2 = this.$viewState;
                                final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = this.$callbacks;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlpha);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                ImmutableList<UIComponent<GenericAction>> footerComponents = loaded2.getFooterComponents();
                                composer.startReplaceGroup(-1772220517);
                                SduiColumns.SduiColumn(footerComponents, GenericAction.class, companion2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), false, composer, 0, 0);
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(primaryUserIntroScreenCallbacks) | composer.changedInstance(loaded2);
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return JointAccountOnboardingPrimaryUserIntroScreenKt.C200631.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(primaryUserIntroScreenCallbacks, loaded2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, loaded2.getCtaText(), TestTag3.testTag(UtilKt.autoLogEvents(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(WindowInsetsPadding_androidKt.navigationBarsPadding(companion2), 0.0f, 1, null), Component.ComponentType.BUTTON, loaded2.getCtaLoggingId(), false, composer, 48, 4), "continue_button"), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                composer.endNode();
                                float fFloatValue = f != null ? f.floatValue() : Float.MIN_VALUE;
                                if (!JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$7(this.$showText$delegate) && fFloatValue >= this.$asset.getBodyVisibilityFrame()) {
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$8(this.$showText$delegate, true);
                                }
                                if (!JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$11(this.$showFooter$delegate) && fFloatValue >= JointAccountOnboardingPrimaryUserIntroScreenKt.ShowFooterFrame) {
                                    JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$12(this.$showFooter$delegate, true);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                final boolean z6 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$14(viewState, callbacks, modifier3, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final JointAccountOnboardingAsset.Fullscreen asset2 = viewState.getAsset();
                Object[] objArr3 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i62 = i3 & 7168;
                if (i62 != 2048) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z4) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$6$lambda$5(z3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState<Boolean> snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    Object[] objArr22 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i62 != 2048) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z5) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$10$lambda$9(z3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotState<Boolean> snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                        final SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!AnimatedLoadedScreen$lambda$11(snapshotState22) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(FooterDuration, 0, OpacityEasing, 2, null), 0.0f, "footer_appearance", null, composerStartRestartGroup, 3120, 20);
                        composerStartRestartGroup = composerStartRestartGroup;
                        z2 = z3;
                        modifier3 = modifier4;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_INTRO, null, asset2.getIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1270352968, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1270352968, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:320)");
                                }
                                JointAccountOnboardingAsset.Fullscreen fullscreen = asset2;
                                PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                                composer2.startReplaceGroup(5004770);
                                boolean zChanged = composer2.changed(primaryUserIntroScreenCallbacks);
                                Object objRememberedValue3 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new C20064x3050ce6d(primaryUserIntroScreenCallbacks);
                                    composer2.updateRememberedValue(objRememberedValue3);
                                }
                                composer2.endReplaceGroup();
                                JointAccountMotionContainer.JointAccountMotionContainer(fullscreen, true, (Function0) ((KFunction) objRememberedValue3), ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), null, null, ComposableLambda3.rememberComposableLambda(248306411, true, new AnonymousClass2(asset2, snapshotState3, viewState, snapshotState4AnimateFloatAsState2, callbacks, snapshotState22), composer2, 54), composer2, 1572912, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function4<Column5, Float, Composer, Integer, Unit> {
                                final /* synthetic */ JointAccountOnboardingAsset.Fullscreen $asset;
                                final /* synthetic */ PrimaryUserIntroScreenCallbacks $callbacks;
                                final /* synthetic */ SnapshotState4<Float> $footerOpacity$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showFooter$delegate;
                                final /* synthetic */ SnapshotState<Boolean> $showText$delegate;
                                final /* synthetic */ JointAccountPrimaryIntroViewState.Loaded $viewState;

                                AnonymousClass2(JointAccountOnboardingAsset.Fullscreen fullscreen, SnapshotState<Boolean> snapshotState, JointAccountPrimaryIntroViewState.Loaded loaded, SnapshotState4<Float> snapshotState4, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, SnapshotState<Boolean> snapshotState2) {
                                    this.$asset = fullscreen;
                                    this.$showText$delegate = snapshotState;
                                    this.$viewState = loaded;
                                    this.$footerOpacity$delegate = snapshotState4;
                                    this.$callbacks = primaryUserIntroScreenCallbacks;
                                    this.$showFooter$delegate = snapshotState2;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final int invoke$lambda$1$lambda$0(int i) {
                                    return i;
                                }

                                @Override // kotlin.jvm.functions.Function4
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Float f, Composer composer, Integer num) {
                                    invoke(column5, f, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$4$lambda$3$lambda$2(PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, JointAccountPrimaryIntroViewState.Loaded loaded) {
                                    primaryUserIntroScreenCallbacks.onContinueClick(loaded.getIneligibleBottomSheet());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 JointAccountMotionContainer, Float f, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(JointAccountMotionContainer, "$this$JointAccountMotionContainer");
                                    if ((i & 6) == 0) {
                                        i2 = i | (composer.changed(JointAccountMotionContainer) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i & 48) == 0) {
                                        i2 |= composer.changed(f) ? 32 : 16;
                                    }
                                    int i3 = i2;
                                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(248306411, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:326)");
                                    }
                                    boolean zAnimatedLoadedScreen$lambda$7 = JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$7(this.$showText$delegate);
                                    TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(this.$asset.getBodyAnimationDuration(), 0, JointAccountOnboardingPrimaryUserIntroScreenKt.PositionEasing, 2, null);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return Integer.valueOf(JointAccountOnboardingPrimaryUserIntroScreenKt.C200631.AnonymousClass2.invoke$lambda$1$lambda$0(((Integer) obj).intValue()));
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(this.$asset.getBodyAnimationDuration(), 0, JointAccountOnboardingPrimaryUserIntroScreenKt.OpacityEasing, 2, null), 0.0f, 2, null));
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i4 = BentoTheme.$stable;
                                    Modifier modifierWeight$default = Column5.weight$default(JointAccountMotionContainer, PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null);
                                    final JointAccountPrimaryIntroViewState.Loaded loaded = this.$viewState;
                                    AnimatedVisibilityKt.AnimatedVisibility(JointAccountMotionContainer, zAnimatedLoadedScreen$lambda$7, modifierWeight$default, enterTransitionPlus, (ExitTransition) null, "text_appearance", ComposableLambda3.rememberComposableLambda(1920815891, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen.1.2.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                            invoke(animatedVisibilityScope, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1920815891, i5, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.AnimatedLoadedScreen.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:344)");
                                            }
                                            ImmutableList<UIComponent<GenericAction>> bodyComponents = loaded.getBodyComponents();
                                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                            composer2.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(bodyComponents, GenericAction.class, modifierVerticalScroll$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 0, 0);
                                            composer2.endReplaceGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, (i3 & 14) | 1769472, 8);
                                    Modifier modifierAlpha = Alpha.alpha(PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM(), 1, null), JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$13(this.$footerOpacity$delegate));
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
                                    final JointAccountPrimaryIntroViewState.Loaded loaded2 = this.$viewState;
                                    final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = this.$callbacks;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAlpha);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    ImmutableList<UIComponent<GenericAction>> footerComponents = loaded2.getFooterComponents();
                                    composer.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(footerComponents, GenericAction.class, companion2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion3.getStart(), false, composer, 0, 0);
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(primaryUserIntroScreenCallbacks) | composer.changedInstance(loaded2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$AnimatedLoadedScreen$1$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return JointAccountOnboardingPrimaryUserIntroScreenKt.C200631.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2(primaryUserIntroScreenCallbacks, loaded2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, loaded2.getCtaText(), TestTag3.testTag(UtilKt.autoLogEvents(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(WindowInsetsPadding_androidKt.navigationBarsPadding(companion2), 0.0f, 1, null), Component.ComponentType.BUTTON, loaded2.getCtaLoggingId(), false, composer, 48, 4), "continue_button"), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                    composer.endNode();
                                    float fFloatValue = f != null ? f.floatValue() : Float.MIN_VALUE;
                                    if (!JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$7(this.$showText$delegate) && fFloatValue >= this.$asset.getBodyVisibilityFrame()) {
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$8(this.$showText$delegate, true);
                                    }
                                    if (!JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$11(this.$showFooter$delegate) && fFloatValue >= JointAccountOnboardingPrimaryUserIntroScreenKt.ShowFooterFrame) {
                                        JointAccountOnboardingPrimaryUserIntroScreenKt.AnimatedLoadedScreen$lambda$12(this.$showFooter$delegate, true);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
            final boolean z62 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 1171) != 1170) {
        }
        final boolean z622 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AnimatedLoadedScreen$lambda$6$lambda$5(boolean z) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedLoadedScreen$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState AnimatedLoadedScreen$lambda$10$lambda$9(boolean z) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedLoadedScreen$lambda$12(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StaticLoadedScreen(final JointAccountPrimaryIntroViewState.Loaded viewState, final PrimaryUserIntroScreenCallbacks callbacks, Modifier modifier, ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollState2;
        final Modifier modifier3;
        final ScrollState scrollStateRememberScrollState;
        Composer composer2;
        final Modifier modifier4;
        final ScrollState scrollState3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1422556422);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    int i5 = composerStartRestartGroup.changed(scrollState2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    scrollState2 = scrollState;
                }
                i3 |= i5;
            } else {
                scrollState2 = scrollState;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        i3 &= -7169;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1422556422, i3, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen (JointAccountOnboardingPrimaryUserIntroScreen.kt:392)");
                    }
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    final JointAccountOnboardingAsset.Fullscreen asset = viewState.getAsset();
                    composer2 = composerStartRestartGroup;
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1276674882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1276674882, i6, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:397)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_INTRO, null, asset.getIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null));
                            final Modifier modifier5 = modifier3;
                            final JointAccountPrimaryIntroViewState.Loaded loaded = viewState;
                            final ScrollState scrollState4 = scrollStateRememberScrollState;
                            final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(1025634153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1.1

                                /* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C502581 implements Function3<Column5, Composer, Integer, Unit> {
                                    final /* synthetic */ PrimaryUserIntroScreenCallbacks $callbacks;
                                    final /* synthetic */ ScrollState $verticalScroll;
                                    final /* synthetic */ JointAccountPrimaryIntroViewState.Loaded $viewState;

                                    C502581(JointAccountPrimaryIntroViewState.Loaded loaded, ScrollState scrollState, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks) {
                                        this.$viewState = loaded;
                                        this.$verticalScroll = scrollState;
                                        this.$callbacks = primaryUserIntroScreenCallbacks;
                                    }

                                    public final void invoke(Column5 JointAccountStaticContainer, Composer composer, int i) {
                                        int i2;
                                        Intrinsics.checkNotNullParameter(JointAccountStaticContainer, "$this$JointAccountStaticContainer");
                                        if ((i & 6) == 0) {
                                            i2 = i | (composer.changed(JointAccountStaticContainer) ? 4 : 2);
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(685804437, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:413)");
                                        }
                                        ImmutableList<UIComponent<GenericAction>> bodyComponents = this.$viewState.getBodyComponents();
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(JointAccountStaticContainer, companion, 1.0f, false, 2, null), this.$verticalScroll, false, null, false, 14, null);
                                        composer.startReplaceGroup(-1772220517);
                                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Vertical top = arrangement.getTop();
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        SduiColumns.SduiColumn(bodyComponents, GenericAction.class, modifierVerticalScroll$default, null, null, horizontalPadding, top, companion2.getStart(), false, composer, 0, 0);
                                        composer.endReplaceGroup();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                                        final JointAccountPrimaryIntroViewState.Loaded loaded = this.$viewState;
                                        final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = this.$callbacks;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                                        ImmutableList<UIComponent<GenericAction>> footerComponents = loaded.getFooterComponents();
                                        composer.startReplaceGroup(-1772220517);
                                        SduiColumns.SduiColumn(footerComponents, GenericAction.class, companion, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composer, 0, 0);
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(-1633490746);
                                        boolean zChanged = composer.changed(primaryUserIntroScreenCallbacks) | composer.changedInstance(loaded);
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return JointAccountOnboardingPrimaryUserIntroScreenKt.C200731.AnonymousClass1.C502581.invoke$lambda$2$lambda$1$lambda$0(primaryUserIntroScreenCallbacks, loaded);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, loaded.getCtaText(), TestTag3.testTag(UtilKt.autoLogEvents(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), Component.ComponentType.BUTTON, loaded.getCtaLoggingId(), false, composer, 48, 4), "continue_button"), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                        composer.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                                        invoke(column5, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, JointAccountPrimaryIntroViewState.Loaded loaded) {
                                        primaryUserIntroScreenCallbacks.onContinueClick(loaded.getIneligibleBottomSheet());
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1025634153, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:410)");
                                    }
                                    JointAccountStaticContainer.JointAccountStaticContainer(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), ComposableLambda3.rememberComposableLambda(685804437, true, new C502581(loaded, scrollState4, primaryUserIntroScreenCallbacks), composer4, 54), composer4, 48, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    scrollState3 = scrollStateRememberScrollState;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                scrollStateRememberScrollState = scrollState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final JointAccountOnboardingAsset.Fullscreen asset2 = viewState.getAsset();
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1276674882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1276674882, i6, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:397)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_INTRO, null, asset2.getIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null));
                        final Modifier modifier5 = modifier3;
                        final JointAccountPrimaryIntroViewState.Loaded loaded = viewState;
                        final ScrollState scrollState4 = scrollStateRememberScrollState;
                        final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(1025634153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1.1

                            /* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C502581 implements Function3<Column5, Composer, Integer, Unit> {
                                final /* synthetic */ PrimaryUserIntroScreenCallbacks $callbacks;
                                final /* synthetic */ ScrollState $verticalScroll;
                                final /* synthetic */ JointAccountPrimaryIntroViewState.Loaded $viewState;

                                C502581(JointAccountPrimaryIntroViewState.Loaded loaded, ScrollState scrollState, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks) {
                                    this.$viewState = loaded;
                                    this.$verticalScroll = scrollState;
                                    this.$callbacks = primaryUserIntroScreenCallbacks;
                                }

                                public final void invoke(Column5 JointAccountStaticContainer, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(JointAccountStaticContainer, "$this$JointAccountStaticContainer");
                                    if ((i & 6) == 0) {
                                        i2 = i | (composer.changed(JointAccountStaticContainer) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(685804437, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:413)");
                                    }
                                    ImmutableList<UIComponent<GenericAction>> bodyComponents = this.$viewState.getBodyComponents();
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(JointAccountStaticContainer, companion, 1.0f, false, 2, null), this.$verticalScroll, false, null, false, 14, null);
                                    composer.startReplaceGroup(-1772220517);
                                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    SduiColumns.SduiColumn(bodyComponents, GenericAction.class, modifierVerticalScroll$default, null, null, horizontalPadding, top, companion2.getStart(), false, composer, 0, 0);
                                    composer.endReplaceGroup();
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i3 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                                    final JointAccountPrimaryIntroViewState.Loaded loaded = this.$viewState;
                                    final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = this.$callbacks;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                                    ImmutableList<UIComponent<GenericAction>> footerComponents = loaded.getFooterComponents();
                                    composer.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(footerComponents, GenericAction.class, companion, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composer, 0, 0);
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(primaryUserIntroScreenCallbacks) | composer.changedInstance(loaded);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return JointAccountOnboardingPrimaryUserIntroScreenKt.C200731.AnonymousClass1.C502581.invoke$lambda$2$lambda$1$lambda$0(primaryUserIntroScreenCallbacks, loaded);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, loaded.getCtaText(), TestTag3.testTag(UtilKt.autoLogEvents(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), Component.ComponentType.BUTTON, loaded.getCtaLoggingId(), false, composer, 48, 4), "continue_button"), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                                    invoke(column5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, JointAccountPrimaryIntroViewState.Loaded loaded) {
                                    primaryUserIntroScreenCallbacks.onContinueClick(loaded.getIneligibleBottomSheet());
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1025634153, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:410)");
                                }
                                JointAccountStaticContainer.JointAccountStaticContainer(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), ComposableLambda3.rememberComposableLambda(685804437, true, new C502581(loaded, scrollState4, primaryUserIntroScreenCallbacks), composer4, 54), composer4, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                scrollState3 = scrollStateRememberScrollState;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                scrollState3 = scrollState2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen$lambda$15(viewState, callbacks, modifier4, scrollState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) == 0) {
                    scrollStateRememberScrollState = scrollState2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final UserInteractionEventDescriptor userInteractionEventDescriptor22 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                final JointAccountOnboardingAsset.Fullscreen asset22 = viewState.getAsset();
                composer2 = composerStartRestartGroup;
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1276674882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1276674882, i6, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:397)");
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor22, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_PRIMARY_INTRO, null, asset22.getIdentifier(), null, 10, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, viewState.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null));
                        final Modifier modifier5 = modifier3;
                        final JointAccountPrimaryIntroViewState.Loaded loaded = viewState;
                        final ScrollState scrollState4 = scrollStateRememberScrollState;
                        final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = callbacks;
                        AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(1025634153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt.StaticLoadedScreen.1.1

                            /* compiled from: JointAccountOnboardingPrimaryUserIntroScreen.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C502581 implements Function3<Column5, Composer, Integer, Unit> {
                                final /* synthetic */ PrimaryUserIntroScreenCallbacks $callbacks;
                                final /* synthetic */ ScrollState $verticalScroll;
                                final /* synthetic */ JointAccountPrimaryIntroViewState.Loaded $viewState;

                                C502581(JointAccountPrimaryIntroViewState.Loaded loaded, ScrollState scrollState, PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks) {
                                    this.$viewState = loaded;
                                    this.$verticalScroll = scrollState;
                                    this.$callbacks = primaryUserIntroScreenCallbacks;
                                }

                                public final void invoke(Column5 JointAccountStaticContainer, Composer composer, int i) {
                                    int i2;
                                    Intrinsics.checkNotNullParameter(JointAccountStaticContainer, "$this$JointAccountStaticContainer");
                                    if ((i & 6) == 0) {
                                        i2 = i | (composer.changed(JointAccountStaticContainer) ? 4 : 2);
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(685804437, i2, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:413)");
                                    }
                                    ImmutableList<UIComponent<GenericAction>> bodyComponents = this.$viewState.getBodyComponents();
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(JointAccountStaticContainer, companion, 1.0f, false, 2, null), this.$verticalScroll, false, null, false, 14, null);
                                    composer.startReplaceGroup(-1772220517);
                                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    SduiColumns.SduiColumn(bodyComponents, GenericAction.class, modifierVerticalScroll$default, null, null, horizontalPadding, top, companion2.getStart(), false, composer, 0, 0);
                                    composer.endReplaceGroup();
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i3 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                                    final JointAccountPrimaryIntroViewState.Loaded loaded = this.$viewState;
                                    final PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks = this.$callbacks;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer, 48);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                                    ImmutableList<UIComponent<GenericAction>> footerComponents = loaded.getFooterComponents();
                                    composer.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(footerComponents, GenericAction.class, companion, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composer, 0, 0);
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(primaryUserIntroScreenCallbacks) | composer.changedInstance(loaded);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.intro.primary.JointAccountOnboardingPrimaryUserIntroScreenKt$StaticLoadedScreen$1$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return JointAccountOnboardingPrimaryUserIntroScreenKt.C200731.AnonymousClass1.C502581.invoke$lambda$2$lambda$1$lambda$0(primaryUserIntroScreenCallbacks, loaded);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, loaded.getCtaText(), TestTag3.testTag(UtilKt.autoLogEvents(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), Component.ComponentType.BUTTON, loaded.getCtaLoggingId(), false, composer, 48, 4), "continue_button"), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer, Integer num) {
                                    invoke(column5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$2$lambda$1$lambda$0(PrimaryUserIntroScreenCallbacks primaryUserIntroScreenCallbacks, JointAccountPrimaryIntroViewState.Loaded loaded) {
                                    primaryUserIntroScreenCallbacks.onContinueClick(loaded.getIneligibleBottomSheet());
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1025634153, i7, -1, "com.robinhood.android.jointaccounts.onboarding.intro.primary.StaticLoadedScreen.<anonymous>.<anonymous> (JointAccountOnboardingPrimaryUserIntroScreen.kt:410)");
                                }
                                JointAccountStaticContainer.JointAccountStaticContainer(ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null), ComposableLambda3.rememberComposableLambda(685804437, true, new C502581(loaded, scrollState4, primaryUserIntroScreenCallbacks), composer4, 54), composer4, 48, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                scrollState3 = scrollStateRememberScrollState;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: copy-ek8zF_U, reason: not valid java name */
    private static final long m15775copyek8zF_U(long j, float f, float f2) {
        return Color.m6703convertvNxB06k(Color.m6705copywmQWz5c$default(Color.m6703convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab()), f, f2, 0.0f, 0.0f, 12, null), Color.m6710getColorSpaceimpl(j));
    }
}
