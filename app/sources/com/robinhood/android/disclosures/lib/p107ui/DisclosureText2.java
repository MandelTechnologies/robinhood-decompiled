package com.robinhood.android.disclosures.lib.p107ui;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.UriHandleContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisclosureText.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"DisclosureText", "", "id", "", "modifier", "Landroidx/compose/ui/Modifier;", "openUriHandler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "uri", "(ILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-disclosures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.disclosures.lib.ui.DisclosureTextKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class DisclosureText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DisclosureText$lambda$0(int i, Modifier modifier, Function1 function1, int i2, int i3, Composer composer, int i4) {
        DisclosureText(i, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    public static final void DisclosureText(final int i, final Modifier modifier, final Function1<? super String, Unit> openUriHandler, Composer composer, final int i2, final int i3) {
        int i4;
        Intrinsics.checkNotNullParameter(openUriHandler, "openUriHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(197203550);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(openUriHandler) ? 256 : 128;
        }
        if ((i4 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(197203550, i4, -1, "com.robinhood.android.disclosures.lib.ui.DisclosureText (DisclosureText.kt:15)");
            }
            UriHandleContent.UriHandleContent(openUriHandler, ComposableLambda3.rememberComposableLambda(828334987, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.disclosures.lib.ui.DisclosureTextKt.DisclosureText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(828334987, i6, -1, "com.robinhood.android.disclosures.lib.ui.DisclosureText.<anonymous> (DisclosureText.kt:19)");
                    }
                    int i7 = i;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    BentoText2.m20748BentoTextQnj7Zds(AnnotatedStringResource.m22062annotatedStringResourceV2eopBjH0(i7, bentoTheme.getColors(composer2, i8).m21426getFg20d7_KjU(), 0L, (LinkInteractionListener) null, composer2, 0, 12), modifier, null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer2, i8).getTextS(), composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.disclosures.lib.ui.DisclosureTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisclosureText2.DisclosureText$lambda$0(i, modifier2, openUriHandler, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
