package com.robinhood.android.crypto.tab.p093ui.support;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.crypto.tab.C13013R;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.odyssey.lib.Constants4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: CryptoHomeSupportComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"CryptoHomeSupportComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.support.CryptoHomeSupportComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeSupportComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHomeSupportComposable$lambda$8(Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoHomeSupportComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoHomeSupportComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-137999984);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        } else {
            Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-137999984, i3, -1, "com.robinhood.android.crypto.tab.ui.support.CryptoHomeSupportComposable (CryptoHomeSupportComposable.kt:28)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strStringResource = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_support_robinhood_support, composerStartRestartGroup, 0);
            final String strStringResource2 = StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_support_phone_number, composerStartRestartGroup, 0);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(StringResources_androidKt.stringResource(C13013R.string.crypto_home_tab_support_text, composerStartRestartGroup, 0), Arrays.copyOf(new Object[]{strStringResource, strStringResource2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            composerStartRestartGroup.startReplaceGroup(526021553);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, strStringResource, 0, false, 6, (Object) null);
            int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str, strStringResource, 0, false, 6, (Object) null) + strStringResource.length();
            int iIndexOf$default3 = StringsKt.indexOf$default((CharSequence) str, strStringResource2, 0, false, 6, (Object) null);
            int iIndexOf$default4 = StringsKt.indexOf$default((CharSequence) str, strStringResource2, 0, false, 6, (Object) null) + strStringResource2.length();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier5 = modifier4;
            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
            try {
                String strSubstring = str.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                builder.append(strSubstring);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null);
                String str2 = DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD() + "://support";
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.crypto.tab.ui.support.CryptoHomeSupportComposableKt$CryptoHomeSupportComposable$annotatedText$1$2$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(((LinkAnnotation.Url) it).getUrl()), null, null, false, null, 60, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int iPushLink = builder.pushLink(new LinkAnnotation.Url(str2, textLinkStyles, (LinkInteractionListener) objRememberedValue));
                try {
                    builder.append(strStringResource);
                    builder.pop(iPushLink);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        String strSubstring2 = str.substring(iIndexOf$default2, iIndexOf$default3);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                        builder.append(strSubstring2);
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource2);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new LinkInteractionListener() { // from class: com.robinhood.android.crypto.tab.ui.support.CryptoHomeSupportComposableKt$CryptoHomeSupportComposable$annotatedText$1$5$1
                                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                                public final void onClick(LinkAnnotation it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    try {
                                        Context context2 = context;
                                        Intent intent = new Intent("android.intent.action.DIAL");
                                        intent.setData(Uri.parse("tel:" + strStringResource2));
                                        context2.startActivity(intent);
                                    } catch (ActivityNotFoundException unused) {
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        iPushLink = builder.pushLink(new LinkAnnotation.Clickable(Constants4.ENTITY_FIELD_PHONE_NUMBER, textLinkStyles, (LinkInteractionListener) objRememberedValue2));
                        try {
                            builder.append(strStringResource2);
                            builder.pop(iPushLink);
                            iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                String strSubstring3 = str.substring(iIndexOf$default4);
                                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                                builder.append(strSubstring3);
                                builder.pop(iPushStyle);
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composerStartRestartGroup.endReplaceGroup();
                                modifier3 = modifier5;
                                composer2 = composerStartRestartGroup;
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5146paddingqDBjuR0$default(modifier5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composer2, 0, 0, 8188);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.tab.ui.support.CryptoHomeSupportComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoHomeSupportComposable.CryptoHomeSupportComposable$lambda$8(modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
