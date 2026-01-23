package com.robinhood.android.goldearningspotential.p152ui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorAlertContentUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsCalculatorUiModel;
import com.robinhood.android.goldearningspotential.microgram.GoldEarningsDisclosureUiModel;
import com.robinhood.android.goldearningspotential.p152ui.GoldEarningsPotentialCalculatorComposable;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldEarningsPotentialCalculatorComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\u000f\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aE\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\" \u0010\u0018\u001a\u00020\u00178\u0000X\u0081D¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;", "goldEarningsCalculatorUiModel", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Context;", "screenEventContext", "Landroidx/compose/ui/Modifier;", "modifier", "", "GoldEarningsPotentialCalculatorComposable", "(Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorUiModel;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "GoldEarningsPotentialCalculatorRow", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;", "goldEarningsDisclosureUiModel", "Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsCalculatorAlertContentUiModel;", "onDisclosureClick", "GoldEarningsPotentialCalculatorDisclosure", "(Lcom/robinhood/android/goldearningspotential/microgram/GoldEarningsDisclosureUiModel;Lkotlin/jvm/functions/Function1;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "GoldEarningsCalculatorLogoImage", "Ljava/lang/String;", "getGoldEarningsCalculatorLogoImage", "()Ljava/lang/String;", "getGoldEarningsCalculatorLogoImage$annotations", "()V", "lib-gold-earnings-potential-microgram_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldEarningsPotentialCalculatorComposable {
    private static final String GoldEarningsCalculatorLogoImage = "goldEarningsCalculatorLogoImage";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsPotentialCalculatorComposable$lambda$0(GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, Screen screen, Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldEarningsPotentialCalculatorComposable(goldEarningsCalculatorUiModel, screen, context, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsPotentialCalculatorDisclosure$lambda$2(GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, Function1 function1, Screen screen, Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldEarningsPotentialCalculatorDisclosure(goldEarningsDisclosureUiModel, function1, screen, context, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldEarningsPotentialCalculatorRow$lambda$1(Function3 function3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldEarningsPotentialCalculatorRow(function3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldEarningsCalculatorLogoImage$annotations() {
    }

    public static final String getGoldEarningsCalculatorLogoImage() {
        return GoldEarningsCalculatorLogoImage;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldEarningsPotentialCalculatorComposable(final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel, final Screen eventScreen, final Context screenEventContext, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldEarningsCalculatorUiModel, "goldEarningsCalculatorUiModel");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(screenEventContext, "screenEventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(490874393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldEarningsCalculatorUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenEventContext) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(490874393, i3, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposable (GoldEarningsPotentialCalculatorComposable.kt:43)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, screenEventContext, new Component(Component.ComponentType.ROW, "gold_earnings_potential_calculator_row", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(1670016324, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt.GoldEarningsPotentialCalculatorComposable.1
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
                            ComposerKt.traceEventStart(1670016324, i5, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposable.<anonymous> (GoldEarningsPotentialCalculatorComposable.kt:54)");
                        }
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null);
                        final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel2 = goldEarningsCalculatorUiModel;
                        final Modifier modifier5 = modifier4;
                        GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorRow(ComposableLambda3.rememberComposableLambda(326433676, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt.GoldEarningsPotentialCalculatorComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                                invoke(row5, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Row5 GoldEarningsPotentialCalculatorRow, Composer composer3, int i6) {
                                int i7;
                                GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel3;
                                Modifier modifier6;
                                Composer composer4 = composer3;
                                Intrinsics.checkNotNullParameter(GoldEarningsPotentialCalculatorRow, "$this$GoldEarningsPotentialCalculatorRow");
                                if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(326433676, i6, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposable.<anonymous>.<anonymous> (GoldEarningsPotentialCalculatorComposable.kt:60)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM());
                                GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel4 = goldEarningsCalculatorUiModel2;
                                Modifier modifier7 = modifier5;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer4, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                String remoteImageUrl = goldEarningsCalculatorUiModel4.getRemoteImageUrl();
                                composer4.startReplaceGroup(1333566256);
                                if (remoteImageUrl == null) {
                                    goldEarningsCalculatorUiModel3 = goldEarningsCalculatorUiModel4;
                                    modifier6 = modifier7;
                                    i7 = 0;
                                } else {
                                    i7 = 0;
                                    goldEarningsCalculatorUiModel3 = goldEarningsCalculatorUiModel4;
                                    modifier6 = modifier7;
                                    ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(remoteImageUrl, CoilUtils2.rememberImageLoader(0.0d, null, composer4, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(32)), 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 11, null), GoldEarningsPotentialCalculatorComposable.getGoldEarningsCalculatorLogoImage()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                                    composer4 = composer3;
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierWeight$default = Row5.weight$default(row6, modifier6, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, i7);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, i7);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                SduiComponent3.SduiComponent(goldEarningsCalculatorUiModel3.getTitle(), null, null, composer4, 0, 6);
                                SduiComponent3.SduiComponent(goldEarningsCalculatorUiModel3.getSubtitle(), null, null, composer3, 0, 6);
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), modifierAutoLogEvents$default, composer2, 6, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorComposable$lambda$0(goldEarningsCalculatorUiModel, eventScreen, screenEventContext, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, screenEventContext, new Component(Component.ComponentType.ROW, "gold_earnings_potential_calculator_row", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(1670016324, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt.GoldEarningsPotentialCalculatorComposable.1
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
                        ComposerKt.traceEventStart(1670016324, i5, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposable.<anonymous> (GoldEarningsPotentialCalculatorComposable.kt:54)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, null, true, false, false, true, false, null, 109, null);
                    final GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel2 = goldEarningsCalculatorUiModel;
                    final Modifier modifier5 = modifier4;
                    GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorRow(ComposableLambda3.rememberComposableLambda(326433676, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt.GoldEarningsPotentialCalculatorComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                            invoke(row5, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 GoldEarningsPotentialCalculatorRow, Composer composer3, int i6) {
                            int i7;
                            GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel3;
                            Modifier modifier6;
                            Composer composer4 = composer3;
                            Intrinsics.checkNotNullParameter(GoldEarningsPotentialCalculatorRow, "$this$GoldEarningsPotentialCalculatorRow");
                            if ((i6 & 17) == 16 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(326433676, i6, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposable.<anonymous>.<anonymous> (GoldEarningsPotentialCalculatorComposable.kt:60)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer4, i8).m21590getDefaultD9Ej5fM());
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer4, i8).m21593getSmallD9Ej5fM());
                            GoldEarningsCalculatorUiModel goldEarningsCalculatorUiModel4 = goldEarningsCalculatorUiModel2;
                            Modifier modifier7 = modifier5;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer4, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            String remoteImageUrl = goldEarningsCalculatorUiModel4.getRemoteImageUrl();
                            composer4.startReplaceGroup(1333566256);
                            if (remoteImageUrl == null) {
                                goldEarningsCalculatorUiModel3 = goldEarningsCalculatorUiModel4;
                                modifier6 = modifier7;
                                i7 = 0;
                            } else {
                                i7 = 0;
                                goldEarningsCalculatorUiModel3 = goldEarningsCalculatorUiModel4;
                                modifier6 = modifier7;
                                ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(remoteImageUrl, CoilUtils2.rememberImageLoader(0.0d, null, composer4, 0, 3), null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(32)), 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 11, null), GoldEarningsPotentialCalculatorComposable.getGoldEarningsCalculatorLogoImage()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                                composer4 = composer3;
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierWeight$default = Row5.weight$default(row6, modifier6, 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer4, i7);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, i7);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            SduiComponent3.SduiComponent(goldEarningsCalculatorUiModel3.getTitle(), null, null, composer4, 0, 6);
                            SduiComponent3.SduiComponent(goldEarningsCalculatorUiModel3.getSubtitle(), null, null, composer3, 0, 6);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), modifierAutoLogEvents$default, composer2, 6, 0);
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

    /* compiled from: GoldEarningsPotentialCalculatorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt$GoldEarningsPotentialCalculatorDisclosure$1 */
    static final class C183121 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ GoldEarningsDisclosureUiModel $goldEarningsDisclosureUiModel;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<GoldEarningsCalculatorAlertContentUiModel, Unit> $onDisclosureClick;

        /* JADX WARN: Multi-variable type inference failed */
        C183121(Modifier modifier, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, Function1<? super GoldEarningsCalculatorAlertContentUiModel, Unit> function1) {
            this.$modifier = modifier;
            this.$goldEarningsDisclosureUiModel = goldEarningsDisclosureUiModel;
            this.$onDisclosureClick = function1;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1701890790, i, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorDisclosure.<anonymous> (GoldEarningsPotentialCalculatorComposable.kt:137)");
            }
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            final GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel = this.$goldEarningsDisclosureUiModel;
            final Function1<GoldEarningsCalculatorAlertContentUiModel, Unit> function1 = this.$onDisclosureClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            SduiComponent3.SduiComponent(goldEarningsDisclosureUiModel.getDisclosure(), null, null, composer, 0, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function1) | composer.changedInstance(goldEarningsDisclosureUiModel);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt$GoldEarningsPotentialCalculatorDisclosure$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldEarningsPotentialCalculatorComposable.C183121.invoke$lambda$2$lambda$1$lambda$0(function1, goldEarningsDisclosureUiModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SduiComponent3.SduiComponent(goldEarningsDisclosureUiModel.getTrailingTextButton(), ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), null, composer, 0, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel) {
            function1.invoke(goldEarningsDisclosureUiModel.getTrailingTextButtonAlert());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldEarningsPotentialCalculatorRow(final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1511840199);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
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
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1511840199, i3, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorRow (GoldEarningsPotentialCalculatorComposable.kt:100)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, null, true, false, false, true, false, null, 109, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Clip.clip(Background3.m4872backgroundbw27NRU$default(PaddingKt.m5142padding3ABfNKs(modifierAutoLogEvents$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), null, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_4), bentoTheme.getColors(composerStartRestartGroup, i5).m21372getBg20d7_KjU(), null, 2, null);
                int i6 = ((i3 << 9) & 7168) | 384;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i6 >> 6) & 112) | 6));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorRow$lambda$1(function3, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, null, true, false, false, true, false, null, 109, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(Clip.clip(Background3.m4872backgroundbw27NRU$default(PaddingKt.m5142padding3ABfNKs(modifierAutoLogEvents$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), null, 2, null), roundedCornerShapeM5327RoundedCornerShape0680j_42), bentoTheme2.getColors(composerStartRestartGroup, i52).m21372getBg20d7_KjU(), null, 2, null);
            int i62 = ((i3 << 9) & 7168) | 384;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                function3.invoke(Row6.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i62 >> 6) & 112) | 6));
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldEarningsPotentialCalculatorDisclosure(final GoldEarningsDisclosureUiModel goldEarningsDisclosureUiModel, final Function1<? super GoldEarningsCalculatorAlertContentUiModel, Unit> onDisclosureClick, final Screen eventScreen, final Context screenEventContext, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(goldEarningsDisclosureUiModel, "goldEarningsDisclosureUiModel");
        Intrinsics.checkNotNullParameter(onDisclosureClick, "onDisclosureClick");
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(screenEventContext, "screenEventContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(-383042181);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(goldEarningsDisclosureUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDisclosureClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventScreen) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screenEventContext) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-383042181, i3, -1, "com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorDisclosure (GoldEarningsPotentialCalculatorComposable.kt:126)");
                }
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, screenEventContext, new Component(Component.ComponentType.ROW, "gold_earnings_potential_calculator_disclosure", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(1701890790, true, new C183121(modifier4, goldEarningsDisclosureUiModel, onDisclosureClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.goldearningspotential.ui.GoldEarningsPotentialCalculatorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GoldEarningsPotentialCalculatorComposable.GoldEarningsPotentialCalculatorDisclosure$lambda$2(goldEarningsDisclosureUiModel, onDisclosureClick, eventScreen, screenEventContext, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, eventScreen, null, screenEventContext, new Component(Component.ComponentType.ROW, "gold_earnings_potential_calculator_disclosure", null, 4, null), null, 37, null), ComposableLambda3.rememberComposableLambda(1701890790, true, new C183121(modifier4, goldEarningsDisclosureUiModel, onDisclosureClick), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
