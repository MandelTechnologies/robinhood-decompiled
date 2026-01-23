package com.robinhood.android.dashboard.sweep;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SweepSectionV1Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1, reason: use source file name */
/* loaded from: classes2.dex */
final class SweepSectionV1Composable3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ApiSweepSplash.SweepSectionDepositRow $depositRow;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ Navigator $navigator;

    SweepSectionV1Composable3(ApiSweepSplash.SweepSectionDepositRow sweepSectionDepositRow, EventLogger eventLogger, Navigator navigator, Context context) {
        this.$depositRow = sweepSectionDepositRow;
        this.$eventLogger = eventLogger;
        this.$navigator = navigator;
        this.$context = context;
    }

    public final void invoke(Composer composer, int i) {
        BentoTheme bentoTheme;
        int i2;
        Context context;
        Arrangement arrangement;
        EventLogger eventLogger;
        Navigator navigator;
        ApiSweepSplash.SweepSectionDepositRow sweepSectionDepositRow;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-162140766, i, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<anonymous>.<anonymous>.<anonymous> (SweepSectionV1Composable.kt:128)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        ApiSweepSplash.SweepSectionDepositRow sweepSectionDepositRow2 = this.$depositRow;
        EventLogger eventLogger2 = this.$eventLogger;
        Navigator navigator2 = this.$navigator;
        Context context2 = this.$context;
        Arrangement arrangement2 = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically, composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        String title = sweepSectionDepositRow2.getTitle();
        composer.startReplaceGroup(-1265506152);
        if (title == null) {
            bentoTheme = bentoTheme2;
            i2 = i3;
            sweepSectionDepositRow = sweepSectionDepositRow2;
            context = context2;
            arrangement = arrangement2;
            eventLogger = eventLogger2;
            navigator = navigator2;
        } else {
            bentoTheme = bentoTheme2;
            i2 = i3;
            context = context2;
            arrangement = arrangement2;
            eventLogger = eventLogger2;
            navigator = navigator2;
            sweepSectionDepositRow = sweepSectionDepositRow2;
            BentoText2.m20747BentoText38GnDrw(title, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme2.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme2.getColors(composer, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16376);
        }
        composer.endReplaceGroup();
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM());
        composer.startReplaceGroup(-1224400529);
        final ApiSweepSplash.SweepSectionDepositRow sweepSectionDepositRow3 = sweepSectionDepositRow;
        final EventLogger eventLogger3 = eventLogger;
        final Navigator navigator3 = navigator;
        final Context context3 = context;
        boolean zChangedInstance = composer.changedInstance(sweepSectionDepositRow3) | composer.changedInstance(eventLogger3) | composer.changedInstance(navigator3) | composer.changedInstance(context3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SweepSectionV1Composable3.invoke$lambda$5$lambda$4$lambda$3(sweepSectionDepositRow3, eventLogger3, navigator3, context3, (LazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyRow(null, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, centerVertically2, null, false, null, (Function1) objRememberedValue, composer, 196608, 463);
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
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(ApiSweepSplash.SweepSectionDepositRow sweepSectionDepositRow, final EventLogger eventLogger, final Navigator navigator, final Context context, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List<ApiSweepSplash.SweepSectionDepositRowButton> buttons = sweepSectionDepositRow.getButtons();
        final C13802x4998868e c13802x4998868e = new Function1() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$invoke$lambda$5$lambda$4$lambda$3$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ApiSweepSplash.SweepSectionDepositRowButton sweepSectionDepositRowButton) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ApiSweepSplash.SweepSectionDepositRowButton) obj);
            }
        };
        LazyRow.items(buttons.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$invoke$lambda$5$lambda$4$lambda$3$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c13802x4998868e.invoke(buttons.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$invoke$lambda$5$lambda$4$lambda$3$$inlined$items$default$4
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
                final ApiSweepSplash.SweepSectionDepositRowButton sweepSectionDepositRowButton = (ApiSweepSplash.SweepSectionDepositRowButton) buttons.get(i);
                composer.startReplaceGroup(399686611);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(sweepSectionDepositRowButton) | composer.changedInstance(eventLogger) | composer.changedInstance(navigator) | composer.changedInstance(context);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final EventLogger eventLogger2 = eventLogger;
                    final Navigator navigator2 = navigator;
                    final Context context2 = context;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            String loggingIdentifier = sweepSectionDepositRowButton.getLoggingIdentifier();
                            String ctaDeeplinkUri = sweepSectionDepositRowButton.getCtaDeeplinkUri();
                            if (ctaDeeplinkUri != null) {
                                EventLogger eventLogger3 = eventLogger2;
                                Navigator navigator3 = navigator2;
                                Context context3 = context2;
                                EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger3, new UserInteractionEventData(UserInteractionEventData.EventType.TAP, null, new Component(Component.ComponentType.LINK_BUTTON, loggingIdentifier, null, 4, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
                                Navigator.DefaultImpls.handleDeepLink$default(navigator3, context3, Uri.parse(ctaDeeplinkUri), null, null, false, null, 60, null);
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20585BentoButton6BkTXZw((Function0) objRememberedValue, null, BentoButtons.Type.Secondary, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21427getFg30d7_KjU()), false, null, ComposableLambda3.rememberComposableLambda(584203665, true, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.android.dashboard.sweep.SweepSectionV1ComposableKt$SweepSectionV1Composable$1$3$1$1$2$1$1$2
                    public final void invoke(Row5 BentoButton, ButtonStyle.Style it, Composer composer2, int i4) {
                        ApiSweepSplash.SweepSectionDepositRowButton sweepSectionDepositRowButton2;
                        Modifier.Companion companion;
                        BentoTheme bentoTheme;
                        int i5;
                        BentoTheme bentoTheme2;
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i4 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(584203665, i4, -1, "com.robinhood.android.dashboard.sweep.SweepSectionV1Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SweepSectionV1Composable.kt:166)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM());
                        ApiSweepSplash.SweepSectionDepositRowButton sweepSectionDepositRowButton3 = sweepSectionDepositRowButton;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        String text = sweepSectionDepositRowButton3.getText();
                        composer2.startReplaceGroup(1235301341);
                        if (text == null) {
                            bentoTheme = bentoTheme3;
                            i5 = i7;
                            sweepSectionDepositRowButton2 = sweepSectionDepositRowButton3;
                            companion = companion2;
                        } else {
                            sweepSectionDepositRowButton2 = sweepSectionDepositRowButton3;
                            companion = companion2;
                            bentoTheme = bentoTheme3;
                            i5 = i7;
                            BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8190);
                        }
                        composer2.endReplaceGroup();
                        String highlightedText = sweepSectionDepositRowButton2.getHighlightedText();
                        composer2.startReplaceGroup(1235312148);
                        if (highlightedText == null) {
                            bentoTheme2 = bentoTheme;
                            i6 = i5;
                        } else {
                            long jM21256getGoldDepositMaxAwareness0d7_KjU = BentoColor.INSTANCE.m21256getGoldDepositMaxAwareness0d7_KjU();
                            BentoTheme bentoTheme4 = bentoTheme;
                            int i8 = i5;
                            bentoTheme2 = bentoTheme4;
                            i6 = i8;
                            BentoText2.m20747BentoText38GnDrw(highlightedText, null, Color.m6701boximpl(jM21256getGoldDepositMaxAwareness0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i8).getTextM(), composer2, 24576, 0, 8170);
                        }
                        composer2.endReplaceGroup();
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(sweepSectionDepositRowButton2.getIcon());
                        composer2.startReplaceGroup(1235328351);
                        if (serverToBentoAssetMapper2FromServerValue != null) {
                            BentoTheme bentoTheme5 = bentoTheme2;
                            int i9 = i6;
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(serverToBentoAssetMapper2FromServerValue), null, bentoTheme5.getColors(composer2, i9).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme5.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(0), 0.0f, 10, null), null, false, composer2, BentoIcon4.Size16.$stable | 48, 48);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer2, Integer num) {
                        invoke(row5, style, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 817889664, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
