package com.robinhood.shared.lib.challenge.deviceapproval;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceApprovalChallengeComposable.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0015\u001a\u00020\u0016X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"DeviceApprovalChallengeComposable", "", "viewState", "Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;", "onPrimaryCtaClicked", "Lkotlin/Function0;", "onSecondaryCtaClicked", "onAnimationFinished", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/lib/challenge/deviceapproval/DeviceApprovalChallengeViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingAnimation", "challengeCompleted", "", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BlockedAnimation", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnimationFinishCallback", "lottieAnimationState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "(Lcom/airbnb/lottie/compose/LottieAnimationState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DeviceApprovalsChallengeLottieTestTag", "", "lib-challenge_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class DeviceApprovalChallengeComposable {
    public static final String DeviceApprovalsChallengeLottieTestTag = "PromptsVerificationLottie";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimationFinishCallback$lambda$10(LottieAnimationState lottieAnimationState, Function0 function0, int i, Composer composer, int i2) {
        AnimationFinishCallback(lottieAnimationState, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BlockedAnimation$lambda$9(Modifier modifier, int i, int i2, Composer composer, int i3) {
        BlockedAnimation(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceApprovalChallengeComposable$lambda$0(DeviceApprovalChallengeViewState deviceApprovalChallengeViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeviceApprovalChallengeComposable(deviceApprovalChallengeViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingAnimation$lambda$4(boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingAnimation(z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeviceApprovalChallengeComposable(final DeviceApprovalChallengeViewState viewState, final Function0<Unit> onPrimaryCtaClicked, final Function0<Unit> onSecondaryCtaClicked, final Function0<Unit> onAnimationFinished, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        Intrinsics.checkNotNullParameter(onAnimationFinished, "onAnimationFinished");
        Composer composerStartRestartGroup = composer.startRestartGroup(-108053630);
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
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAnimationFinished) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-108053630, i3, -1, "com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable (DeviceApprovalChallengeComposable.kt:36)");
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), false, ComposableLambda3.rememberComposableLambda(1700503479, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt.DeviceApprovalChallengeComposable.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1700503479, i5, -1, "com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable.<anonymous> (DeviceApprovalChallengeComposable.kt:42)");
                        }
                        if (viewState.isButtonBarVisible()) {
                            StringResource helperTextRes = viewState.getHelperTextRes();
                            composer2.startReplaceGroup(2096275330);
                            String string2 = helperTextRes == null ? null : StringResource2.getString(helperTextRes, composer2, StringResource.$stable);
                            composer2.endReplaceGroup();
                            Function0<Unit> function0 = onPrimaryCtaClicked;
                            String strStringResource = StringResources_androidKt.stringResource(C39076R.string.device_approvals_challenge_resend_cta_text, composer2, 0);
                            boolean zIsLoading = viewState.isLoading();
                            Function0<Unit> function02 = onSecondaryCtaClicked;
                            StringResource secondaryCtaRes = viewState.getSecondaryCtaRes();
                            composer2.startReplaceGroup(2096287714);
                            String string3 = secondaryCtaRes != null ? StringResource2.getString(secondaryCtaRes, composer2, StringResource.$stable) : null;
                            composer2.endReplaceGroup();
                            BentoButtonBar2.BentoButtonBar(null, string2, null, false, null, null, function0, strStringResource, zIsLoading, null, false, function02, string3, viewState.isLoading(), null, false, composer2, 0, 0, 50749);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1163146646, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt.DeviceApprovalChallengeComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1163146646, i5, -1, "com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable.<anonymous> (DeviceApprovalChallengeComposable.kt:55)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        DeviceApprovalChallengeViewState deviceApprovalChallengeViewState = viewState;
                        Function0<Unit> function0 = onAnimationFinished;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (deviceApprovalChallengeViewState.getShowLoadingLottie()) {
                            composer2.startReplaceGroup(-120662770);
                            DeviceApprovalChallengeComposable.LoadingAnimation(deviceApprovalChallengeViewState.getChallengeCompleted(), function0, AspectRatio3.aspectRatio$default(SizeKt.fillMaxHeight(TestTag3.testTag(companion, DeviceApprovalChallengeComposable.DeviceApprovalsChallengeLottieTestTag), 0.4f), 1.0f, false, 2, null), composer2, 384, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-120228708);
                            DeviceApprovalChallengeComposable.BlockedAnimation(AspectRatio3.aspectRatio$default(SizeKt.fillMaxHeight(TestTag3.testTag(companion, DeviceApprovalChallengeComposable.DeviceApprovalsChallengeLottieTestTag), 0.4f), 1.0f, false, 2, null), composer2, 6, 0);
                            composer2.endReplaceGroup();
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        StringResource headerRes = deviceApprovalChallengeViewState.getHeaderRes();
                        int i7 = StringResource.$stable;
                        String string2 = StringResource2.getString(headerRes, composer2, i7);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        BentoText2.m20747BentoText38GnDrw(string2, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String string3 = StringResource2.getString(deviceApprovalChallengeViewState.getBodyRes(), composer2, i7);
                        int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
                        BentoText2.m20747BentoText38GnDrw(string3, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8124);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DeviceApprovalChallengeComposable.DeviceApprovalChallengeComposable$lambda$0(viewState, onPrimaryCtaClicked, onSecondaryCtaClicked, onAnimationFinished, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), false, ComposableLambda3.rememberComposableLambda(1700503479, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt.DeviceApprovalChallengeComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1700503479, i5, -1, "com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable.<anonymous> (DeviceApprovalChallengeComposable.kt:42)");
                    }
                    if (viewState.isButtonBarVisible()) {
                        StringResource helperTextRes = viewState.getHelperTextRes();
                        composer2.startReplaceGroup(2096275330);
                        String string2 = helperTextRes == null ? null : StringResource2.getString(helperTextRes, composer2, StringResource.$stable);
                        composer2.endReplaceGroup();
                        Function0<Unit> function0 = onPrimaryCtaClicked;
                        String strStringResource = StringResources_androidKt.stringResource(C39076R.string.device_approvals_challenge_resend_cta_text, composer2, 0);
                        boolean zIsLoading = viewState.isLoading();
                        Function0<Unit> function02 = onSecondaryCtaClicked;
                        StringResource secondaryCtaRes = viewState.getSecondaryCtaRes();
                        composer2.startReplaceGroup(2096287714);
                        String string3 = secondaryCtaRes != null ? StringResource2.getString(secondaryCtaRes, composer2, StringResource.$stable) : null;
                        composer2.endReplaceGroup();
                        BentoButtonBar2.BentoButtonBar(null, string2, null, false, null, null, function0, strStringResource, zIsLoading, null, false, function02, string3, viewState.isLoading(), null, false, composer2, 0, 0, 50749);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1163146646, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt.DeviceApprovalChallengeComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1163146646, i5, -1, "com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposable.<anonymous> (DeviceApprovalChallengeComposable.kt:55)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    DeviceApprovalChallengeViewState deviceApprovalChallengeViewState = viewState;
                    Function0<Unit> function0 = onAnimationFinished;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    if (deviceApprovalChallengeViewState.getShowLoadingLottie()) {
                        composer2.startReplaceGroup(-120662770);
                        DeviceApprovalChallengeComposable.LoadingAnimation(deviceApprovalChallengeViewState.getChallengeCompleted(), function0, AspectRatio3.aspectRatio$default(SizeKt.fillMaxHeight(TestTag3.testTag(companion, DeviceApprovalChallengeComposable.DeviceApprovalsChallengeLottieTestTag), 0.4f), 1.0f, false, 2, null), composer2, 384, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-120228708);
                        DeviceApprovalChallengeComposable.BlockedAnimation(AspectRatio3.aspectRatio$default(SizeKt.fillMaxHeight(TestTag3.testTag(companion, DeviceApprovalChallengeComposable.DeviceApprovalsChallengeLottieTestTag), 0.4f), 1.0f, false, 2, null), composer2, 6, 0);
                        composer2.endReplaceGroup();
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    StringResource headerRes = deviceApprovalChallengeViewState.getHeaderRes();
                    int i7 = StringResource.$stable;
                    String string2 = StringResource2.getString(headerRes, composer2, i7);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                    BentoText2.m20747BentoText38GnDrw(string2, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String string3 = StringResource2.getString(deviceApprovalChallengeViewState.getBodyRes(), composer2, i7);
                    int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
                    BentoText2.m20747BentoText38GnDrw(string3, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8124);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final LottieComposition BlockedAnimation$lambda$5(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BlockedAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }

    private static final LottieComposition LoadingAnimation$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadingAnimation(final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(610242495);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(610242495, i3, -1, "com.robinhood.shared.lib.challenge.deviceapproval.LoadingAnimation (DeviceApprovalChallengeComposable.kt:99)");
                }
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C39076R.raw.lottie_prompts_loading)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(-862079066);
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LoadingAnimation$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, 1, null, false, false, composerStartRestartGroup, 1572864, 958);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-861948215);
                    lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(LoadingAnimation$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(-1967462359);
                if (z) {
                    AnimationFinishCallback(lottieAnimationStateAnimateLottieCompositionAsState, function0, composerStartRestartGroup, i3 & 112);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieComposition lottieCompositionLoadingAnimation$lambda$1 = LoadingAnimation$lambda$1(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.getProgress());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                LottieAnimation2.LottieAnimation(lottieCompositionLoadingAnimation$lambda$1, (Function0) objRememberedValue, modifier5, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, i3 & 896, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DeviceApprovalChallengeComposable.LoadingAnimation$lambda$4(z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C39076R.raw.lottie_prompts_loading)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            if (!z) {
            }
            composerStartRestartGroup.startReplaceGroup(-1967462359);
            if (z) {
            }
            composerStartRestartGroup.endReplaceGroup();
            LottieComposition lottieCompositionLoadingAnimation$lambda$12 = LoadingAnimation$lambda$1(lottieCompositionResultRememberLottieComposition2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(lottieAnimationStateAnimateLottieCompositionAsState.getProgress());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                LottieAnimation2.LottieAnimation(lottieCompositionLoadingAnimation$lambda$12, (Function0) objRememberedValue, modifier52, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, i3 & 896, 0, 65528);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BlockedAnimation(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1618792025);
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
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1618792025, i3, -1, "com.robinhood.shared.lib.challenge.deviceapproval.BlockedAnimation (DeviceApprovalChallengeComposable.kt:124)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C39076R.raw.lottie_prompts_blocked)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            int i5 = i3;
            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(BlockedAnimation$lambda$5(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
            LottieComposition lottieCompositionBlockedAnimation$lambda$5 = BlockedAnimation$lambda$5(lottieCompositionResultRememberLottieComposition);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(DeviceApprovalChallengeComposable.BlockedAnimation$lambda$6(lottieAnimationStateAnimateLottieCompositionAsState));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            modifier2 = modifier3;
            LottieAnimation2.LottieAnimation(lottieCompositionBlockedAnimation$lambda$5, (Function0) objRememberedValue, modifier2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, (i5 << 6) & 896, 0, 65528);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceApprovalChallengeComposable.BlockedAnimation$lambda$9(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AnimationFinishCallback(final LottieAnimationState lottieAnimationState, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1739186514);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(lottieAnimationState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1739186514, i2, -1, "com.robinhood.shared.lib.challenge.deviceapproval.AnimationFinishCallback (DeviceApprovalChallengeComposable.kt:142)");
            }
            if (lottieAnimationState.getProgress() == 1.0f) {
                function0.invoke();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.lib.challenge.deviceapproval.DeviceApprovalChallengeComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceApprovalChallengeComposable.AnimationFinishCallback$lambda$10(lottieAnimationState, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
