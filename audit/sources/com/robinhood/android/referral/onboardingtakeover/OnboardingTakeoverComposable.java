package com.robinhood.android.referral.onboardingtakeover;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.ReferralLandingSdui;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.OnboardingWelcomeTakeoverAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.compose.focus.Focusable6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OnboardingTakeoverComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"OnboardingTakeoverComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lcom/robinhood/models/api/ReferralLandingSdui;", "onCloseClicked", "Lkotlin/Function0;", "onDeepLinkClicked", "Lkotlin/Function1;", "", "onEmailSubmitted", "onPresentAlert", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingWelcomeTakeoverAction;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/api/ReferralLandingSdui;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TopBarComposable", "topBarContent", "Lcom/robinhood/models/api/ReferralLandingSdui$TitleBar;", "onClickClose", "onActionClick", "(Lcom/robinhood/models/api/ReferralLandingSdui$TitleBar;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class OnboardingTakeoverComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OnboardingTakeoverComposable$lambda$1(Modifier modifier, ReferralLandingSdui referralLandingSdui, Function0 function0, Function1 function1, Function1 function12, Function1 function13, int i, int i2, Composer composer, int i3) {
        OnboardingTakeoverComposable(modifier, referralLandingSdui, function0, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopBarComposable$lambda$2(ReferralLandingSdui.TitleBar titleBar, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        TopBarComposable(titleBar, function0, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void OnboardingTakeoverComposable(Modifier modifier, final ReferralLandingSdui content, final Function0<Unit> onCloseClicked, final Function1<? super String, Unit> onDeepLinkClicked, final Function1<? super String, Unit> onEmailSubmitted, final Function1<? super AlertAction<? extends OnboardingWelcomeTakeoverAction>, Unit> onPresentAlert, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(onDeepLinkClicked, "onDeepLinkClicked");
        Intrinsics.checkNotNullParameter(onEmailSubmitted, "onEmailSubmitted");
        Intrinsics.checkNotNullParameter(onPresentAlert, "onPresentAlert");
        Composer composerStartRestartGroup = composer.startRestartGroup(1855234966);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDeepLinkClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEmailSubmitted) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPresentAlert) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1855234966, i3, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable (OnboardingTakeoverComposable.kt:37)");
            }
            FocusRequester focusRequester = new FocusRequester();
            Focusable6.Focusable(focusRequester, ComposableLambda3.rememberComposableLambda(663478012, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.OnboardingTakeoverComposable.1
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
                        ComposerKt.traceEventStart(663478012, i5, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable.<anonymous> (OnboardingTakeoverComposable.kt:40)");
                    }
                    final ReferralLandingSdui referralLandingSdui = content;
                    final Function0<Unit> function0 = onCloseClicked;
                    final Function1<String, Unit> function1 = onDeepLinkClicked;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1000032873, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.OnboardingTakeoverComposable.1.1
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
                                ComposerKt.traceEventStart(-1000032873, i6, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable.<anonymous>.<anonymous> (OnboardingTakeoverComposable.kt:42)");
                            }
                            OnboardingTakeoverComposable.TopBarComposable(referralLandingSdui.getTitle_bar(), function0, function1, composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    final Modifier modifier4 = modifier3;
                    final ReferralLandingSdui referralLandingSdui2 = content;
                    final Function1<String, Unit> function12 = onEmailSubmitted;
                    final Function1<String, Unit> function13 = onDeepLinkClicked;
                    final Function1<AlertAction<? extends OnboardingWelcomeTakeoverAction>, Unit> function14 = onPresentAlert;
                    final Function0<Unit> function02 = onCloseClicked;
                    ScaffoldKt.m5625Scaffold27mzLpw(null, null, composableLambdaRememberComposableLambda, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, 0L, ComposableLambda3.rememberComposableLambda(-1617371522, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.OnboardingTakeoverComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final PaddingValues paddingValues, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = (composer3.changed(paddingValues) ? 4 : 2) | i6;
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617371522, i7, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable.<anonymous>.<anonymous> (OnboardingTakeoverComposable.kt:46)");
                            }
                            final SduiStateHandler3 sduiStateHandler3RememberStateHandler = SduiStateHandler2.rememberStateHandler(composer3, 0);
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), paddingValues);
                            final Modifier modifier5 = modifier4;
                            final ReferralLandingSdui referralLandingSdui3 = referralLandingSdui2;
                            final Function1<String, Unit> function15 = function12;
                            final Function1<String, Unit> function16 = function13;
                            final Function1<AlertAction<? extends OnboardingWelcomeTakeoverAction>, Unit> function17 = function14;
                            final Function0<Unit> function03 = function02;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(790156531, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.OnboardingTakeoverComposable.1.2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer4, Integer num) {
                                    invoke(bentoButtonBar3, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(790156531, i8, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable.<anonymous>.<anonymous>.<anonymous> (OnboardingTakeoverComposable.kt:52)");
                                    }
                                    Modifier modifierPadding2 = PaddingKt.padding(ModifiersKt.autoLogEvents$default(modifier5, null, true, false, false, true, false, null, 109, null), paddingValues);
                                    ImmutableList immutableList = extensions2.toImmutableList(referralLandingSdui3.getFooter_components());
                                    composer4.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer4.changedInstance(sduiStateHandler3RememberStateHandler) | composer4.changed(function15) | composer4.changed(function16) | composer4.changed(function17) | composer4.changed(function03);
                                    final SduiStateHandler3 sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
                                    final Function1<String, Unit> function18 = function15;
                                    final Function1<String, Unit> function19 = function16;
                                    final Function1<AlertAction<? extends OnboardingWelcomeTakeoverAction>, Unit> function110 = function17;
                                    final Function0<Unit> function04 = function03;
                                    Object objRememberedValue = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        SduiActionHandler sduiActionHandler = new SduiActionHandler() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt$OnboardingTakeoverComposable$1$2$1$1$1
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                            public final boolean mo15941handle(OnboardingWelcomeTakeoverAction action) {
                                                Intrinsics.checkNotNullParameter(action, "action");
                                                if (action instanceof OnboardingWelcomeTakeoverAction.SubmitForm) {
                                                    OnboardingWelcomeTakeoverAction.SubmitForm submitForm = (OnboardingWelcomeTakeoverAction.SubmitForm) action;
                                                    if (sduiStateHandler3.validateComponents(submitForm.getValue2().getValidate_on_submit(), true)) {
                                                        Object obj = sduiStateHandler3.serverValueStates().get(submitForm.getValue2().getValue());
                                                        String string2 = obj != null ? obj.toString() : null;
                                                        if (string2 != null) {
                                                            function18.invoke(string2);
                                                        }
                                                    }
                                                } else if (action instanceof OnboardingWelcomeTakeoverAction.Deeplink) {
                                                    function19.invoke(((OnboardingWelcomeTakeoverAction.Deeplink) action).getValue2().getUri());
                                                } else if (action instanceof OnboardingWelcomeTakeoverAction.InfoAlert) {
                                                    function110.invoke(((OnboardingWelcomeTakeoverAction.InfoAlert) action).getValue2());
                                                } else {
                                                    if (!(action instanceof OnboardingWelcomeTakeoverAction.Dismiss)) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    function04.invoke();
                                                }
                                                return true;
                                            }
                                        };
                                        composer4.updateRememberedValue(sduiActionHandler);
                                        objRememberedValue = sduiActionHandler;
                                    }
                                    composer4.endReplaceGroup();
                                    SduiStateHandler3 sduiStateHandler32 = sduiStateHandler3RememberStateHandler;
                                    int i9 = (SduiStateHandler3.$stable << 6) | 12582912;
                                    composer4.startReplaceGroup(-1772220517);
                                    int i10 = i9 & 14;
                                    int i11 = i9 << 3;
                                    SduiColumns.SduiColumn(immutableList, OnboardingWelcomeTakeoverAction.class, modifierPadding2, sduiStateHandler32, (SduiActionHandler) objRememberedValue, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), true, composer4, i10 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            final Modifier modifier6 = modifier4;
                            final ReferralLandingSdui referralLandingSdui4 = referralLandingSdui2;
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifierPadding, false, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(-1716613274, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.OnboardingTakeoverComposable.1.2.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                    invoke(boxScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer4, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                    if ((i8 & 17) == 16 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1716613274, i8, -1, "com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposable.<anonymous>.<anonymous>.<anonymous> (OnboardingTakeoverComposable.kt:92)");
                                    }
                                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(modifier6, paddingValues), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                                    ImmutableList immutableList = extensions2.toImmutableList(referralLandingSdui4.getBody_components());
                                    SduiStateHandler3 sduiStateHandler3 = sduiStateHandler3RememberStateHandler;
                                    int i9 = (SduiStateHandler3.$stable << 6) | 12582912;
                                    composer4.startReplaceGroup(-1772220517);
                                    int i10 = i9 & 14;
                                    int i11 = i9 << 3;
                                    SduiColumns.SduiColumn(immutableList, OnboardingWelcomeTakeoverAction.class, modifierVerticalScroll$default, sduiStateHandler3, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer4, i10 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (i11 & 234881024), 0);
                                    composer4.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 3456, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 12582912, 98299);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(focusRequester);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OnboardingTakeoverComposable3(focusRequester, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingTakeoverComposable.OnboardingTakeoverComposable$lambda$1(modifier2, content, onCloseClicked, onDeepLinkClicked, onEmailSubmitted, onPresentAlert, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopBarComposable(final ReferralLandingSdui.TitleBar titleBar, final Function0<Unit> function0, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1321251045);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(titleBar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1321251045, i2, -1, "com.robinhood.android.referral.onboardingtakeover.TopBarComposable (OnboardingTakeoverComposable.kt:114)");
            }
            composer2 = composerStartRestartGroup;
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1516918638, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.TopBarComposable.1
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
                        ComposerKt.traceEventStart(-1516918638, i3, -1, "com.robinhood.android.referral.onboardingtakeover.TopBarComposable.<anonymous> (OnboardingTakeoverComposable.kt:123)");
                    }
                    String title = titleBar.getTitle();
                    if (title != null) {
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-2100601114, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt.TopBarComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                    invoke(bentoAppBarScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i3 & 6) == 0) {
                        i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2100601114, i3, -1, "com.robinhood.android.referral.onboardingtakeover.TopBarComposable.<anonymous> (OnboardingTakeoverComposable.kt:117)");
                    }
                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(TestTag3.testTag(Modifier.INSTANCE, "closeButton"), false, 0L, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-550378233, true, new C267483(titleBar, function1), composerStartRestartGroup, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingTakeoverComposable.TopBarComposable$lambda$2(titleBar, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OnboardingTakeoverComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt$TopBarComposable$3 */
    static final class C267483 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onActionClick;
        final /* synthetic */ ReferralLandingSdui.TitleBar $topBarContent;

        /* JADX WARN: Multi-variable type inference failed */
        C267483(ReferralLandingSdui.TitleBar titleBar, Function1<? super String, Unit> function1) {
            this.$topBarContent = titleBar;
            this.$onActionClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-550378233, i, -1, "com.robinhood.android.referral.onboardingtakeover.TopBarComposable.<anonymous> (OnboardingTakeoverComposable.kt:128)");
            }
            final ReferralLandingSdui.ActionTextButton action_text_button = this.$topBarContent.getAction_text_button();
            if (action_text_button != null) {
                final Function1<String, Unit> function1 = this.$onActionClick;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(action_text_button);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.onboardingtakeover.OnboardingTakeoverComposableKt$TopBarComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OnboardingTakeoverComposable.C267483.invoke$lambda$2$lambda$1$lambda$0(function1, action_text_button);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(action_text_button.getLabel(), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, false, null, null, (Function0) objRememberedValue, 7, null), null, true, false, false, true, false, null, 109, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer, 24576, 0, 16364);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, ReferralLandingSdui.ActionTextButton actionTextButton) {
            function1.invoke(actionTextButton.getDeeplink());
            return Unit.INSTANCE;
        }
    }
}
