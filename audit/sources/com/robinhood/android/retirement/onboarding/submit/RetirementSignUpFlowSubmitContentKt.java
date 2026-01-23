package com.robinhood.android.retirement.onboarding.submit;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.models.retirement.api.ApiRetirementAccountCreatedResponse;
import com.robinhood.android.retirement.lib.ContributionRings2;
import com.robinhood.android.retirement.onboarding.C27032R;
import com.robinhood.android.retirement.onboarding.submit.RetirementSignupSubmitViewState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.Haptics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RetirementSignUpFlowSubmitContent.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000b\u001a\u0011\u0010\r\u001a\u00020\u0004*\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f\u001a\u001f\u0010\u0010\u001a\u00020\u0004*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a-\u0010\u0014\u001a\u00020\u0004*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0003¢\u0006\u0002\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0003¢\u0006\u0002\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u0004*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"SUCCESS_IDENTIFIER", "", "ERROR_IDENTIFIER", "SubmitScreen", "", "currentState", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/submit/SubmitScreenCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;Lcom/robinhood/android/retirement/onboarding/submit/SubmitScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BottomContent", "LoadingWithTextContent", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "ErrorRefreshContent", "refresh", "Lkotlin/Function0;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ErrorCanContactSupportContent", "contactSupport", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Success", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "continueOnSuccess", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TitleAndSubtitle", "title", "subtitle", "(Landroidx/compose/foundation/layout/ColumnScope;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "feature-retirement-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowSubmitContentKt {
    private static final String ERROR_IDENTIFIER = "error";
    private static final String SUCCESS_IDENTIFIER = "success";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomContent$lambda$9(RetirementSignupSubmitViewState retirementSignupSubmitViewState, SubmitScreenCallbacks submitScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomContent(retirementSignupSubmitViewState, submitScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorCanContactSupportContent$lambda$12(Column5 column5, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ErrorCanContactSupportContent(column5, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorRefreshContent$lambda$11(Column5 column5, Function0 function0, int i, Composer composer, int i2) {
        ErrorRefreshContent(column5, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingWithTextContent$lambda$10(Column5 column5, int i, Composer composer, int i2) {
        LoadingWithTextContent(column5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmitScreen$lambda$2(RetirementSignupSubmitViewState retirementSignupSubmitViewState, SubmitScreenCallbacks submitScreenCallbacks, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SubmitScreen(retirementSignupSubmitViewState, submitScreenCallbacks, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Success$lambda$13(Column5 column5, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, Function0 function0, int i, Composer composer, int i2) {
        Success(column5, apiRetirementAccountCreatedResponse, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TitleAndSubtitle$lambda$15(Column5 column5, String str, String str2, int i, Composer composer, int i2) {
        TitleAndSubtitle(column5, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SubmitScreen(final RetirementSignupSubmitViewState currentState, final SubmitScreenCallbacks callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SystemUiController systemUiControllerRememberSystemUiController;
        long xrayLight;
        boolean zChanged;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1132878844);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currentState) ? 4 : 2) | i;
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
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1132878844, i3, -1, "com.robinhood.android.retirement.onboarding.submit.SubmitScreen (RetirementSignUpFlowSubmitContent.kt:54)");
                }
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                xrayLight = bentoTheme.getColors(composerStartRestartGroup, i5).getXrayLight();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(xrayLight);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new RetirementSignUpFlowSubmitContentKt$SubmitScreen$1$1(systemUiControllerRememberSystemUiController, xrayLight, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.background$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getXrayLight())), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getXrayLight())), Tuples4.m3642to(Float.valueOf(0.88f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getPrimeLight())), Tuples4.m3642to(Float.valueOf(1.11f), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).getPrime()))}, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null));
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$RetirementSignUpFlowSubmitContentKt.INSTANCE.getLambda$848896287$feature_retirement_onboarding_externalDebug(), PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 7, null), ComposableLambda3.rememberComposableLambda(-714507405, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$SubmitScreen$2$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-714507405, i6, -1, "com.robinhood.android.retirement.onboarding.submit.SubmitScreen.<anonymous>.<anonymous> (RetirementSignUpFlowSubmitContent.kt:78)");
                        }
                        if (currentState.getIsCloseButtonVisible()) {
                            SubmitScreenCallbacks submitScreenCallbacks = callbacks;
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(submitScreenCallbacks);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new RetirementSignUpFlowSubmitContentKt$SubmitScreen$2$1$1$1(submitScreenCallbacks);
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue2), composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
                composerStartRestartGroup = composerStartRestartGroup;
                ContributionRings2.SpinningRingsAnimation(true, PaddingKt.m5144paddingVpY3zN4$default(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), true, composerStartRestartGroup, 390, 0);
                modifier2 = modifier3;
                BottomContent(currentState, callbacks, Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpFlowSubmitContentKt.SubmitScreen$lambda$2(currentState, callbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            xrayLight = bentoTheme2.getColors(composerStartRestartGroup, i52).getXrayLight();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(xrayLight);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new RetirementSignUpFlowSubmitContentKt$SubmitScreen$1$1(systemUiControllerRememberSystemUiController, xrayLight, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.background$default(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getXrayLight())), Tuples4.m3642to(Float.valueOf(0.6f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getXrayLight())), Tuples4.m3642to(Float.valueOf(0.88f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getPrimeLight())), Tuples4.m3642to(Float.valueOf(1.11f), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).getPrime()))}, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$RetirementSignUpFlowSubmitContentKt.INSTANCE.getLambda$848896287$feature_retirement_onboarding_externalDebug(), PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM(), 7, null), ComposableLambda3.rememberComposableLambda(-714507405, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$SubmitScreen$2$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                            invoke(bentoAppBarScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i6 & 6) == 0) {
                                i6 |= (i6 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-714507405, i6, -1, "com.robinhood.android.retirement.onboarding.submit.SubmitScreen.<anonymous>.<anonymous> (RetirementSignUpFlowSubmitContent.kt:78)");
                            }
                            if (currentState.getIsCloseButtonVisible()) {
                                SubmitScreenCallbacks submitScreenCallbacks = callbacks;
                                composer2.startReplaceGroup(5004770);
                                boolean zChanged2 = composer2.changed(submitScreenCallbacks);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new RetirementSignUpFlowSubmitContentKt$SubmitScreen$2$1$1$1(submitScreenCallbacks);
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue2), composer2, (BentoAppBarScope.$stable << 12) | ((i6 << 12) & 57344), 7);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2008);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ContributionRings2.SpinningRingsAnimation(true, PaddingKt.m5144paddingVpY3zN4$default(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), true, composerStartRestartGroup, 390, 0);
                    modifier2 = modifier3;
                    BottomContent(currentState, callbacks, Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BottomContent(final RetirementSignupSubmitViewState retirementSignupSubmitViewState, final SubmitScreenCallbacks submitScreenCallbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-254351058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(retirementSignupSubmitViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(submitScreenCallbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-254351058, i3, -1, "com.robinhood.android.retirement.onboarding.submit.BottomContent (RetirementSignUpFlowSubmitContent.kt:106)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (!(retirementSignupSubmitViewState instanceof RetirementSignupSubmitViewState.LoadingWithText)) {
                    composerStartRestartGroup.startReplaceGroup(167565776);
                    LoadingWithTextContent(column6, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (retirementSignupSubmitViewState instanceof RetirementSignupSubmitViewState.ErrorRefresh) {
                    composerStartRestartGroup.startReplaceGroup(167568648);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & 112) == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new RetirementSignUpFlowSubmitContentKt$BottomContent$1$1$1(submitScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorRefreshContent(column6, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (retirementSignupSubmitViewState instanceof RetirementSignupSubmitViewState.ErrorCanContactSupport) {
                    composerStartRestartGroup.startReplaceGroup(167573678);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i5 = i3 & 112;
                    boolean z2 = i5 == 32;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new RetirementSignUpFlowSubmitContentKt$BottomContent$1$2$1(submitScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function0 = (Function0) ((KFunction) objRememberedValue2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z = i5 == 32;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new RetirementSignUpFlowSubmitContentKt$BottomContent$1$3$1(submitScreenCallbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ErrorCanContactSupportContent(column6, function0, (Function0) ((KFunction) objRememberedValue3), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (retirementSignupSubmitViewState instanceof RetirementSignupSubmitViewState.Success) {
                    composerStartRestartGroup.startReplaceGroup(167580439);
                    ApiRetirementAccountCreatedResponse response = ((RetirementSignupSubmitViewState.Success) retirementSignupSubmitViewState).getResponse();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z3 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RetirementSignUpFlowSubmitContentKt.BottomContent$lambda$8$lambda$7$lambda$6(submitScreenCallbacks, retirementSignupSubmitViewState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Success(column6, response, (Function0) objRememberedValue4, composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(900231752);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RetirementSignUpFlowSubmitContentKt.BottomContent$lambda$9(retirementSignupSubmitViewState, submitScreenCallbacks, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (!(retirementSignupSubmitViewState instanceof RetirementSignupSubmitViewState.LoadingWithText)) {
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomContent$lambda$8$lambda$7$lambda$6(SubmitScreenCallbacks submitScreenCallbacks, RetirementSignupSubmitViewState retirementSignupSubmitViewState) {
        submitScreenCallbacks.continueOnSuccess((RetirementSignupSubmitViewState.Success) retirementSignupSubmitViewState);
        return Unit.INSTANCE;
    }

    private static final void LoadingWithTextContent(final Column5 column5, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-446088700);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-446088700, i2, -1, "com.robinhood.android.retirement.onboarding.submit.LoadingWithTextContent (RetirementSignUpFlowSubmitContent.kt:135)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_loading, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM();
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM()), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8124);
            composer2 = composerStartRestartGroup;
            Spacer2.Spacer(Column5.weight$default(column5, companion, 1.0f, false, 2, null), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitContentKt.LoadingWithTextContent$lambda$10(column5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorRefreshContent(final Column5 column5, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-480026628);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(column5) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-480026628, i2, -1, "com.robinhood.android.retirement.onboarding.submit.ErrorRefreshContent (RetirementSignUpFlowSubmitContent.kt:151)");
            }
            TitleAndSubtitle(column5, StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_working_on_it, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_refresh_content, composerStartRestartGroup, 0), composerStartRestartGroup, i2 & 14);
            String strStringResource = StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_refresh, composerStartRestartGroup, 0);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, ModifiersKt.autoLogEvents$default(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen != null ? Screen.copy$default(screen, null, null, "error", null, 11, null) : null, UserInteractionEventData.Action.REFRESH, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i2 >> 3) & 14, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitContentKt.ErrorRefreshContent$lambda$11(column5, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ErrorCanContactSupportContent(final Column5 column5, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        Composer composerStartRestartGroup = composer.startRestartGroup(1903074532);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            function04 = function02;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1903074532, i2, -1, "com.robinhood.android.retirement.onboarding.submit.ErrorCanContactSupportContent (RetirementSignUpFlowSubmitContent.kt:181)");
            }
            TitleAndSubtitle(column5, StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_working_on_it, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_refresh_or_contact_support_content, composerStartRestartGroup, 0), composerStartRestartGroup, i2 & 14);
            String strStringResource = StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_try_again, composerStartRestartGroup, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 7, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            Screen screenCopy$default = screen != null ? Screen.copy$default(screen, null, null, "error", null, 11, null) : null;
            UserInteractionEventData.Action action = UserInteractionEventData.Action.REFRESH;
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            int i4 = i2;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, strStringResource, ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screenCopy$default, action, null, new Component(componentType, null, null, 6, null), null, 41, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i2 >> 3) & 14, 0, 8184);
            String strStringResource2 = StringResources_androidKt.stringResource(C27032R.string.retirement_sign_up_contact_support, composerStartRestartGroup, 0);
            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Screen screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            function03 = function0;
            function04 = function02;
            BentoButtonKt.m20586BentoButtonEikTQX8(function04, strStringResource2, ModifiersKt.autoLogEvents$default(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, screen2 != null ? Screen.copy$default(screen2, null, null, "error", null, 11, null) : null, UserInteractionEventData.Action.CONTACT_SUPPORT, null, new Component(componentType, null, null, 6, null), null, 41, null), true, false, false, true, false, null, 108, null), null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 24576, 0, 8168);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitContentKt.ErrorCanContactSupportContent$lambda$12(column5, function03, function04, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Success(final Column5 column5, final ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1451082660);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(apiRetirementAccountCreatedResponse) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1451082660, i2, -1, "com.robinhood.android.retirement.onboarding.submit.Success (RetirementSignUpFlowSubmitContent.kt:231)");
            }
            TitleAndSubtitle(column5, apiRetirementAccountCreatedResponse.getEnd_view_model().getTitle(), apiRetirementAccountCreatedResponse.getEnd_view_model().getSubtitle(), composerStartRestartGroup, i2 & 14);
            Function0<Unit> function0HapticClick = Haptics.hapticClick(function0, composerStartRestartGroup, (i2 >> 6) & 14);
            String button_text = apiRetirementAccountCreatedResponse.getEnd_view_model().getButton_text();
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0HapticClick, button_text, ModifiersKt.autoLogEvents$default(modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, screen != null ? Screen.copy$default(screen, null, null, "success", null, 11, null) : null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), true, false, false, true, false, null, 108, null), null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitContentKt.Success$lambda$13(column5, apiRetirementAccountCreatedResponse, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TitleAndSubtitle(final Column5 column5, final String str, String str2, Composer composer, final int i) {
        int i2;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-135182691);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(column5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135182691, i3, -1, "com.robinhood.android.retirement.onboarding.submit.TitleAndSubtitle (RetirementSignUpFlowSubmitContent.kt:261)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierWeight$default = Column5.weight$default(column5, PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            TextStyle displayCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleLarge();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
            str3 = str2;
            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, (i3 >> 6) & 14, 0, 8124);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.submit.RetirementSignUpFlowSubmitContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementSignUpFlowSubmitContentKt.TitleAndSubtitle$lambda$15(column5, str, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
