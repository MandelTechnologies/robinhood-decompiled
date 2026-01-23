package com.robinhood.android.retirement.match;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiMarkdownText2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.android.models.retirement.api.contributions.ApiAgreementsViewModel;
import com.robinhood.android.retirement.lib.RetirementSelectionRow;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchAgreementsScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aM\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/retirement/match/MatchAgreementState;", "state", "Lcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;", "callbacks", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "", "loading", "modifier", "Lkotlin/Function0;", "header", "MatchAgreementsScreen", "(Lcom/robinhood/android/retirement/match/MatchAgreementState;Lcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;", "agreementsViewModel", "MatchAgreementsLoaded", "(Lcom/robinhood/android/retirement/match/MatchAgreementState;Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;Lcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainContent", "(Lcom/robinhood/android/retirement/match/MatchAgreementState;Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;Lcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "agreeButtonLoading", "FooterContent", "(Lcom/robinhood/android/models/retirement/api/contributions/ApiAgreementsViewModel;ZLcom/robinhood/android/retirement/match/MatchAgreementsCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "ContributionAndAgreementsLoadingTestTag", "Ljava/lang/String;", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.match.MatchAgreementsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class MatchAgreementsScreen5 {
    public static final String ContributionAndAgreementsLoadingTestTag = "LoadingTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FooterContent$lambda$17(ApiAgreementsViewModel apiAgreementsViewModel, boolean z, MatchAgreementsScreen4 matchAgreementsScreen4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FooterContent(apiAgreementsViewModel, z, matchAgreementsScreen4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$14(MatchAgreementState matchAgreementState, ApiAgreementsViewModel apiAgreementsViewModel, MatchAgreementsScreen4 matchAgreementsScreen4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(matchAgreementState, apiAgreementsViewModel, matchAgreementsScreen4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchAgreementsLoaded$lambda$7(MatchAgreementState matchAgreementState, ApiAgreementsViewModel apiAgreementsViewModel, MatchAgreementsScreen4 matchAgreementsScreen4, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MatchAgreementsLoaded(matchAgreementState, apiAgreementsViewModel, matchAgreementsScreen4, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchAgreementsScreen$lambda$0(MatchAgreementState matchAgreementState, MatchAgreementsScreen4 matchAgreementsScreen4, Function3 function3, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        MatchAgreementsScreen(matchAgreementState, matchAgreementsScreen4, function3, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchAgreementsScreen(final MatchAgreementState state, final MatchAgreementsScreen4 callbacks, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> loading, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug;
        final Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(loading, "loading");
        Composer composerStartRestartGroup = composer.startRestartGroup(1375999468);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(loading) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug = MatchAgreementsScreen.INSTANCE.m18142getLambda$1246667577$lib_retirement_contributions_externalDebug();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1375999468, i3, -1, "com.robinhood.android.retirement.match.MatchAgreementsScreen (MatchAgreementsScreen.kt:56)");
                    }
                    if (state.getAgreementsViewModel() != null) {
                        composerStartRestartGroup.startReplaceGroup(1232558468);
                        loading.invoke(TestTag3.testTag(modifier3, ContributionAndAgreementsLoadingTestTag), composerStartRestartGroup, Integer.valueOf((i3 >> 3) & 112));
                        composerStartRestartGroup.endReplaceGroup();
                        function22 = function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1232650445);
                        int i6 = i3 << 3;
                        int i7 = (57344 & i6) | ((i3 >> 3) & 7168) | (i3 & 14) | (i6 & 896);
                        function22 = function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug;
                        MatchAgreementsLoaded(state, state.getAgreementsViewModel(), callbacks, function22, modifier3, composerStartRestartGroup, i7, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    function23 = function22;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function23 = function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MatchAgreementsScreen5.MatchAgreementsScreen$lambda$0(state, callbacks, loading, modifier3, function23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug = function2;
            if ((i3 & 9363) != 9362) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (state.getAgreementsViewModel() != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer2 = composerStartRestartGroup;
                function23 = function22;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        function2M18142getLambda$1246667577$lib_retirement_contributions_externalDebug = function2;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult MatchAgreementsLoaded$lambda$4$lambda$3(final UserInteractionEventDescriptor userInteractionEventDescriptor, final EventLogger eventLogger, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$MatchAgreementsLoaded$lambda$4$lambda$3$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(userInteractionEventDescriptor, UserInteractionEventData.EventType.SCREEN_TRANSITION_DISAPPEAR), false, false, 6, null);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MatchAgreementsLoaded(final MatchAgreementState state, final ApiAgreementsViewModel agreementsViewModel, final MatchAgreementsScreen4 callbacks, final Function2<? super Composer, ? super Integer, Unit> header, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(agreementsViewModel, "agreementsViewModel");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(header, "header");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1643327134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(agreementsViewModel) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(header) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1643327134, i4, -1, "com.robinhood.android.retirement.match.MatchAgreementsLoaded (MatchAgreementsScreen.kt:77)");
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MatchAgreementsScreen8(userInteractionEventDescriptor, current, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchAgreementsScreen5.MatchAgreementsLoaded$lambda$4$lambda$3(userInteractionEventDescriptor, current, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                header.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                int i6 = i4 & 896;
                MainContent(state, agreementsViewModel, callbacks, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | i6, 0);
                FooterContent(agreementsViewModel, state.isAgreeButtonLoading(), callbacks, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, ((i4 >> 3) & 14) | i6, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MatchAgreementsScreen5.MatchAgreementsLoaded$lambda$7(state, agreementsViewModel, callbacks, header, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new MatchAgreementsScreen8(userInteractionEventDescriptor, current, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(current);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MatchAgreementsScreen5.MatchAgreementsLoaded$lambda$4$lambda$3(userInteractionEventDescriptor, current, (DisposableEffectScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 6);
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        header.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 9) & 14));
                        Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            int i62 = i4 & 896;
                            MainContent(state, agreementsViewModel, callbacks, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), composerStartRestartGroup, (i4 & 14) | 3072 | (i4 & 112) | i62, 0);
                            FooterContent(agreementsViewModel, state.isAgreeButtonLoading(), callbacks, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), composerStartRestartGroup, ((i4 >> 3) & 14) | i62, 0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0331  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MainContent(final MatchAgreementState matchAgreementState, final ApiAgreementsViewModel apiAgreementsViewModel, MatchAgreementsScreen4 matchAgreementsScreen4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        MarkdownText<GenericAction> subtitle;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        ApiRetirementSignUpFlow.RetirementAgreementViewModel sweep_agreement;
        MatchAgreementsScreen4 matchAgreementsScreen42;
        boolean z;
        Object objRememberedValue;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1560156948);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(matchAgreementState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(apiAgreementsViewModel) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(matchAgreementsScreen4) : composerStartRestartGroup.changedInstance(matchAgreementsScreen4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    matchAgreementsScreen42 = matchAgreementsScreen4;
                } else {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1560156948, i3, -1, "com.robinhood.android.retirement.match.MainContent (MatchAgreementsScreen.kt:127)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(apiAgreementsViewModel.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                    subtitle = apiAgreementsViewModel.getSubtitle();
                    composerStartRestartGroup.startReplaceGroup(1192043374);
                    if (subtitle != null) {
                        SduiMarkdownText2.SduiMarkdownText(subtitle, PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, 0, 0, composerStartRestartGroup, 0, 28);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    BentoText2.m20747BentoText38GnDrw(apiAgreementsViewModel.getGold_agreement().getTitle(), modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    String body_markdown = apiAgreementsViewModel.getGold_agreement().getBody_markdown();
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                    int i6 = BentoMarkdownText.$stable;
                    MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textS, 0, jM21425getFg0d7_KjU, jM21425getFg0d7_KjU2, false, composerStartRestartGroup, i6 << 15, 18);
                    int i7 = MarkdownStyle.$stable;
                    BentoMarkdownText2.BentoMarkdownText(body_markdown, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i7 << 6, 26);
                    composerStartRestartGroup.endNode();
                    Modifier.Companion companion4 = companion3;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                    Composer composer2 = composerStartRestartGroup;
                    sweep_agreement = apiAgreementsViewModel.getSweep_agreement();
                    composer2.startReplaceGroup(1192089320);
                    if (sweep_agreement != null) {
                        matchAgreementsScreen42 = matchAgreementsScreen4;
                    } else {
                        String title = sweep_agreement.getTitle();
                        boolean zIsSweepAgreementChecked = matchAgreementState.isSweepAgreementChecked();
                        composer2.startReplaceGroup(5004770);
                        if ((i3 & 896) != 256) {
                            if ((i3 & 512) != 0) {
                                matchAgreementsScreen42 = matchAgreementsScreen4;
                                if (composer2.changedInstance(matchAgreementsScreen42)) {
                                }
                                objRememberedValue = composer2.rememberedValue();
                                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new MatchAgreementsScreen7(matchAgreementsScreen42);
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                RetirementSelectionRow.RetirementSelectionRow(title, zIsSweepAgreementChecked, (Function1) ((KFunction) objRememberedValue), null, false, bentoTheme.getTypography(composer2, i5).getTextM(), null, null, false, false, composer2, 0, 984);
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default2);
                                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.useNode();
                                } else {
                                    composer2.createNode(constructor3);
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                BentoMarkdownText2.BentoMarkdownText(sweep_agreement.getBody_markdown(), (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i5).getTextS(), 0, bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), false, composer2, i6 << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i7 << 6, 26);
                                composer2.endNode();
                                companion4 = companion4;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                composer2 = composer2;
                                Unit unit2 = Unit.INSTANCE;
                            } else {
                                matchAgreementsScreen42 = matchAgreementsScreen4;
                            }
                            z = false;
                            objRememberedValue = composer2.rememberedValue();
                            if (z) {
                                objRememberedValue = new MatchAgreementsScreen7(matchAgreementsScreen42);
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                RetirementSelectionRow.RetirementSelectionRow(title, zIsSweepAgreementChecked, (Function1) ((KFunction) objRememberedValue), null, false, bentoTheme.getTypography(composer2, i5).getTextM(), null, null, false, false, composer2, 0, 984);
                                Modifier modifierM5144paddingVpY3zN4$default22 = PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default22);
                                Function0<ComposeUiNode> constructor32 = companion2.getConstructor();
                                if (composer2.getApplier() == null) {
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion2.getSetModifier());
                                    BentoMarkdownText2.BentoMarkdownText(sweep_agreement.getBody_markdown(), (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i5).getTextS(), 0, bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), false, composer2, i6 << 15, 18), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i7 << 6, 26);
                                    composer2.endNode();
                                    companion4 = companion4;
                                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getColors(composer2, i5).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                    composer2 = composer2;
                                    Unit unit22 = Unit.INSTANCE;
                                }
                            }
                        } else {
                            matchAgreementsScreen42 = matchAgreementsScreen4;
                        }
                        z = true;
                        objRememberedValue = composer2.rememberedValue();
                        if (z) {
                        }
                    }
                    composer2.endReplaceGroup();
                    ImmutableList3 persistentList = extensions2.toPersistentList(apiAgreementsViewModel.getPost_agreements_content());
                    composer2.startReplaceGroup(-1772220517);
                    Composer composer3 = composer2;
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, companion4, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composer3, 100663296, 0);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final MatchAgreementsScreen4 matchAgreementsScreen43 = matchAgreementsScreen42;
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MatchAgreementsScreen5.MainContent$lambda$14(matchAgreementState, apiAgreementsViewModel, matchAgreementsScreen43, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    Modifier modifier42 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(apiAgreementsViewModel.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                    subtitle = apiAgreementsViewModel.getSubtitle();
                    composerStartRestartGroup.startReplaceGroup(1192043374);
                    if (subtitle != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierM5144paddingVpY3zN4$default3 = PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    BentoText2.m20747BentoText38GnDrw(apiAgreementsViewModel.getGold_agreement().getTitle(), modifierM5144paddingVpY3zN4$default3, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 24576, 0, 8168);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        String body_markdown2 = apiAgreementsViewModel.getGold_agreement().getBody_markdown();
                        BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                        TextStyle textS2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS();
                        long jM21425getFg0d7_KjU3 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                        long jM21425getFg0d7_KjU22 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
                        int i62 = BentoMarkdownText.$stable;
                        MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText2.m21100withTextStylesYhh7B2I(textS2, 0, jM21425getFg0d7_KjU3, jM21425getFg0d7_KjU22, false, composerStartRestartGroup, i62 << 15, 18);
                        int i72 = MarkdownStyle.$stable;
                        BentoMarkdownText2.BentoMarkdownText(body_markdown2, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i72 << 6, 26);
                        composerStartRestartGroup.endNode();
                        Modifier.Companion companion42 = companion32;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(companion42, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 4);
                        Composer composer22 = composerStartRestartGroup;
                        sweep_agreement = apiAgreementsViewModel.getSweep_agreement();
                        composer22.startReplaceGroup(1192089320);
                        if (sweep_agreement != null) {
                        }
                        composer22.endReplaceGroup();
                        ImmutableList3 persistentList2 = extensions2.toPersistentList(apiAgreementsViewModel.getPost_agreements_content());
                        composer22.startReplaceGroup(-1772220517);
                        Composer composer32 = composer22;
                        SduiColumns.SduiColumn(persistentList2, GenericAction.class, companion42, null, null, HorizontalPadding.Default, arrangement2.getTop(), companion5.getStart(), false, composer32, 100663296, 0);
                        composerStartRestartGroup = composer32;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void FooterContent(ApiAgreementsViewModel apiAgreementsViewModel, final boolean z, final MatchAgreementsScreen4 matchAgreementsScreen4, Modifier modifier, Composer composer, final int i, final int i2) {
        final ApiAgreementsViewModel apiAgreementsViewModel2;
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1009797202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            apiAgreementsViewModel2 = apiAgreementsViewModel;
        } else if ((i & 6) == 0) {
            apiAgreementsViewModel2 = apiAgreementsViewModel;
            i3 = (composerStartRestartGroup.changedInstance(apiAgreementsViewModel2) ? 4 : 2) | i;
        } else {
            apiAgreementsViewModel2 = apiAgreementsViewModel;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(matchAgreementsScreen4) : composerStartRestartGroup.changedInstance(matchAgreementsScreen4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1009797202, i3, -1, "com.robinhood.android.retirement.match.FooterContent (MatchAgreementsScreen.kt:220)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    ImmutableList3 persistentList = extensions2.toPersistentList(apiAgreementsViewModel2.getFooter_content());
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifier5 = modifier4;
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, companion3, null, null, HorizontalPadding.Default, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, 100663296, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    z2 = true;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, apiAgreementsViewModel2.getPrimary_cta_logging_id(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !composerStartRestartGroup.changedInstance(matchAgreementsScreen4))) {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new MatchAgreementsScreen6(matchAgreementsScreen4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), apiAgreementsViewModel2.getPrimary_cta_label(), modifierAutoLogEvents$default, null, null, false, z, null, null, null, null, false, null, composerStartRestartGroup, (i3 << 15) & 3670016, 0, 8120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.match.MatchAgreementsScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MatchAgreementsScreen5.FooterContent$lambda$17(apiAgreementsViewModel2, z, matchAgreementsScreen4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    ImmutableList3 persistentList2 = extensions2.toPersistentList(apiAgreementsViewModel2.getFooter_content());
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifier52 = modifier4;
                    SduiColumns.SduiColumn(persistentList2, GenericAction.class, companion32, null, null, HorizontalPadding.Default, arrangement2.getTop(), companion4.getStart(), false, composerStartRestartGroup, 100663296, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    z2 = true;
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, apiAgreementsViewModel2.getPrimary_cta_logging_id(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 896) != 256) {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue = new MatchAgreementsScreen6(matchAgreementsScreen4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), apiAgreementsViewModel2.getPrimary_cta_label(), modifierAutoLogEvents$default2, null, null, false, z, null, null, null, null, false, null, composerStartRestartGroup, (i3 << 15) & 3670016, 0, 8120);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
