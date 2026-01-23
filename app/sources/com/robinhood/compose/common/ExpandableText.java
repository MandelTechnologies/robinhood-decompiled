package com.robinhood.compose.common;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExpandableText.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2#\b\u0002\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"ExpandableText", "", "text", "", "previewLines", "", "expandButtonText", "collapseButtonText", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "textColor", "Landroidx/compose/ui/graphics/Color;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "textButtonSpacing", "Landroidx/compose/ui/unit/Dp;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "ExpandableText-vaZb8Ik", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;JLandroidx/compose/ui/text/TextStyle;FILandroidx/compose/runtime/Composer;II)V", "lib-compose-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.ExpandableTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ExpandableText {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableText_vaZb8Ik$lambda$5(String str, int i, String str2, String str3, boolean z, Function1 function1, long j, TextStyle textStyle, float f, int i2, int i3, int i4, Composer composer, int i5) {
        m21647ExpandableTextvaZb8Ik(str, i, str2, str3, z, function1, j, textStyle, f, i2, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableText_vaZb8Ik$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /* renamed from: ExpandableText-vaZb8Ik, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m21647ExpandableTextvaZb8Ik(final String text, final int i, final String expandButtonText, final String collapseButtonText, boolean z, Function1<? super Boolean, Unit> function1, final long j, final TextStyle textStyle, final float f, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7;
        final Function1<? super Boolean, Unit> function12;
        int i8;
        long j2;
        int i9;
        int i10;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function1<? super Boolean, Unit> function13;
        int i11;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        final boolean z5;
        final boolean z6;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(expandButtonText, "expandButtonText");
        Intrinsics.checkNotNullParameter(collapseButtonText, "collapseButtonText");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1519661395);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(expandButtonText) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(collapseButtonText) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    z2 = z;
                    i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i3 & 196608) == 0) {
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                }
                if ((i4 & 64) == 0) {
                    if ((i3 & 1572864) == 0) {
                        i8 = i6;
                        j2 = j;
                        i5 |= composerStartRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    if ((i4 & 128) == 0) {
                        i5 |= 12582912;
                    } else if ((i3 & 12582912) == 0) {
                        i5 |= composerStartRestartGroup.changed(textStyle) ? 8388608 : 4194304;
                    }
                    if ((i4 & 256) == 0) {
                        i5 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changed(f) ? 67108864 : 33554432;
                    }
                    i9 = i4 & 512;
                    if (i9 == 0) {
                        i5 |= 805306368;
                        i10 = i2;
                    } else {
                        i10 = i2;
                        if ((i3 & 805306368) == 0) {
                            i5 |= composerStartRestartGroup.changed(i10) ? 536870912 : 268435456;
                        }
                    }
                    if ((i5 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.common.ExpandableTextKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ExpandableText.ExpandableText_vaZb8Ik$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function12 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        int iM7959getEllipsisgIe3tQ8 = i9 == 0 ? TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8() : i10;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1519661395, i5, -1, "com.robinhood.compose.common.ExpandableText (ExpandableText.kt:41)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(f);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(companion, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, 2, null);
                        int i13 = i5 >> 12;
                        int i14 = (i5 & 14) | (i13 & 896);
                        function13 = function12;
                        i11 = i5;
                        int i15 = iM7959getEllipsisgIe3tQ8;
                        boolean z7 = false;
                        z3 = z2;
                        BentoText2.m20747BentoText38GnDrw(text, modifierAnimateContentSize$default, Color.m6701boximpl(j2), null, null, null, null, i15, false, !z2 ? Integer.MAX_VALUE : i, 0, null, 0, textStyle, composerStartRestartGroup, ((i5 >> 6) & 29360128) | i14, i13 & 7168, 7544);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean z8 = (i11 & 458752) != 131072;
                        if ((i11 & 57344) == 16384) {
                            z7 = true;
                        }
                        z4 = z8 | z7;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z5 = z3;
                            function12 = function13;
                            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.ExpandableTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ExpandableText.ExpandableText_vaZb8Ik$lambda$4$lambda$3$lambda$2(function12, z5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            z5 = z3;
                            function12 = function13;
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig(function0, !z5 ? collapseButtonText : expandButtonText, null, null, null, false, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z6 = z5;
                        i12 = i15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        i12 = i10;
                        z6 = z2;
                    }
                    final Function1<? super Boolean, Unit> function14 = function12;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.ExpandableTextKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ExpandableText.ExpandableText_vaZb8Ik$lambda$5(text, i, expandButtonText, collapseButtonText, z6, function14, j, textStyle, f, i12, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 |= 1572864;
                i8 = i6;
                j2 = j;
                if ((i4 & 128) == 0) {
                }
                if ((i4 & 256) == 0) {
                }
                i9 = i4 & 512;
                if (i9 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                    if (i8 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(f);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier modifierAnimateContentSize$default2 = AnimationModifier.animateContentSize$default(companion3, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, 2, null);
                        int i132 = i5 >> 12;
                        int i142 = (i5 & 14) | (i132 & 896);
                        function13 = function12;
                        i11 = i5;
                        int i152 = iM7959getEllipsisgIe3tQ8;
                        boolean z72 = false;
                        z3 = z2;
                        BentoText2.m20747BentoText38GnDrw(text, modifierAnimateContentSize$default2, Color.m6701boximpl(j2), null, null, null, null, i152, false, !z2 ? Integer.MAX_VALUE : i, 0, null, 0, textStyle, composerStartRestartGroup, ((i5 >> 6) & 29360128) | i142, i132 & 7168, 7544);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((i11 & 458752) != 131072) {
                        }
                        if ((i11 & 57344) == 16384) {
                        }
                        z4 = z8 | z72;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            z5 = z3;
                            function12 = function13;
                            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.ExpandableTextKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ExpandableText.ExpandableText_vaZb8Ik$lambda$4$lambda$3$lambda$2(function12, z5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function0 function02 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function02, !z5 ? collapseButtonText : expandButtonText, null, null, null, false, null, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z6 = z5;
                            i12 = i152;
                        }
                    }
                }
                final Function1 function142 = function12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i8 = i6;
            j2 = j;
            if ((i4 & 128) == 0) {
            }
            if ((i4 & 256) == 0) {
            }
            i9 = i4 & 512;
            if (i9 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            final Function1 function1422 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i4 & 4) == 0) {
        }
        if ((i4 & 8) == 0) {
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i8 = i6;
        j2 = j;
        if ((i4 & 128) == 0) {
        }
        if ((i4 & 256) == 0) {
        }
        i9 = i4 & 512;
        if (i9 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        final Function1 function14222 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExpandableText_vaZb8Ik$lambda$4$lambda$3$lambda$2(Function1 function1, boolean z) {
        function1.invoke(Boolean.valueOf(!z));
        return Unit.INSTANCE;
    }
}
