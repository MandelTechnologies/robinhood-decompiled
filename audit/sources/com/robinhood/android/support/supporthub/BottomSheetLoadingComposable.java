package com.robinhood.android.support.supporthub;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: BottomSheetLoadingComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"BottomSheetLoadingComposable", "", "title", "", "subtitle", "isConciergeUser", "", "modifier", "Landroidx/compose/ui/Modifier;", "skeletonCount", "", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.supporthub.BottomSheetLoadingComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BottomSheetLoadingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomSheetLoadingComposable$lambda$5(String str, String str2, boolean z, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        BottomSheetLoadingComposable(str, str2, z, modifier, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029f A[LOOP:0: B:109:0x029d->B:110:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0170  */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetLoadingComposable(final String str, final String str2, final boolean z, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        float fM21592getMediumD9Ej5fM;
        Modifier modifier3;
        int i7;
        String str3;
        ?? r4;
        int i8;
        int i9;
        final int i10;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1581794719);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    i4 |= composerStartRestartGroup.changed(i6) ? 16384 : 8192;
                }
                if ((i4 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    i10 = i6;
                } else {
                    Modifier modifier5 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                    int i12 = i5 == 0 ? 3 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1581794719, i4, -1, "com.robinhood.android.support.supporthub.BottomSheetLoadingComposable (BottomSheetLoadingComposable.kt:27)");
                    }
                    TextAlign.Companion companion = TextAlign.INSTANCE;
                    int iM7924getStarte0LSkKk = !z ? companion.m7924getStarte0LSkKk() : companion.m7919getCentere0LSkKk();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(TestTag3.testTag(modifier5, "BottomSheet"), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1486432682);
                    if (str != null) {
                        modifier3 = modifier5;
                        i7 = i12;
                    } else {
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "BottomSheetTitle");
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i13 = BentoTheme.$stable;
                        float fM21592getMediumD9Ej5fM2 = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM();
                        float fM21592getMediumD9Ej5fM3 = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM();
                        float fM21592getMediumD9Ej5fM4 = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM();
                        if (str2 == null || StringsKt.isBlank(str2)) {
                            composerStartRestartGroup.startReplaceGroup(1492925679);
                            fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1492926670);
                            fM21592getMediumD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21593getSmallD9Ej5fM();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        i7 = i12;
                        BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(ModifiersKt.bentoPlaceholder(PaddingKt.m5145paddingqDBjuR0(modifierTestTag, fM21592getMediumD9Ej5fM2, fM21592getMediumD9Ej5fM4, fM21592getMediumD9Ej5fM3, fM21592getMediumD9Ej5fM), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(iM7924getStarte0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i13).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    str3 = (str2 != null || StringsKt.isBlank(str2)) ? null : str2;
                    composerStartRestartGroup.startReplaceGroup(-1486404283);
                    if (str3 != null) {
                        r4 = 1;
                    } else {
                        Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "BottomSheetSubtitle");
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i14 = BentoTheme.$stable;
                        r4 = 1;
                        BentoText2.m20747BentoText38GnDrw(str3, ModifiersKt.bentoPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag2, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i14).m21592getMediumD9Ej5fM(), 2, null), true, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8))), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i14).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i14).getTextM(), composerStartRestartGroup, 0, 0, 8120);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1486380773);
                    i8 = i7;
                    for (i9 = 0; i9 < i8; i9++) {
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i15 = BentoTheme.$stable;
                        BoxKt.Box(TestTag3.testTag(ModifiersKt.bentoPlaceholder(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme3.getSpacing(composerStartRestartGroup, i15).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, r4, null), C2002Dp.m7995constructorimpl(56)), r4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(12))), "BottomSheetLoading"), composerStartRestartGroup, 0);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme3.getSpacing(composerStartRestartGroup, i15).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i10 = i8;
                    modifier4 = modifier3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.BottomSheetLoadingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BottomSheetLoadingComposable.BottomSheetLoadingComposable$lambda$5(str, str2, z, modifier4, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                if (i11 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                if (!z) {
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ScrollKt.verticalScroll$default(TestTag3.testTag(modifier5, "BottomSheet"), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
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
                    composerStartRestartGroup.startReplaceGroup(-1486432682);
                    if (str != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (str2 != null) {
                        composerStartRestartGroup.startReplaceGroup(-1486404283);
                        if (str3 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1486380773);
                        i8 = i7;
                        while (i9 < i8) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        i10 = i8;
                        modifier4 = modifier3;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        i6 = i;
        if ((i4 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
