package com.robinhood.android.wires.p278ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.wires.C31498R;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.wires.ApiWireDetailsContent;
import com.robinhood.models.api.bonfire.transfer.wires.WireInvalidAccountButton;
import com.robinhood.models.api.bonfire.transfer.wires.WireInvalidAccountButtonAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WiresInvalidAccountContentComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"WiresInvalidAccountContentComposable", "", "content", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onButtonClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/transfer/wires/WireInvalidAccountButtonAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/api/bonfire/transfer/wires/ApiWireDetailsContent$InvalidAccountContent;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PrimaryButtonTag", "", "SecondaryButtonTag", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class WiresInvalidAccountContentComposable {
    public static final String PrimaryButtonTag = "primaryButton";
    public static final String SecondaryButtonTag = "secondaryButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WiresInvalidAccountContentComposable$lambda$0(ApiWireDetailsContent.InvalidAccountContent invalidAccountContent, Screen screen, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WiresInvalidAccountContentComposable(invalidAccountContent, screen, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void WiresInvalidAccountContentComposable(final ApiWireDetailsContent.InvalidAccountContent content, final Screen screen, final Function1<? super WireInvalidAccountButtonAction, Unit> onButtonClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-44755233);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44755233, i3, -1, "com.robinhood.android.wires.ui.WiresInvalidAccountContentComposable (WiresInvalidAccountContentComposable.kt:33)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1393491670, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt.WiresInvalidAccountContentComposable.1
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
                        ComposerKt.traceEventStart(-1393491670, i5, -1, "com.robinhood.android.wires.ui.WiresInvalidAccountContentComposable.<anonymous> (WiresInvalidAccountContentComposable.kt:35)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(modifier, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-523723032, true, new AnonymousClass1(content, screen, onButtonClick), composer2, 54), composer2, 0, 12582912, 98302);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: WiresInvalidAccountContentComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt$WiresInvalidAccountContentComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ ApiWireDetailsContent.InvalidAccountContent $content;
                    final /* synthetic */ Function1<WireInvalidAccountButtonAction, Unit> $onButtonClick;
                    final /* synthetic */ Screen $screen;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ApiWireDetailsContent.InvalidAccountContent invalidAccountContent, Screen screen, Function1<? super WireInvalidAccountButtonAction, Unit> function1) {
                        this.$content = invalidAccountContent;
                        this.$screen = screen;
                        this.$onButtonClick = function1;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$2$lambda$1$lambda$0(Function1 function1, WireInvalidAccountButton wireInvalidAccountButton) {
                        function1.invoke(wireInvalidAccountButton.getAction());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues padding, Composer composer, int i) {
                        int i2;
                        int i3;
                        BentoTheme bentoTheme;
                        Function1<WireInvalidAccountButtonAction, Unit> function1;
                        Intrinsics.checkNotNullParameter(padding, "padding");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(padding) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-523723032, i2, -1, "com.robinhood.android.wires.ui.WiresInvalidAccountContentComposable.<anonymous>.<anonymous> (WiresInvalidAccountContentComposable.kt:39)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, padding);
                        ApiWireDetailsContent.InvalidAccountContent invalidAccountContent = this.$content;
                        Screen screen = this.$screen;
                        final Function1<WireInvalidAccountButtonAction, Unit> function12 = this.$onButtonClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
                        ContentScale inside = ContentScale.INSTANCE.getInside();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        ImageKt.Image(PainterResources_androidKt.painterResource(C31498R.drawable.svg_wires_invalid_account, composer, 0), (String) null, SizeKt.wrapContentWidth$default(Column5.weight$default(column6, PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), 1, null), 1.0f, false, 2, null), null, false, 3, null), (Alignment) null, inside, 0.0f, (ColorFilter) null, composer, 24624, 104);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 7, null);
                        TextStyle displayCapsuleMedium = bentoTheme2.getTypography(composer, i4).getDisplayCapsuleMedium();
                        String title = invalidAccountContent.getTitle();
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
                        BentoText2.m20747BentoText38GnDrw(invalidAccountContent.getMessage(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i4).getTextM(), composer, 48, 0, 8124);
                        Composer composer2 = composer;
                        final WireInvalidAccountButton primary_button = invalidAccountContent.getPrimary_button();
                        composer2.startReplaceGroup(509026566);
                        if (primary_button == null) {
                            function1 = function12;
                            bentoTheme = bentoTheme2;
                            i3 = i4;
                        } else {
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BUTTON, primary_button.getAction().getServerValue(), null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), 0.0f, bentoTheme2.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), WiresInvalidAccountContentComposable.PrimaryButtonTag);
                            String text = primary_button.getText();
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChanged = composer2.changed(function12) | composer2.changedInstance(primary_button);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt$WiresInvalidAccountContentComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresInvalidAccountContentComposable.C315171.AnonymousClass1.invoke$lambda$6$lambda$2$lambda$1$lambda$0(function12, primary_button);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            i3 = i4;
                            bentoTheme = bentoTheme2;
                            function1 = function12;
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierTestTag, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                            composer2 = composer;
                        }
                        composer2.endReplaceGroup();
                        final WireInvalidAccountButton secondary_button = invalidAccountContent.getSecondary_button();
                        composer2.startReplaceGroup(509059976);
                        if (secondary_button != null) {
                            Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, screen, null, null, new Component(Component.ComponentType.BUTTON, secondary_button.getAction().getServerValue(), null, 4, null), null, 45, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), WiresInvalidAccountContentComposable.SecondaryButtonTag);
                            String text2 = secondary_button.getText();
                            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                            composer2.startReplaceGroup(-1633490746);
                            final Function1<WireInvalidAccountButtonAction, Unit> function13 = function1;
                            boolean zChanged2 = composer2.changed(function13) | composer2.changedInstance(secondary_button);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt$WiresInvalidAccountContentComposable$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return WiresInvalidAccountContentComposable.C315171.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4$lambda$3(function13, secondary_button);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text2, modifierTestTag2, null, type3, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                        }
                        composer.endReplaceGroup();
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3(Function1 function1, WireInvalidAccountButton wireInvalidAccountButton) {
                        function1.invoke(wireInvalidAccountButton.getAction());
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.WiresInvalidAccountContentComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WiresInvalidAccountContentComposable.WiresInvalidAccountContentComposable$lambda$0(content, screen, onButtonClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
