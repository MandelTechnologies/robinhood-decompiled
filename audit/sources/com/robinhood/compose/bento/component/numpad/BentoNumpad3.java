package com.robinhood.compose.bento.component.numpad;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.input.key.Key;
import androidx.compose.p011ui.input.key.Key_androidKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.g11n.Locales2;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.singular.sdk.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0091\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001¢\u0006\u0002\u0010\u0016\u001aK\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0018\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0012\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001a\u001aO\u0010\u001b\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\rH\u0003¢\u0006\u0002\u0010!\u001a(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0#2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002\u001a \u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002¨\u0006+"}, m3636d2 = {"BentoNumpad", "", "modifier", "Landroidx/compose/ui/Modifier;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "buttonText", "", "buttonOnClick", "Lkotlin/Function0;", "isNumpadEnabled", "", "isButtonEnabled", "isButtonVisible", "isButtonLoading", "buttonPositionTop", "showDelimiter", "delimiterLocalized", "backspaceOverride", "Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZZZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;Landroidx/compose/runtime/Composer;III)V", "BentoNumpadAnimatedButton", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZLandroidx/compose/runtime/Composer;II)V", "enabled", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;ZZLandroidx/compose/runtime/Composer;II)V", "BentoNumpadButton", "onCustomKeyPress", "buttonData", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;", "characterMap", "Landroid/view/KeyCharacterMap;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadButtonData;Landroid/view/KeyCharacterMap;ZLandroidx/compose/runtime/Composer;I)V", "buttonCharacters", "", "playButtonClickFeedback", "context", "Landroid/content/Context;", "haptic", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "keyPressAudioType", "", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpad3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpad$lambda$1(Modifier modifier, Function1 function1, String str, Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, CustomKeyConfig customKeyConfig, int i, int i2, int i3, Composer composer, int i4) {
        BentoNumpad(modifier, function1, str, function0, z, z2, z3, z4, z5, z6, z7, customKeyConfig, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpad$lambda$7(Modifier modifier, Function1 function1, boolean z, CustomKeyConfig customKeyConfig, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        BentoNumpad(modifier, function1, z, customKeyConfig, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadAnimatedButton$lambda$2(Modifier modifier, String str, Function0 function0, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        BentoNumpadAnimatedButton(modifier, str, function0, z, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadButton$lambda$15(Function1 function1, Function0 function0, BentoNumpad bentoNumpad, KeyCharacterMap keyCharacterMap, boolean z, int i, Composer composer, int i2) {
        BentoNumpadButton(function1, function0, bentoNumpad, keyCharacterMap, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoNumpad(Modifier modifier, final Function1<? super KeyEvent, Unit> onKeyPress, final String buttonText, final Function0<Unit> buttonOnClick, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, final boolean z6, final boolean z7, final CustomKeyConfig customKeyConfig, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z8;
        int i5;
        boolean z9;
        int i6;
        final boolean z10;
        int i7;
        boolean z11;
        int i8;
        int i9;
        int i10;
        boolean z12;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i11;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        boolean z17;
        final boolean z18;
        Composer composer2;
        final Modifier modifier3;
        final boolean z19;
        final boolean z20;
        final boolean z21;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonOnClick, "buttonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(721341578);
        int i13 = i3 & 1;
        if (i13 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(buttonText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(buttonOnClick) ? 2048 : 1024;
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                z8 = z;
                i4 |= composerStartRestartGroup.changed(z8) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                z9 = z2;
            } else {
                z9 = z2;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z9) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z10 = z3;
            } else {
                z10 = z3;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z10) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                z11 = z4;
            } else {
                z11 = z4;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z11) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else {
                if ((i & 100663296) == 0) {
                    i9 = i8;
                    i4 |= composerStartRestartGroup.changed(z5) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changed(z6) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1024) == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (composerStartRestartGroup.changed(z7) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i3 & 2048) != 0) {
                        if ((i2 & 48) == 0) {
                            i10 |= composerStartRestartGroup.changed(customKeyConfig) ? 32 : 16;
                        }
                        int i15 = i10;
                        if ((i4 & 306783379) != 306783378 || (i15 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i14 != 0) {
                                z8 = true;
                            }
                            if (i5 != 0) {
                                z9 = true;
                            }
                            if (i6 != 0) {
                                z10 = true;
                            }
                            if (i7 != 0) {
                                z11 = false;
                            }
                            z12 = i9 == 0 ? true : z5;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(721341578, i4, i15, "com.robinhood.compose.bento.component.numpad.BentoNumpad (BentoNumpad.kt:76)");
                            }
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Modifier modifier5 = modifier4;
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
                            composerStartRestartGroup.startReplaceGroup(18780092);
                            if (z12) {
                                i11 = i15;
                                z13 = z11;
                                z14 = z10;
                                i12 = i4;
                            } else {
                                int i16 = i4 >> 3;
                                int i17 = i4 >> 6;
                                boolean z22 = z10;
                                boolean z23 = z11;
                                i12 = i4;
                                i11 = i15;
                                BentoNumpadAnimatedButton(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), buttonText, buttonOnClick, z9, z22, z23, composerStartRestartGroup, (i17 & 7168) | (i16 & 896) | (i16 & 112) | 6 | (i17 & 57344) | (i17 & 458752), 0);
                                z14 = z22;
                                z13 = z23;
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            boolean z24 = z9;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            int i18 = i11;
                            int i19 = ((i12 << 3) & 458752) | ((i18 << 12) & 57344) | (i12 & 112) | 6 | ((i12 >> 21) & 896) | ((i18 << 6) & 7168);
                            boolean z25 = z14;
                            z15 = z12;
                            boolean z26 = z8;
                            BentoNumpad(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), onKeyPress, z6, customKeyConfig, z7, z26, composerStartRestartGroup, i19, 0);
                            composerStartRestartGroup.startReplaceGroup(18802205);
                            if (z15) {
                                int i20 = i12 >> 3;
                                int i21 = i12 >> 6;
                                z16 = z24;
                                z17 = z25;
                                BentoNumpadAnimatedButton(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), buttonText, buttonOnClick, z16, z17, z13, composerStartRestartGroup, (i20 & 896) | (i20 & 112) | 6 | (i21 & 7168) | (i21 & 57344) | (i21 & 458752), 0);
                            } else {
                                z16 = z24;
                                z17 = z25;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z18 = z15;
                            z10 = z17;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier5;
                            z19 = z13;
                            z20 = z26;
                            z21 = z16;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z18 = z5;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            z19 = z11;
                            z21 = z9;
                            z20 = z8;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoNumpad3.BentoNumpad$lambda$1(modifier3, onKeyPress, buttonText, buttonOnClick, z20, z21, z10, z19, z18, z6, z7, customKeyConfig, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i10 |= 48;
                    int i152 = i10;
                    if ((i4 & 306783379) != 306783378) {
                        if (i13 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Modifier modifier52 = modifier4;
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
                            composerStartRestartGroup.startReplaceGroup(18780092);
                            if (z12) {
                            }
                            boolean z242 = z9;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            int i182 = i11;
                            int i192 = ((i12 << 3) & 458752) | ((i182 << 12) & 57344) | (i12 & 112) | 6 | ((i12 >> 21) & 896) | ((i182 << 6) & 7168);
                            boolean z252 = z14;
                            z15 = z12;
                            boolean z262 = z8;
                            BentoNumpad(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), onKeyPress, z6, customKeyConfig, z7, z262, composerStartRestartGroup, i192, 0);
                            composerStartRestartGroup.startReplaceGroup(18802205);
                            if (z15) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z18 = z15;
                            z10 = z17;
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier52;
                            z19 = z13;
                            z20 = z262;
                            z21 = z16;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i1522 = i10;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i9 = i8;
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i15222 = i10;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z8 = z;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i152222 = i10;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void BentoNumpadAnimatedButton(Modifier modifier, final String str, final Function0<Unit> function0, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final String str2;
        final Function0<Unit> function02;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        final Modifier modifier3;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-882701928);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        z6 = z3;
                        i3 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i7 != 0) {
                            z4 = true;
                        }
                        boolean z8 = i4 == 0 ? true : z5;
                        final boolean z9 = i5 == 0 ? false : z6;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-882701928, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadAnimatedButton (BentoNumpad.kt:117)");
                        }
                        final Modifier modifier4 = modifier3;
                        final boolean z10 = z4;
                        z7 = z9;
                        z5 = z8;
                        AnimatedVisibilityKt.AnimatedVisibility(z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-2072697232, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt.BentoNumpadAnimatedButton.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i8) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2072697232, i8, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadAnimatedButton.<anonymous> (BentoNumpad.kt:123)");
                                }
                                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, PaddingKt.padding(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ((Styles) composer2.consume(Styles2.getLocalStyles())).getNumpad(composer2, 0).getSpacing().getCtaButtonPadding()), null, type2, z10, z9, null, null, null, null, false, null, composer2, 24576, 0, 8072);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 200064, 18);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z7 = z6;
                    }
                    final boolean z11 = z4;
                    final boolean z12 = z5;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoNumpad3.BentoNumpadAnimatedButton$lambda$2(modifier3, str, function0, z11, z12, z7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z6 = z3;
                if ((74899 & i3) == 74898) {
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Modifier modifier42 = modifier3;
                    final boolean z102 = z4;
                    z7 = z9;
                    z5 = z8;
                    AnimatedVisibilityKt.AnimatedVisibility(z5, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambda3.rememberComposableLambda(-2072697232, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt.BentoNumpadAnimatedButton.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i8) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2072697232, i8, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadAnimatedButton.<anonymous> (BentoNumpad.kt:123)");
                            }
                            BentoButtons.Type type2 = BentoButtons.Type.Primary;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function02, str2, PaddingKt.padding(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), ((Styles) composer2.consume(Styles2.getLocalStyles())).getNumpad(composer2, 0).getSpacing().getCtaButtonPadding()), null, type2, z102, z9, null, null, null, null, false, null, composer2, 24576, 0, 8072);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 12) & 14) | 200064, 18);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
                final boolean z112 = z4;
                final boolean z122 = z5;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z2;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z6 = z3;
            if ((74899 & i3) == 74898) {
            }
            final boolean z1122 = z4;
            final boolean z1222 = z5;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z6 = z3;
        if ((74899 & i3) == 74898) {
        }
        final boolean z11222 = z4;
        final boolean z12222 = z5;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoNumpad(Modifier modifier, final Function1<? super KeyEvent, Unit> onKeyPress, final boolean z, final CustomKeyConfig customKeyConfig, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        Object objRememberedValue;
        Composer.Companion companion;
        final KeyCharacterMap keyCharacterMap;
        final List<BentoNumpad> listButtonCharacters;
        GridCells.Fixed fixed;
        boolean zChangedInstance;
        Object objRememberedValue2;
        GridCells.Fixed fixed2;
        final boolean z6;
        Composer composer2;
        final Modifier modifier3;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(544658271);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(customKeyConfig) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z5 = z3;
                    i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                }
                if ((i3 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z9 = i6 == 0 ? false : z4;
                    if (i4 != 0) {
                        z5 = true;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(544658271, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpad (BentoNumpad.kt:144)");
                    }
                    boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = zBooleanValue ? null : KeyCharacterMap.load(-1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    keyCharacterMap = (KeyCharacterMap) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    listButtonCharacters = buttonCharacters(z, z9, customKeyConfig);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    fixed = new GridCells.Fixed(3);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(listButtonCharacters) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(keyCharacterMap) | ((458752 & i3) != 131072);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        fixed2 = fixed;
                        z6 = z5;
                        Function1 function1 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return BentoNumpad3.BentoNumpad$lambda$6$lambda$5(listButtonCharacters, onKeyPress, customKeyConfig, keyCharacterMap, z6, (LazyGridScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function1);
                        objRememberedValue2 = function1;
                    } else {
                        fixed2 = fixed;
                        z6 = z5;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    boolean z10 = z9;
                    LazyGridDslKt.LazyVerticalGrid(fixed2, modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, 100663296, 0, 764);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z6;
                    z8 = z10;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    z8 = z4;
                    z7 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoNumpad3.BentoNumpad$lambda$7(modifier3, onKeyPress, z, customKeyConfig, z8, z7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z5 = z3;
            if ((i3 & 74899) != 74898) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                keyCharacterMap = (KeyCharacterMap) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                listButtonCharacters = buttonCharacters(z, z9, customKeyConfig);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                fixed = new GridCells.Fixed(3);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(listButtonCharacters) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changedInstance(keyCharacterMap) | ((458752 & i3) != 131072);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    fixed2 = fixed;
                    z6 = z5;
                    Function1 function12 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return BentoNumpad3.BentoNumpad$lambda$6$lambda$5(listButtonCharacters, onKeyPress, customKeyConfig, keyCharacterMap, z6, (LazyGridScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(function12);
                    objRememberedValue2 = function12;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    boolean z102 = z9;
                    LazyGridDslKt.LazyVerticalGrid(fixed2, modifierFillMaxWidth$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, 100663296, 0, 764);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z7 = z6;
                    z8 = z102;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z2;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z5 = z3;
        if ((i3 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoNumpadButton(final Function1<? super KeyEvent, Unit> function1, final Function0<Unit> function0, final BentoNumpad bentoNumpad, final KeyCharacterMap keyCharacterMap, final boolean z, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        boolean z2;
        CharSequence backupText;
        boolean z3;
        Composer composer2;
        Modifier modifierTestTag;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1081565319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(bentoNumpad) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(keyCharacterMap) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1081565319, i2, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadButton (BentoNumpad.kt:179)");
            }
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            final HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i3 = i2 & 896;
            boolean zChangedInstance = ((i2 & 112) == 32) | (i3 == 256) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(hapticFeedback) | ((i2 & 14) == 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function03 = new Function0() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoNumpad3.BentoNumpadButton$lambda$9$lambda$8(bentoNumpad, context, hapticFeedback, function1, function02);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function03);
                objRememberedValue = function03;
            }
            Function0 function04 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue();
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = i3 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (bentoNumpad instanceof BentoNumpad.Button) {
                    BentoNumpad.Button button = (BentoNumpad.Button) bentoNumpad;
                    backupText = (button.getIcon() == null || button.getContentDescription() == null) ? button.buttonString(zBooleanValue, keyCharacterMap) : resources.getText(button.getContentDescription().intValue());
                } else if (bentoNumpad instanceof BentoNumpad.CustomButton) {
                    backupText = ((BentoNumpad.CustomButton) bentoNumpad).getBackupText();
                } else {
                    if (!(bentoNumpad instanceof BentoNumpad.Empty)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    backupText = null;
                }
                if (backupText != null) {
                    objRememberedValue2 = "numpad-" + ((Object) backupText);
                } else {
                    objRememberedValue2 = null;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            String str = (String) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            final NumpadStyle numpad = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNumpad(composerStartRestartGroup, 0);
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoNumpad2.INSTANCE.m20891getNumpadButtonHeightD9Ej5fM()), false, null, 3, null);
            if (str != null && (modifierTestTag = TestTag3.testTag(modifierWithBentoPlaceholder$default, str)) != null) {
                modifierWithBentoPlaceholder$default = modifierTestTag;
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoNumpad3.BentoNumpadButton$lambda$14$lambda$13((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierWithBentoPlaceholder$default, false, (Function1) objRememberedValue3, 1, null);
            Shape rectangleShape = RectangleShape2.getRectangleShape();
            if ((bentoNumpad instanceof BentoNumpad.Button) || (bentoNumpad instanceof BentoNumpad.CustomButton)) {
                z3 = z2;
            } else {
                if (!Intrinsics.areEqual(bentoNumpad, BentoNumpad.Empty.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                z3 = false;
            }
            ButtonKt.Button(function04, modifierSemantics$default, z3, rectangleShape, ButtonDefaults.INSTANCE.m5719buttonColorsro_MJ88(numpad.getColors().m21873getBackgroundColor0d7_KjU(), numpad.getColors().m21874getContentColor0d7_KjU(), numpad.getColors().m21873getBackgroundColor0d7_KjU(), numpad.getColors().m21875getDisabledContentColor0d7_KjU(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambda3.rememberComposableLambda(1187952489, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt.BentoNumpadButton.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer3, Integer num) {
                    invoke(row5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 Button, Composer composer3, int i4) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i4 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1187952489, i4, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadButton.<anonymous> (BentoNumpad.kt:236)");
                    }
                    long value = ((Color) composer3.consume(ContentColor3.getLocalContentColor())).getValue();
                    BentoNumpad bentoNumpad2 = bentoNumpad;
                    if (bentoNumpad2 instanceof BentoNumpad.Button) {
                        composer3.startReplaceGroup(-838953984);
                        if (((BentoNumpad.Button) bentoNumpad).getIcon() == null || ((BentoNumpad.Button) bentoNumpad).getContentDescription() == null) {
                            composer3.startReplaceGroup(-237381482);
                            BentoText2.m20747BentoText38GnDrw(((BentoNumpad.Button) bentoNumpad).buttonString(((Boolean) composer3.consume(InspectionMode.getLocalInspectionMode())).booleanValue(), keyCharacterMap), null, Color.m6701boximpl(value), null, null, null, null, 0, false, 0, 0, null, 0, numpad.getTypography().getTextStyle(), composer3, 0, 0, 8186);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(-237710671);
                            IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(((BentoNumpad.Button) bentoNumpad).getIcon().intValue(), composer3, 0), StringResources_androidKt.stringResource(((BentoNumpad.Button) bentoNumpad).getContentDescription().intValue(), composer3, 0), LocalShowPlaceholder.withBentoCirclePlaceholder$default(Modifier.INSTANCE, false, 1, null), value, composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        composer3.endReplaceGroup();
                    } else if (bentoNumpad2 instanceof BentoNumpad.CustomButton) {
                        composer3.startReplaceGroup(-237072784);
                        BentoText2.m20747BentoText38GnDrw(((BentoNumpad.CustomButton) bentoNumpad).getText(), null, Color.m6701boximpl(value), null, null, null, null, 0, false, 0, 0, null, 0, numpad.getTypography().getCustomKeyTextStyle(), composer3, 0, 0, 8186);
                        composer3.endReplaceGroup();
                    } else {
                        if (!Intrinsics.areEqual(bentoNumpad2, BentoNumpad.Empty.INSTANCE)) {
                            composer3.startReplaceGroup(-838955771);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(-236865673);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805506048, 448);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoNumpad3.BentoNumpadButton$lambda$15(function1, function0, bentoNumpad, keyCharacterMap, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadButton$lambda$9$lambda$8(BentoNumpad bentoNumpad, Context context, HapticFeedback hapticFeedback, Function1 function1, Function0 function0) {
        if (bentoNumpad instanceof BentoNumpad.Button) {
            BentoNumpad.Button button = (BentoNumpad.Button) bentoNumpad;
            playButtonClickFeedback(context, hapticFeedback, button.getKeyPressAudioType());
            function1.invoke(new KeyEvent(0, Key_androidKt.m7123getNativeKeyCodeYVgTNJs(button.m20890getKeyEK5gGoQ())));
        } else if ((bentoNumpad instanceof BentoNumpad.CustomButton) && function0 != null) {
            playButtonClickFeedback(context, hapticFeedback, ((BentoNumpad.CustomButton) bentoNumpad).getKeyPressAudioType());
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadButton$lambda$14$lambda$13(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    private static final List<BentoNumpad> buttonCharacters(boolean z, boolean z2, CustomKeyConfig customKeyConfig) {
        BentoNumpad button;
        BentoNumpad customButton;
        Key.Companion companion = Key.INSTANCE;
        BentoNumpad.Button button2 = new BentoNumpad.Button(companion.m7091getNumPad1EK5gGoQ(), null, null, 0, Constants.SdidMigrationStatusCodes.ALREADY_SDID, 14, null);
        BentoNumpad.Button button3 = new BentoNumpad.Button(companion.m7092getNumPad2EK5gGoQ(), null, null, 0, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, 14, null);
        BentoNumpad.Button button4 = new BentoNumpad.Button(companion.m7093getNumPad3EK5gGoQ(), null, null, 0, Constants.SdidMigrationStatusCodes.DID_NOT_SEND_START_SESSION_WITH_SDID_YET, 14, null);
        BentoNumpad.Button button5 = new BentoNumpad.Button(companion.m7094getNumPad4EK5gGoQ(), null, null, 0, Constants.SdidMigrationStatusCodes.MISSING_PARAMS, 14, null);
        BentoNumpad.Button button6 = new BentoNumpad.Button(companion.m7095getNumPad5EK5gGoQ(), null, null, 0, Constants.SdidMigrationStatusCodes.CAUGHT_EXCEPTION, 14, null);
        BentoNumpad.Button button7 = new BentoNumpad.Button(companion.m7096getNumPad6EK5gGoQ(), null, null, 0, "6", 14, null);
        BentoNumpad.Button button8 = new BentoNumpad.Button(companion.m7097getNumPad7EK5gGoQ(), null, null, 0, "7", 14, null);
        BentoNumpad.Button button9 = new BentoNumpad.Button(companion.m7098getNumPad8EK5gGoQ(), null, null, 0, "8", 14, null);
        BentoNumpad.Button button10 = new BentoNumpad.Button(companion.m7099getNumPad9EK5gGoQ(), null, null, 0, "9", 14, null);
        if (!z) {
            button = BentoNumpad.Empty.INSTANCE;
        } else if (z2) {
            Tuples2<Character, KeyEvent> decimalSeparator = Locales2.getDecimalSeparator(CurrencyFormatterLocale.INSTANCE.getInstance().getNumpadLocale());
            button = new BentoNumpad.Button(Key_androidKt.Key(decimalSeparator.component2().getKeyCode()), null, null, 0, String.valueOf(decimalSeparator.component1().charValue()), 14, null);
        } else {
            button = new BentoNumpad.Button(companion.m7100getNumPadDotEK5gGoQ(), null, null, 0, ".", 14, null);
        }
        BentoNumpad.Button button11 = new BentoNumpad.Button(companion.m7090getNumPad0EK5gGoQ(), null, null, 0, "0", 14, null);
        if (customKeyConfig == null) {
            customButton = new BentoNumpad.Button(companion.m7082getBackspaceEK5gGoQ(), Integer.valueOf(C20690R.drawable.ic_rds_backspace_24dp), Integer.valueOf(C13997R.string.numpad_backspace_content_description), 7, "⌫", null);
        } else {
            customButton = new BentoNumpad.CustomButton(customKeyConfig.getText(), customKeyConfig.getContentDescription(), customKeyConfig.getKeyPressAudioType(), customKeyConfig.getBackupText());
        }
        return CollectionsKt.listOf((Object[]) new BentoNumpad[]{button2, button3, button4, button5, button6, button7, button8, button9, button10, button, button11, customButton});
    }

    private static final void playButtonClickFeedback(Context context, HapticFeedback hapticFeedback, int i) {
        ContextSystemServices.getAudioManager(context).playSoundEffect(i, 1.0f);
        hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpad$lambda$6$lambda$5(final List list, final Function1 function1, final CustomKeyConfig customKeyConfig, final KeyCharacterMap keyCharacterMap, final boolean z, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C32564xc9fa4587 c32564xc9fa4587 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$BentoNumpad$lambda$6$lambda$5$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BentoNumpad bentoNumpad) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BentoNumpad) obj);
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$BentoNumpad$lambda$6$lambda$5$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c32564xc9fa4587.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadKt$BentoNumpad$lambda$6$lambda$5$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
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
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                BentoNumpad bentoNumpad = (BentoNumpad) list.get(i);
                composer.startReplaceGroup(415475615);
                Function1 function12 = function1;
                CustomKeyConfig customKeyConfig2 = customKeyConfig;
                BentoNumpad3.BentoNumpadButton(function12, customKeyConfig2 != null ? customKeyConfig2.getOnCustomKeyPress() : null, bentoNumpad, keyCharacterMap, z, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
