package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.component.text.AutoSizeText;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: UkRowItem.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001a?\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"UkRowItem", "", AnnotatedPrivateKey.LABEL, "Landroidx/compose/ui/text/AnnotatedString;", "value", "modifier", "Landroidx/compose/ui/Modifier;", "onLabelClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ClickableUkRowItem", "", "enabled", "", "onClick", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-uk-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkRowItem {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableUkRowItem$lambda$3(String str, String str2, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        ClickableUkRowItem(str, str2, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkRowItem$lambda$2(AnnotatedString annotatedString, AnnotatedString annotatedString2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        UkRowItem(annotatedString, annotatedString2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UkRowItem(final AnnotatedString label, final AnnotatedString value, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        Composer composer2;
        final Function0<Unit> function03;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1254565699);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    Function0<Unit> function04 = i4 == 0 ? null : function02;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1254565699, i3, -1, "com.robinhood.android.ui.transfers.ekiben.uk.UkRowItem (UkRowItem.kt:27)");
                    }
                    BentoIcon4.Size16 size16 = function04 == null ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16) : null;
                    composerStartRestartGroup.startReplaceGroup(1248186426);
                    Color colorM6701boximpl = function04 != null ? Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU()) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, label, null, size16, colorM6701boximpl, value, null, null, null, null, false, false, 4036, null);
                    int i6 = i3 >> 3;
                    int i7 = BentoDataRowState.$stable | (i6 & 112) | (i6 & 896);
                    Modifier modifier5 = modifier4;
                    Function0<Unit> function05 = function04;
                    BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, modifier5, function05, null, null, composer2, i7, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function05;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UkRowItem.UkRowItem$lambda$2(label, value, modifier3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) == 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (function04 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(1248186426);
                if (function04 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, label, null, size16, colorM6701boximpl, value, null, null, null, null, false, false, 4036, null);
                int i62 = i3 >> 3;
                int i72 = BentoDataRowState.$stable | (i62 & 112) | (i62 & 896);
                Modifier modifier52 = modifier4;
                Function0<Unit> function052 = function04;
                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, modifier52, function052, null, null, composer2, i72, 24);
                if (ComposerKt.isTraceInProgress()) {
                }
                function03 = function052;
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ClickableUkRowItem(final String label, final String value, Modifier modifier, boolean z, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-23429735);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-23429735, i3, -1, "com.robinhood.android.ui.transfers.ekiben.uk.ClickableUkRowItem (UkRowItem.kt:46)");
                    }
                    final boolean z4 = z2;
                    modifier3 = modifier4;
                    BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(modifier3, z4, null, null, onClick, 6, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), null, null, ComposableLambda3.rememberComposableLambda(-388303018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt.ClickableUkRowItem.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            long jM21427getFg30d7_KjU;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-388303018, i6, -1, "com.robinhood.android.ui.transfers.ekiben.uk.ClickableUkRowItem.<anonymous> (UkRowItem.kt:52)");
                            }
                            String str = label;
                            if (z4) {
                                composer2.startReplaceGroup(502957593);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU();
                            } else {
                                composer2.startReplaceGroup(502958457);
                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 3, 0, null, 0, null, composer2, 805306368, 0, 15866);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1015566168, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt.ClickableUkRowItem.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            long jM21427getFg30d7_KjU;
                            long jM21427getFg30d7_KjU2;
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1015566168, i6, -1, "com.robinhood.android.ui.transfers.ekiben.uk.ClickableUkRowItem.<anonymous> (UkRowItem.kt:59)");
                            }
                            Arrangement arrangement = Arrangement.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM());
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            String str = value;
                            boolean z5 = z4;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            if (z5) {
                                composer2.startReplaceGroup(-388928034);
                                jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(-388927201);
                                jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, str, Color.m6701boximpl(jM21427getFg30d7_KjU), (FontStyle) null, (FontWeight) null, (TextDecoration) null, (TextAlign) null, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, 0.0f, 0.0f, composer2, 0, 0, 4089);
                            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16);
                            if (z5) {
                                composer2.startReplaceGroup(-388920674);
                                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            } else {
                                composer2.startReplaceGroup(-388919841);
                                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                            }
                            composer2.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU2, null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, false, true, false, null, composerStartRestartGroup, 113445888, 0, 1622);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UkRowItem.ClickableUkRowItem$lambda$3(label, value, modifier3, z3, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final boolean z42 = z2;
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5144paddingVpY3zN4$default(ClickableKt.m4893clickableXHw0xAI$default(modifier3, z42, null, null, onClick, 6, null), 0.0f, C2002Dp.m7995constructorimpl(12), 1, null), null, null, ComposableLambda3.rememberComposableLambda(-388303018, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt.ClickableUkRowItem.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        long jM21427getFg30d7_KjU;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-388303018, i6, -1, "com.robinhood.android.ui.transfers.ekiben.uk.ClickableUkRowItem.<anonymous> (UkRowItem.kt:52)");
                        }
                        String str = label;
                        if (z42) {
                            composer2.startReplaceGroup(502957593);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21426getFg20d7_KjU();
                        } else {
                            composer2.startReplaceGroup(502958457);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21427getFg30d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 3, 0, null, 0, null, composer2, 805306368, 0, 15866);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(1015566168, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.UkRowItemKt.ClickableUkRowItem.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        long jM21427getFg30d7_KjU;
                        long jM21427getFg30d7_KjU2;
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1015566168, i6, -1, "com.robinhood.android.ui.transfers.ekiben.uk.ClickableUkRowItem.<anonymous> (UkRowItem.kt:59)");
                        }
                        Arrangement arrangement = Arrangement.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM());
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        String str = value;
                        boolean z5 = z42;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        if (z5) {
                            composer2.startReplaceGroup(-388928034);
                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-388927201);
                            jM21427getFg30d7_KjU = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        AutoSizeText.m21098AutoSizeTextG_RxxvU((Modifier) null, str, Color.m6701boximpl(jM21427getFg30d7_KjU), (FontStyle) null, (FontWeight) null, (TextDecoration) null, (TextAlign) null, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, 0.0f, 0.0f, composer2, 0, 0, 4089);
                        BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16);
                        if (z5) {
                            composer2.startReplaceGroup(-388920674);
                            jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        } else {
                            composer2.startReplaceGroup(-388919841);
                            jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer2, i7).m21427getFg30d7_KjU();
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(size16, null, jM21427getFg30d7_KjU2, null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, true, false, null, composerStartRestartGroup, 113445888, 0, 1622);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
