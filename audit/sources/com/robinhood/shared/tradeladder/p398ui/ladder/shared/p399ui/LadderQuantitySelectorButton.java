package com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.animations.LadderAnimations2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderQuantitySelectorButton;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.p399ui.LadderQuantitySelectorButton2;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyle;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.LadderStyleKt;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LadderQuantitySelectorButton.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"LadderQuantitySelectorButton", "", "text", "", "enabled", "", "isQuantitySelectorOpen", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLadderQuantitySelectorButton", "parameters", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderQuantitySelectorButtonPreviewParameterProvider$Parameters;", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/ui/LadderQuantitySelectorButtonPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug", "buttonHeight", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LadderQuantitySelectorButton {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderQuantitySelectorButton$lambda$7(String str, boolean z, boolean z2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LadderQuantitySelectorButton(str, z, z2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLadderQuantitySelectorButton$lambda$8(LadderQuantitySelectorButton2.Parameters parameters, int i, Composer composer, int i2) {
        PreviewLadderQuantitySelectorButton(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LadderQuantitySelectorButton(final String text, final boolean z, final boolean z2, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean z4;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(766199379);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z3 = z2;
        } else {
            z3 = z2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(766199379, i4, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButton (LadderQuantitySelectorButton.kt:39)");
                }
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                float fM21717getMinHeightD9Ej5fM = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(fM21717getMinHeightD9Ej5fM), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier2, 0.0f, fM21717getMinHeightD9Ej5fM, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z4 = ((i4 & 112) != 32) | ((i4 & 7168) != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$4$lambda$3(z, onClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$6$lambda$5((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue3, null, null, null, ComposableLambda3.rememberComposableLambda(-565800938, true, new C410562(function0, modifierM5155defaultMinSizeVpY3zN4$default, density, text, snapshotState), composerStartRestartGroup, 54), composer2, ((i4 >> 6) & 14) | 1573248, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$7(text, z, z2, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float fM21717getMinHeightD9Ej5fM2 = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary().m21717getMinHeightD9Ej5fM();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5155defaultMinSizeVpY3zN4$default2 = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier2, 0.0f, fM21717getMinHeightD9Ej5fM2, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            z4 = ((i4 & 112) != 32) | ((i4 & 7168) != 2048);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$4$lambda$3(z, onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                Function0 function02 = (Function0) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf2 = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue3, null, null, null, ComposableLambda3.rememberComposableLambda(-565800938, true, new C410562(function02, modifierM5155defaultMinSizeVpY3zN4$default2, density2, text, snapshotState2), composerStartRestartGroup, 54), composer2, ((i4 >> 6) & 14) | 1573248, 58);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LadderQuantitySelectorButton$lambda$2(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LadderQuantitySelectorButton$lambda$4$lambda$3(boolean z, Function0 function0) {
        if (z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: LadderQuantitySelectorButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$LadderQuantitySelectorButton$2 */
    static final class C410562 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<C2002Dp> $buttonHeight$delegate;
        final /* synthetic */ Modifier $buttonModifier;
        final /* synthetic */ Density $localDensity;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ String $text;

        C410562(Function0<Unit> function0, Modifier modifier, Density density, String str, SnapshotState<C2002Dp> snapshotState) {
            this.$onClick = function0;
            this.$buttonModifier = modifier;
            this.$localDensity = density;
            this.$text = str;
            this.$buttonHeight$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
            invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-565800938, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButton.<anonymous> (LadderQuantitySelectorButton.kt:57)");
            }
            if (z) {
                composer.startReplaceGroup(1970926665);
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(this.$onClick, new BentoIconButton4.Icon.HeroSize24(ServerToBentoAssetMapper2.CLOSE_24), StringResources_androidKt.stringResource(C40888R.string.quantity_selector_close_btn, composer, 0), this.$buttonModifier, BentoIconButton4.Type.Secondary, false, null, null, Color.m6701boximpl(((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU()), C2002Dp.m7993boximpl(LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$1(this.$buttonHeight$delegate)), false, composer, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 24576, 0, 1248);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1971449325);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                long jM26234getButtonNonLoadingBorderColor0d7_KjU = ((LadderStyle) composer.consume(LadderStyleKt.getLocalLadderStyle())).getMarketOrderForm().m26234getButtonNonLoadingBorderColor0d7_KjU();
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
                Modifier modifier = this.$buttonModifier;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(this.$localDensity);
                final Density density = this.$localDensity;
                final SnapshotState<C2002Dp> snapshotState = this.$buttonHeight$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$LadderQuantitySelectorButton$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LadderQuantitySelectorButton.C410562.invoke$lambda$2$lambda$1(density, snapshotState, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8(this.$onClick, this.$text, OnGloballyPositionedModifier3.onGloballyPositioned(modifier, (Function1) objRememberedValue), null, type2, false, false, null, null, Color.m6701boximpl(jM26234getButtonNonLoadingBorderColor0d7_KjU), textStyleM7655copyp1EtxEg$default, false, null, composer, 24576, 0, 6632);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Density density, SnapshotState snapshotState, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            LadderQuantitySelectorButton.LadderQuantitySelectorButton$lambda$2(snapshotState, density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform LadderQuantitySelectorButton$lambda$6$lambda$5(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(LadderAnimations2.getLadderFadeInAnimation(), LadderAnimations2.getLadderFadeOutAnimation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LadderQuantitySelectorButton$lambda$1(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    public static final void PreviewLadderQuantitySelectorButton(final LadderQuantitySelectorButton2.Parameters parameters, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Composer composerStartRestartGroup = composer.startRestartGroup(1894135019);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(parameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1894135019, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.PreviewLadderQuantitySelectorButton (LadderQuantitySelectorButton.kt:120)");
            }
            PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(1157280108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt.PreviewLadderQuantitySelectorButton.1
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
                        ComposerKt.traceEventStart(1157280108, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.PreviewLadderQuantitySelectorButton.<anonymous> (LadderQuantitySelectorButton.kt:124)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    SurfaceKt.m5967SurfaceT9BRK9s(null, null, bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU(), 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-874235087, true, new AnonymousClass1(parameters), composer2, 54), composer2, 12582912, 115);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: LadderQuantitySelectorButton.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$PreviewLadderQuantitySelectorButton$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ LadderQuantitySelectorButton2.Parameters $parameters;

                    AnonymousClass1(LadderQuantitySelectorButton2.Parameters parameters) {
                        this.$parameters = parameters;
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
                            ComposerKt.traceEventStart(-874235087, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.ui.PreviewLadderQuantitySelectorButton.<anonymous>.<anonymous> (LadderQuantitySelectorButton.kt:128)");
                        }
                        String text = this.$parameters.getText();
                        boolean enabled = this.$parameters.getEnabled();
                        boolean zIsQuantitySelectorOpen = this.$parameters.isQuantitySelectorOpen();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$PreviewLadderQuantitySelectorButton$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LadderQuantitySelectorButton.LadderQuantitySelectorButton(text, enabled, zIsQuantitySelectorOpen, (Function0) objRememberedValue, null, composer, 3072, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.ui.LadderQuantitySelectorButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LadderQuantitySelectorButton.PreviewLadderQuantitySelectorButton$lambda$8(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
