package com.robinhood.android.retirement.onboarding.accountcomparison;

import android.text.SpannableString;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionConfig;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.models.retirement.api.ApiRetirementAccountComparisonResponse;
import com.robinhood.android.models.retirement.api.RetirementAccountComparisonDropdown;
import com.robinhood.android.models.retirement.api.RetirementAccountComparisonDropdownBody;
import com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonViewState;
import com.robinhood.android.retirement.onboarding.databinding.IncludeComparisonInlineDefinitionBinding;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: RetirementAccountComparison.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000e\u001a3\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u0015H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"LoadingTag", "", "RetirementAccountComparison", "", "viewState", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;", "callbacks", "Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonCallbacks;", "(Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonViewState;Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonCallbacks;Landroidx/compose/runtime/Composer;I)V", "Loading", "(Landroidx/compose/runtime/Composer;I)V", "Success", "comparison", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountComparisonResponse;Lcom/robinhood/android/retirement/onboarding/accountcomparison/RetirementAccountComparisonCallbacks;Landroidx/compose/runtime/Composer;I)V", "ComparisonSection", "modifier", "Landroidx/compose/ui/Modifier;", "section", "Lcom/robinhood/android/models/retirement/api/RetirementAccountComparisonDropdown;", "onOpenedCallback", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/models/retirement/api/RetirementAccountComparisonDropdown;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ComparisonInfo", CarResultComposable2.BODY, "Lcom/robinhood/android/models/retirement/api/RetirementAccountComparisonDropdownBody;", "(Lcom/robinhood/android/models/retirement/api/RetirementAccountComparisonDropdownBody;Landroidx/compose/runtime/Composer;I)V", "feature-retirement-onboarding_externalDebug", "showFooterDivider", "isExpanded"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RetirementAccountComparison5 {
    public static final String LoadingTag = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComparisonInfo$lambda$22(RetirementAccountComparisonDropdownBody retirementAccountComparisonDropdownBody, int i, Composer composer, int i2) {
        ComparisonInfo(retirementAccountComparisonDropdownBody, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComparisonSection$lambda$17(Modifier modifier, RetirementAccountComparisonDropdown retirementAccountComparisonDropdown, Function1 function1, int i, int i2, Composer composer, int i3) {
        ComparisonSection(modifier, retirementAccountComparisonDropdown, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loading$lambda$1(int i, Composer composer, int i2) {
        Loading(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetirementAccountComparison$lambda$0(RetirementAccountComparisonViewState retirementAccountComparisonViewState, RetirementAccountComparison4 retirementAccountComparison4, int i, Composer composer, int i2) {
        RetirementAccountComparison(retirementAccountComparisonViewState, retirementAccountComparison4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Success$lambda$11(ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, RetirementAccountComparison4 retirementAccountComparison4, int i, Composer composer, int i2) {
        Success(apiRetirementAccountComparisonResponse, retirementAccountComparison4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RetirementAccountComparison(final RetirementAccountComparisonViewState viewState, final RetirementAccountComparison4 callbacks, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886794648);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1886794648, i2, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparison (RetirementAccountComparison.kt:59)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1149226051, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt.RetirementAccountComparison.1
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
                        ComposerKt.traceEventStart(-1149226051, i3, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparison.<anonymous> (RetirementAccountComparison.kt:61)");
                    }
                    RetirementAccountComparisonViewState retirementAccountComparisonViewState = viewState;
                    if (retirementAccountComparisonViewState instanceof RetirementAccountComparisonViewState.Loading) {
                        composer2.startReplaceGroup(-599636986);
                        RetirementAccountComparison5.Loading(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(retirementAccountComparisonViewState instanceof RetirementAccountComparisonViewState.Success)) {
                            composer2.startReplaceGroup(-599639342);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-599634547);
                        RetirementAccountComparison5.Success(((RetirementAccountComparisonViewState.Success) viewState).getComparison(), callbacks, composer2, 0);
                        composer2.endReplaceGroup();
                    }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparison5.RetirementAccountComparison$lambda$0(viewState, callbacks, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Loading(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2002395805);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2002395805, i, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.Loading (RetirementAccountComparison.kt:72)");
            }
            LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, "loading"), null, RetirementAccountComparison2.INSTANCE.m18150getLambda$534044941$feature_retirement_onboarding_externalDebug(), composerStartRestartGroup, 3126, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparison5.Loading$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean ComparisonSection$lambda$13(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean Success$lambda$4(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Success(final ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, final RetirementAccountComparison4 retirementAccountComparison4, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(109881143);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(apiRetirementAccountComparisonResponse) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(retirementAccountComparison4) : composerStartRestartGroup.changedInstance(retirementAccountComparison4) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(109881143, i2, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.Success (RetirementAccountComparison.kt:91)");
            }
            final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(RetirementAccountComparison5.Success$lambda$3$lambda$2(lazyListStateRememberLazyListState));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(companion2);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion2, 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(apiRetirementAccountComparisonResponse) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementAccountComparison5.Success$lambda$10$lambda$8$lambda$7(apiRetirementAccountComparisonResponse, coroutineScope, lazyListStateRememberLazyListState, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2;
            LazyDslKt.LazyColumn(modifierWeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 508);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), Success$lambda$4(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
            boolean z = true;
            BentoText2.m20747BentoText38GnDrw(apiRetirementAccountComparisonResponse.getDisclosure_text(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 8, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8120);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
            String button_cta_text = apiRetirementAccountComparisonResponse.getButton_cta_text();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !composerStartRestartGroup.changedInstance(retirementAccountComparison4))) {
                z = false;
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new RetirementAccountComparison8(retirementAccountComparison4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue4), button_cta_text, modifierAutoLogEvents$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparison5.Success$lambda$11(apiRetirementAccountComparisonResponse, retirementAccountComparison4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Success$lambda$3$lambda$2(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Success$lambda$10$lambda$8$lambda$7(final ApiRetirementAccountComparisonResponse apiRetirementAccountComparisonResponse, final CoroutineScope coroutineScope, final LazyListState lazyListState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1114613580, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$1$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1114613580, i, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.Success.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RetirementAccountComparison.kt:109)");
                }
                String title = apiRetirementAccountComparisonResponse.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(apiRetirementAccountComparisonResponse.getDescription(), PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final List<RetirementAccountComparisonDropdown> sections = apiRetirementAccountComparisonResponse.getSections();
        LazyColumn.items(sections.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$lambda$10$lambda$8$lambda$7$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                sections.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$lambda$10$lambda$8$lambda$7$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, final int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                RetirementAccountComparisonDropdown retirementAccountComparisonDropdown = (RetirementAccountComparisonDropdown) sections.get(i);
                composer.startReplaceGroup(517678912);
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(lazyListState) | ((((i3 & 112) ^ 48) > 32 && composer.changed(i)) || (i3 & 48) == 32);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    final LazyListState lazyListState2 = lazyListState;
                    objRememberedValue = new Function1<Boolean, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        /* compiled from: RetirementAccountComparison.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$1$1$1$2$1$1$1", m3645f = "RetirementAccountComparison.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$Success$1$1$1$2$1$1$1 */
                        static final class C270501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ int $index;
                            final /* synthetic */ LazyListState $scrollState;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C270501(LazyListState lazyListState, int i, Continuation<? super C270501> continuation) {
                                super(2, continuation);
                                this.$scrollState = lazyListState;
                                this.$index = i;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C270501(this.$scrollState, this.$index, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C270501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
                            
                                if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r10, 2, null) == r0) goto L15;
                             */
                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invokeSuspend(Object obj) {
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.label = 1;
                                    if (DelayKt.delay(200L, this) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                ResultKt.throwOnFailure(obj);
                                LazyListState lazyListState = this.$scrollState;
                                int i2 = this.$index + 1;
                                this.label = 2;
                            }
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C270501(lazyListState2, i, null), 3, null);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RetirementAccountComparison5.ComparisonSection(null, retirementAccountComparisonDropdown, (Function1) objRememberedValue, composer, 0, 1);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComparisonSection(Modifier modifier, final RetirementAccountComparisonDropdown retirementAccountComparisonDropdown, final Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(32754877);
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
            i3 |= composerStartRestartGroup.changedInstance(retirementAccountComparisonDropdown) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(32754877, i3, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.ComparisonSection (RetirementAccountComparison.kt:190)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, retirementAccountComparisonDropdown.getLogging_identifier(), null, 4, null), null, 43, null), false, false, false, true, false, null, 110, null);
            Modifier modifier5 = modifier4;
            String title = retirementAccountComparisonDropdown.getTitle();
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(retirementAccountComparisonDropdown.getPictogram().getServerValue());
            if (serverToBentoAssetMapper3FromServerValue == null) {
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
            }
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper3FromServerValue, null, null, 6, null), title, (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
            boolean zComparisonSection$lambda$13 = ComparisonSection$lambda$13(snapshotState);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = (i3 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RetirementAccountComparison5.ComparisonSection$lambda$16$lambda$15(function1, snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAccordionRow.BentoAccordionRow(modifierAutoLogEvents$default, zComparisonSection$lambda$13, bentoBaseRowState, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(550748134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt.ComparisonSection.2
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(550748134, i5, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.ComparisonSection.<anonymous> (RetirementAccountComparison.kt:217)");
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    RetirementAccountComparisonDropdown retirementAccountComparisonDropdown2 = retirementAccountComparisonDropdown;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composer2.startReplaceGroup(1332832603);
                    Iterator<T> it = retirementAccountComparisonDropdown2.getSections().iterator();
                    while (it.hasNext()) {
                        RetirementAccountComparison5.ComparisonInfo((RetirementAccountComparisonDropdownBody) it.next(), composer2, 0);
                    }
                    composer2.endReplaceGroup();
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (BentoBaseRowState.$stable << 6) | 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparison5.ComparisonSection$lambda$17(modifier3, retirementAccountComparisonDropdown, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ComparisonSection$lambda$14(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComparisonSection$lambda$16$lambda$15(Function1 function1, SnapshotState snapshotState, boolean z) {
        ComparisonSection$lambda$14(snapshotState, z);
        function1.invoke(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComparisonInfo(final RetirementAccountComparisonDropdownBody retirementAccountComparisonDropdownBody, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-516404912);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(retirementAccountComparisonDropdownBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-516404912, i2, -1, "com.robinhood.android.retirement.onboarding.accountcomparison.ComparisonInfo (RetirementAccountComparison.kt:230)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            String title = retirementAccountComparisonDropdownBody.getTitle();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21595getXsmallD9Ej5fM(), 5, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            final Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(retirementAccountComparisonDropdownBody.getDescription(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(spannedRememberMarkdown);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function3() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return RetirementAccountComparison5.ComparisonInfo$lambda$21$lambda$20$lambda$19(spannedRememberMarkdown, (LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidViewBinding.AndroidViewBinding((Function3) objRememberedValue, null, null, composerStartRestartGroup, 0, 6);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.onboarding.accountcomparison.RetirementAccountComparisonKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RetirementAccountComparison5.ComparisonInfo$lambda$22(retirementAccountComparisonDropdownBody, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IncludeComparisonInlineDefinitionBinding ComparisonInfo$lambda$21$lambda$20$lambda$19(Spanned spanned, LayoutInflater inflater, ViewGroup parent, boolean z) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        IncludeComparisonInlineDefinitionBinding includeComparisonInlineDefinitionBindingInflate = IncludeComparisonInlineDefinitionBinding.inflate(inflater, parent, z);
        Intrinsics.checkNotNullExpressionValue(includeComparisonInlineDefinitionBindingInflate, "inflate(...)");
        RdsInlineDefinitionTextView root = includeComparisonInlineDefinitionBindingInflate.getRoot();
        root.setSpannableString(new SpannableString(spanned));
        root.setConfig(new RdsInlineDefinitionConfig(null, false, null, 5, null));
        return includeComparisonInlineDefinitionBindingInflate;
    }
}
