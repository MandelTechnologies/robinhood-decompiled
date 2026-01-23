package com.truelayer.payments.p419ui.screens.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.truelayer.payments.core.domain.experience.localisation.Legals;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.TextWithHTML;
import com.truelayer.payments.p419ui.theme.Color7;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegalText.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"LegalText", "", "modifier", "Landroidx/compose/ui/Modifier;", "legals", "Lcom/truelayer/payments/core/domain/experience/localisation/Legals;", "onLinkClicked", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/core/domain/experience/localisation/Legals;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.screens.components.LegalTextKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class LegalText {
    public static final void LegalText(Modifier modifier, final Legals legals, Function1<? super String, Unit> function1, Composer composer, int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124574064);
        Modifier modifier2 = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        final Function1<? super String, Unit> function12 = (i2 & 4) != 0 ? new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.components.LegalTextKt.LegalText.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        } : function1;
        if (ComposerKt.isTraceInProgress()) {
            i3 = i;
            ComposerKt.traceEventStart(-1124574064, i3, -1, "com.truelayer.payments.ui.screens.components.LegalText (LegalText.kt:20)");
        } else {
            i3 = i;
        }
        final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), TestTags.LEGAL_TEXT);
        String text = legals != null ? legals.getText() : null;
        composerStartRestartGroup.startReplaceableGroup(251715307);
        if (text == null) {
            text = StringResources_androidKt.stringResource(C42830R.string.terms, composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i4 = MaterialTheme.$stable;
        TextWithHTML.TextWithHTML(text, modifierTestTag, TextStyle.m7655copyp1EtxEg$default(materialTheme.getTypography(composerStartRestartGroup, i4).getBodySmall(), Color.m6705copywmQWz5c$default(Color7.m27159contentColoriJQMabo(materialTheme, 0L, composerStartRestartGroup, i4, 1), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), null, new Function2<String, AnnotatedString.Range<String>, Unit>() { // from class: com.truelayer.payments.ui.screens.components.LegalTextKt.LegalText.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, AnnotatedString.Range<String> range) {
                invoke2(str, range);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String uri, AnnotatedString.Range<String> range) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                Intrinsics.checkNotNullParameter(range, "<anonymous parameter 1>");
                function12.invoke(uri);
                uriHandler.openUri(uri);
            }
        }, composerStartRestartGroup, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            final Function1<? super String, Unit> function13 = function12;
            final int i5 = i3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.components.LegalTextKt.LegalText.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    LegalText.LegalText(modifier3, legals, function13, composer2, RecomposeScopeImpl4.updateChangedFlags(i5 | 1), i2);
                }
            });
        }
    }
}
