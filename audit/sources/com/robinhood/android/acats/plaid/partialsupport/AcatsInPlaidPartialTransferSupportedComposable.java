package com.robinhood.android.acats.plaid.partialsupport;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.C7376R;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposable;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AcatsInPlaidPartialTransferSupportedComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"AcatsInPlaidPartialTransferSupportedComposable", "", "brokerage", "", "supportedAssetCount", "", "onContinue", "Lkotlin/Function0;", "hasShortEquityPositions", "", "onShowBorrowingFeeDetails", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-acats-plaid_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidPartialTransferSupportedComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsInPlaidPartialTransferSupportedComposable$lambda$2(String str, int i, Function0 function0, boolean z, Function0 function02, int i2, int i3, Composer composer, int i4) {
        AcatsInPlaidPartialTransferSupportedComposable(str, i, function0, z, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsInPlaidPartialTransferSupportedComposable(final String brokerage, final int i, final Function0<Unit> onContinue, boolean z, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z2;
        int i5;
        Function0<Unit> function02;
        final boolean z3;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(brokerage, "brokerage");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-481265104);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(brokerage) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    function02 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                }
                if ((i4 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    z3 = i6 == 0 ? false : z2;
                    if (i5 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function03 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-481265104, i4, -1, "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposable (AcatsInPlaidPartialTransferSupportedComposable.kt:35)");
                    }
                    HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, AcatsInPlaidPartialTransferSupportedComposable2.INSTANCE.m10638getLambda$896090062$lib_acats_plaid_externalDebug(), ComposableLambda3.rememberComposableLambda(162121566, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt.AcatsInPlaidPartialTransferSupportedComposable.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                            invoke(bentoButtonBar3, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i7) {
                            Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                            if ((i7 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(162121566, i7, -1, "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposable.<anonymous> (AcatsInPlaidPartialTransferSupportedComposable.kt:39)");
                            }
                            BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, onContinue, StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_continue, composer2, 0), false, null, false, null, null, false, null, false, composer2, 0, 0, 65342);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(400364852, true, new C74473(z3, function03, i, brokerage), composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z3 = z2;
                    function03 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AcatsInPlaidPartialTransferSupportedComposable.AcatsInPlaidPartialTransferSupportedComposable$lambda$2(brokerage, i, onContinue, z3, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            function02 = function0;
            if ((i4 & 9363) != 9362) {
                if (i6 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(null, AcatsInPlaidPartialTransferSupportedComposable2.INSTANCE.m10638getLambda$896090062$lib_acats_plaid_externalDebug(), ComposableLambda3.rememberComposableLambda(162121566, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt.AcatsInPlaidPartialTransferSupportedComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                        if ((i7 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(162121566, i7, -1, "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposable.<anonymous> (AcatsInPlaidPartialTransferSupportedComposable.kt:39)");
                        }
                        BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, onContinue, StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_continue, composer2, 0), false, null, false, null, null, false, null, false, composer2, 0, 0, 65342);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(400364852, true, new C74473(z3, function03, i, brokerage), composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        function02 = function0;
        if ((i4 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: AcatsInPlaidPartialTransferSupportedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt$AcatsInPlaidPartialTransferSupportedComposable$3 */
    static final class C74473 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $brokerage;
        final /* synthetic */ boolean $hasShortEquityPositions;
        final /* synthetic */ Function0<Unit> $onShowBorrowingFeeDetails;
        final /* synthetic */ int $supportedAssetCount;

        C74473(boolean z, Function0<Unit> function0, int i, String str) {
            this.$hasShortEquityPositions = z;
            this.$onShowBorrowingFeeDetails = function0;
            this.$supportedAssetCount = i;
            this.$brokerage = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400364852, i, -1, "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposable.<anonymous> (AcatsInPlaidPartialTransferSupportedComposable.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxHeight$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            boolean z = this.$hasShortEquityPositions;
            final Function0<Unit> function0 = this.$onShowBorrowingFeeDetails;
            int i3 = this.$supportedAssetCount;
            String str = this.$brokerage;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = arrangement.getCenter();
            Modifier modifierWeight$default = Column5.weight$default(column6, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(center, centerHorizontally2, composer, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(C7376R.drawable.partial_transfer_robot, composer, 0), "", PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strPluralStringResource = StringResources_androidKt.pluralStringResource(C7376R.plurals.acats_plaid_partial_title, i3, new Object[]{Integer.valueOf(i3)}, composer, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strPluralStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_partial_body, new Object[]{str}, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16316);
            composer.endNode();
            composer.startReplaceGroup(-949717130);
            if (z) {
                composer.startReplaceGroup(-949714812);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_warning_prefix, composer, 0));
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                composer.startReplaceGroup(-949709201);
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61439, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_warning_underlined, composer, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composer.endReplaceGroup();
                    builder.append(StringResources_androidKt.stringResource(C7686R.string.acats_in_borrowing_fee_warning_suffix, composer, 0));
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    TextStyle textS = bentoTheme.getTypography(composer, i2).getTextS();
                    int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 7, null);
                    composer.startReplaceGroup(5004770);
                    boolean zChanged = composer.changed(function0);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedComposableKt$AcatsInPlaidPartialTransferSupportedComposable$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AcatsInPlaidPartialTransferSupportedComposable.C74473.invoke$lambda$5$lambda$4$lambda$3(function0);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default2, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, textS, composer, 0, 0, 8124);
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
