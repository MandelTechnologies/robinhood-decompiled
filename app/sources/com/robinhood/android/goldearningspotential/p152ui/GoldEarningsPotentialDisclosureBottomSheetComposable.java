package com.robinhood.android.goldearningspotential.p152ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.ParagraphStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: GoldEarningsPotentialDisclosureBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"GoldEarningsPotentialDisclosureBottomSheet", "", "alert", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldEarningsPotentialDisclosureBottomSheetBulletPoints", "bodyComponents", "Lkotlinx/collections/immutable/ImmutableList;", "", "(Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldEarningsPotentialDisclosureBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsPotentialDisclosureBottomSheet$lambda$0(GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldEarningsPotentialDisclosureBottomSheet(goldEarningsCalculatorAlertContentUiModel, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$6(ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldEarningsPotentialDisclosureBottomSheetBulletPoints(immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GoldEarningsPotentialDisclosureBottomSheet(final GoldEarningsCalculatorAlertContentUiModel alert, final Function0<Unit> onDismiss, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(462163008);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(alert) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
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
                ComposerKt.traceEventStart(462163008, i3, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheet (GoldEarningsPotentialDisclosureBottomSheetComposable.kt:34)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-274654187, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt.GoldEarningsPotentialDisclosureBottomSheet.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    Object obj;
                    Modifier.Companion companion;
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-274654187, i5, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheet.<anonymous> (GoldEarningsPotentialDisclosureBottomSheetComposable.kt:36)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM());
                    GoldEarningsCalculatorAlertContentUiModel goldEarningsCalculatorAlertContentUiModel = alert;
                    Function0<Unit> function0 = onDismiss;
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
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
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(goldEarningsCalculatorAlertContentUiModel.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8124);
                    List<String> bodyComponents = goldEarningsCalculatorAlertContentUiModel.getBodyComponents();
                    composer2.startReplaceGroup(1730169050);
                    if (bodyComponents != null) {
                        obj = null;
                        GoldEarningsPotentialDisclosureBottomSheetComposable.GoldEarningsPotentialDisclosureBottomSheetBulletPoints(extensions2.toImmutableList(bodyComponents), null, composer2, 0, 2);
                    } else {
                        obj = null;
                    }
                    composer2.endReplaceGroup();
                    String bodyMarkdown = goldEarningsCalculatorAlertContentUiModel.getBodyMarkdown();
                    composer2.startReplaceGroup(1730177332);
                    if (bodyMarkdown != null) {
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, obj);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default2);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        companion = companion4;
                        BentoText2.m20747BentoText38GnDrw(bodyMarkdown, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                        composer2.endNode();
                    } else {
                        companion = companion4;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(6)), composer2, 6);
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0, goldEarningsCalculatorAlertContentUiModel.getDismissLabel(), PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(22), 7, null), null, null, false, false, null, null, null, null, false, null, composer2, 384, 0, 8184);
                    composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldEarningsPotentialDisclosureBottomSheetComposable.GoldEarningsPotentialDisclosureBottomSheet$lambda$0(alert, onDismiss, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldEarningsPotentialDisclosureBottomSheetBulletPoints(final ImmutableList<String> bodyComponents, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bodyComponents, "bodyComponents");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1677786516);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(bodyComponents) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1677786516, i3, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetBulletPoints (GoldEarningsPotentialDisclosureBottomSheetComposable.kt:85)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GoldEarningsPotentialDisclosureBottomSheetComposable.m2056xc4e61156(bodyComponents, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 3) & 14;
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i5, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldEarningsPotentialDisclosureBottomSheetComposable.GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$6(bodyComponents, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) != 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldEarningsPotentialDisclosureBottomSheetComposable.m2056xc4e61156(bodyComponents, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                int i52 = (i3 >> 3) & 14;
                modifier3 = modifier4;
                LazyDslKt.LazyColumn(modifier3, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i52, 510);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$5$lambda$4 */
    public static final Unit m2056xc4e61156(final ImmutableList immutableList, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C18316xa04ec29f c18316xa04ec29f = new Function1() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(String str) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((String) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c18316xa04ec29f.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialDisclosureBottomSheetComposableKt$GoldEarningsPotentialDisclosureBottomSheetBulletPoints$lambda$5$lambda$4$$inlined$items$default$4
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
                String str = (String) immutableList.get(i);
                composer.startReplaceGroup(-1624575055);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(0L, TextUnit2.getSp(12), 1, null), null, null, 0, 0, null, 503, null));
                try {
                    builder.append("•\t\t" + str);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    BentoText2.m20748BentoTextQnj7Zds(builder.toAnnotatedString(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer, 0, 0, 16380);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
