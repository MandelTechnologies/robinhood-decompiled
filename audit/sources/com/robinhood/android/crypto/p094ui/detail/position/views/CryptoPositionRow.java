package com.robinhood.android.crypto.p094ui.detail.position.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.p094ui.detail.position.views.CryptoPositionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.position.views.ComposableSingletons$CryptoPositionRowKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPositionRow {
    public static final CryptoPositionRow INSTANCE = new CryptoPositionRow();
    private static Function2<Composer, Integer, Unit> lambda$1351385393 = ComposableLambda3.composableLambdaInstance(1351385393, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.position.views.ComposableSingletons$CryptoPositionRowKt$lambda$1351385393$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1351385393, i, -1, "com.robinhood.android.crypto.ui.detail.position.views.ComposableSingletons$CryptoPositionRowKt.lambda$1351385393.<anonymous> (CryptoPositionRow.kt:369)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
            StringResource.Companion companion3 = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion3.invoke("Today's return");
            composer.startReplaceGroup(945476839);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("-$0.4448");
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(" (-0.60%)");
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                composer.endReplaceGroup();
                CryptoPositionRowState cryptoPositionRowState = new CryptoPositionRowState(true, stringResourceInvoke, false, annotatedString, null, null, "", 52, null);
                int i3 = StringResource.$stable;
                CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(cryptoPositionRowState, null, 0L, null, null, null, composer, i3, 62);
                StringResource stringResourceInvoke2 = companion3.invoke("Today's return");
                composer.startReplaceGroup(945492327);
                builder = new AnnotatedString.Builder(0, 1, null);
                builder.append("+$0.4448");
                iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(" (+0.60%)");
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString2 = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(new CryptoPositionRowState(false, stringResourceInvoke2, false, annotatedString2, null, null, "", 53, null), null, 0L, null, null, null, composer, i3, 62);
                    StringResource stringResourceInvoke3 = companion3.invoke("Today's return");
                    composer.startReplaceGroup(945510791);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append("-$0.4448");
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" (-0.60%)");
                        builder.pop(iPushStyle);
                        AnnotatedString annotatedString3 = builder.toAnnotatedString();
                        composer.endReplaceGroup();
                        CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(new CryptoPositionRowState(true, stringResourceInvoke3, true, annotatedString3, null, null, "", 48, null), null, 0L, null, null, null, composer, i3, 62);
                        StringResource stringResourceInvoke4 = companion3.invoke("Today's return");
                        composer.startReplaceGroup(945527975);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        builder.append("+$0.4448");
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(" (+0.60%)");
                            builder.pop(iPushStyle);
                            AnnotatedString annotatedString4 = builder.toAnnotatedString();
                            composer.endReplaceGroup();
                            CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(new CryptoPositionRowState(false, stringResourceInvoke4, true, annotatedString4, null, null, "", 49, null), null, 0L, null, null, null, composer, i3, 62);
                            CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(new CryptoPositionRowState(true, companion3.invoke("Portfolio diversity"), true, new AnnotatedString("47%", null, 2, null), new CryptoPositionRowState.TextTrailingContent.PieChart(0.47f), null, "", 32, null), null, 0L, null, null, null, composer, i3, 62);
                            CryptoPositionRow3.m13110CryptoPositionRowFU0evQE(new CryptoPositionRowState(false, companion3.invoke("Portfolio diversity"), true, new AnnotatedString("87%", null, 2, null), new CryptoPositionRowState.TextTrailingContent.PieChart(0.87f), null, "", 33, null), null, 0L, null, null, null, composer, i3, 62);
                            composer.endNode();
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
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1351385393$feature_crypto_externalDebug() {
        return lambda$1351385393;
    }
}
