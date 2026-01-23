package com.robinhood.android.charts.cursor;

import android.annotation.SuppressLint;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.bugsy.BugsyRedactCompose2;
import com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt;
import com.robinhood.android.charts.cursor.CursorData;
import com.robinhood.android.charts.cursor.CursorRowModifiers;
import com.robinhood.android.mcw.fxswitcher.ftux.constants.Transitions;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.bento.util.ModifiersKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: ChartCursorDataHeader.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a|\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a|\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0099\u0001\u0010!\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a7\u0010!\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010&\u001a\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)\u001a\u000f\u0010*\u001a\u00020\nH\u0001¢\u0006\u0004\b*\u0010+\u001a\u000f\u0010,\u001a\u00020\nH\u0001¢\u0006\u0004\b,\u0010+¨\u00063²\u0006\u000e\u0010.\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020-8\n@\nX\u008a\u008e\u0002²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002²\u0006\u000e\u00102\u001a\u0004\u0018\u00010$8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;", "primaryValue", "", "privacyEnabled", "showPlaceholder", "clearSemanticsOnChildren", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Lkotlin/ExtensionFunctionType;", "primaryRowTrailing", "Lkotlin/Function0;", "onPrimaryValueClick", "", "displayCurrencyCode", "ChartCursorDataHeader", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;ZZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "secondaryRowModifier", "tertiaryRowModifier", "quaternaryRowModifier", "Lcom/robinhood/android/charts/cursor/CursorData;", "state", "alwaysAllowTertiary", "secondaryRowTrailing", "ChartCursorDataSubheader", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData;ZLkotlin/jvm/functions/Function3;ZZLandroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/charts/cursor/CursorRowModifiers;", "rowModifiers", "Lcom/robinhood/android/charts/cursor/CursorDataConfig;", "cursorDataConfig", "showDisplayCurrencyLabel", "ChartCursorDataHeaderSection", "(Lcom/robinhood/android/charts/cursor/CursorData;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorRowModifiers;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/charts/cursor/CursorDataConfig;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "displayText", "Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;", "subDisplayText", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/charts/cursor/CursorData$DisplayText;Lcom/robinhood/android/charts/cursor/CursorData$SubDisplayText;ZLandroidx/compose/runtime/Composer;II)V", "value", "adjustQuaternaryValue", "(Ljava/lang/String;)Ljava/lang/String;", "ChartCursorDataHeaderNoPrivacyPreview", "(Landroidx/compose/runtime/Composer;I)V", "ChartCursorDataHeaderPrivacyPreview", "", "tertiaryRowYPosition", "quaternaryRowYPosition", "", "tertiaryAndQuaternaryRowsTaken", "adjustedQuaternaryValue", "lib-charts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ChartCursorDataHeaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataHeader$lambda$3(Modifier modifier, CursorData.DisplayText displayText, boolean z, boolean z2, boolean z3, Function3 function3, Function0 function0, String str, int i, int i2, Composer composer, int i3) {
        ChartCursorDataHeader(modifier, displayText, z, z2, z3, function3, function0, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataHeaderNoPrivacyPreview$lambda$35(int i, Composer composer, int i2) {
        ChartCursorDataHeaderNoPrivacyPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataHeaderPrivacyPreview$lambda$39(int i, Composer composer, int i2) {
        ChartCursorDataHeaderPrivacyPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataHeaderSection$lambda$30(CursorData cursorData, Modifier modifier, CursorRowModifiers cursorRowModifiers, Function3 function3, Function3 function32, Function0 function0, CursorDataConfig cursorDataConfig, String str, boolean z, int i, int i2, Composer composer, int i3) {
        ChartCursorDataHeaderSection(cursorData, modifier, cursorRowModifiers, function3, function32, function0, cursorDataConfig, str, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataHeaderSection$lambda$31(Modifier modifier, CursorData.DisplayText displayText, CursorData.SubDisplayText subDisplayText, boolean z, int i, int i2, Composer composer, int i3) {
        ChartCursorDataHeaderSection(modifier, displayText, subDisplayText, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChartCursorDataSubheader$lambda$19(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, CursorData cursorData, boolean z, Function3 function3, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        ChartCursorDataSubheader(modifier, modifier2, modifier3, modifier4, cursorData, z, function3, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartCursorDataHeader(Modifier modifier, final CursorData.DisplayText displayText, boolean z, boolean z2, boolean z3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0, String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        int i8;
        int i9;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z7;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        Composer composer2;
        boolean z8;
        Function0<Unit> function02;
        String str2;
        final String str3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        final boolean z9;
        Composer composer3;
        final boolean z10;
        final Modifier modifier3;
        final boolean z11;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(732640814);
        int i10 = i2 & 1;
        if (i10 != 0) {
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
            i3 |= composerStartRestartGroup.changed(displayText) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z6 = z3;
                        i3 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            function32 = function3;
                            i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 == 0) {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                            }
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i11 != 0) {
                                    z4 = false;
                                }
                                boolean z12 = i4 == 0 ? false : z5;
                                boolean z13 = i5 == 0 ? false : z6;
                                if (i6 != 0) {
                                    function32 = null;
                                }
                                Function0<Unit> function04 = i7 == 0 ? null : function0;
                                String str4 = i9 == 0 ? null : str;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(732640814, i3, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeader (ChartCursorDataHeader.kt:75)");
                                }
                                Modifier modifierBentoPillPlaceholder = ModifiersKt.bentoPillPlaceholder(modifier4, z12);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(8)), companion.getCenterVertically(), composerStartRestartGroup, 54);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBentoPillPlaceholder);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor);
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Modifier modifier5 = modifier4;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1811054651);
                                if (displayText != null) {
                                    z7 = z12;
                                    z8 = z13;
                                    function02 = function04;
                                    function33 = function32;
                                    str2 = str4;
                                    composer2 = composerStartRestartGroup;
                                } else {
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor2);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    z7 = z12;
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function33 = function32;
                                    Function0<Unit> function05 = function04;
                                    AnimatedVisibilityKt.AnimatedVisibility(z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, null, 3, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(796985602, true, new ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$1(function04, displayText), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 200064, 18);
                                    composer2 = composerStartRestartGroup;
                                    z8 = z13;
                                    String str5 = str4;
                                    function02 = function05;
                                    str2 = str5;
                                    AnimatedVisibilityKt.AnimatedVisibility(!z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideInVertically$default(null, null, 3, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.slideOutVertically$default(null, null, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(1516572907, true, new ChartCursorDataHeaderKt$ChartCursorDataHeader$1$1$1$2(z8, function05, displayText, displayText, str5), composer2, 54), composerStartRestartGroup, 200064, 18);
                                    composer2.endNode();
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1810934826);
                                if (function33 != null) {
                                    function33.invoke(row6, composer2, Integer.valueOf(((i3 >> 12) & 112) | 6));
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35 = function33;
                                str3 = str2;
                                function34 = function35;
                                z9 = z8;
                                composer3 = composer2;
                                z10 = z4;
                                modifier3 = modifier5;
                                z11 = z7;
                                function03 = function02;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                str3 = str;
                                composer3 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                z10 = z4;
                                z11 = z5;
                                z9 = z6;
                                function34 = function32;
                                function03 = function0;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ChartCursorDataHeaderKt.ChartCursorDataHeader$lambda$3(modifier3, displayText, z10, z11, z9, function34, function03, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i9 = i8;
                        if ((i3 & 4793491) == 4793490) {
                            if (i10 == 0) {
                            }
                            if (i11 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierBentoPillPlaceholder2 = ModifiersKt.bentoPillPlaceholder(modifier4, z12);
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(8)), companion4.getCenterVertically(), composerStartRestartGroup, 54);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierBentoPillPlaceholder2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier52 = modifier4;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                composerStartRestartGroup.startReplaceGroup(-1811054651);
                                if (displayText != null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1810934826);
                                if (function33 != null) {
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Function3<? super Row5, ? super Composer, ? super Integer, Unit> function352 = function33;
                                str3 = str2;
                                function34 = function352;
                                z9 = z8;
                                composer3 = composer2;
                                z10 = z4;
                                modifier3 = modifier52;
                                z11 = z7;
                                function03 = function02;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function32 = function3;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z6 = z3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function32 = function3;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z5 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z6 = z3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function32 = function3;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z6 = z3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function32 = function3;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartCursorDataHeaderNoPrivacyPreview$lambda$33(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChartCursorDataHeaderPrivacyPreview$lambda$37(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChartCursorDataSubheader$lambda$18$lambda$14(SnapshotState4<Integer> snapshotState4) {
        return snapshotState4.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorData.SubDisplayText ChartCursorDataSubheader$lambda$18$lambda$17(SnapshotState4<CursorData.SubDisplayText> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: ChartCursorDataHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderNoPrivacyPreview$1 */
    static final class C109821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $privacyEnabled$delegate;

        C109821(SnapshotState<Boolean> snapshotState) {
            this.$privacyEnabled$delegate = snapshotState;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1590412364, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderNoPrivacyPreview.<anonymous> (ChartCursorDataHeader.kt:417)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            final SnapshotState<Boolean> snapshotState = this.$privacyEnabled$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            CursorData.DisplayText displayText = new CursorData.DisplayText("$123,456.78", Color.INSTANCE.m6716getBlack0d7_KjU(), null, null);
            boolean zChartCursorDataHeaderNoPrivacyPreview$lambda$33 = ChartCursorDataHeaderKt.ChartCursorDataHeaderNoPrivacyPreview$lambda$33(snapshotState);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderNoPrivacyPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartCursorDataHeaderKt.C109821.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ChartCursorDataHeaderKt.ChartCursorDataHeader(companion, displayText, zChartCursorDataHeaderNoPrivacyPreview$lambda$33, false, false, null, (Function0) objRememberedValue, null, composer, 1572870, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            ChartCursorDataHeaderKt.ChartCursorDataHeaderNoPrivacyPreview$lambda$34(snapshotState, !ChartCursorDataHeaderKt.ChartCursorDataHeaderNoPrivacyPreview$lambda$33(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChartCursorDataHeader.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderPrivacyPreview$1 */
    static final class C109831 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $privacyEnabled$delegate;

        C109831(SnapshotState<Boolean> snapshotState) {
            this.$privacyEnabled$delegate = snapshotState;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1421082029, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderPrivacyPreview.<anonymous> (ChartCursorDataHeader.kt:443)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            final SnapshotState<Boolean> snapshotState = this.$privacyEnabled$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
            CursorData.DisplayText displayText = new CursorData.DisplayText("$123,456.78", Color.INSTANCE.m6716getBlack0d7_KjU(), null, null);
            boolean zChartCursorDataHeaderPrivacyPreview$lambda$37 = ChartCursorDataHeaderKt.ChartCursorDataHeaderPrivacyPreview$lambda$37(snapshotState);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderPrivacyPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChartCursorDataHeaderKt.C109831.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ChartCursorDataHeaderKt.ChartCursorDataHeader(companion, displayText, zChartCursorDataHeaderPrivacyPreview$lambda$37, false, false, null, (Function0) objRememberedValue, null, composer, 1572870, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            ChartCursorDataHeaderKt.ChartCursorDataHeaderPrivacyPreview$lambda$38(snapshotState, !ChartCursorDataHeaderKt.ChartCursorDataHeaderPrivacyPreview$lambda$37(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartCursorDataSubheader(Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, final CursorData cursorData, boolean z, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier5;
        int i3;
        Modifier secondaryRowModifier;
        int i4;
        Modifier modifier6;
        int i5;
        Modifier modifier7;
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier tertiaryRowModifier;
        Modifier quaternaryRowModifier;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32;
        boolean z5;
        final boolean z6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        CursorData.SubDisplayText secondaryValue;
        CursorData.SubDisplayText tertiaryValue;
        final CursorData.SubDisplayText quaternaryValue;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotFloatState2 snapshotFloatState2;
        Object objRememberedValue2;
        final SnapshotFloatState2 snapshotFloatState22;
        Object objRememberedValue3;
        final SnapshotState4 snapshotState4;
        boolean zChanged;
        Object objRememberedValue4;
        SnapshotState4 snapshotState42;
        boolean z7;
        boolean z8;
        Composer composer2;
        final boolean z9;
        final Modifier modifier8;
        final Modifier modifier9;
        final boolean z10;
        final boolean z11;
        final Modifier modifier10;
        final Modifier modifier11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1368112793);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            modifier5 = modifier;
        } else if ((i & 6) == 0) {
            modifier5 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier5) ? 4 : 2) | i;
        } else {
            modifier5 = modifier;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                secondaryRowModifier = modifier2;
                i3 |= composerStartRestartGroup.changed(secondaryRowModifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier6 = modifier3;
                    i3 |= composerStartRestartGroup.changed(modifier6) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        modifier7 = modifier4;
                        i3 |= composerStartRestartGroup.changed(modifier7) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(cursorData) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        z4 = z;
                    } else {
                        z4 = z;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else {
                        if ((i & 12582912) == 0) {
                            i9 = i8;
                            i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                        }
                        i10 = i2 & 256;
                        if (i10 == 0) {
                            if ((i & 100663296) == 0) {
                                i11 = i10;
                                i3 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                if (i12 != 0) {
                                    modifier5 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    secondaryRowModifier = CursorRowModifiers.Default.INSTANCE.getSecondaryRowModifier();
                                }
                                tertiaryRowModifier = i4 == 0 ? CursorRowModifiers.Default.INSTANCE.getTertiaryRowModifier() : modifier6;
                                quaternaryRowModifier = i5 == 0 ? CursorRowModifiers.Default.INSTANCE.getQuaternaryRowModifier() : modifier7;
                                if (i6 != 0) {
                                    z4 = true;
                                }
                                function32 = i7 == 0 ? null : function3;
                                z5 = i9 == 0 ? false : z2;
                                z6 = i11 == 0 ? false : z3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1368112793, i3, -1, "com.robinhood.android.charts.cursor.ChartCursorDataSubheader (ChartCursorDataHeader.kt:166)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                boolean z12 = z4;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor);
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Modifier modifier12 = modifier5;
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                Modifier.Companion companion4 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
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
                                Row6 row6 = Row6.INSTANCE;
                                secondaryValue = cursorData == null ? cursorData.getSecondaryValue() : null;
                                composerStartRestartGroup.startReplaceGroup(436063620);
                                if (secondaryValue != null) {
                                    SubDisplayText2.SubDisplayText(BugsyRedactCompose2.redactable(ModifiersKt.bentoPillPlaceholder(com.robinhood.utils.compose.extensions.ModifiersKt.clearSemanticsIf(secondaryRowModifier, z6), z5)), secondaryValue, composerStartRestartGroup, 0, 0);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(436075385);
                                if (function32 != null) {
                                    function32.invoke(row6, composerStartRestartGroup, Integer.valueOf(((i3 >> 15) & 112) | 6));
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                tertiaryValue = cursorData == null ? cursorData.getTertiaryValue() : null;
                                quaternaryValue = cursorData == null ? cursorData.getQuaternaryValue() : null;
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Integer.valueOf(ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$18$lambda$13$lambda$12(snapshotFloatState22, snapshotFloatState2));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                snapshotState4 = (SnapshotState4) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                int iChartCursorDataSubheader$lambda$18$lambda$14 = ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4);
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                zChanged = composerStartRestartGroup.changed(iChartCursorDataSubheader$lambda$18$lambda$14) | composerStartRestartGroup.changed(quaternaryValue);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$18$lambda$16$lambda$15(quaternaryValue, snapshotState4);
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                snapshotState42 = (SnapshotState4) objRememberedValue4;
                                composerStartRestartGroup.endReplaceGroup();
                                if (tertiaryValue == null || quaternaryValue != null) {
                                    z7 = z5;
                                    z8 = z6;
                                    composerStartRestartGroup.startReplaceGroup(557820551);
                                    composer2 = composerStartRestartGroup;
                                    FlowLayoutKt.FlowRow(null, null, null, null, ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4) <= 1 ? 1 : 2, 0, ComposableLambda3.rememberComposableLambda(2033550897, true, new ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2(tertiaryValue, tertiaryRowModifier, z8, z7, snapshotFloatState2, snapshotState42, quaternaryRowModifier, snapshotFloatState22), composerStartRestartGroup, 54), composer2, 1572864, 47);
                                    composer2.endReplaceGroup();
                                } else if (z12) {
                                    composerStartRestartGroup.startReplaceGroup(559847052);
                                    z7 = z5;
                                    z8 = z6;
                                    composer2 = composerStartRestartGroup;
                                    FlowLayoutKt.FlowRow(null, null, null, null, 1, 0, ComposableLambda3.rememberComposableLambda(93007720, true, new Function3<FlowRowScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer3, Integer num) {
                                            invoke(flowRowScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(FlowRowScope FlowRow, Composer composer3, int i14) {
                                            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
                                            if ((i14 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(93007720, i14, -1, "com.robinhood.android.charts.cursor.ChartCursorDataSubheader.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:254)");
                                            }
                                            int iChartCursorDataSubheader$lambda$18$lambda$142 = ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4);
                                            boolean z13 = z6;
                                            for (int i15 = 0; i15 < iChartCursorDataSubheader$lambda$18$lambda$142; i15++) {
                                                SubDisplayText2.SubDisplayText(Alpha.alpha(com.robinhood.utils.compose.extensions.ModifiersKt.clearSemanticsIf(Modifier.INSTANCE, z13), 0.0f), CursorData.INSTANCE.getEmptySubDisplayText$lib_charts_externalDebug(), composer3, 48, 0);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composer2, 1597440, 47);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    z7 = z5;
                                    z8 = z6;
                                    composerStartRestartGroup.startReplaceGroup(560405393);
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                }
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z9 = z12;
                                modifier8 = secondaryRowModifier;
                                modifier9 = tertiaryRowModifier;
                                z10 = z8;
                                z11 = z7;
                                modifier10 = quaternaryRowModifier;
                                modifier11 = modifier12;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function32 = function3;
                                z10 = z3;
                                composer2 = composerStartRestartGroup;
                                z9 = z4;
                                modifier11 = modifier5;
                                modifier8 = secondaryRowModifier;
                                modifier9 = modifier6;
                                modifier10 = modifier7;
                                z11 = z2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$19(modifier11, modifier8, modifier9, modifier10, cursorData, z9, function32, z11, z10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        i11 = i10;
                        if ((i3 & 38347923) == 38347922) {
                            if (i12 != 0) {
                            }
                            if (i13 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                            Arrangement arrangement2 = Arrangement.INSTANCE;
                            Arrangement.Vertical top2 = arrangement2.getTop();
                            Alignment.Companion companion22 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                            boolean z122 = z4;
                            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Modifier modifier122 = modifier5;
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                                Modifier.Companion companion42 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    if (cursorData == null) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(436063620);
                                    if (secondaryValue != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(436075385);
                                    if (function32 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (cursorData == null) {
                                    }
                                    if (cursorData == null) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue == companion.getEmpty()) {
                                    }
                                    snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                    }
                                    snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                    }
                                    snapshotState4 = (SnapshotState4) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    int iChartCursorDataSubheader$lambda$18$lambda$142 = ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4);
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    zChanged = composerStartRestartGroup.changed(iChartCursorDataSubheader$lambda$18$lambda$142) | composerStartRestartGroup.changed(quaternaryValue);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return ChartCursorDataHeaderKt.ChartCursorDataSubheader$lambda$18$lambda$16$lambda$15(quaternaryValue, snapshotState4);
                                            }
                                        });
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        snapshotState42 = (SnapshotState4) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        if (tertiaryValue == null) {
                                            z7 = z5;
                                            z8 = z6;
                                            composerStartRestartGroup.startReplaceGroup(557820551);
                                            composer2 = composerStartRestartGroup;
                                            FlowLayoutKt.FlowRow(null, null, null, null, ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4) <= 1 ? 1 : 2, 0, ComposableLambda3.rememberComposableLambda(2033550897, true, new ChartCursorDataHeaderKt$ChartCursorDataSubheader$1$2(tertiaryValue, tertiaryRowModifier, z8, z7, snapshotFloatState2, snapshotState42, quaternaryRowModifier, snapshotFloatState22), composerStartRestartGroup, 54), composer2, 1572864, 47);
                                            composer2.endReplaceGroup();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z9 = z122;
                                            modifier8 = secondaryRowModifier;
                                            modifier9 = tertiaryRowModifier;
                                            z10 = z8;
                                            z11 = z7;
                                            modifier10 = quaternaryRowModifier;
                                            modifier11 = modifier122;
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                modifier7 = modifier4;
                if ((i2 & 16) == 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier6 = modifier3;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            modifier7 = modifier4;
            if ((i2 & 16) == 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        secondaryRowModifier = modifier2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier6 = modifier3;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        modifier7 = modifier4;
        if ((i2 & 16) == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChartCursorDataSubheader$lambda$18$lambda$13$lambda$12(SnapshotFloatState2 snapshotFloatState2, SnapshotFloatState2 snapshotFloatState22) {
        return snapshotFloatState2.getFloatValue() > snapshotFloatState22.getFloatValue() ? 2 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorData.SubDisplayText ChartCursorDataSubheader$lambda$18$lambda$16$lambda$15(CursorData.SubDisplayText subDisplayText, SnapshotState4 snapshotState4) {
        if (ChartCursorDataSubheader$lambda$18$lambda$14(snapshotState4) <= 1) {
            return subDisplayText;
        }
        if (subDisplayText != null) {
            return CursorData.SubDisplayText.copy$default(subDisplayText, CursorData.IconDisplayText.m11999copyiJQMabo$default(subDisplayText.getMain(), adjustQuaternaryValue(subDisplayText.getMain().getValue()), 0L, null, null, null, 30, null), null, null, 6, null);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0100  */
    @SuppressLint({"UnusedTargetStateInContentKeyLambda"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartCursorDataHeaderSection(final CursorData cursorData, Modifier modifier, CursorRowModifiers cursorRowModifiers, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32, Function0<Unit> function0, CursorDataConfig cursorDataConfig, String str, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        int i6;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        int i7;
        Function0<Unit> function02;
        int i8;
        int i9;
        int i10;
        int i11;
        CursorRowModifiers cursorRowModifiers2;
        CursorDataConfig cursorDataConfig2;
        String str2;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Composer composer2;
        final String str3;
        final Modifier modifier3;
        final CursorRowModifiers cursorRowModifiers3;
        final Function0<Unit> function03;
        final CursorDataConfig cursorDataConfig3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function36;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-964415538);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(cursorData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(cursorRowModifiers) : composerStartRestartGroup.changedInstance(cursorRowModifiers) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function33 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function34 = function32;
                        i3 |= composerStartRestartGroup.changedInstance(function34) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                    } else {
                        if ((196608 & i) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                        }
                        if ((i & 1572864) == 0) {
                            i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(cursorDataConfig)) ? 1048576 : 524288;
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                            }
                            i10 = i2 & 256;
                            if (i10 != 0) {
                                if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                                }
                                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    cursorDataConfig3 = cursorDataConfig;
                                    str3 = str;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    function36 = function33;
                                    function35 = function34;
                                    function03 = function02;
                                    cursorRowModifiers3 = cursorRowModifiers;
                                    z3 = z;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        cursorRowModifiers2 = i4 == 0 ? CursorRowModifiers.Default.INSTANCE : cursorRowModifiers;
                                        if (i5 != 0) {
                                            function33 = null;
                                        }
                                        if (i6 != 0) {
                                            function34 = null;
                                        }
                                        if (i7 != 0) {
                                            function02 = null;
                                        }
                                        if ((i2 & 64) == 0) {
                                            cursorDataConfig2 = new CursorDataConfig(false, false, false, false, false, false, 63, null);
                                            i3 &= -3670017;
                                        } else {
                                            cursorDataConfig2 = cursorDataConfig;
                                        }
                                        str2 = i9 == 0 ? str : null;
                                        if (i11 == 0) {
                                            z2 = false;
                                        }
                                        int i13 = i3;
                                        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function37 = function34;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-964415538, i13, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection (ChartCursorDataHeader.kt:286)");
                                        }
                                        AnimationTargetState animationTargetState = new AnimationTargetState(cursorData, cursorDataConfig2.getHasPrivacy(), str2);
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        final CursorRowModifiers cursorRowModifiers4 = cursorRowModifiers2;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composerStartRestartGroup, 48);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        final String str4 = str2;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ChartCursorDataHeaderKt.ChartCursorDataHeaderSection$lambda$29$lambda$21$lambda$20((AnimatedContentTransitionScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ChartCursorDataHeaderKt.ChartCursorDataHeaderSection$lambda$29$lambda$23$lambda$22((AnimationTargetState) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        final boolean z4 = z2;
                                        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function38 = function33;
                                        final Function0<Unit> function04 = function02;
                                        final CursorDataConfig cursorDataConfig4 = cursorDataConfig2;
                                        AnimatedContentKt.AnimatedContent(animationTargetState, null, function1, null, "chartCursorDataHeaderTextAnimation", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1115628419, true, new Function4<AnimatedContentScope, AnimationTargetState, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderSection$1$3
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AnimationTargetState animationTargetState2, Composer composer3, Integer num) {
                                                invoke(animatedContentScope, animationTargetState2, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope AnimatedContent, AnimationTargetState state, Composer composer3, int i14) {
                                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                                Intrinsics.checkNotNullParameter(state, "state");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1115628419, i14, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:309)");
                                                }
                                                CursorData cursorData2 = state.getCursorData();
                                                if ((cursorData2 != null ? cursorData2.getPrimaryValue() : null) != null || function38 != null) {
                                                    ChartCursorDataHeaderKt.ChartCursorDataHeader(BugsyRedactCompose2.redactable(PaddingKt.m5146paddingqDBjuR0$default(cursorRowModifiers4.getPrimaryRowModifier(), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 7, null)), cursorData2 != null ? cursorData2.getPrimaryValue() : null, cursorDataConfig4.getHasPrivacy(), cursorDataConfig4.getShowPlaceholder(), cursorDataConfig4.getHeaderClearSemanticsOnChildren(), function38, function04, z4 ? str4 : null, composer3, 0, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1794432, 10);
                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.useNode();
                                        } else {
                                            composerStartRestartGroup.createNode(constructor2);
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                        final BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda5
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ChartCursorDataHeaderKt.m1817x1c5b7db0((AnimatedContentTransitionScope) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        Function1 function12 = (Function1) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return ChartCursorDataHeaderKt.m1818x4624e334((AnimationTargetState) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        composer2 = composerStartRestartGroup;
                                        AnimatedContentKt.AnimatedContent(animationTargetState, null, function12, null, "chartCursorDataSubHeaderTextAnimation", (Function1) objRememberedValue4, ComposableLambda3.rememberComposableLambda(-1766122883, true, new Function4<AnimatedContentScope, AnimationTargetState, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderSection$1$4$3
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AnimationTargetState animationTargetState2, Composer composer3, Integer num) {
                                                invoke(animatedContentScope, animationTargetState2, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope AnimatedContent, AnimationTargetState state, Composer composer3, int i14) {
                                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                                Intrinsics.checkNotNullParameter(state, "state");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1766122883, i14, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection.<anonymous>.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:340)");
                                                }
                                                ChartCursorDataHeaderKt.ChartCursorDataSubheader(null, cursorRowModifiers4.getSecondaryRowModifier(), cursorRowModifiers4.getTertiaryRowModifier(), cursorRowModifiers4.getQuaternaryRowModifier(), state.getCursorData(), cursorDataConfig4.getAlwaysAllowTertiary(), function37, cursorDataConfig4.getShowPlaceholder(), cursorDataConfig4.getSubheaderClearSemanticsOnChildren(), composer3, 0, 1);
                                                AnimatedVisibilityKt.AnimatedVisibility(cursorDataConfig4.getShouldAddScrimOverlayToSubheader(), boxScopeInstance.matchParentSize(Modifier.INSTANCE), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null), (String) null, ComposableSingletons$ChartCursorDataHeaderKt.INSTANCE.getLambda$2012895909$lib_charts_externalDebug(), composer3, 200064, 16);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composer2, 1794432, 10);
                                        composer2.endNode();
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str3 = str4;
                                        modifier3 = modifier2;
                                        cursorRowModifiers3 = cursorRowModifiers4;
                                        function03 = function04;
                                        cursorDataConfig3 = cursorDataConfig4;
                                        function35 = function37;
                                        function36 = function33;
                                        z3 = z4;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i2 & 64) != 0) {
                                            i3 &= -3670017;
                                        }
                                        cursorRowModifiers2 = cursorRowModifiers;
                                        cursorDataConfig2 = cursorDataConfig;
                                        str2 = str;
                                    }
                                    z2 = z;
                                    int i132 = i3;
                                    final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function372 = function34;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    AnimationTargetState animationTargetState2 = new AnimationTargetState(cursorData, cursorDataConfig2.getHasPrivacy(), str2);
                                    Alignment.Companion companion22 = Alignment.INSTANCE;
                                    final CursorRowModifiers cursorRowModifiers42 = cursorRowModifiers2;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    final String str42 = str2;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                        }
                                        Function1 function13 = (Function1) objRememberedValue;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(1849434622);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue2 == companion.getEmpty()) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        final boolean z42 = z2;
                                        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function382 = function33;
                                        final Function0<Unit> function042 = function02;
                                        final CursorDataConfig cursorDataConfig42 = cursorDataConfig2;
                                        AnimatedContentKt.AnimatedContent(animationTargetState2, null, function13, null, "chartCursorDataHeaderTextAnimation", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1115628419, true, new Function4<AnimatedContentScope, AnimationTargetState, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderSection$1$3
                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AnimationTargetState animationTargetState22, Composer composer3, Integer num) {
                                                invoke(animatedContentScope, animationTargetState22, composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedContentScope AnimatedContent, AnimationTargetState state, Composer composer3, int i14) {
                                                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                                Intrinsics.checkNotNullParameter(state, "state");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1115628419, i14, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:309)");
                                                }
                                                CursorData cursorData2 = state.getCursorData();
                                                if ((cursorData2 != null ? cursorData2.getPrimaryValue() : null) != null || function382 != null) {
                                                    ChartCursorDataHeaderKt.ChartCursorDataHeader(BugsyRedactCompose2.redactable(PaddingKt.m5146paddingqDBjuR0$default(cursorRowModifiers42.getPrimaryRowModifier(), 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 7, null)), cursorData2 != null ? cursorData2.getPrimaryValue() : null, cursorDataConfig42.getHasPrivacy(), cursorDataConfig42.getShowPlaceholder(), cursorDataConfig42.getHeaderClearSemanticsOnChildren(), function382, function042, z42 ? str42 : null, composer3, 0, 0);
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 1794432, 10);
                                        Modifier.Companion companion42 = Modifier.INSTANCE;
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl2.getInserting()) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                            final BoxScope boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue3 == companion.getEmpty()) {
                                            }
                                            Function1 function122 = (Function1) objRememberedValue3;
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(1849434622);
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue4 == companion.getEmpty()) {
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composer2 = composerStartRestartGroup;
                                            AnimatedContentKt.AnimatedContent(animationTargetState2, null, function122, null, "chartCursorDataSubHeaderTextAnimation", (Function1) objRememberedValue4, ComposableLambda3.rememberComposableLambda(-1766122883, true, new Function4<AnimatedContentScope, AnimationTargetState, Composer, Integer, Unit>() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$ChartCursorDataHeaderSection$1$4$3
                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, AnimationTargetState animationTargetState22, Composer composer3, Integer num) {
                                                    invoke(animatedContentScope, animationTargetState22, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedContentScope AnimatedContent, AnimationTargetState state, Composer composer3, int i14) {
                                                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                                                    Intrinsics.checkNotNullParameter(state, "state");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1766122883, i14, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection.<anonymous>.<anonymous>.<anonymous> (ChartCursorDataHeader.kt:340)");
                                                    }
                                                    ChartCursorDataHeaderKt.ChartCursorDataSubheader(null, cursorRowModifiers42.getSecondaryRowModifier(), cursorRowModifiers42.getTertiaryRowModifier(), cursorRowModifiers42.getQuaternaryRowModifier(), state.getCursorData(), cursorDataConfig42.getAlwaysAllowTertiary(), function372, cursorDataConfig42.getShowPlaceholder(), cursorDataConfig42.getSubheaderClearSemanticsOnChildren(), composer3, 0, 1);
                                                    AnimatedVisibilityKt.AnimatedVisibility(cursorDataConfig42.getShouldAddScrimOverlayToSubheader(), boxScopeInstance2.matchParentSize(Modifier.INSTANCE), EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(0, 0, null, 7, null), 0.0f, 2, null), (String) null, ComposableSingletons$ChartCursorDataHeaderKt.INSTANCE.getLambda$2012895909$lib_charts_externalDebug(), composer3, 200064, 16);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composerStartRestartGroup, 54), composer2, 1794432, 10);
                                            composer2.endNode();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            str3 = str42;
                                            modifier3 = modifier2;
                                            cursorRowModifiers3 = cursorRowModifiers42;
                                            function03 = function042;
                                            cursorDataConfig3 = cursorDataConfig42;
                                            function35 = function372;
                                            function36 = function33;
                                            z3 = z42;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return ChartCursorDataHeaderKt.ChartCursorDataHeaderSection$lambda$30(cursorData, modifier3, cursorRowModifiers3, function36, function35, function03, cursorDataConfig3, str3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i11 = i10;
                            if ((i3 & 38347923) == 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 == 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i11 == 0) {
                                        z2 = z;
                                    }
                                    int i1322 = i3;
                                    final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3722 = function34;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    AnimationTargetState animationTargetState22 = new AnimationTargetState(cursorData, cursorDataConfig2.getHasPrivacy(), str2);
                                    Alignment.Companion companion222 = Alignment.INSTANCE;
                                    final CursorRowModifiers cursorRowModifiers422 = cursorRowModifiers2;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion222.getStart(), composerStartRestartGroup, 48);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                                    ComposeUiNode.Companion companion322 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor32 = companion322.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    final String str422 = str2;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion322.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap32, companion322.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion322.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting()) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i9 = i8;
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    function02 = function0;
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    i10 = i2 & 256;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function34 = function32;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function02 = function0;
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function33 = function3;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function34 = function32;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function02 = function0;
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function33 = function3;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function34 = function32;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        function02 = function0;
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ContentTransform ChartCursorDataHeaderSection$lambda$29$lambda$21$lambda$20(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((AnimationTargetState) AnimatedContent.getInitialState()).isPrivacyEnabled() != ((AnimationTargetState) AnimatedContent.getTargetState()).isPrivacyEnabled()) {
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
        return AnimatedContent.using(Transitions.getCurrencySwapTransition(), Transitions.getCurrencySwapSizeTransform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ChartCursorDataHeaderSection$lambda$29$lambda$23$lambda$22(AnimationTargetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDisplayCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ChartCursorDataHeaderSection$lambda$29$lambda$28$lambda$25$lambda$24 */
    public static final ContentTransform m1817x1c5b7db0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((AnimationTargetState) AnimatedContent.getInitialState()).isPrivacyEnabled() != ((AnimationTargetState) AnimatedContent.getTargetState()).isPrivacyEnabled()) {
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
        return AnimatedContent.using(Transitions.getCurrencySwapTransition(), Transitions.getCurrencySwapSizeTransform());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChartCursorDataHeaderSection$lambda$29$lambda$28$lambda$27$lambda$26 */
    public static final Object m1818x4624e334(AnimationTargetState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDisplayCurrencyCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChartCursorDataHeaderSection(Modifier modifier, final CursorData.DisplayText displayText, final CursorData.SubDisplayText subDisplayText, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        CursorData.DisplayText displayText2;
        CursorData.SubDisplayText subDisplayText2;
        boolean z2;
        final boolean z3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1616201545);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            displayText2 = displayText;
        } else {
            displayText2 = displayText;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(displayText2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            subDisplayText2 = subDisplayText;
        } else {
            subDisplayText2 = subDisplayText;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(subDisplayText2) ? 256 : 128;
            }
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                boolean z4 = i5 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1616201545, i3, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderSection (ChartCursorDataHeader.kt:376)");
                }
                Modifier modifier5 = modifier4;
                ChartCursorDataHeaderSection(new CursorData(null, displayText2, subDisplayText2, null, null, null), modifier5, null, null, null, null, new CursorDataConfig(z4, false, false, false, false, false, 62, null), null, false, composerStartRestartGroup, (i3 << 3) & 112, 444);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z3 = z4;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChartCursorDataHeaderKt.ChartCursorDataHeaderSection$lambda$31(modifier3, displayText, subDisplayText, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier52 = modifier4;
            ChartCursorDataHeaderSection(new CursorData(null, displayText2, subDisplayText2, null, null, null), modifier52, null, null, null, null, new CursorDataConfig(z4, false, false, false, false, false, 62, null), null, false, composerStartRestartGroup, (i3 << 3) & 112, 444);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final String adjustQuaternaryValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator it = CollectionsKt.listOf((Object[]) new Character[]{183, 8211, 8212, '-'}).iterator();
        while (it.hasNext()) {
            value = new Regex("\\s*" + Regex.INSTANCE.escape(String.valueOf(((Character) it.next()).charValue())) + "\\s*").replaceFirst(value, "");
        }
        return value;
    }

    @DayNightPreview
    public static final void ChartCursorDataHeaderNoPrivacyPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(871355388);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(871355388, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderNoPrivacyPreview (ChartCursorDataHeader.kt:412)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1590412364, true, new C109821((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartCursorDataHeaderKt.ChartCursorDataHeaderNoPrivacyPreview$lambda$35(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartCursorDataHeaderNoPrivacyPreview$lambda$34(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    @DayNightPreview
    public static final void ChartCursorDataHeaderPrivacyPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-551482213);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-551482213, i, -1, "com.robinhood.android.charts.cursor.ChartCursorDataHeaderPrivacyPreview (ChartCursorDataHeader.kt:438)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1421082029, true, new C109831((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.charts.cursor.ChartCursorDataHeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChartCursorDataHeaderKt.ChartCursorDataHeaderPrivacyPreview$lambda$39(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChartCursorDataHeaderPrivacyPreview$lambda$38(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
