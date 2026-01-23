package com.truelayer.payments.p419ui.screens.wait;

import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.components.ScreenTitle;
import com.truelayer.payments.p419ui.screens.components.LegalText;
import com.truelayer.payments.p419ui.screens.wait.components.ProgressIndicatorWithImage;
import com.truelayer.payments.p419ui.theme.Breakpoints;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.ContentChangeAccessibilityAnnouncement;
import com.truelayer.payments.p419ui.utils.UiText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WaitContainerView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\n\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m3636d2 = {"WaitContainerView", "", "waitingText", "Lcom/truelayer/payments/ui/utils/UiText;", "providerImageUri", "", "providerExtendedImageUri", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "extraText", "(Lcom/truelayer/payments/ui/utils/UiText;Ljava/lang/String;Ljava/lang/String;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lcom/truelayer/payments/ui/utils/UiText;Landroidx/compose/runtime/Composer;II)V", "legalTextBreakpoints", "Lcom/truelayer/payments/ui/theme/Breakpoints;", "modifier", "Landroidx/compose/ui/Modifier;", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class WaitContainerView5 {
    public static final void WaitContainerView(final UiText waitingText, final String providerImageUri, final String str, final Legals legals, UiText uiText, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(waitingText, "waitingText");
        Intrinsics.checkNotNullParameter(providerImageUri, "providerImageUri");
        Intrinsics.checkNotNullParameter(legals, "legals");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1978721275);
        UiText uiText2 = (i2 & 16) != 0 ? null : uiText;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1978721275, i, -1, "com.truelayer.payments.ui.screens.wait.WaitContainerView (WaitContainerView.kt:45)");
        }
        final UiText uiText3 = uiText2;
        ScaffoldKt.m5939ScaffoldTvnljyQ(null, WaitContainerView.INSTANCE.m27155getLambda2$payments_ui_release(), null, null, null, 0, 0L, 0L, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -50308522, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt.WaitContainerView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                invoke(paddingValues, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues padding, Composer composer2, int i3) {
                int i4;
                Intrinsics.checkNotNullParameter(padding, "padding");
                if ((i3 & 14) == 0) {
                    i4 = i3 | (composer2.changed(padding) ? 4 : 2);
                } else {
                    i4 = i3;
                }
                if ((i4 & 91) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-50308522, i4, -1, "com.truelayer.payments.ui.screens.wait.WaitContainerView.<anonymous> (WaitContainerView.kt:51)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), padding);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                String str2 = providerImageUri;
                String str3 = str;
                UiText uiText4 = waitingText;
                UiText uiText5 = uiText3;
                final Legals legals2 = legals;
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Column6 column6 = Column6.INSTANCE;
                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                ScreenTitle.ScreenTitle(StringResources_androidKt.stringResource(C42830R.string.wait_screen_title, composer2, 0), null, composer2, 0, 2);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(center, companion2.getStart(), composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierVerticalScroll$default);
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
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                Spacing spacing = Spacing.INSTANCE;
                Modifier modifierSemantics = SemanticsModifier6.semantics(PaddingKt.m5144paddingVpY3zN4$default(companion, spacing.m27177getREGULARD9Ej5fM(), 0.0f, 2, null), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt$WaitContainerView$1$1$1$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semantics) {
                        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(spacing.m27177getREGULARD9Ej5fM());
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerHorizontally2, composer2, 54);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierSemantics);
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                ProgressIndicatorWithImage.m27157ProgressIndicatorWithImageCxxc4bg(str2, str3, C2002Dp.m7995constructorimpl(48), C2002Dp.m7995constructorimpl(64), C2002Dp.m7995constructorimpl(5), false, composer2, 28032, 32);
                TextKt.m6028Text4IGK_g(uiText4.asString(composer2, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65534);
                composer2.startReplaceableGroup(-22816749);
                String strAsString = uiText5 == null ? null : uiText5.asString(composer2, 0);
                composer2.endReplaceableGroup();
                ContentChangeAccessibilityAnnouncement.ContentChangeAccessibilityAnnouncement(uiText5, strAsString, composer2, 0);
                Crossfade.Crossfade(uiText5, (Modifier) null, AnimationSpecKt.tween$default(1000, 0, null, 6, null), (String) null, WaitContainerView.INSTANCE.m27156getLambda3$payments_ui_release(), composer2, 24960, 10);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                ResponsiveContainer.ResponsiveContainer(null, null, WaitContainerView5.legalTextBreakpoints(companion), ComposableLambda3.composableLambda(composer2, 2064696098, true, new Function3<Modifier, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt$WaitContainerView$1$1$2
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                        invoke(modifier, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Modifier it, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2064696098, i5, -1, "com.truelayer.payments.ui.screens.wait.WaitContainerView.<anonymous>.<anonymous>.<anonymous> (WaitContainerView.kt:100)");
                            }
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Spacing spacing2 = Spacing.INSTANCE;
                            LegalText.LegalText(PaddingKt.m5143paddingVpY3zN4(companion4, spacing2.m27177getREGULARD9Ej5fM(), spacing2.m27179getXLARGED9Ej5fM()), legals2, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt$WaitContainerView$1$1$2.1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(String str4) {
                                    invoke2(str4);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(String url) {
                                    Intrinsics.checkNotNullParameter(url, "url");
                                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.LegalsOpened(url, null, 2, null));
                                }
                            }, composer3, 454, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), composer2, 3072, 3);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 805306416, 509);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.wait.WaitContainerViewKt.WaitContainerView.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    WaitContainerView5.WaitContainerView(waitingText, providerImageUri, str, legals, uiText3, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Breakpoints legalTextBreakpoints(Modifier modifier) {
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
        float f = EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE;
        return new Breakpoints(modifierFillMaxWidth$default, SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null), SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier, C2002Dp.m7995constructorimpl(f), 0.0f, 2, null));
    }
}
