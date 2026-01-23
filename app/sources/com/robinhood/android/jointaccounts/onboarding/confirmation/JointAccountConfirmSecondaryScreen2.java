package com.robinhood.android.jointaccounts.onboarding.confirmation;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
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
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreen2;
import com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.jointaccounts.api.confirmation.ApiConfirmSecondaryViewModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.extensions2;

/* compiled from: JointAccountConfirmSecondaryScreen.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0015\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"RejectSecondaryConfirmationDialog", "", "alert", "Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel$RejectAlert;", "postingRejection", "", "onReject", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/jointaccounts/api/confirmation/ApiConfirmSecondaryViewModel$RejectAlert;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConfirmSecondaryLoadedScreen", "state", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loaded;", "callbacks", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/ConfirmSecondaryCallbacks;", "(Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState$Loaded;Lcom/robinhood/android/jointaccounts/onboarding/confirmation/ConfirmSecondaryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConfirmSecondaryLoadingTestTag", "", "ConfirmSecondaryErrorTestTag", "ConfirmSecondaryScreen", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;", "(Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;Lcom/robinhood/android/jointaccounts/onboarding/confirmation/ConfirmSecondaryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewConfirmSecondaryScreen", "(Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryViewState;Landroidx/compose/runtime/Composer;I)V", "feature-joint-account-onboarding_externalDebug", "showingRejectConfirmationDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountConfirmSecondaryScreen2 {
    public static final String ConfirmSecondaryErrorTestTag = "confirm_secondary_error";
    public static final String ConfirmSecondaryLoadingTestTag = "confirm_secondary_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmSecondaryLoadedScreen$lambda$5(JointAccountConfirmSecondaryViewState.Loaded loaded, JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConfirmSecondaryLoadedScreen(loaded, jointAccountConfirmSecondaryScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmSecondaryScreen$lambda$6(JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState, JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConfirmSecondaryScreen(jointAccountConfirmSecondaryViewState, jointAccountConfirmSecondaryScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewConfirmSecondaryScreen$lambda$7(JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState, int i, Composer composer, int i2) {
        PreviewConfirmSecondaryScreen(jointAccountConfirmSecondaryViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RejectSecondaryConfirmationDialog$lambda$0(ApiConfirmSecondaryViewModel.RejectAlert rejectAlert, boolean z, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RejectSecondaryConfirmationDialog(rejectAlert, z, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RejectSecondaryConfirmationDialog(final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert2;
        int i3;
        final boolean z2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-577735435);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            rejectAlert2 = rejectAlert;
        } else {
            rejectAlert2 = rejectAlert;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(rejectAlert2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function03 = function0;
        } else {
            function03 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function04 = function02;
        } else {
            function04 = function02;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-577735435, i3, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog (JointAccountConfirmSecondaryScreen.kt:76)");
                }
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(-2089215958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1
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
                            ComposerKt.traceEventStart(-2089215958, i5, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous> (JointAccountConfirmSecondaryScreen.kt:86)");
                        }
                        final Function0<Unit> function05 = function04;
                        final Modifier modifier5 = modifier4;
                        final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert3 = rejectAlert2;
                        final Function0<Unit> function06 = function03;
                        final boolean z3 = z2;
                        AndroidDialog_androidKt.Dialog(function05, null, ComposableLambda3.rememberComposableLambda(1506526657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1
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
                                    ComposerKt.traceEventStart(1506526657, i6, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:89)");
                                }
                                final Modifier modifier6 = modifier5;
                                final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert4 = rejectAlert3;
                                final Function0<Unit> function07 = function06;
                                final boolean z4 = z3;
                                final Function0<Unit> function08 = function05;
                                BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(662900191, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1.1
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
                                            ComposerKt.traceEventStart(662900191, i7, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:90)");
                                        }
                                        BentoTheme4 bentoTheme4 = BentoTheme4.NEGATIVE;
                                        final Modifier modifier7 = modifier6;
                                        final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert5 = rejectAlert4;
                                        final Function0<Unit> function09 = function07;
                                        final boolean z5 = z4;
                                        final Function0<Unit> function010 = function08;
                                        BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-1319024263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1.1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                invoke(composer5, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer5, int i8) {
                                                if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1319024263, i8, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:93)");
                                                }
                                                Modifier modifierClip = Clip.clip(modifier7, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i9 = BentoTheme.$stable;
                                                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composer5, i9).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM());
                                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer5, i9).m21593getSmallD9Ej5fM());
                                                ApiConfirmSecondaryViewModel.RejectAlert rejectAlert6 = rejectAlert5;
                                                Function0<Unit> function011 = function09;
                                                boolean z6 = z5;
                                                Function0<Unit> function012 = function010;
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer5, 48);
                                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                                if (composer5.getApplier() == null) {
                                                    Composables.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                                Column6 column6 = Column6.INSTANCE;
                                                String title = rejectAlert6.getTitle();
                                                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer5, i9).getDisplayCapsuleSmall();
                                                TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer5, 0, 0, 8126);
                                                String message = rejectAlert6.getMessage();
                                                int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                                BentoText2.m20747BentoText38GnDrw(message, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16316);
                                                String primary_button_text = rejectAlert6.getPrimary_button_text();
                                                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                                                BentoButtonKt.m20586BentoButtonEikTQX8(function011, primary_button_text, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, rejectAlert6.getPrimary_button_logging_identifier(), false, composer5, 54, 4), null, type2, false, z6, null, null, null, null, false, null, composer5, 24576, 0, 8104);
                                                String secondary_button_text = rejectAlert6.getSecondary_button_text();
                                                composer5.startReplaceGroup(1714368152);
                                                if (secondary_button_text != null) {
                                                    BentoButtonKt.m20586BentoButtonEikTQX8(function012, secondary_button_text, UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), componentType, rejectAlert6.getSecondary_button_logging_identifier(), false, composer5, 54, 4), null, BentoButtons.Type.Secondary, !z6, false, null, null, null, null, false, null, composer5, 24576, 0, 8136);
                                                }
                                                composer5.endReplaceGroup();
                                                composer5.endNode();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 54);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountConfirmSecondaryScreen2.RejectSecondaryConfirmationDialog$lambda$0(rejectAlert, z, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(-2089215958, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1
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
                        ComposerKt.traceEventStart(-2089215958, i5, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous> (JointAccountConfirmSecondaryScreen.kt:86)");
                    }
                    final Function0<Unit> function05 = function04;
                    final Modifier modifier5 = modifier4;
                    final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert3 = rejectAlert2;
                    final Function0<Unit> function06 = function03;
                    final boolean z3 = z2;
                    AndroidDialog_androidKt.Dialog(function05, null, ComposableLambda3.rememberComposableLambda(1506526657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1
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
                                ComposerKt.traceEventStart(1506526657, i6, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:89)");
                            }
                            final Modifier modifier6 = modifier5;
                            final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert4 = rejectAlert3;
                            final Function0<Unit> function07 = function06;
                            final boolean z4 = z3;
                            final Function0<Unit> function08 = function05;
                            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(662900191, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1.1
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
                                        ComposerKt.traceEventStart(662900191, i7, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:90)");
                                    }
                                    BentoTheme4 bentoTheme4 = BentoTheme4.NEGATIVE;
                                    final Modifier modifier7 = modifier6;
                                    final ApiConfirmSecondaryViewModel.RejectAlert rejectAlert5 = rejectAlert4;
                                    final Function0<Unit> function09 = function07;
                                    final boolean z5 = z4;
                                    final Function0<Unit> function010 = function08;
                                    BentoThemeOverlays.DirectionThemeOverlay(bentoTheme4, ComposableLambda3.rememberComposableLambda(-1319024263, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.RejectSecondaryConfirmationDialog.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i8) {
                                            if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                                composer5.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1319024263, i8, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.RejectSecondaryConfirmationDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:93)");
                                            }
                                            Modifier modifierClip = Clip.clip(modifier7, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i9 = BentoTheme.$stable;
                                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(Background3.m4872backgroundbw27NRU$default(modifierClip, bentoTheme.getColors(composer5, i9).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM());
                                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer5, i9).m21593getSmallD9Ej5fM());
                                            ApiConfirmSecondaryViewModel.RejectAlert rejectAlert6 = rejectAlert5;
                                            Function0<Unit> function011 = function09;
                                            boolean z6 = z5;
                                            Function0<Unit> function012 = function010;
                                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally, composer5, 48);
                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            if (composer5.getApplier() == null) {
                                                Composables.invalidApplier();
                                            }
                                            composer5.startReusableNode();
                                            if (composer5.getInserting()) {
                                                composer5.createNode(constructor);
                                            } else {
                                                composer5.useNode();
                                            }
                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                            Column6 column6 = Column6.INSTANCE;
                                            String title = rejectAlert6.getTitle();
                                            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer5, i9).getDisplayCapsuleSmall();
                                            TextAlign.Companion companion2 = TextAlign.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer5, 0, 0, 8126);
                                            String message = rejectAlert6.getMessage();
                                            int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                                            Modifier.Companion companion3 = Modifier.INSTANCE;
                                            BentoText2.m20747BentoText38GnDrw(message, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer5, i9).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16316);
                                            String primary_button_text = rejectAlert6.getPrimary_button_text();
                                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                                            Component.ComponentType componentType = Component.ComponentType.BUTTON;
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function011, primary_button_text, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, rejectAlert6.getPrimary_button_logging_identifier(), false, composer5, 54, 4), null, type2, false, z6, null, null, null, null, false, null, composer5, 24576, 0, 8104);
                                            String secondary_button_text = rejectAlert6.getSecondary_button_text();
                                            composer5.startReplaceGroup(1714368152);
                                            if (secondary_button_text != null) {
                                                BentoButtonKt.m20586BentoButtonEikTQX8(function012, secondary_button_text, UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), componentType, rejectAlert6.getSecondary_button_logging_identifier(), false, composer5, 54, 4), null, BentoButtons.Type.Secondary, !z6, false, null, null, null, null, false, null, composer5, 24576, 0, 8136);
                                            }
                                            composer5.endReplaceGroup();
                                            composer5.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer4, 54), composer4, 54);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ConfirmSecondaryLoadedScreen$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmSecondaryLoadedScreen(final JointAccountConfirmSecondaryViewState.Loaded loaded, final JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen, Modifier modifier, Composer composer, final int i, final int i2) {
        JointAccountConfirmSecondaryViewState.Loaded loaded2;
        int i3;
        JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen2;
        final Modifier modifier2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1831915354);
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
            jointAccountConfirmSecondaryScreen2 = jointAccountConfirmSecondaryScreen;
        } else {
            jointAccountConfirmSecondaryScreen2 = jointAccountConfirmSecondaryScreen;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(jointAccountConfirmSecondaryScreen2) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1831915354, i3, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryLoadedScreen (JointAccountConfirmSecondaryScreen.kt:153)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                ApiConfirmSecondaryViewModel viewModel = loaded2.getViewModel();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen$lambda$2$lambda$1();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier3;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_CONFIRM_SECONDARY, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, loaded2.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1204495857, true, new C200201(modifier4, viewModel, loaded2, jointAccountConfirmSecondaryScreen2, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen$lambda$5(loaded, jointAccountConfirmSecondaryScreen, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            ApiConfirmSecondaryViewModel viewModel2 = loaded2.getViewModel();
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier42 = modifier3;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.JOINT_ACCOUNT_CONFIRM_SECONDARY, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, loaded2.getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null)), ComposableLambda3.rememberComposableLambda(-1204495857, true, new C200201(modifier42, viewModel2, loaded2, jointAccountConfirmSecondaryScreen2, (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6)), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState ConfirmSecondaryLoadedScreen$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConfirmSecondaryLoadedScreen$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: JointAccountConfirmSecondaryScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1 */
    static final class C200201 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ JointAccountConfirmSecondaryScreen $callbacks;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotState<Boolean> $showingRejectConfirmationDialog$delegate;
        final /* synthetic */ JointAccountConfirmSecondaryViewState.Loaded $state;
        final /* synthetic */ ApiConfirmSecondaryViewModel $viewModel;

        C200201(Modifier modifier, ApiConfirmSecondaryViewModel apiConfirmSecondaryViewModel, JointAccountConfirmSecondaryViewState.Loaded loaded, JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen, SnapshotState<Boolean> snapshotState) {
            this.$modifier = modifier;
            this.$viewModel = apiConfirmSecondaryViewModel;
            this.$state = loaded;
            this.$callbacks = jointAccountConfirmSecondaryScreen;
            this.$showingRejectConfirmationDialog$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(final ApiConfirmSecondaryViewModel apiConfirmSecondaryViewModel, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-664363942, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1$1$1$1$1
                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-664363942, i, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryLoadedScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:180)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
                    ApiConfirmSecondaryViewModel apiConfirmSecondaryViewModel2 = apiConfirmSecondaryViewModel;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
                    BentoText2.m20747BentoText38GnDrw(apiConfirmSecondaryViewModel2.getTitle_text(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                    BentoText2.m20747BentoText38GnDrw(apiConfirmSecondaryViewModel2.getSubtitle_text(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }
            }), 3, null);
            SduiColumns.sduiItems(LazyColumn, extensions2.toImmutableList(apiConfirmSecondaryViewModel.getPost_title_components()), GenericAction.class, null, null, HorizontalPadding.Default);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState) {
            JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen$lambda$4(snapshotState, true);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204495857, i, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryLoadedScreen.<anonymous> (JointAccountConfirmSecondaryScreen.kt:171)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(WindowInsetsPadding_androidKt.navigationBarsPadding(this.$modifier), null, 1, null);
            final ApiConfirmSecondaryViewModel apiConfirmSecondaryViewModel = this.$viewModel;
            Object obj = this.$callbacks;
            final SnapshotState<Boolean> snapshotState = this.$showingRejectConfirmationDialog$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierLogScreenTransitions$default);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(apiConfirmSecondaryViewModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return JointAccountConfirmSecondaryScreen2.C200201.invoke$lambda$6$lambda$1$lambda$0(apiConfirmSecondaryViewModel, (LazyListScope) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), companion.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(obj);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new JointAccountConfirmSecondaryScreen4(obj);
                composer.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            composer.endReplaceGroup();
            String primary_button_text = apiConfirmSecondaryViewModel.getPrimary_button_text();
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) kFunction, primary_button_text, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, apiConfirmSecondaryViewModel.getPrimary_button_logging_identifier(), false, composer, 54, 4), null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            String secondary_button_text = apiConfirmSecondaryViewModel.getSecondary_button_text();
            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
            Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), componentType, apiConfirmSecondaryViewModel.getSecondary_button_logging_identifier(), false, composer, 54, 4);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(snapshotState);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return JointAccountConfirmSecondaryScreen2.C200201.invoke$lambda$6$lambda$5$lambda$4$lambda$3(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, secondary_button_text, modifierAutoLogEvents, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            composer.endNode();
            if (JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen$lambda$3(this.$showingRejectConfirmationDialog$delegate)) {
                ApiConfirmSecondaryViewModel.RejectAlert reject_application_alert = this.$viewModel.getReject_application_alert();
                boolean postingRejection = this.$state.getPostingRejection();
                Object obj2 = this.$callbacks;
                composer.startReplaceGroup(5004770);
                boolean zChanged3 = composer.changed(obj2);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new JointAccountConfirmSecondaryScreen5(obj2);
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) objRememberedValue4);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$state) | composer.changed(this.$showingRejectConfirmationDialog$delegate);
                final JointAccountConfirmSecondaryViewState.Loaded loaded = this.$state;
                final SnapshotState<Boolean> snapshotState2 = this.$showingRejectConfirmationDialog$delegate;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$ConfirmSecondaryLoadedScreen$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return JointAccountConfirmSecondaryScreen2.C200201.invoke$lambda$9$lambda$8(loaded, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                JointAccountConfirmSecondaryScreen2.RejectSecondaryConfirmationDialog(reject_application_alert, postingRejection, function0, (Function0) objRememberedValue5, null, composer, 0, 16);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(JointAccountConfirmSecondaryViewState.Loaded loaded, SnapshotState snapshotState) {
            if (!loaded.getPostingRejection()) {
                JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen$lambda$4(snapshotState, false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void ConfirmSecondaryScreen(final JointAccountConfirmSecondaryViewState state, final JointAccountConfirmSecondaryScreen callbacks, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-247754951);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-247754951, i3, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryScreen (JointAccountConfirmSecondaryScreen.kt:254)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-639604412, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.ConfirmSecondaryScreen.1
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
                        ComposerKt.traceEventStart(-639604412, i5, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryScreen.<anonymous> (JointAccountConfirmSecondaryScreen.kt:256)");
                    }
                    final JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState = state;
                    final Modifier modifier2 = modifier;
                    final JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen = callbacks;
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, null, ComposableLambda3.rememberComposableLambda(1338756210, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.ConfirmSecondaryScreen.1.1
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
                                ComposerKt.traceEventStart(1338756210, i6, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.ConfirmSecondaryScreen.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:257)");
                            }
                            JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState2 = jointAccountConfirmSecondaryViewState;
                            if (jointAccountConfirmSecondaryViewState2 instanceof JointAccountConfirmSecondaryViewState.Error) {
                                composer3.startReplaceGroup(-179956988);
                                Modifier modifierTestTag = TestTag3.testTag(modifier2, JointAccountConfirmSecondaryScreen2.ConfirmSecondaryErrorTestTag);
                                JointAccountConfirmSecondaryScreen jointAccountConfirmSecondaryScreen2 = jointAccountConfirmSecondaryScreen;
                                composer3.startReplaceGroup(5004770);
                                boolean zChanged = composer3.changed(jointAccountConfirmSecondaryScreen2);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new JointAccountConfirmSecondaryScreen6(jointAccountConfirmSecondaryScreen2);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                ErrorScreenComposable.ErrorScreenComposable(modifierTestTag, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                                composer3.endReplaceGroup();
                            } else if (jointAccountConfirmSecondaryViewState2 instanceof JointAccountConfirmSecondaryViewState.Loaded) {
                                composer3.startReplaceGroup(-179654862);
                                JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadedScreen((JointAccountConfirmSecondaryViewState.Loaded) jointAccountConfirmSecondaryViewState, jointAccountConfirmSecondaryScreen, modifier2, composer3, 0, 0);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(jointAccountConfirmSecondaryViewState2 instanceof JointAccountConfirmSecondaryViewState.Loading)) {
                                    composer3.startReplaceGroup(-1945469311);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(-179355371);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(TestTag3.testTag(modifier2, JointAccountConfirmSecondaryScreen2.ConfirmSecondaryLoadingTestTag), 0.0f, 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                LoadingScreenComposablesKt.ListLoadingScreenComposable(null, true, true, 1, composer3, 3504, 1);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 24576, 15);
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
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountConfirmSecondaryScreen2.ConfirmSecondaryScreen$lambda$6(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewConfirmSecondaryScreen(final JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1429286074);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(jointAccountConfirmSecondaryViewState) : composerStartRestartGroup.changedInstance(jointAccountConfirmSecondaryViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429286074, i2, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.PreviewConfirmSecondaryScreen (JointAccountConfirmSecondaryScreen.kt:297)");
            }
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE)}, ComposableLambda3.rememberComposableLambda(1236269062, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.PreviewConfirmSecondaryScreen.1
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
                        ComposerKt.traceEventStart(1236269062, i3, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.PreviewConfirmSecondaryScreen.<anonymous> (JointAccountConfirmSecondaryScreen.kt:303)");
                    }
                    final JointAccountConfirmSecondaryViewState jointAccountConfirmSecondaryViewState2 = jointAccountConfirmSecondaryViewState;
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1759937602, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.PreviewConfirmSecondaryScreen.1.1
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
                                ComposerKt.traceEventStart(-1759937602, i4, -1, "com.robinhood.android.jointaccounts.onboarding.confirmation.PreviewConfirmSecondaryScreen.<anonymous>.<anonymous> (JointAccountConfirmSecondaryScreen.kt:304)");
                            }
                            JointAccountConfirmSecondaryScreen2.ConfirmSecondaryScreen(jointAccountConfirmSecondaryViewState2, new JointAccountConfirmSecondaryScreen() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt.PreviewConfirmSecondaryScreen.1.1.1
                                @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreen
                                public void onConfirmClicked() {
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreen
                                public void onRejectClicked() {
                                }

                                @Override // com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreen
                                public void onRetryClicked() {
                                }
                            }, null, composer3, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.confirmation.JointAccountConfirmSecondaryScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return JointAccountConfirmSecondaryScreen2.PreviewConfirmSecondaryScreen$lambda$7(jointAccountConfirmSecondaryViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
