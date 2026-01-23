package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.selection.Selectable3;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.ParagraphStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationDecision;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.UtilsKt;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreen;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountRecommendationEligibleScreen.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"CardInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "AccountTypeOptionCardShape", "Landroidx/compose/ui/graphics/Shape;", "getAccountTypeOptionCardShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "AccountTypeOptionCard", "", "state", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$AccountTypeOption;", "activeAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$AccountTypeOption;Lcom/robinhood/models/api/BrokerageAccountType;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountRecommendationEligibleScreen", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Eligible;", "onAccountTypeDecided", "Lkotlin/Function1;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationDecision;", "(Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState$Eligible;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-advisory-onboarding_externalDebug", "selectedAccountType"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AccountRecommendationEligibleScreen {
    private static final float CardInnerPadding = C2002Dp.m7995constructorimpl(20);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRecommendationEligibleScreen$lambda$8(AccountRecommendationResultsViewState.Eligible eligible, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountRecommendationEligibleScreen(eligible, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeOptionCard$lambda$0(AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption, BrokerageAccountType brokerageAccountType, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountTypeOptionCard(accountTypeOption, brokerageAccountType, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    @JvmName
    public static final Shape getAccountTypeOptionCardShape(Composer composer, int i) {
        composer.startReplaceGroup(267389039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(267389039, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.<get-AccountTypeOptionCardShape> (AccountRecommendationEligibleScreen.kt:50)");
        }
        RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShapeM5327RoundedCornerShape0680j_4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTypeOptionCard(final AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption, final BrokerageAccountType brokerageAccountType, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1056913781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(accountTypeOption) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1056913781, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountTypeOptionCard (AccountRecommendationEligibleScreen.kt:58)");
                }
                final boolean z = accountTypeOption.getAccountType() != brokerageAccountType;
                Shape accountTypeOptionCardShape = getAccountTypeOptionCardShape(composerStartRestartGroup, 0);
                Modifier modifierM5315selectableXHw0xAI = Selectable3.m5315selectableXHw0xAI(Clip.clip(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), getAccountTypeOptionCardShape(composerStartRestartGroup, 0)), z, true, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 6) & 14));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                CardKt.Card(modifierM5315selectableXHw0xAI, accountTypeOptionCardShape, CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU()), ComposableLambda3.rememberComposableLambda(-249944381, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt.AccountTypeOptionCard.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 Card, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i6 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-249944381, i6, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountTypeOptionCard.<anonymous> (AccountRecommendationEligibleScreen.kt:79)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, AccountRecommendationEligibleScreen.CardInnerPadding);
                        boolean z2 = z;
                        final AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption2 = accountTypeOption;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(accountTypeOption2.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer3, 24576, 0, 16366);
                        composer3.startReplaceGroup(-392869952);
                        if (accountTypeOption2.getRecommendationLabel() != null) {
                            String recommendationLabel = accountTypeOption2.getRecommendationLabel();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(recommendationLabel, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).getXray()), null, false, null, null, composer3, 12582912, 116);
                        }
                        composer3.endReplaceGroup();
                        Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer3, 0);
                        RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        RadioButtonKt.RadioButton(z2, null, null, false, radioButtonDefaults.m5934colorsro_MJ88(bentoTheme3.getColors(composer3, i8).m21368getAccent0d7_KjU(), bentoTheme3.getColors(composer3, i8).m21427getFg30d7_KjU(), 0L, 0L, composer3, RadioButtonDefaults.$stable << 12, 12), null, composer3, 48, 44);
                        composer3.endNode();
                        AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-135773387, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountTypeOptionCard$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                invoke(animatedVisibilityScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-135773387, i9, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountTypeOptionCard.<anonymous>.<anonymous>.<anonymous> (AccountRecommendationEligibleScreen.kt:113)");
                                }
                                AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption3 = accountTypeOption2;
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                for (String str : accountTypeOption3.getValueProps()) {
                                    int iPushStyle = builder.pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(0L, TextUnit2.getSp(12), 1, null), null, null, 0, 0, null, 503, null));
                                    try {
                                        builder.append("•\t\t" + str);
                                        Unit unit = Unit.INSTANCE;
                                    } finally {
                                        builder.pop(iPushStyle);
                                    }
                                }
                                BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer4, 0, 0, 16380);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 1572870, 30);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 196608, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountRecommendationEligibleScreen.AccountTypeOptionCard$lambda$0(accountTypeOption, brokerageAccountType, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (accountTypeOption.getAccountType() != brokerageAccountType) {
            }
            Shape accountTypeOptionCardShape2 = getAccountTypeOptionCardShape(composerStartRestartGroup, 0);
            Modifier modifierM5315selectableXHw0xAI2 = Selectable3.m5315selectableXHw0xAI(Clip.clip(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), getAccountTypeOptionCardShape(composerStartRestartGroup, 0)), z, true, Role.m7472boximpl(Role.INSTANCE.m7484getRadioButtono7Vup1c()), Haptics.hapticClick(function0, composerStartRestartGroup, (i3 >> 6) & 14));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            CardKt.Card(modifierM5315selectableXHw0xAI2, accountTypeOptionCardShape2, CardDefaults.INSTANCE.m5729cardColorsro_MJ88(bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, 0L, 0L, composer2, CardDefaults.$stable << 12, 14), null, BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU()), ComposableLambda3.rememberComposableLambda(-249944381, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt.AccountTypeOptionCard.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 Card, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i6 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-249944381, i6, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountTypeOptionCard.<anonymous> (AccountRecommendationEligibleScreen.kt:79)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, AccountRecommendationEligibleScreen.CardInnerPadding);
                    boolean z2 = z;
                    final AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption2 = accountTypeOption;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer3, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, companion);
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor2);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(accountTypeOption2.getTitle(), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer3, 24576, 0, 16366);
                    composer3.startReplaceGroup(-392869952);
                    if (accountTypeOption2.getRecommendationLabel() != null) {
                        String recommendationLabel = accountTypeOption2.getRecommendationLabel();
                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(recommendationLabel, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, Color.m6701boximpl(bentoTheme22.getColors(composer3, i7).getXray()), null, false, null, null, composer3, 12582912, 116);
                    }
                    composer3.endReplaceGroup();
                    Spacer2.Spacer(Row5.weight$default(row6, companion, 1.0f, false, 2, null), composer3, 0);
                    RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    RadioButtonKt.RadioButton(z2, null, null, false, radioButtonDefaults.m5934colorsro_MJ88(bentoTheme3.getColors(composer3, i8).m21368getAccent0d7_KjU(), bentoTheme3.getColors(composer3, i8).m21427getFg30d7_KjU(), 0L, 0L, composer3, RadioButtonDefaults.$stable << 12, 12), null, composer3, 48, 44);
                    composer3.endNode();
                    AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-135773387, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountTypeOptionCard$1$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                            invoke(animatedVisibilityScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i9) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-135773387, i9, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountTypeOptionCard.<anonymous>.<anonymous>.<anonymous> (AccountRecommendationEligibleScreen.kt:113)");
                            }
                            AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption3 = accountTypeOption2;
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            for (String str : accountTypeOption3.getValueProps()) {
                                int iPushStyle = builder.pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(0L, TextUnit2.getSp(12), 1, null), null, null, 0, 0, null, 503, null));
                                try {
                                    builder.append("•\t\t" + str);
                                    Unit unit = Unit.INSTANCE;
                                } finally {
                                    builder.pop(iPushStyle);
                                }
                            }
                            BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer4, 0, 0, 16380);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), composer3, 1572870, 30);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 196608, 8);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrokerageAccountType AccountRecommendationEligibleScreen$lambda$2(SnapshotState<BrokerageAccountType> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountRecommendationEligibleScreen(final AccountRecommendationResultsViewState.Eligible state, final Function1<? super AccountRecommendationDecision, Unit> onAccountTypeDecided, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAccountTypeDecided, "onAccountTypeDecided");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1049188193);
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
            i3 |= composerStartRestartGroup.changedInstance(onAccountTypeDecided) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1049188193, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreen (AccountRecommendationEligibleScreen.kt:135)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(state);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(state.getRecommendedOption(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String loggingIdentifier = state.getLoggingIdentifier();
                AccountRecommendationDecision accountRecommendationDecision = new AccountRecommendationDecision(state.getRecommendedOption(), AccountRecommendationEligibleScreen$lambda$2(snapshotState), state.getTaxYear());
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountRecommendationEligibleScreen.AccountRecommendationEligibleScreen$lambda$7$lambda$6(state, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(424799011, true, new C90892(state, loggingIdentifier, onAccountTypeDecided, accountRecommendationDecision), composerStartRestartGroup, 54), modifier2, null, 0L, false, paddingValuesM5137PaddingValuesYgX7TsA$default, null, null, composerStartRestartGroup, (i3 & 896) | 48, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountRecommendationEligibleScreen.AccountRecommendationEligibleScreen$lambda$8(state, onAccountTypeDecided, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(state);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(state.getRecommendedOption(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String loggingIdentifier2 = state.getLoggingIdentifier();
                AccountRecommendationDecision accountRecommendationDecision2 = new AccountRecommendationDecision(state.getRecommendedOption(), AccountRecommendationEligibleScreen$lambda$2(snapshotState), state.getTaxYear());
                PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default2 = androidx.compose.foundation.layout.PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(state) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountRecommendationEligibleScreen.AccountRecommendationEligibleScreen$lambda$7$lambda$6(state, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    UtilsKt.m11125StickyFooterLazyColumnmxsUjTo((Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(424799011, true, new C90892(state, loggingIdentifier2, onAccountTypeDecided, accountRecommendationDecision2), composerStartRestartGroup, 54), modifier2, null, 0L, false, paddingValuesM5137PaddingValuesYgX7TsA$default2, null, null, composerStartRestartGroup, (i3 & 896) | 48, 440);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountRecommendationEligibleScreen$lambda$7$lambda$6(AccountRecommendationResultsViewState.Eligible eligible, final SnapshotState snapshotState, LazyListScope StickyFooterLazyColumn) {
        Intrinsics.checkNotNullParameter(StickyFooterLazyColumn, "$this$StickyFooterLazyColumn");
        SduiColumns.sduiItems(StickyFooterLazyColumn, eligible.getHeader(), GenericAction.class, null, null, HorizontalPadding.Default);
        LazyListScope.item$default(StickyFooterLazyColumn, null, null, AccountRecommendationEligibleScreen4.INSTANCE.getLambda$548526735$feature_advisory_onboarding_externalDebug(), 3, null);
        final ImmutableList<AccountRecommendationResultsViewState.AccountTypeOption> options = eligible.getOptions();
        final C9084x360587bb c9084x360587bb = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AccountRecommendationResultsViewState.AccountTypeOption) obj);
            }
        };
        StickyFooterLazyColumn.items(options.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c9084x360587bb.invoke(options.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$lambda$7$lambda$6$$inlined$items$default$4
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
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final AccountRecommendationResultsViewState.AccountTypeOption accountTypeOption = (AccountRecommendationResultsViewState.AccountTypeOption) options.get(i);
                composer.startReplaceGroup(-581671930);
                BrokerageAccountType brokerageAccountTypeAccountRecommendationEligibleScreen$lambda$2 = AccountRecommendationEligibleScreen.AccountRecommendationEligibleScreen$lambda$2(snapshotState);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(snapshotState) | composer.changedInstance(accountTypeOption);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState snapshotState2 = snapshotState;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            snapshotState2.setValue(accountTypeOption.getAccountType());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                AccountRecommendationEligibleScreen.AccountTypeOptionCard(accountTypeOption, brokerageAccountTypeAccountRecommendationEligibleScreen$lambda$2, (Function0) objRememberedValue, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 7, null), composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* compiled from: AccountRecommendationEligibleScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$2 */
    static final class C90892 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $ctaIdentifier;
        final /* synthetic */ AccountRecommendationDecision $decision;
        final /* synthetic */ Function1<AccountRecommendationDecision, Unit> $onAccountTypeDecided;
        final /* synthetic */ AccountRecommendationResultsViewState.Eligible $state;

        /* JADX WARN: Multi-variable type inference failed */
        C90892(AccountRecommendationResultsViewState.Eligible eligible, String str, Function1<? super AccountRecommendationDecision, Unit> function1, AccountRecommendationDecision accountRecommendationDecision) {
            this.$state = eligible;
            this.$ctaIdentifier = str;
            this.$onAccountTypeDecided = function1;
            this.$decision = accountRecommendationDecision;
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
                ComposerKt.traceEventStart(424799011, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreen.<anonymous> (AccountRecommendationEligibleScreen.kt:167)");
            }
            String label = this.$state.getCta().getLabel();
            ImmutableList<UIComponent<GenericAction>> footer = this.$state.getFooter();
            String str = this.$ctaIdentifier;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onAccountTypeDecided) | composer.changedInstance(this.$decision);
            final Function1<AccountRecommendationDecision, Unit> function1 = this.$onAccountTypeDecided;
            final AccountRecommendationDecision accountRecommendationDecision = this.$decision;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationEligibleScreenKt$AccountRecommendationEligibleScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AccountRecommendationEligibleScreen.C90892.invoke$lambda$1$lambda$0(function1, accountRecommendationDecision);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UtilsKt.RetirementOnboardingFooter(label, str, (Function0) objRememberedValue, null, footer, false, composer, 0, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, AccountRecommendationDecision accountRecommendationDecision) {
            function1.invoke(accountRecommendationDecision);
            return Unit.INSTANCE;
        }
    }
}
