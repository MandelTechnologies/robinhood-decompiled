package com.robinhood.android.referral.pastRewards;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RewardRowComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"RewardRowComposable", "", "primaryText", "", "modifier", "Landroidx/compose/ui/Modifier;", "secondaryText", "metadataPrimaryText", "metadataSecondaryText", "buttonText", "showBottomDivider", "", "onClick", "Lkotlin/Function0;", "onButtonClick", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", RewardRowComposable.RewardRowTestTagRowView, RewardRowComposable.RewardRowTestTagDivider, RewardRowComposable.RewardRowTestTagButton, "feature-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.referral.pastRewards.RewardRowComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RewardRowComposable {
    public static final String RewardRowTestTagButton = "RewardRowTestTagButton";
    public static final String RewardRowTestTagDivider = "RewardRowTestTagDivider";
    public static final String RewardRowTestTagRowView = "RewardRowTestTagRowView";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RewardRowComposable$lambda$5(String str, Modifier modifier, String str2, String str3, String str4, String str5, boolean z, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        RewardRowComposable(str, modifier, str2, str3, str4, str5, z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RewardRowComposable(final String primaryText, Modifier modifier, String str, String str2, String str3, String str4, boolean z, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str5;
        int i5;
        String str6;
        int i6;
        String str7;
        int i7;
        String str8;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        String str9;
        String str10;
        boolean z3;
        Function0<Unit> function03;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BentoBaseRowState.Meta singleLine;
        final String str11;
        Composer composer2;
        Function0<Unit> function04;
        String str12;
        Modifier.Companion companion;
        float f;
        Object obj;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final String str13;
        final String str14;
        final boolean z4;
        final String str15;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(604054945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(primaryText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str5 = str;
                    i3 |= composerStartRestartGroup.changed(str5) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        str6 = str2;
                        i3 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str7 = str3;
                            i3 |= composerStartRestartGroup.changed(str7) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                            str8 = str4;
                        } else {
                            str8 = str4;
                            if ((i & 196608) == 0) {
                                i3 |= composerStartRestartGroup.changed(str8) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i & 1572864) == 0) {
                                i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                            }
                        }
                        i9 = i2 & 128;
                        if (i9 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i10 = i9;
                                i3 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                            }
                            i11 = i2 & 256;
                            if (i11 != 0) {
                                if ((i & 100663296) == 0) {
                                    i12 = i11;
                                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
                                }
                                if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier modifier4 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        str5 = null;
                                    }
                                    str9 = i5 == 0 ? null : str6;
                                    String str16 = i6 == 0 ? null : str7;
                                    str10 = i7 == 0 ? null : str8;
                                    z3 = i8 == 0 ? true : z2;
                                    Function0<Unit> function07 = i10 == 0 ? null : function0;
                                    if (i12 == 0) {
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.pastRewards.RewardRowComposableKt$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        function03 = (Function0) objRememberedValue;
                                    } else {
                                        function03 = function02;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(604054945, i3, -1, "com.robinhood.android.referral.pastRewards.RewardRowComposable (RewardRowComposable.kt:29)");
                                    }
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier.Companion companion4 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor2);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Modifier modifierTestTag = TestTag3.testTag(Row5.weight$default(Row6.INSTANCE, companion4, 1.0f, false, 2, null), RewardRowTestTagRowView);
                                    if (str9 == null && str16 != null) {
                                        singleLine = new BentoBaseRowState.Meta.TwoLine(str9, str16);
                                    } else {
                                        singleLine = str9 == null ? new BentoBaseRowState.Meta.SingleLine(str9) : null;
                                    }
                                    Modifier modifier5 = modifier4;
                                    int i14 = i3;
                                    String str17 = str9;
                                    String str18 = str16;
                                    str11 = str5;
                                    composer2 = composerStartRestartGroup;
                                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, primaryText, str11, null, singleLine, null, false, false, false, 0L, function07, composer2, ((i3 << 6) & 896) | 12582912 | ((i3 << 3) & 7168) | (BentoBaseRowState.Meta.$stable << 15), (i3 >> 18) & 112, 1874);
                                    Function0<Unit> function08 = function07;
                                    composer2.startReplaceGroup(158355607);
                                    if (str10 == null) {
                                        companion = companion4;
                                        f = 0.0f;
                                        obj = null;
                                        Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(TestTag3.testTag(companion, RewardRowTestTagButton), C2002Dp.m7995constructorimpl(0), 0.0f, 2, null);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i15 = BentoTheme.$stable;
                                        function04 = function03;
                                        str12 = str10;
                                        BentoTextButton2.m20715BentoTextButtonPIknLig(function04, str12, PaddingKt.m5146paddingqDBjuR0$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i15).m21592getMediumD9Ej5fM(), 0.0f, 11, null), null, null, false, Color.m6701boximpl(bentoTheme.getColors(composer2, i15).m21425getFg0d7_KjU()), composer2, ((i14 >> 24) & 14) | ((i14 >> 12) & 112), 56);
                                        composer2 = composer2;
                                    } else {
                                        function04 = function03;
                                        str12 = str10;
                                        companion = companion4;
                                        f = 0.0f;
                                        obj = null;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    composer2.startReplaceGroup(1648250473);
                                    if (z3) {
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, f, 1, obj), RewardRowTestTagDivider), f, composer2, 6, 1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function05 = function08;
                                    function06 = function04;
                                    str13 = str12;
                                    str14 = str17;
                                    z4 = z3;
                                    str15 = str18;
                                    modifier3 = modifier5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    function05 = function0;
                                    str13 = str8;
                                    modifier3 = modifier2;
                                    composer2 = composerStartRestartGroup;
                                    str14 = str6;
                                    str15 = str7;
                                    z4 = z2;
                                    str11 = str5;
                                    function06 = function02;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.pastRewards.RewardRowComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj2, Object obj3) {
                                            return RewardRowComposable.RewardRowComposable$lambda$5(primaryText, modifier3, str11, str14, str15, str13, z4, function05, function06, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i12 = i11;
                            if ((i3 & 38347923) != 38347922) {
                                if (i13 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                Arrangement.Vertical top2 = arrangement2.getTop();
                                Alignment.Companion companion22 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (!composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting()) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl2.getInserting()) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                        Modifier modifierTestTag2 = TestTag3.testTag(Row5.weight$default(Row6.INSTANCE, companion42, 1.0f, false, 2, null), RewardRowTestTagRowView);
                                        if (str9 == null) {
                                            if (str9 == null) {
                                            }
                                            Modifier modifier52 = modifier4;
                                            int i142 = i3;
                                            String str172 = str9;
                                            String str182 = str16;
                                            str11 = str5;
                                            composer2 = composerStartRestartGroup;
                                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag2, null, primaryText, str11, null, singleLine, null, false, false, false, 0L, function07, composer2, ((i3 << 6) & 896) | 12582912 | ((i3 << 3) & 7168) | (BentoBaseRowState.Meta.$stable << 15), (i3 >> 18) & 112, 1874);
                                            Function0<Unit> function082 = function07;
                                            composer2.startReplaceGroup(158355607);
                                            if (str10 == null) {
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            composer2.startReplaceGroup(1648250473);
                                            if (z3) {
                                            }
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function05 = function082;
                                            function06 = function04;
                                            str13 = str12;
                                            str14 = str172;
                                            z4 = z3;
                                            str15 = str182;
                                            modifier3 = modifier52;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        i11 = i2 & 256;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        if ((i3 & 38347923) != 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str7 = str3;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i2 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & 38347923) != 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str6 = str2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str7 = str3;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i2 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str5 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str6 = str2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str7 = str3;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i2 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str6 = str2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str7 = str3;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i2 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
