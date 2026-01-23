package com.robinhood.android.cortex.digest.common.sources;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CortexArticleSourceSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"CortexArticleSourceSheetComposable", "", "articleSource", "Lcom/robinhood/android/cortex/models/ArticleSource;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/models/ArticleSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CortexArticleSourceSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexArticleSourceSheetComposable$lambda$0(ArticleSource articleSource, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CortexArticleSourceSheetComposable(articleSource, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CortexArticleSourceSheetComposable(final ArticleSource articleSource, final Function0<Unit> onDismiss, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(articleSource, "articleSource");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(419981900);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(articleSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419981900, i3, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposable (CortexArticleSourceSheetComposable.kt:19)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1558825313, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposableKt.CortexArticleSourceSheetComposable.1
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
                        ComposerKt.traceEventStart(1558825313, i5, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposable.<anonymous> (CortexArticleSourceSheetComposable.kt:21)");
                    }
                    String publisher = articleSource.getPublisher();
                    List listListOf = CollectionsKt.listOf(new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), onDismiss));
                    Modifier modifier2 = modifier;
                    final ArticleSource articleSource2 = articleSource;
                    BentoAlerts2.AlertContent(modifier2, null, publisher, null, listListOf, true, ComposableLambda3.rememberComposableLambda(1310198737, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposableKt.CortexArticleSourceSheetComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1310198737, i6, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposable.<anonymous>.<anonymous> (CortexArticleSourceSheetComposable.kt:32)");
                            }
                            BentoText2.m20747BentoText38GnDrw(articleSource2.getTitle(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer3, 48, 0, 16316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, (BentoAlertButton.$stable << 12) | 1769472, 10);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceSheetComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CortexArticleSourceSheetComposable.CortexArticleSourceSheetComposable$lambda$0(articleSource, onDismiss, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
