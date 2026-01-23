package com.robinhood.android.gold.sparkle.bento;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ToggleableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoSparkleButton.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"BentoSparkleButton", "", "onClick", "Lkotlin/Function0;", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "icon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "enabled", "", "loading", "showRippleEffectOnClick", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZZZLandroidx/compose/runtime/Composer;II)V", "Sparkle", "(Landroidx/compose/runtime/Composer;I)V", "lib-gold-sparkle-bento_externalDebug", "positionInWindow", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class BentoSparkleButton2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoSparkleButton$lambda$2(Function0 function0, String str, Modifier modifier, BentoButtons.Icon.Size16 size16, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        BentoSparkleButton(function0, str, modifier, size16, z, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Sparkle$lambda$3(int i, Composer composer, int i2) {
        Sparkle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoSparkleButton(final Function0<Unit> onClick, final String text, Modifier modifier, BentoButtons.Icon.Size16 size16, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        Composer composer2;
        Object objRememberedValue;
        Composer.Companion companion;
        ToggleableInteractionSource toggleableInteractionSource;
        boolean z9;
        Object objRememberedValue2;
        final Modifier modifier3;
        final boolean z10;
        final boolean z11;
        final BentoButtons.Icon.Size16 size162;
        final boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1394975804);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(size16) : composerStartRestartGroup.changedInstance(size16) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        BentoButtons.Icon.Size16 size163 = i4 == 0 ? null : size16;
                        boolean z13 = i5 == 0 ? true : z4;
                        if (i6 != 0) {
                            z5 = false;
                        }
                        if (i7 != 0) {
                            z6 = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1394975804, i3, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleButton (BentoSparkleButton.kt:66)");
                        }
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        long jM6725getTransparent0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        z7 = z5;
                        z8 = z6;
                        ButtonColors buttonColorsM5719buttonColorsro_MJ88 = buttonDefaults.m5719buttonColorsro_MJ88(jM6725getTransparent0d7_KjU, bentoTheme.getColors(composerStartRestartGroup, i9).getJet(), bentoTheme.getColors(composerStartRestartGroup, i9).m21373getBg30d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 6, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new ToggleableInteractionSource(z7, z8);
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        toggleableInteractionSource = (ToggleableInteractionSource) objRememberedValue;
                        composer2.endReplaceGroup();
                        Boolean boolValueOf = Boolean.valueOf(z7);
                        Boolean boolValueOf2 = Boolean.valueOf(z8);
                        composer2.startReplaceGroup(-1746271574);
                        z9 = ((3670016 & i3) != 1048576) | ((458752 & i3) == 131072);
                        objRememberedValue2 = composer2.rememberedValue();
                        if (!z9 || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new BentoSparkleButton3(toggleableInteractionSource, z8, z7, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue2, composer2, (i3 >> 15) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        boolean z14 = z13;
                        Modifier modifier4 = modifier2;
                        CompositionLocal3.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())), ComposableLambda3.rememberComposableLambda(421164924, true, new C179132(modifier4, z7, onClick, z14, buttonColorsM5719buttonColorsro_MJ88, toggleableInteractionSource, size163, text), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z10 = z7;
                        z11 = z14;
                        size162 = size163;
                        z12 = z8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        size162 = size16;
                        z11 = z4;
                        z12 = z6;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        z10 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoSparkleButton2.BentoSparkleButton$lambda$2(onClick, text, modifier3, size162, z11, z10, z12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z5 = z2;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                    if (i8 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    long jM6725getTransparent0d7_KjU2 = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i92 = BentoTheme.$stable;
                    z7 = z5;
                    z8 = z6;
                    ButtonColors buttonColorsM5719buttonColorsro_MJ882 = buttonDefaults2.m5719buttonColorsro_MJ88(jM6725getTransparent0d7_KjU2, bentoTheme2.getColors(composerStartRestartGroup, i92).getJet(), bentoTheme2.getColors(composerStartRestartGroup, i92).m21373getBg30d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i92).m21371getBg0d7_KjU(), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 6, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    toggleableInteractionSource = (ToggleableInteractionSource) objRememberedValue;
                    composer2.endReplaceGroup();
                    Boolean boolValueOf3 = Boolean.valueOf(z7);
                    Boolean boolValueOf22 = Boolean.valueOf(z8);
                    composer2.startReplaceGroup(-1746271574);
                    z9 = ((3670016 & i3) != 1048576) | ((458752 & i3) == 131072);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!z9) {
                        objRememberedValue2 = new BentoSparkleButton3(toggleableInteractionSource, z8, z7, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) objRememberedValue2, composer2, (i3 >> 15) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        boolean z142 = z13;
                        Modifier modifier42 = modifier2;
                        CompositionLocal3.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())), ComposableLambda3.rememberComposableLambda(421164924, true, new C179132(modifier42, z7, onClick, z142, buttonColorsM5719buttonColorsro_MJ882, toggleableInteractionSource, size163, text), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        z10 = z7;
                        z11 = z142;
                        size162 = size163;
                        z12 = z8;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z5 = z2;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z5 = z2;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: BentoSparkleButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$BentoSparkleButton$2 */
    static final class C179132 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ButtonColors $buttonColors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ BentoButtons.Icon.Size16 $icon;
        final /* synthetic */ ToggleableInteractionSource $interactionSource;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ String $text;

        C179132(Modifier modifier, boolean z, Function0<Unit> function0, boolean z2, ButtonColors buttonColors, ToggleableInteractionSource toggleableInteractionSource, BentoButtons.Icon.Size16 size16, String str) {
            this.$modifier = modifier;
            this.$loading = z;
            this.$onClick = function0;
            this.$enabled = z2;
            this.$buttonColors = buttonColors;
            this.$interactionSource = toggleableInteractionSource;
            this.$icon = size16;
            this.$text = str;
        }

        /* compiled from: BentoSparkleButton.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$BentoSparkleButton$2$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
            final /* synthetic */ ButtonColors $buttonColors;
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ BentoButtons.Icon.Size16 $icon;
            final /* synthetic */ boolean $loading;
            final /* synthetic */ String $text;

            AnonymousClass2(boolean z, ButtonColors buttonColors, boolean z2, BentoButtons.Icon.Size16 size16, String str) {
                this.$enabled = z;
                this.$buttonColors = buttonColors;
                this.$loading = z2;
                this.$icon = size16;
                this.$text = str;
            }

            public final void invoke(Row5 Button, Composer composer, int i) {
                Modifier modifierBackground$default;
                long j;
                Composer composer2 = composer;
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2084866676, i, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleButton.<anonymous>.<anonymous> (BentoSparkleButton.kt:101)");
                }
                long contentColor = this.$enabled ? this.$buttonColors.getContentColor() : this.$buttonColors.getDisabledContentColor();
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment center = companion2.getCenter();
                composer2.startReplaceGroup(-2102103911);
                if (this.$enabled) {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$BentoSparkleButton$2$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoSparkleButton2.C179132.AnonymousClass2.invoke$lambda$4$lambda$3(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    modifierBackground$default = Background3.background$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(OnGloballyPositionedModifier3.onGloballyPositioned(companion3, (Function1) objRememberedValue2), 0.0f, BentoSparkleButton.INSTANCE.m15085getMinHeightD9Ej5fM(), 1, null), GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, invoke$lambda$1(snapshotState), null, composer2, 6, 2), null, 0.0f, 6, null);
                } else {
                    modifierBackground$default = Modifier.INSTANCE;
                }
                composer2.endReplaceGroup();
                BentoSparkleButton bentoSparkleButton = BentoSparkleButton.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.padding(modifierBackground$default, bentoSparkleButton.getContentPadding()), 0.0f, 1, null);
                boolean z = this.$loading;
                BentoButtons.Icon.Size16 size16 = this.$icon;
                String str = this.$text;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierWidth = Intrinsic3.width(companion5, Intrinsic4.Max);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion2.getCenterVertically(), composer2, 54);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWidth);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                if (z) {
                    composer2.startReplaceGroup(908158402);
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, contentColor, composer2, 48, 1);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(908433899);
                    composer2.startReplaceGroup(-247789213);
                    if (size16 == null || size16.getPosition() != BentoButtons.Icon.Position.Leading) {
                        j = contentColor;
                    } else {
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(size16.getAsset()), null, contentColor, null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
                        j = contentColor;
                        composer2 = composer;
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, bentoSparkleButton.m15084getIconSpacingD9Ej5fM()), composer2, 6);
                    }
                    composer2.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(j), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoSparkleButton.getTextStyle(composer2, 6), composer, 817889280, 0, 7546);
                    if (size16 != null && size16.getPosition() == BentoButtons.Icon.Position.Trailing) {
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion5, bentoSparkleButton.m15084getIconSpacingD9Ej5fM()), composer, 6);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(size16.getAsset()), null, j, null, null, false, composer, BentoIcon4.Size16.$stable | 48, 56);
                    }
                    composer.endReplaceGroup();
                }
                composer.endNode();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            private static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
                return snapshotState.getValue().getPackedValue();
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                invoke(row5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            private static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
                snapshotState.setValue(Offset.m6534boximpl(j));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(SnapshotState snapshotState, LayoutCoordinates layoutCoordinates) {
                Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
                invoke$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoordinates));
                return Unit.INSTANCE;
            }
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
                ComposerKt.traceEventStart(421164924, i, -1, "com.robinhood.android.gold.sparkle.bento.BentoSparkleButton.<anonymous> (BentoSparkleButton.kt:84)");
            }
            Modifier modifier = this.$modifier;
            BentoSparkleButton bentoSparkleButton = BentoSparkleButton.INSTANCE;
            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(Intrinsic3.width(SizeKt.m5155defaultMinSizeVpY3zN4$default(modifier, 0.0f, bentoSparkleButton.m15085getMinHeightD9Ej5fM(), 1, null), Intrinsic4.Min), false, 1, null);
            RoundedCornerShape shape = bentoSparkleButton.getShape();
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$loading) | composer.changed(this.$onClick);
            final boolean z = this.$loading;
            final Function0<Unit> function0 = this.$onClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$BentoSparkleButton$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoSparkleButton2.C179132.invoke$lambda$1$lambda$0(z, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            boolean z2 = this.$enabled;
            ButtonColors buttonColors = this.$buttonColors;
            ButtonKt.Button((Function0) objRememberedValue, modifierWithBentoPillPlaceholder$default, z2, shape, buttonColors, null, null, paddingValuesM5137PaddingValuesYgX7TsA$default, this.$interactionSource, ComposableLambda3.rememberComposableLambda(-2084866676, true, new AnonymousClass2(z2, buttonColors, this.$loading, this.$icon, this.$text), composer, 54), composer, 918752256, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z, Function0 function0) {
            if (!z) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static final void Sparkle(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1019052636);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1019052636, i, -1, "com.robinhood.android.gold.sparkle.bento.Sparkle (BentoSparkleButton.kt:209)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoSparkleButton4.INSTANCE.m15088getLambda$403427820$lib_gold_sparkle_bento_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.sparkle.bento.BentoSparkleButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoSparkleButton2.Sparkle$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
