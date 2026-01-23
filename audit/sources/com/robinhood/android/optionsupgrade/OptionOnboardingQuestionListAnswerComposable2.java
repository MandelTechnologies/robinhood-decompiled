package com.robinhood.android.optionsupgrade;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionOnboardingQuestionListAnswerComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"OptionOnboardingQuestionListAnswerComposable", "", "T", "state", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswerViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onQuestionAnswered", "Lkotlin/Function1;", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswer;", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionListAnswerViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingQuestionListAnswerComposable2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingQuestionListAnswerComposable$lambda$7(OptionOnboardingQuestionListAnswerViewState optionOnboardingQuestionListAnswerViewState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        OptionOnboardingQuestionListAnswerComposable(optionOnboardingQuestionListAnswerViewState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void OptionOnboardingQuestionListAnswerComposable(OptionOnboardingQuestionListAnswerViewState<T> optionOnboardingQuestionListAnswerViewState, Modifier modifier, Function1<? super OptionOnboardingQuestionListAnswer<T>, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Navigator navigator;
        final Context context;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean z;
        boolean z2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final OptionOnboardingQuestionListAnswerViewState<T> state = optionOnboardingQuestionListAnswerViewState;
        final Function1<? super OptionOnboardingQuestionListAnswer<T>, Unit> onQuestionAnswered = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onQuestionAnswered, "onQuestionAnswered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-703477808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onQuestionAnswered) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-703477808, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposable (OptionOnboardingQuestionListAnswerComposable.kt:29)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
                String strStringResource = StringResources_androidKt.stringResource(state.getQuestionResId(), composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                String strStringResource2 = StringResources_androidKt.stringResource(optionOnboardingQuestionListAnswerViewState.getBodyMarkdownResId(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOnboardingQuestionListAnswerComposable2.m2360x14b37f3d(navigator, context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(strStringResource2, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, 0, 14);
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i4 & 14) == 4) {
                    if ((i4 & 8) != 0) {
                        state = optionOnboardingQuestionListAnswerViewState;
                        if (composerStartRestartGroup.changedInstance(state)) {
                        }
                        z2 = ((i4 & 896) == 256) | z;
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            onQuestionAnswered = function1;
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionOnboardingQuestionListAnswerComposable2.m2361xe5d943bd(state, onQuestionAnswered, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            onQuestionAnswered = function1;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 510);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        state = optionOnboardingQuestionListAnswerViewState;
                    }
                    z = false;
                    z2 = ((i4 & 896) == 256) | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                        onQuestionAnswered = function1;
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionOnboardingQuestionListAnswerComposable2.m2361xe5d943bd(state, onQuestionAnswered, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 510);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier5;
                    }
                } else {
                    state = optionOnboardingQuestionListAnswerViewState;
                }
                z = true;
                z2 = ((i4 & 896) == 256) | z;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOnboardingQuestionListAnswerComposable2.OptionOnboardingQuestionListAnswerComposable$lambda$7(state, modifier3, onQuestionAnswered, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
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
                String strStringResource3 = StringResources_androidKt.stringResource(state.getQuestionResId(), composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource3, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                String strStringResource22 = StringResources_androidKt.stringResource(optionOnboardingQuestionListAnswerViewState.getBodyMarkdownResId(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionOnboardingQuestionListAnswerComposable2.m2360x14b37f3d(navigator, context, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(strStringResource22, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, 0, 14);
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i4 & 14) == 4) {
                    }
                    z = true;
                    z2 = ((i4 & 896) == 256) | z;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionOnboardingQuestionListAnswerComposable$lambda$6$lambda$1$lambda$0 */
    public static final Unit m2360x14b37f3d(Navigator navigator, Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt.isHelpCenterUrl(url)) {
            Navigators3.showHelpCenterWebViewFragment(navigator, context, url);
        } else {
            WebUtils.viewUrl$default(context, url, 0, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionOnboardingQuestionListAnswerComposable$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2361xe5d943bd(OptionOnboardingQuestionListAnswerViewState optionOnboardingQuestionListAnswerViewState, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final ImmutableList answers = optionOnboardingQuestionListAnswerViewState.getAnswers();
        final C25003x278e74d0 c25003x278e74d0 = new Function1() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$OptionOnboardingQuestionListAnswerComposable$lambda$6$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(OptionOnboardingQuestionListAnswer<T> optionOnboardingQuestionListAnswer) {
                return null;
            }
        };
        LazyColumn.items(answers.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$OptionOnboardingQuestionListAnswerComposable$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c25003x278e74d0.invoke(answers.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$OptionOnboardingQuestionListAnswerComposable$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final OptionOnboardingQuestionListAnswer optionOnboardingQuestionListAnswer = (OptionOnboardingQuestionListAnswer) answers.get(i);
                composer.startReplaceGroup(122050115);
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(optionOnboardingQuestionListAnswer.getAnswerResId(), composer, 0)), null, null, null, false, false, 125, null);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function1) | composer.changedInstance(optionOnboardingQuestionListAnswer);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = function1;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionListAnswerComposableKt$OptionOnboardingQuestionListAnswerComposable$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(optionOnboardingQuestionListAnswer);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, true, 0L, (Function0) objRememberedValue, composer, (BentoBaseRowState.$stable << 3) | 24576, 45);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
