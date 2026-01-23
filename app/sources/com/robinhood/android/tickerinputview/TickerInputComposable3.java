package com.robinhood.android.tickerinputview;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnRemeasuredModifier2;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TickerInputComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001ae\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u0001X\u008a\u008e\u0002"}, m3636d2 = {"toViewConstant", "", "Landroidx/compose/ui/text/style/TextAlign;", "toViewConstant-aXe7zB0", "(I)I", "TickerInputComposable", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "animate", "", "handleZero", "maxTextSize", "Landroidx/compose/ui/unit/Dp;", "textAlign", "shake", "onShaken", "Lkotlin/Function0;", "TickerInputComposable-uSRqIlo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZZFIZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TickerInputComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-ticker-input-view_externalDebug", "maxHeightPx"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.tickerinputview.TickerInputComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TickerInputComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposablePreview$lambda$14(int i, Composer composer, int i2) {
        TickerInputComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposable_uSRqIlo$lambda$13(String str, Modifier modifier, boolean z, boolean z2, float f, int i, boolean z3, Function0 function0, int i2, int i3, Composer composer, int i4) {
        m19249TickerInputComposableuSRqIlo(str, modifier, z, z2, f, i, z3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* renamed from: toViewConstant-aXe7zB0, reason: not valid java name */
    private static final int m19250toViewConstantaXe7zB0(int i) {
        TextAlign.Companion companion = TextAlign.INSTANCE;
        if (TextAlign.m7915equalsimpl0(i, companion.m7919getCentere0LSkKk())) {
            return 4;
        }
        if (TextAlign.m7915equalsimpl0(i, companion.m7924getStarte0LSkKk())) {
            return 5;
        }
        if (TextAlign.m7915equalsimpl0(i, companion.m7920getEnde0LSkKk())) {
            return 6;
        }
        throw new IllegalStateException(("Unsupported text align: " + TextAlign.m7917toStringimpl(i)).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* renamed from: TickerInputComposable-uSRqIlo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m19249TickerInputComposableuSRqIlo(final String text, Modifier modifier, boolean z, boolean z2, float f, int i, boolean z3, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        final boolean z4;
        int i6;
        final boolean z5;
        int i7;
        final float fM7995constructorimpl;
        final int iM7919getCentere0LSkKk;
        int i8;
        final boolean z6;
        int i9;
        float f2;
        int i10;
        Function0<Unit> function02;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        float f3;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-644069073);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    z4 = z;
                    i4 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z5 = z2;
                        i4 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 != 0) {
                        if ((i2 & 24576) == 0) {
                            fM7995constructorimpl = f;
                            i4 |= composerStartRestartGroup.changed(fM7995constructorimpl) ? 16384 : 8192;
                        }
                        if ((i2 & 196608) == 0) {
                            iM7919getCentere0LSkKk = i;
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(iM7919getCentere0LSkKk)) ? 131072 : 65536;
                        } else {
                            iM7919getCentere0LSkKk = i;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            z6 = z3;
                        } else {
                            z6 = z3;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(z6) ? 1048576 : 524288;
                            }
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
                        }
                        if ((i4 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function04 = function0;
                            modifier5 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                if (i6 != 0) {
                                    z5 = true;
                                }
                                if (i7 != 0) {
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(96);
                                }
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                    iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                }
                                if (i8 != 0) {
                                    z6 = false;
                                }
                                if (i9 == 0) {
                                    f2 = fM7995constructorimpl;
                                    i10 = i4;
                                    function02 = null;
                                    modifier3 = modifier2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-644069073, i10, -1, "com.robinhood.android.tickerinputview.TickerInputComposable (TickerInputComposable.kt:67)");
                                }
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier3, f2);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.tickerinputview.TickerInputComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return TickerInputComposable3.TickerInputComposable_uSRqIlo$lambda$4$lambda$3(snapshotIntState2, (IntSize) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnSizeChanged = OnRemeasuredModifier2.onSizeChanged(modifierM5156height3ABfNKs, (Function1) objRememberedValue2);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Modifier modifier6 = modifier3;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                                    modifier4 = modifier6;
                                    f3 = f2;
                                    Function0<Unit> function05 = function02;
                                    boolean z7 = z6;
                                    boolean z8 = z4;
                                    int i12 = iM7919getCentere0LSkKk;
                                    boolean z9 = z5;
                                    if (snapshotIntState2.getIntValue() > 0) {
                                        composerStartRestartGroup.startReplaceGroup(-192820298);
                                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7993boximpl(density.mo5013toDpu2uoSUM(snapshotIntState2.getIntValue())).getValue());
                                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                                        iM7919getCentere0LSkKk = i12;
                                        boolean z10 = ((((458752 & i10) ^ 196608) > 131072 && composerStartRestartGroup.changed(iM7919getCentere0LSkKk)) || (i10 & 196608) == 131072) | ((i10 & 7168) == 2048);
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (z10 || objRememberedValue3 == companion.getEmpty()) {
                                            z5 = z9;
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.tickerinputview.TickerInputComposableKt$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TickerInputComposable3.TickerInputComposable_uSRqIlo$lambda$12$lambda$8$lambda$7(iM7919getCentere0LSkKk, snapshotIntState2, z5, (Context) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        } else {
                                            z5 = z9;
                                        }
                                        Function1 function1 = (Function1) objRememberedValue3;
                                        composerStartRestartGroup.endReplaceGroup();
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        boolean z11 = ((i10 & 896) == 256) | ((i10 & 14) == 4) | ((3670016 & i10) == 1048576) | ((29360128 & i10) == 8388608);
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (z11 || objRememberedValue4 == companion.getEmpty()) {
                                            z4 = z8;
                                            z6 = z7;
                                            function03 = function05;
                                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.tickerinputview.TickerInputComposableKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return TickerInputComposable3.TickerInputComposable_uSRqIlo$lambda$12$lambda$11$lambda$10(z4, text, z6, function03, (TickerInputView) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        } else {
                                            z4 = z8;
                                            z6 = z7;
                                            function03 = function05;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        AndroidView_androidKt.AndroidView(function1, modifierM5156height3ABfNKs2, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        iM7919getCentere0LSkKk = i12;
                                        z5 = z9;
                                        z4 = z8;
                                        z6 = z7;
                                        function03 = function05;
                                        composerStartRestartGroup.startReplaceGroup(-191475859);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-193102832);
                                    f3 = f2;
                                    modifier4 = modifier6;
                                    BentoText2.m20747BentoText38GnDrw(text, null, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium(), 0L, TextUnit2.getSp(f2), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), composerStartRestartGroup, i10 & 14, 0, 8190);
                                    composerStartRestartGroup.endReplaceGroup();
                                    iM7919getCentere0LSkKk = iM7919getCentere0LSkKk;
                                    z5 = z5;
                                    z4 = z4;
                                    z6 = z6;
                                    function03 = function02;
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function04 = function03;
                                modifier5 = modifier4;
                                fM7995constructorimpl = f3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 32) != 0) {
                                    i4 &= -458753;
                                }
                            }
                            f2 = fM7995constructorimpl;
                            modifier3 = modifier2;
                            i10 = i4;
                            function02 = function0;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5156height3ABfNKs3 = SizeKt.m5156height3ABfNKs(modifier3, f2);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnSizeChanged2 = OnRemeasuredModifier2.onSizeChanged(modifierM5156height3ABfNKs3, (Function1) objRememberedValue2);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged2);
                            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                            Modifier modifier62 = modifier3;
                            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                                }
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function04 = function03;
                                modifier5 = modifier4;
                                fM7995constructorimpl = f3;
                            }
                        }
                        final boolean z12 = z6;
                        final boolean z13 = z4;
                        final int i13 = iM7919getCentere0LSkKk;
                        final boolean z14 = z5;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tickerinputview.TickerInputComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TickerInputComposable3.TickerInputComposable_uSRqIlo$lambda$13(text, modifier5, z13, z14, fM7995constructorimpl, i13, z12, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 24576;
                    fM7995constructorimpl = f;
                    if ((i2 & 196608) == 0) {
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    if ((i4 & 4793491) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if ((i3 & 32) != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 == 0) {
                                f2 = fM7995constructorimpl;
                                modifier3 = modifier2;
                                i10 = i4;
                                function02 = function0;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Density density22 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            final SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5156height3ABfNKs32 = SizeKt.m5156height3ABfNKs(modifier3, f2);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnSizeChanged22 = OnRemeasuredModifier2.onSizeChanged(modifierM5156height3ABfNKs32, (Function1) objRememberedValue2);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnSizeChanged22);
                            ComposeUiNode.Companion companion222 = ComposeUiNode.INSTANCE;
                            Modifier modifier622 = modifier3;
                            Function0<ComposeUiNode> constructor22 = companion222.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion222.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion222.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion222.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                            }
                        }
                    }
                    final boolean z122 = z6;
                    final boolean z132 = z4;
                    final int i132 = iM7919getCentere0LSkKk;
                    final boolean z142 = z5;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 16;
                if (i7 != 0) {
                }
                fM7995constructorimpl = f;
                if ((i2 & 196608) == 0) {
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                if ((i4 & 4793491) == 4793490) {
                }
                final boolean z1222 = z6;
                final boolean z1322 = z4;
                final int i1322 = iM7919getCentere0LSkKk;
                final boolean z1422 = z5;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            fM7995constructorimpl = f;
            if ((i2 & 196608) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            if ((i4 & 4793491) == 4793490) {
            }
            final boolean z12222 = z6;
            final boolean z13222 = z4;
            final int i13222 = iM7919getCentere0LSkKk;
            final boolean z14222 = z5;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        fM7995constructorimpl = f;
        if ((i2 & 196608) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        if ((i4 & 4793491) == 4793490) {
        }
        final boolean z122222 = z6;
        final boolean z132222 = z4;
        final int i132222 = iM7919getCentere0LSkKk;
        final boolean z142222 = z5;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposable_uSRqIlo$lambda$4$lambda$3(SnapshotIntState2 snapshotIntState2, IntSize intSize) {
        snapshotIntState2.setIntValue((int) (intSize.getPackedValue() & 4294967295L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TickerInputView TickerInputComposable_uSRqIlo$lambda$12$lambda$8$lambda$7(int i, SnapshotIntState2 snapshotIntState2, boolean z, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TickerInputView tickerInputView = new TickerInputView(context, null, 0, snapshotIntState2.getIntValue(), m19250toViewConstantaXe7zB0(i), 6, null);
        tickerInputView.setUseLegacyTextSizingAndLayout(false);
        tickerInputView.setTypeface(ContextsUiExtensions.getFont(context, C16915R.font.capsule_sans_medium));
        tickerInputView.setHandleZero(z);
        return tickerInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerInputComposable_uSRqIlo$lambda$12$lambda$11$lambda$10(boolean z, String str, boolean z2, Function0 function0, TickerInputView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground1));
        if (z) {
            char[] charArray = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            view.transitionTo(charArray);
        } else {
            char[] charArray2 = str.toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
            view.setValue(charArray2);
        }
        if (z2) {
            AnimationUtils.animateErrorShake$default(AnimationUtils.INSTANCE, view, 0L, 0.05f, 1, null);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void TickerInputComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(646923003);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(646923003, i, -1, "com.robinhood.android.tickerinputview.TickerInputComposablePreview (TickerInputComposable.kt:124)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TickerInputComposable.INSTANCE.m19247getLambda$1126196669$lib_ticker_input_view_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tickerinputview.TickerInputComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TickerInputComposable3.TickerInputComposablePreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
