package com.robinhood.android.advisory.projection.frequency;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advisory.contracts.SimulateDepositFrequency;
import com.robinhood.android.advisory.projection.AdvisoryProjectionScreen;
import com.robinhood.android.advisory.projection.C9264R;
import com.robinhood.android.advisory.projection.frequency.FrequencySelector3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: FrequencySelector.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001aY\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"FrequencySelector", "", "frequency", "Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;", "currentSupportedFrequency", "Lkotlinx/collections/immutable/ImmutableList;", "modifier", "Landroidx/compose/ui/Modifier;", "isRetirementAccount", "", "onFrequencySelected", "Lkotlin/Function1;", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "FrequencyBottomSheet", "selectedFrequency", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/android/advisory/contracts/SimulateDepositFrequency;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FrequencySelectorPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-projected-returns_externalDebug", "showBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class FrequencySelector3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencyBottomSheet$lambda$13(SimulateDepositFrequency simulateDepositFrequency, ImmutableList immutableList, Function1 function1, Modifier modifier, boolean z, Function0 function0, int i, int i2, Composer composer, int i3) {
        FrequencyBottomSheet(simulateDepositFrequency, immutableList, function1, modifier, z, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelector$lambda$12(SimulateDepositFrequency simulateDepositFrequency, ImmutableList immutableList, Modifier modifier, boolean z, Function1 function1, int i, int i2, Composer composer, int i3) {
        FrequencySelector(simulateDepositFrequency, immutableList, modifier, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelectorPreview$lambda$14(int i, Composer composer, int i2) {
        FrequencySelectorPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020e A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:90:0x01fa, B:92:0x020e, B:97:0x0218, B:96:0x0215), top: B:124:0x01fa }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215 A[Catch: all -> 0x0212, TryCatch #0 {all -> 0x0212, blocks: (B:90:0x01fa, B:92:0x020e, B:97:0x0218, B:96:0x0215), top: B:124:0x01fa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrequencySelector(final SimulateDepositFrequency frequency, final ImmutableList<? extends SimulateDepositFrequency> currentSupportedFrequency, Modifier modifier, boolean z, final Function1<? super SimulateDepositFrequency, Unit> onFrequencySelected, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        AnnotatedString.Builder builder;
        int iPushStyle;
        Composer composer2;
        final boolean z4;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(currentSupportedFrequency, "currentSupportedFrequency");
        Intrinsics.checkNotNullParameter(onFrequencySelected, "onFrequencySelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1896094498);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(frequency.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(currentSupportedFrequency) ? 32 : 16;
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
                    i3 |= composerStartRestartGroup.changedInstance(onFrequencySelected) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    z4 = z2;
                } else {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i4 == 0 ? false : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1896094498, i3, -1, "com.robinhood.android.advisory.projection.frequency.FrequencySelector (FrequencySelector.kt:48)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FrequencySelector3.FrequencySelector$lambda$4$lambda$3(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue2, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1354230632);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(StringResources_androidKt.stringResource(C9264R.string.frequency_selector_simulate, composerStartRestartGroup, 0));
                    composerStartRestartGroup.startReplaceGroup(-1354226895);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.stringResource(SimulateDepositFrequency2.getActionTextResId(frequency), composerStartRestartGroup, 0));
                        builder.append(PlaceholderUtils.XXShortPlaceholderText);
                        builder.append(StringResources_androidKt.stringResource(!z3 ? C9264R.string.frequency_selector_contribution : C9264R.string.frequency_selector_deposit, composerStartRestartGroup, 0));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), StringResources_androidKt.stringResource(C9264R.string.frequency_selector_icon_description, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                        composerStartRestartGroup.endNode();
                        if (FrequencySelector$lambda$1(snapshotState)) {
                            composer2 = composerStartRestartGroup;
                            z4 = z3;
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z5 = (i3 & 57344) == 16384;
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (z5 || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return FrequencySelector3.FrequencySelector$lambda$9$lambda$8(onFrequencySelected, (SimulateDepositFrequency) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FrequencySelector3.FrequencySelector$lambda$11$lambda$10(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i7 = (i3 & 14) | 196608 | (i3 & 112) | ((i3 << 3) & 57344);
                            z4 = z3;
                            modifier3 = modifier5;
                            FrequencyBottomSheet(frequency, currentSupportedFrequency, function1, null, z4, (Function0) objRememberedValue4, composerStartRestartGroup, i7, 8);
                            composer2 = composerStartRestartGroup;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FrequencySelector3.FrequencySelector$lambda$12(frequency, currentSupportedFrequency, modifier4, z4, onFrequencySelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierFillMaxWidth$default2, false, null, null, (Function0) objRememberedValue2, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4893clickableXHw0xAI$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1354230632);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(StringResources_androidKt.stringResource(C9264R.string.frequency_selector_simulate, composerStartRestartGroup, 0));
                    composerStartRestartGroup.startReplaceGroup(-1354226895);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    builder.append(StringResources_androidKt.stringResource(SimulateDepositFrequency2.getActionTextResId(frequency), composerStartRestartGroup, 0));
                    builder.append(PlaceholderUtils.XXShortPlaceholderText);
                    builder.append(StringResources_androidKt.stringResource(!z3 ? C9264R.string.frequency_selector_contribution : C9264R.string.frequency_selector_deposit, composerStartRestartGroup, 0));
                    Unit unit2 = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString2 = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM(), composerStartRestartGroup, 0, 0, 8186);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.DROPDOWN_16), StringResources_androidKt.stringResource(C9264R.string.frequency_selector_icon_description, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                    composerStartRestartGroup.endNode();
                    if (FrequencySelector$lambda$1(snapshotState)) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
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
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void FrequencySelector$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelector$lambda$4$lambda$3(SnapshotState snapshotState) {
        FrequencySelector$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    private static final boolean FrequencySelector$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelector$lambda$9$lambda$8(Function1 function1, SimulateDepositFrequency newFrequency) {
        Intrinsics.checkNotNullParameter(newFrequency, "newFrequency");
        function1.invoke(newFrequency);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelector$lambda$11$lambda$10(SnapshotState snapshotState) {
        FrequencySelector$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrequencyBottomSheet(final SimulateDepositFrequency selectedFrequency, final ImmutableList<? extends SimulateDepositFrequency> currentSupportedFrequency, final Function1<? super SimulateDepositFrequency, Unit> onFrequencySelected, Modifier modifier, boolean z, final Function0<Unit> onDismiss, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final Modifier modifier3;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(selectedFrequency, "selectedFrequency");
        Intrinsics.checkNotNullParameter(currentSupportedFrequency, "currentSupportedFrequency");
        Intrinsics.checkNotNullParameter(onFrequencySelected, "onFrequencySelected");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-796778701);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(selectedFrequency.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(currentSupportedFrequency) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFrequencySelected) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 131072 : 65536;
                }
                i5 = i3;
                if ((74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-796778701, i5, -1, "com.robinhood.android.advisory.projection.frequency.FrequencyBottomSheet (FrequencySelector.kt:113)");
                    }
                    final boolean z4 = z2;
                    Modifier modifier5 = modifier4;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier5, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-679755636, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt.FrequencyBottomSheet.1

                        /* compiled from: FrequencySelector.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ ImmutableList<SimulateDepositFrequency> $currentSupportedFrequency;
                            final /* synthetic */ boolean $isRetirementAccount;
                            final /* synthetic */ Function0<Unit> $onDismiss;
                            final /* synthetic */ Function1<SimulateDepositFrequency, Unit> $onFrequencySelected;
                            final /* synthetic */ SimulateDepositFrequency $selectedFrequency;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(boolean z, ImmutableList<? extends SimulateDepositFrequency> immutableList, Function0<Unit> function0, SimulateDepositFrequency simulateDepositFrequency, Function1<? super SimulateDepositFrequency, Unit> function1) {
                                this.$isRetirementAccount = z;
                                this.$currentSupportedFrequency = immutableList;
                                this.$onDismiss = function0;
                                this.$selectedFrequency = simulateDepositFrequency;
                                this.$onFrequencySelected = function1;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            public final void invoke(Composer composer, int i) {
                                if ((i & 3) == 2 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2100479209, i, -1, "com.robinhood.android.advisory.projection.frequency.FrequencyBottomSheet.<anonymous>.<anonymous> (FrequencySelector.kt:119)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                boolean z = this.$isRetirementAccount;
                                ImmutableList<SimulateDepositFrequency> immutableList = this.$currentSupportedFrequency;
                                Function0<Unit> function0 = this.$onDismiss;
                                SimulateDepositFrequency simulateDepositFrequency = this.$selectedFrequency;
                                Function1<SimulateDepositFrequency, Unit> function1 = this.$onFrequencySelected;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                                Function1<SimulateDepositFrequency, Unit> function12 = function1;
                                Function0<Unit> function02 = function0;
                                SimulateDepositFrequency simulateDepositFrequency2 = simulateDepositFrequency;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z ? C9264R.string.frequency_selector_title_contribution : C9264R.string.frequency_selector_title_deposit, composer, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                                Composer composer2 = composer;
                                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21591getLargeD9Ej5fM());
                                int i3 = 0;
                                Spacer2.Spacer(modifierM5156height3ABfNKs, composer2, 0);
                                composer2.startReplaceGroup(493580321);
                                for (Iterator<SimulateDepositFrequency> it = immutableList.iterator(); it.hasNext(); it = it) {
                                    final SimulateDepositFrequency next = it.next();
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                    String strStringResource = StringResources_androidKt.stringResource(SimulateDepositFrequency2.getTitleResId(next), composer2, i3);
                                    SimulateDepositFrequency simulateDepositFrequency3 = simulateDepositFrequency2;
                                    int i4 = simulateDepositFrequency3 == next ? 1 : i3;
                                    composer2.startReplaceGroup(-1746271574);
                                    final Function1<SimulateDepositFrequency, Unit> function13 = function12;
                                    final Function0<Unit> function03 = function02;
                                    boolean zChanged = composer2.changed(function13) | composer2.changed(next.ordinal()) | composer2.changed(function03);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return FrequencySelector3.C92871.AnonymousClass1.invoke$lambda$5$lambda$2$lambda$1$lambda$0(function13, next, function03);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    simulateDepositFrequency2 = simulateDepositFrequency3;
                                    function12 = function13;
                                    function02 = function03;
                                    BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, i4, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 48, 0, 1009);
                                    i3 = i3;
                                    composer2 = composer;
                                }
                                int i5 = i3;
                                final Function0<Unit> function04 = function02;
                                composer2.endReplaceGroup();
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i6).m21591getLargeD9Ej5fM()), composer2, i5);
                                Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), AdvisoryProjectionScreen.TagProjectionCtaButton);
                                BentoButtons.Type type3 = BentoButtons.Type.Primary;
                                String strStringResource2 = StringResources_androidKt.stringResource(C9264R.string.frequency_selector_cta, composer2, i5);
                                composer2.startReplaceGroup(5004770);
                                boolean zChanged2 = composer2.changed(function04);
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FrequencySelector3.C92871.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(function04);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceGroup();
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierTestTag, null, type3, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
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
                            public static final Unit invoke$lambda$5$lambda$2$lambda$1$lambda$0(Function1 function1, SimulateDepositFrequency simulateDepositFrequency, Function0 function0) {
                                function1.invoke(simulateDepositFrequency);
                                function0.invoke();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function0 function0) {
                                function0.invoke();
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-679755636, i7, -1, "com.robinhood.android.advisory.projection.frequency.FrequencyBottomSheet.<anonymous> (FrequencySelector.kt:118)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2100479209, true, new AnonymousClass1(z4, currentSupportedFrequency, onDismiss, selectedFrequency, onFrequencySelected), composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 15) & 14) | 1572864 | ((i5 >> 6) & 112), 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z3 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return FrequencySelector3.FrequencyBottomSheet$lambda$13(selectedFrequency, currentSupportedFrequency, onFrequencySelected, modifier3, z3, onDismiss, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i2 & 32) != 0) {
            }
            i5 = i3;
            if ((74899 & i5) != 74898) {
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final boolean z42 = z2;
                Modifier modifier52 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismiss, modifier52, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-679755636, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt.FrequencyBottomSheet.1

                    /* compiled from: FrequencySelector.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ ImmutableList<SimulateDepositFrequency> $currentSupportedFrequency;
                        final /* synthetic */ boolean $isRetirementAccount;
                        final /* synthetic */ Function0<Unit> $onDismiss;
                        final /* synthetic */ Function1<SimulateDepositFrequency, Unit> $onFrequencySelected;
                        final /* synthetic */ SimulateDepositFrequency $selectedFrequency;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(boolean z, ImmutableList<? extends SimulateDepositFrequency> immutableList, Function0<Unit> function0, SimulateDepositFrequency simulateDepositFrequency, Function1<? super SimulateDepositFrequency, Unit> function1) {
                            this.$isRetirementAccount = z;
                            this.$currentSupportedFrequency = immutableList;
                            this.$onDismiss = function0;
                            this.$selectedFrequency = simulateDepositFrequency;
                            this.$onFrequencySelected = function1;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2100479209, i, -1, "com.robinhood.android.advisory.projection.frequency.FrequencyBottomSheet.<anonymous>.<anonymous> (FrequencySelector.kt:119)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            boolean z = this.$isRetirementAccount;
                            ImmutableList<SimulateDepositFrequency> immutableList = this.$currentSupportedFrequency;
                            Function0<Unit> function0 = this.$onDismiss;
                            SimulateDepositFrequency simulateDepositFrequency = this.$selectedFrequency;
                            Function1<SimulateDepositFrequency, Unit> function1 = this.$onFrequencySelected;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
                            Function1<SimulateDepositFrequency, Unit> function12 = function1;
                            Function0<Unit> function02 = function0;
                            SimulateDepositFrequency simulateDepositFrequency2 = simulateDepositFrequency;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(z ? C9264R.string.frequency_selector_title_contribution : C9264R.string.frequency_selector_title_deposit, composer, 0), PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                            Composer composer2 = composer;
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21591getLargeD9Ej5fM());
                            int i3 = 0;
                            Spacer2.Spacer(modifierM5156height3ABfNKs, composer2, 0);
                            composer2.startReplaceGroup(493580321);
                            for (Iterator<SimulateDepositFrequency> it = immutableList.iterator(); it.hasNext(); it = it) {
                                final SimulateDepositFrequency next = it.next();
                                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                                String strStringResource = StringResources_androidKt.stringResource(SimulateDepositFrequency2.getTitleResId(next), composer2, i3);
                                SimulateDepositFrequency simulateDepositFrequency3 = simulateDepositFrequency2;
                                int i4 = simulateDepositFrequency3 == next ? 1 : i3;
                                composer2.startReplaceGroup(-1746271574);
                                final Function1 function13 = function12;
                                final Function0 function03 = function02;
                                boolean zChanged = composer2.changed(function13) | composer2.changed(next.ordinal()) | composer2.changed(function03);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return FrequencySelector3.C92871.AnonymousClass1.invoke$lambda$5$lambda$2$lambda$1$lambda$0(function13, next, function03);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                simulateDepositFrequency2 = simulateDepositFrequency3;
                                function12 = function13;
                                function02 = function03;
                                BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, i4, null, false, null, false, false, false, (Function0) objRememberedValue, composer, 48, 0, 1009);
                                i3 = i3;
                                composer2 = composer;
                            }
                            int i5 = i3;
                            final Function0 function04 = function02;
                            composer2.endReplaceGroup();
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i6).m21591getLargeD9Ej5fM()), composer2, i5);
                            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme2.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), AdvisoryProjectionScreen.TagProjectionCtaButton);
                            BentoButtons.Type type3 = BentoButtons.Type.Primary;
                            String strStringResource2 = StringResources_androidKt.stringResource(C9264R.string.frequency_selector_cta, composer2, i5);
                            composer2.startReplaceGroup(5004770);
                            boolean zChanged2 = composer2.changed(function04);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$FrequencyBottomSheet$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FrequencySelector3.C92871.AnonymousClass1.invoke$lambda$5$lambda$4$lambda$3(function04);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource2, modifierTestTag, null, type3, false, false, null, null, null, null, false, null, composer2, 24576, 0, 8168);
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
                        public static final Unit invoke$lambda$5$lambda$2$lambda$1$lambda$0(Function1 function1, SimulateDepositFrequency simulateDepositFrequency, Function0 function0) {
                            function1.invoke(simulateDepositFrequency);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-679755636, i7, -1, "com.robinhood.android.advisory.projection.frequency.FrequencyBottomSheet.<anonymous> (FrequencySelector.kt:118)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2100479209, true, new AnonymousClass1(z42, currentSupportedFrequency, onDismiss, selectedFrequency, onFrequencySelected), composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 15) & 14) | 1572864 | ((i5 >> 6) & 112), 60);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                z3 = z42;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 32) != 0) {
        }
        i5 = i3;
        if ((74899 & i5) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void FrequencySelectorPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-276630388);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276630388, i, -1, "com.robinhood.android.advisory.projection.frequency.FrequencySelectorPreview (FrequencySelector.kt:167)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, FrequencySelector.INSTANCE.m11228getLambda$1464420908$feature_projected_returns_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.frequency.FrequencySelectorKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FrequencySelector3.FrequencySelectorPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
