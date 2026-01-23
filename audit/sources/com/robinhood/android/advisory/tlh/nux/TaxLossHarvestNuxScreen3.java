package com.robinhood.android.advisory.tlh.nux;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
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
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.tlh.C9369R;
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.targetbackend.Endpoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: TaxLossHarvestNuxScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"REMOTE_TOP_IMAGE_URL", "", "TaxLossHarvestNuxScreen", "", "onBackClicked", "Lkotlin/Function0;", "onContinueClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxLossHarvestNuxScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestNuxScreen3 {
    public static final String REMOTE_TOP_IMAGE_URL = "advisory/tax_loss_harvesting/tax_loss_harvest_nux_entry.png";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestNuxScreen$lambda$0(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestNuxScreen(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestNuxScreenPreview$lambda$1(int i, Composer composer, int i2) {
        TaxLossHarvestNuxScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestNuxScreen(final Function0<Unit> onBackClicked, final Function0<Unit> onContinueClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onContinueClicked, "onContinueClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1691164001);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinueClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1691164001, i3, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen (TaxLossHarvestNuxScreen.kt:50)");
                }
                final LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                final HttpUrl httpUrlBuild = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(REMOTE_TOP_IMAGE_URL).build();
                modifier3 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_NUX, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1615443092, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt.TaxLossHarvestNuxScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1615443092, i5, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen.<anonymous> (TaxLossHarvestNuxScreen.kt:66)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                        Function0<Unit> function0 = onBackClicked;
                        final LayoutDirection layoutDirection2 = layoutDirection;
                        final Modifier modifier5 = modifier3;
                        final ScrollState scrollState = scrollStateRememberScrollState;
                        final Function0<Unit> function02 = onContinueClicked;
                        final HttpUrl httpUrl = httpUrlBuild;
                        Components2.TaxLossHarvestingScaffold(function0, modifierLogScreenTransitions$default, false, true, null, null, ComposableLambda3.rememberComposableLambda(-1472282499, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt.TaxLossHarvestNuxScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                                int i7;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i6 & 6) == 0) {
                                    i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i7 = i6;
                                }
                                if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1472282499, i7, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen.<anonymous>.<anonymous> (TaxLossHarvestNuxScreen.kt:71)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifier5, PaddingKt.calculateStartPadding(paddingValues, layoutDirection2), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection2), paddingValues.getBottom(), 2, null), 0.0f, 1, null);
                                ScrollState scrollState2 = scrollState;
                                Function0<Unit> function03 = function02;
                                HttpUrl httpUrl2 = httpUrl;
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomCenter(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(httpUrl2, null, null, null, 0, null, composer3, 0, 62);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i8 = BentoTheme.$stable;
                                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer3, i8).m21596getXxlargeD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(12), 5, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                                composer3.endNode();
                                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion3, 1.4f, false, 2, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), scrollState2, false, null, false, 14, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer3, 48);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_title, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayMartinaLarge(), composer3, 0, 0, 8184);
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                composer3.startReplaceGroup(-371908499);
                                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                                composer3.startReplaceGroup(-371906944);
                                FontWeight.Companion companion4 = FontWeight.INSTANCE;
                                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_1_title, composer3, 0));
                                    Unit unit = Unit.INSTANCE;
                                    builder.pop(iPushStyle);
                                    composer3.endReplaceGroup();
                                    AnnotatedString annotatedString = builder.toAnnotatedString();
                                    composer3.endReplaceGroup();
                                    composer3.startReplaceGroup(-371898836);
                                    builder = new AnnotatedString.Builder(0, 1, null);
                                    composer3.startReplaceGroup(-371897281);
                                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_1_body, composer3, 0));
                                        builder.pop(iPushStyle);
                                        composer3.endReplaceGroup();
                                        AnnotatedString annotatedString2 = builder.toAnnotatedString();
                                        composer3.endReplaceGroup();
                                        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
                                        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null);
                                        int i9 = BentoBaseRowState.Start.Icon.$stable;
                                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierM5146paddingqDBjuR0$default, icon, annotatedString, annotatedString2, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16240);
                                        composer3.startReplaceGroup(-371880851);
                                        builder = new AnnotatedString.Builder(0, 1, null);
                                        composer3.startReplaceGroup(-371879296);
                                        iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_2_title, composer3, 0));
                                            builder.pop(iPushStyle);
                                            composer3.endReplaceGroup();
                                            AnnotatedString annotatedString3 = builder.toAnnotatedString();
                                            composer3.endReplaceGroup();
                                            composer3.startReplaceGroup(-371871188);
                                            builder = new AnnotatedString.Builder(0, 1, null);
                                            composer3.startReplaceGroup(-371869633);
                                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_2_body, composer3, 0));
                                                builder.pop(iPushStyle);
                                                composer3.endReplaceGroup();
                                                AnnotatedString annotatedString4 = builder.toAnnotatedString();
                                                composer3.endReplaceGroup();
                                                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), annotatedString3, annotatedString4, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16241);
                                                composer3.startReplaceGroup(-371853203);
                                                builder = new AnnotatedString.Builder(0, 1, null);
                                                composer3.startReplaceGroup(-371851648);
                                                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                                try {
                                                    builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_3_title, composer3, 0));
                                                    builder.pop(iPushStyle);
                                                    composer3.endReplaceGroup();
                                                    AnnotatedString annotatedString5 = builder.toAnnotatedString();
                                                    composer3.endReplaceGroup();
                                                    composer3.startReplaceGroup(-371843540);
                                                    builder = new AnnotatedString.Builder(0, 1, null);
                                                    composer3.startReplaceGroup(-371841985);
                                                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                                    try {
                                                        builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_3_body, composer3, 0));
                                                        builder.pop(iPushStyle);
                                                        composer3.endReplaceGroup();
                                                        AnnotatedString annotatedString6 = builder.toAnnotatedString();
                                                        composer3.endReplaceGroup();
                                                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), annotatedString5, annotatedString6, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16241);
                                                        composer3.endNode();
                                                        BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_cta, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                                                        composer3.endNode();
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    } finally {
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        }, composer2, 54), composer2, 1575936, 52);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TaxLossHarvestNuxScreen3.TaxLossHarvestNuxScreen$lambda$0(onBackClicked, onContinueClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            final HttpUrl httpUrlBuild2 = Endpoint.BrokerageStatic.INSTANCE.getURL_APP_ASSETS().newBuilder().addPathSegment(REMOTE_TOP_IMAGE_URL).build();
            modifier3 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOSS_HARVEST_NUX, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1615443092, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt.TaxLossHarvestNuxScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1615443092, i5, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen.<anonymous> (TaxLossHarvestNuxScreen.kt:66)");
                    }
                    Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
                    Function0<Unit> function0 = onBackClicked;
                    final LayoutDirection layoutDirection22 = layoutDirection2;
                    final Modifier modifier5 = modifier3;
                    final ScrollState scrollState = scrollStateRememberScrollState2;
                    final Function0<Unit> function02 = onContinueClicked;
                    final HttpUrl httpUrl = httpUrlBuild2;
                    Components2.TaxLossHarvestingScaffold(function0, modifierLogScreenTransitions$default, false, true, null, null, ComposableLambda3.rememberComposableLambda(-1472282499, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt.TaxLossHarvestNuxScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1472282499, i7, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen.<anonymous>.<anonymous> (TaxLossHarvestNuxScreen.kt:71)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m5146paddingqDBjuR0$default(modifier5, PaddingKt.calculateStartPadding(paddingValues, layoutDirection22), 0.0f, PaddingKt.calculateEndPadding(paddingValues, layoutDirection22), paddingValues.getBottom(), 2, null), 0.0f, 1, null);
                            ScrollState scrollState2 = scrollState;
                            Function0<Unit> function03 = function02;
                            HttpUrl httpUrl2 = httpUrl;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), Color.INSTANCE.m6716getBlack0d7_KjU(), null, 2, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getBottomCenter(), false);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(httpUrl2, null, null, null, 0, null, composer3, 0, 62);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer3, i8).m21596getXxlargeD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(12), 5, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            composer3.endNode();
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion3, 1.4f, false, 2, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, i8).m21592getMediumD9Ej5fM(), 1, null), bentoTheme.getColors(composer3, i8).m21371getBg0d7_KjU(), null, 2, null), scrollState2, false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composer3, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_title, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i8).getDisplayMartinaLarge(), composer3, 0, 0, 8184);
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            composer3.startReplaceGroup(-371908499);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            composer3.startReplaceGroup(-371906944);
                            FontWeight.Companion companion4 = FontWeight.INSTANCE;
                            int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                            try {
                                builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_1_title, composer3, 0));
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                composer3.endReplaceGroup();
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer3.endReplaceGroup();
                                composer3.startReplaceGroup(-371898836);
                                builder = new AnnotatedString.Builder(0, 1, null);
                                composer3.startReplaceGroup(-371897281);
                                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                try {
                                    builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_1_body, composer3, 0));
                                    builder.pop(iPushStyle);
                                    composer3.endReplaceGroup();
                                    AnnotatedString annotatedString2 = builder.toAnnotatedString();
                                    composer3.endReplaceGroup();
                                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
                                    BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null);
                                    int i9 = BentoBaseRowState.Start.Icon.$stable;
                                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierM5146paddingqDBjuR0$default, icon, annotatedString, annotatedString2, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16240);
                                    composer3.startReplaceGroup(-371880851);
                                    builder = new AnnotatedString.Builder(0, 1, null);
                                    composer3.startReplaceGroup(-371879296);
                                    iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                    try {
                                        builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_2_title, composer3, 0));
                                        builder.pop(iPushStyle);
                                        composer3.endReplaceGroup();
                                        AnnotatedString annotatedString3 = builder.toAnnotatedString();
                                        composer3.endReplaceGroup();
                                        composer3.startReplaceGroup(-371871188);
                                        builder = new AnnotatedString.Builder(0, 1, null);
                                        composer3.startReplaceGroup(-371869633);
                                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                        try {
                                            builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_2_body, composer3, 0));
                                            builder.pop(iPushStyle);
                                            composer3.endReplaceGroup();
                                            AnnotatedString annotatedString4 = builder.toAnnotatedString();
                                            composer3.endReplaceGroup();
                                            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), annotatedString3, annotatedString4, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16241);
                                            composer3.startReplaceGroup(-371853203);
                                            builder = new AnnotatedString.Builder(0, 1, null);
                                            composer3.startReplaceGroup(-371851648);
                                            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, companion4.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                                            try {
                                                builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_3_title, composer3, 0));
                                                builder.pop(iPushStyle);
                                                composer3.endReplaceGroup();
                                                AnnotatedString annotatedString5 = builder.toAnnotatedString();
                                                composer3.endReplaceGroup();
                                                composer3.startReplaceGroup(-371843540);
                                                builder = new AnnotatedString.Builder(0, 1, null);
                                                composer3.startReplaceGroup(-371841985);
                                                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer3, i8).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                                                try {
                                                    builder.append(StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_bullet_3_body, composer3, 0));
                                                    builder.pop(iPushStyle);
                                                    composer3.endReplaceGroup();
                                                    AnnotatedString annotatedString6 = builder.toAnnotatedString();
                                                    composer3.endReplaceGroup();
                                                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), annotatedString5, annotatedString6, null, null, null, false, false, false, false, false, 0L, null, composer3, (i9 << 3) | 12582912, 0, 16241);
                                                    composer3.endNode();
                                                    BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResources_androidKt.stringResource(C9369R.string.tax_loss_harvest_nux_cta, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM()), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
                                                    composer3.endNode();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                } finally {
                                                }
                                            } finally {
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        }
                    }, composer2, 54), composer2, 1575936, 52);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TaxLossHarvestNuxScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-89072192);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-89072192, i, -1, "com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenPreview (TaxLossHarvestNuxScreen.kt:179)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, TaxLossHarvestNuxScreen.INSTANCE.m11284getLambda$958672008$feature_tax_loss_harvesting_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLossHarvestNuxScreen3.TaxLossHarvestNuxScreenPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
