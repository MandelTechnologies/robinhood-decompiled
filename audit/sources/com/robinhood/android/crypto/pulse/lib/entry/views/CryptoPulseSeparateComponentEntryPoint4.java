package com.robinhood.android.crypto.pulse.lib.entry.views;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import bonfire.proto.idl.crypto.p033v1.GetCryptoPulsePreviewResponseDto;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.LottieDynamicProperties;
import com.airbnb.lottie.compose.LottieDynamicProperties2;
import com.airbnb.lottie.compose.LottieDynamicProperties3;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.pulse.lib.C12946R;
import com.robinhood.android.crypto.pulse.lib.entry.CryptoPulseEntryPointViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIcon;
import com.robinhood.compose.bento.component.text.BentoTextWithTrailingIconState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoPulseSeparateComponentEntryPoint.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\"\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002"}, m3636d2 = {"CryptoPulseSeparateComponentEntryPoint", "", "state", "Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Visible;", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Visible;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_PULSE_ENTRY_POINT_CORTEX_ICON_SIZE", "Landroidx/compose/ui/unit/Dp;", "F", "CryptoPulseSeparateComponentEntryPointPositivePreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoPulseSeparateComponentEntryPointNegativePreview", "hasSignedAgreementPreviewState", "getHasSignedAgreementPreviewState", "()Lcom/robinhood/android/crypto/pulse/lib/entry/CryptoPulseEntryPointViewState$Visible;", "lib-crypto-pulse_externalDebug", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseSeparateComponentEntryPoint4 {
    private static final float CRYPTO_PULSE_ENTRY_POINT_CORTEX_ICON_SIZE = C2002Dp.m7995constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseSeparateComponentEntryPoint$lambda$7(CryptoPulseEntryPointViewState.Visible visible, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoPulseSeparateComponentEntryPoint(visible, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseSeparateComponentEntryPointNegativePreview$lambda$9(int i, Composer composer, int i2) {
        CryptoPulseSeparateComponentEntryPointNegativePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoPulseSeparateComponentEntryPointPositivePreview$lambda$8(int i, Composer composer, int i2) {
        CryptoPulseSeparateComponentEntryPointPositivePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x047b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPulseSeparateComponentEntryPoint(final CryptoPulseEntryPointViewState.Visible state, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BentoTheme bentoTheme;
        int i4;
        int i5;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2074511032);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2074511032, i3, -1, "com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPoint (CryptoPulseSeparateComponentEntryPoint.kt:59)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, (InteractionSource3) objRememberedValue, null, false, null, null, onClick, 28, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default);
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
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                long jM21368getAccent0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i7).m21368getAccent0d7_KjU();
                String str = null;
                FontStyle fontStyle = null;
                FontWeight fontWeight = null;
                TextDecoration textDecoration = null;
                TextAlign textAlign = null;
                int i8 = 0;
                boolean z = false;
                int i9 = 0;
                int i10 = 0;
                Modifier modifier5 = modifier4;
                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(state.getTitle(), new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_RIGHT_16), str, bentoTheme2.getColors(composerStartRestartGroup, i7).m21368getAccent0d7_KjU(), Color.m6701boximpl(jM21368getAccent0d7_KjU), fontStyle, fontWeight, textDecoration, textAlign, i8, z, i9, i10, bentoTheme2.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), false, C2002Dp.m7993boximpl(bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), null, false, 221152, null), null, null, null, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 14);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Intrinsic4.Min);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(state.getBody(), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 817889280, 0, 7546);
                composerStartRestartGroup.startReplaceGroup(-467849307);
                if (state.getHasSignedAgreement()) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
                    Brush brushM6682verticalGradient8A3gB4$default = Brush.Companion.m6682verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.INSTANCE.m6725getTransparent0d7_KjU()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU())}), -128.0f, 0.0f, 0, 12, (Object) null);
                    bentoTheme = bentoTheme2;
                    i4 = i7;
                    i5 = 0;
                    BoxKt.Box(Background3.background$default(modifierFillMaxSize$default, brushM6682verticalGradient8A3gB4$default, null, 0.0f, 6, null), composerStartRestartGroup, 0);
                } else {
                    bentoTheme = bentoTheme2;
                    i4 = i7;
                    i5 = 0;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (state.getHasSignedAgreement()) {
                    int i11 = i4;
                    composerStartRestartGroup.startReplaceGroup(-746555693);
                    long jM21368getAccent0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i11).m21368getAccent0d7_KjU();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i11).getTextM();
                    composerStartRestartGroup.startReplaceGroup(807207634);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(i5, 1, null);
                    composerStartRestartGroup.startReplaceGroup(807208949);
                    int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(C12946R.string.crypto_pulse_entry_point_read_more, composerStartRestartGroup, i5));
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, null, Color.m6701boximpl(jM21368getAccent0d7_KjU2), null, bold, null, null, 0, false, 0, 0, null, null, textM, composerStartRestartGroup, 24576, 0, 8170);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-748288438);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM()), composerStartRestartGroup, i5);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i5);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
                    Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    int i12 = i4;
                    LottieAnimation2.LottieAnimation(m1897x719e7c1c(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(bentoTheme.getColors(composerStartRestartGroup, i4).getIsDay() ? LottieUrl.CORTEX_ICON_LIGHT.getUrl().getUrl() : LottieUrl.CORTEX_ICON_DARK.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62)), SizeKt.m5169size3ABfNKs(companion3, CRYPTO_PULSE_ENTRY_POINT_CORTEX_ICON_SIZE), false, false, null, 0.0f, 0, false, false, false, null, false, false, LottieDynamicProperties2.rememberLottieDynamicProperties(new LottieDynamicProperties3[]{LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU())), new String[]{"**"}, composerStartRestartGroup, 6), LottieDynamicProperties2.rememberLottieDynamicProperty(LottieProperty.STROKE_COLOR, Integer.valueOf(Color2.m6735toArgb8_81llA(bentoTheme.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU())), new String[]{"**"}, composerStartRestartGroup, 6)}, composerStartRestartGroup, LottieDynamicProperties3.$stable), null, ContentScale.INSTANCE.getFit(), false, false, null, false, null, composerStartRestartGroup, 48, (LottieDynamicProperties.$stable << 9) | 196608, 0, 2056188);
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(state.getSubtitle(), composerStartRestartGroup, StringResource.$stable), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i12).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i12).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoPulseSeparateComponentEntryPoint4.CryptoPulseSeparateComponentEntryPoint$lambda$7(state, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default2 = ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default2, (InteractionSource3) objRememberedValue, null, false, null, null, onClick, 28, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4891clickableO2vRcR0$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                long jM21368getAccent0d7_KjU3 = bentoTheme22.getColors(composerStartRestartGroup, i72).m21368getAccent0d7_KjU();
                String str2 = null;
                FontStyle fontStyle2 = null;
                FontWeight fontWeight2 = null;
                TextDecoration textDecoration2 = null;
                TextAlign textAlign2 = null;
                int i82 = 0;
                boolean z2 = false;
                int i92 = 0;
                int i102 = 0;
                Modifier modifier52 = modifier4;
                BentoTextWithTrailingIcon.BentoTextWithTrailingIcon(new BentoTextWithTrailingIconState(state.getTitle(), new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_RIGHT_16), str2, bentoTheme22.getColors(composerStartRestartGroup, i72).m21368getAccent0d7_KjU(), Color.m6701boximpl(jM21368getAccent0d7_KjU3), fontStyle2, fontWeight2, textDecoration2, textAlign2, i82, z2, i92, i102, bentoTheme22.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), false, C2002Dp.m7993boximpl(bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), null, false, 221152, null), null, null, null, composerStartRestartGroup, BentoTextWithTrailingIconState.$stable, 14);
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierHeight2 = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), Intrinsic4.Min);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHeight2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(state.getBody(), null, Color.m6701boximpl(bentoTheme22.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU()), null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 4, 0, null, 0, bentoTheme22.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 817889280, 0, 7546);
                    composerStartRestartGroup.startReplaceGroup(-467849307);
                    if (state.getHasSignedAgreement()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (state.getHasSignedAgreement()) {
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: CryptoPulseSeparateComponentEntryPoint$lambda$6$lambda$3$lambda$2 */
    private static final LottieComposition m1897x719e7c1c(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    public static final void CryptoPulseSeparateComponentEntryPointPositivePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1378835888);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1378835888, i, -1, "com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointPositivePreview (CryptoPulseSeparateComponentEntryPoint.kt:162)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.POSITIVE, CryptoPulseSeparateComponentEntryPoint.INSTANCE.m12965getLambda$1353681560$lib_crypto_pulse_externalDebug(), composerStartRestartGroup, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseSeparateComponentEntryPoint4.CryptoPulseSeparateComponentEntryPointPositivePreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CryptoPulseSeparateComponentEntryPointNegativePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-673596940);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-673596940, i, -1, "com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointNegativePreview (CryptoPulseSeparateComponentEntryPoint.kt:176)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, BentoTheme4.NEGATIVE, CryptoPulseSeparateComponentEntryPoint.INSTANCE.getLambda$888852908$lib_crypto_pulse_externalDebug(), composerStartRestartGroup, 113246208, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.pulse.lib.entry.views.CryptoPulseSeparateComponentEntryPointKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoPulseSeparateComponentEntryPoint4.CryptoPulseSeparateComponentEntryPointNegativePreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoPulseEntryPointViewState.Visible getHasSignedAgreementPreviewState() {
        return new CryptoPulseEntryPointViewState.Visible("Crypto Pulse Title", "Bitcoin slips 1% in 24 hours as institutional buying continues but momentum slows, with traders watching for volatility ahead. Bitcoin slips 1% in 24 hours as institutional buying continues but momentum slows, with traders watching for volatility ahead. Bitcoin slips 1% in 24 hours as institutional buying continues but momentum slows, with traders watching for volatility ahead", StringResource.INSTANCE.invoke("Updated 3m ago  •  Based on your trades"), new GetCryptoPulsePreviewResponseDto.TapActionDto(null, 1, null), true);
    }
}
