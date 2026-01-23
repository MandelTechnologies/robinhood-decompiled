package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.lists.C20839R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UserListFuturesContractsDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a%\u0010\u0007\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"inflateUserListFuturesContractsDisclosureComposeView", "Landroidx/compose/ui/platform/ComposeView;", "context", "Landroid/content/Context;", "onSearchClick", "Lkotlin/Function0;", "", "UserListFuturesContractsDisclosure", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-lists_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class UserListFuturesContractsDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserListFuturesContractsDisclosure$lambda$4(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UserListFuturesContractsDisclosure(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final ComposeView inflateUserListFuturesContractsDisclosureComposeView(Context context, final Function0<Unit> onSearchClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(2050900166, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt$inflateUserListFuturesContractsDisclosureComposeView$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2050900166, i, -1, "com.robinhood.android.lists.ui.userlist.inflateUserListFuturesContractsDisclosureComposeView.<anonymous>.<anonymous> (UserListFuturesContractsDisclosure.kt:24)");
                }
                final Function0<Unit> function0 = onSearchClick;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(540551694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt$inflateUserListFuturesContractsDisclosureComposeView$1$1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(540551694, i2, -1, "com.robinhood.android.lists.ui.userlist.inflateUserListFuturesContractsDisclosureComposeView.<anonymous>.<anonymous>.<anonymous> (UserListFuturesContractsDisclosure.kt:25)");
                        }
                        Function0<Unit> function02 = function0;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        UserListFuturesContractsDisclosure.UserListFuturesContractsDisclosure(function02, PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM()), composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return composeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UserListFuturesContractsDisclosure(final Function0<Unit> onSearchClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int iM7919getCentere0LSkKk;
        BentoTheme bentoTheme;
        int i4;
        TextStyle textS;
        AnnotatedString.Builder builder;
        boolean z;
        Object objRememberedValue;
        int iPushLink;
        final Modifier modifier4;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(900929401);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSearchClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(900929401, i3, -1, "com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosure (UserListFuturesContractsDisclosure.kt:40)");
                }
                iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                composerStartRestartGroup.startReplaceGroup(-1790230160);
                builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(StringResources_androidKt.stringResource(C20839R.string.user_list_futures_contract_hidden_disclosure, composerStartRestartGroup, 0));
                composerStartRestartGroup.startReplaceGroup(-1790226295);
                TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i3 & 14) == 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt$UserListFuturesContractsDisclosure$1$1$1
                        @Override // androidx.compose.p011ui.text.LinkInteractionListener
                        public final void onClick(LinkAnnotation it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onSearchClick.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                iPushLink = builder.pushLink(new LinkAnnotation.Clickable("search_futures_contracts", textLinkStyles, (LinkInteractionListener) objRememberedValue));
                try {
                    builder.append(StringResources_androidKt.stringResource(C20839R.string.user_list_futures_contract_hidden_disclosure_search, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushLink);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    int i6 = i3 & 112;
                    modifier4 = modifier3;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifier4, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, textS, composer2, i6, 0, 8120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushLink);
                    throw th;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UserListFuturesContractsDisclosure.UserListFuturesContractsDisclosure$lambda$4(onSearchClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
            composerStartRestartGroup.startReplaceGroup(-1790230160);
            builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(StringResources_androidKt.stringResource(C20839R.string.user_list_futures_contract_hidden_disclosure, composerStartRestartGroup, 0));
            composerStartRestartGroup.startReplaceGroup(-1790226295);
            TextLinkStyles textLinkStyles2 = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 14) == 4) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.lists.ui.userlist.UserListFuturesContractsDisclosureKt$UserListFuturesContractsDisclosure$1$1$1
                    @Override // androidx.compose.p011ui.text.LinkInteractionListener
                    public final void onClick(LinkAnnotation it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        onSearchClick.invoke();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                iPushLink = builder.pushLink(new LinkAnnotation.Clickable("search_futures_contracts", textLinkStyles2, (LinkInteractionListener) objRememberedValue));
                builder.append(StringResources_androidKt.stringResource(C20839R.string.user_list_futures_contract_hidden_disclosure_search, composerStartRestartGroup, 0));
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushLink);
                composerStartRestartGroup.endReplaceGroup();
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                composerStartRestartGroup.endReplaceGroup();
                int i62 = i3 & 112;
                modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifier4, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, null, textS, composer2, i62, 0, 8120);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
