package com.robinhood.android.acatsin.failedtransferbottomsheet;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetCta;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: FailedTransferBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"FailedTransferBottomSheetComposable", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;", "modifier", "Landroidx/compose/ui/Modifier;", "onCtaClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "deeplink", "(Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-acats-in_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class FailedTransferBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedTransferBottomSheetComposable$lambda$8(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        FailedTransferBottomSheetComposable(acatsTransferHubBottomSheetDetails, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03a0  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FailedTransferBottomSheetComposable(AcatsTransferHubBottomSheetDetails details, Modifier modifier, Function1<? super String, Unit> onCtaClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        Composer composer2;
        BentoTheme bentoTheme;
        String str;
        ?? r1;
        Composer composer3;
        final AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Function1<? super String, Unit> function1;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(241755825);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(details) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCtaClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(241755825, i3, -1, "com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposable (FailedTransferBottomSheetComposable.kt:33)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                boolean z2 = StringsKt.isBlank(details.getSourceBrokerageIconUrl()) && !StringsKt.isBlank(details.getDestinationBrokerageIconUrl());
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 2);
                Modifier modifier5 = modifier4;
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                z = z2;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
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
                composerStartRestartGroup.startReplaceGroup(710259916);
                if (z) {
                    i4 = i3;
                    composer2 = composerStartRestartGroup;
                    bentoTheme = bentoTheme2;
                    str = null;
                    r1 = 0;
                } else {
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5090spacedByD5KLDUw(bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), companion.getCenterHorizontally()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    i4 = i3;
                    bentoTheme = bentoTheme2;
                    r1 = 0;
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder(context).data(details.getSourceBrokerageIconUrl()).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62), StringResources_androidKt.stringResource(C7725R.string.source_broker_content_description, composerStartRestartGroup, 0), SizeKt.m5158heightInVpY3zN4$default(companion3, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM(), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ARROW_RIGHT_24), null, bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 48, 56);
                    str = null;
                    ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder(context).data(details.getDestinationBrokerageIconUrl()).build(), null, null, null, 0, null, composerStartRestartGroup, 0, 62), StringResources_androidKt.stringResource(C7725R.string.dest_broker_content_description, composerStartRestartGroup, 0), SizeKt.m5158heightInVpY3zN4$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21591getLargeD9Ej5fM(), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                }
                composer2.endReplaceGroup();
                String title = details.getTitle();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer3, 0, 0, 8126);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer3, i6).m21593getSmallD9Ej5fM()), composer3, r1);
                BentoText2.m20747BentoText38GnDrw(details.getSubtitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer3, i6).m21590getDefaultD9Ej5fM()), composer3, r1);
                composer3.startReplaceGroup(-1633490746);
                acatsTransferHubBottomSheetDetails = details;
                int i7 = i4 & 896;
                zChangedInstance = composer3.changedInstance(acatsTransferHubBottomSheetDetails) | (i7 != 256 ? true : r1);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function1 = onCtaClick;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable$lambda$7$lambda$3$lambda$2(acatsTransferHubBottomSheetDetails, function1);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                } else {
                    function1 = onCtaClick;
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer3.endReplaceGroup();
                AcatsTransferHubBottomSheetCta primaryCta = acatsTransferHubBottomSheetDetails.getPrimaryCta();
                String text = primaryCta == null ? primaryCta.getText() : str;
                composer3.startReplaceGroup(-1633490746);
                zChangedInstance2 = composer3.changedInstance(acatsTransferHubBottomSheetDetails) | (i7 != 256 ? true : r1);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable$lambda$7$lambda$6$lambda$5(acatsTransferHubBottomSheetDetails, function1);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer3.endReplaceGroup();
                AcatsTransferHubBottomSheetCta secondaryCta = acatsTransferHubBottomSheetDetails.getSecondaryCta();
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, text, false, null, false, function02, secondaryCta == null ? secondaryCta.getText() : str, false, null, false, composer3, 0, 0, 59199);
                composer4 = composer3;
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function1 = onCtaClick;
                modifier3 = modifier2;
                composer4 = composerStartRestartGroup;
                acatsTransferHubBottomSheetDetails = details;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails2 = acatsTransferHubBottomSheetDetails;
                final Function1<? super String, Unit> function12 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable$lambda$8(acatsTransferHubBottomSheetDetails2, modifier3, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (StringsKt.isBlank(details.getSourceBrokerageIconUrl())) {
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifier4, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, (i3 >> 3) & 14, 2);
                Modifier modifier52 = modifier4;
                Alignment.Companion companion6 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion6.getCenterHorizontally();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                z = z2;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g02);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(710259916);
                    if (z) {
                    }
                    composer2.endReplaceGroup();
                    String title2 = details.getTitle();
                    TextAlign.Companion companion42 = TextAlign.INSTANCE;
                    composer3 = composer2;
                    BentoText2.m20747BentoText38GnDrw(title2, null, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i62).getDisplayCapsuleSmall(), composer3, 0, 0, 8126);
                    Modifier.Companion companion52 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion52, bentoTheme.getSpacing(composer3, i62).m21593getSmallD9Ej5fM()), composer3, r1);
                    BentoText2.m20747BentoText38GnDrw(details.getSubtitle(), null, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16318);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion52, bentoTheme.getSpacing(composer3, i62).m21590getDefaultD9Ej5fM()), composer3, r1);
                    composer3.startReplaceGroup(-1633490746);
                    acatsTransferHubBottomSheetDetails = details;
                    int i72 = i4 & 896;
                    zChangedInstance = composer3.changedInstance(acatsTransferHubBottomSheetDetails) | (i72 != 256 ? true : r1);
                    objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance) {
                        function1 = onCtaClick;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable$lambda$7$lambda$3$lambda$2(acatsTransferHubBottomSheetDetails, function1);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        Function0 function03 = (Function0) objRememberedValue;
                        composer3.endReplaceGroup();
                        AcatsTransferHubBottomSheetCta primaryCta2 = acatsTransferHubBottomSheetDetails.getPrimaryCta();
                        if (primaryCta2 == null) {
                        }
                        composer3.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composer3.changedInstance(acatsTransferHubBottomSheetDetails) | (i72 != 256 ? true : r1);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.failedtransferbottomsheet.FailedTransferBottomSheetComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FailedTransferBottomSheetComposable.FailedTransferBottomSheetComposable$lambda$7$lambda$6$lambda$5(acatsTransferHubBottomSheetDetails, function1);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                            Function0 function022 = (Function0) objRememberedValue2;
                            composer3.endReplaceGroup();
                            AcatsTransferHubBottomSheetCta secondaryCta2 = acatsTransferHubBottomSheetDetails.getSecondaryCta();
                            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function03, text, false, null, false, function022, secondaryCta2 == null ? secondaryCta2.getText() : str, false, null, false, composer3, 0, 0, 59199);
                            composer4 = composer3;
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedTransferBottomSheetComposable$lambda$7$lambda$3$lambda$2(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, Function1 function1) {
        AcatsTransferHubBottomSheetCta primaryCta = acatsTransferHubBottomSheetDetails.getPrimaryCta();
        if (primaryCta != null) {
            function1.invoke(primaryCta.getDeeplink());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedTransferBottomSheetComposable$lambda$7$lambda$6$lambda$5(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, Function1 function1) {
        AcatsTransferHubBottomSheetCta secondaryCta = acatsTransferHubBottomSheetDetails.getSecondaryCta();
        if (secondaryCta != null) {
            function1.invoke(secondaryCta.getDeeplink());
        }
        return Unit.INSTANCE;
    }
}
