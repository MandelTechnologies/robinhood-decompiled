package com.robinhood.android.slip.onboarding.agreements.onclickagreement;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreen3;
import com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementViewState;
import com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContent3;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SlipOneClickAgreementScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SlipOneClickAgreementScreen", "", "state", "Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClickDone", "Lkotlin/Function0;", "(Lcom/robinhood/android/slip/onboarding/agreements/onclickagreement/SlipOneClickAgreementViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipOneClickAgreementScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlipOneClickAgreementScreen$lambda$0(SlipOneClickAgreementViewState slipOneClickAgreementViewState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        SlipOneClickAgreementScreen(slipOneClickAgreementViewState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: SlipOneClickAgreementScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt$SlipOneClickAgreementScreen$1 */
    static final class C285921 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClickDone;
        final /* synthetic */ SlipOneClickAgreementViewState $state;

        C285921(SlipOneClickAgreementViewState slipOneClickAgreementViewState, Modifier modifier, Function0<Unit> function0) {
            this.$state = slipOneClickAgreementViewState;
            this.$modifier = modifier;
            this.$onClickDone = function0;
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
                ComposerKt.traceEventStart(-19075909, i, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreen.<anonymous> (SlipOneClickAgreementScreen.kt:34)");
            }
            SlipOneClickAgreementViewState slipOneClickAgreementViewState = this.$state;
            if (slipOneClickAgreementViewState instanceof SlipOneClickAgreementViewState.Success) {
                composer.startReplaceGroup(-1354517097);
                final List<ApiPreviouslySignedAgreements.AgreementRow> slipAgreements = ((SlipOneClickAgreementViewState.Success) this.$state).getSlipAgreements();
                Modifier modifier = this.$modifier;
                final SlipOneClickAgreementViewState slipOneClickAgreementViewState2 = this.$state;
                final Function0<Unit> function0 = this.$onClickDone;
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null));
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
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
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(slipAgreements) | composer.changed(slipOneClickAgreementViewState2);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt$SlipOneClickAgreementScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SlipOneClickAgreementScreen3.C285921.invoke$lambda$6$lambda$5$lambda$2$lambda$1(slipAgreements, slipOneClickAgreementViewState2, (LazyListScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composer, 196608, 478);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt$SlipOneClickAgreementScreen$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SlipOneClickAgreementScreen3.C285921.invoke$lambda$6$lambda$5$lambda$4$lambda$3(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0), PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                composer.endNode();
                composer.endReplaceGroup();
            } else if (slipOneClickAgreementViewState instanceof SlipOneClickAgreementViewState.Error) {
                composer.startReplaceGroup(-1350629666);
                ErrorScreenComposable.ErrorScreenComposable(null, null, 0, null, null, null, null, false, composer, 12582912, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
                composer.endReplaceGroup();
            } else {
                if (!(slipOneClickAgreementViewState instanceof SlipOneClickAgreementViewState.Loading)) {
                    composer.startReplaceGroup(-1152074744);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1350499559);
                SlipPreviouslySignedAgreementsContent3.LoadingState(composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$2$lambda$1(List list, final SlipOneClickAgreementViewState slipOneClickAgreementViewState, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, SlipOneClickAgreementScreen.INSTANCE.getLambda$726084224$feature_slip_externalDebug(), 3, null);
            List<ApiPreviouslySignedAgreements.AgreementRow> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (ApiPreviouslySignedAgreements.AgreementRow agreementRow : list2) {
                arrayList.add(Tuples4.m3642to(agreementRow.getTitle(), agreementRow.getContent_markdown()));
            }
            SlipPreviouslySignedAgreementsContent3.expandableAgreements(LazyColumn, false, arrayList);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-981201609, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt$SlipOneClickAgreementScreen$1$1$1$1$1$2
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
                        ComposerKt.traceEventStart(-981201609, i, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SlipOneClickAgreementScreen.kt:67)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
                    SlipOneClickAgreementViewState slipOneClickAgreementViewState2 = slipOneClickAgreementViewState;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                    SlipOneClickAgreementViewState.Success success = (SlipOneClickAgreementViewState.Success) slipOneClickAgreementViewState2;
                    String summaryTitle = success.getSummaryTitle();
                    TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
                    BentoText2.m20747BentoText38GnDrw(summaryTitle, modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composer, 24576, 0, 8168);
                    ImmutableList3 persistentList = extensions2.toPersistentList(success.getSummaryItems());
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composer.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5146paddingqDBjuR0$default2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composer, 100663296, 0);
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void SlipOneClickAgreementScreen(final SlipOneClickAgreementViewState state, Modifier modifier, final Function0<Unit> onClickDone, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickDone, "onClickDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(2012956902);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickDone) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2012956902, i3, -1, "com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreen (SlipOneClickAgreementScreen.kt:32)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-19075909, true, new C285921(state, modifier, onClickDone), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.onclickagreement.SlipOneClickAgreementScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipOneClickAgreementScreen3.SlipOneClickAgreementScreen$lambda$0(state, modifier2, onClickDone, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
