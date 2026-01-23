package com.robinhood.shared.portfolio.lists.p391ui.bottomsheet;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReorderCuratedListBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ComposableSingletons$ReorderCuratedListBottomSheetKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ReorderCuratedListBottomSheet {
    public static final ReorderCuratedListBottomSheet INSTANCE = new ReorderCuratedListBottomSheet();

    /* renamed from: lambda$-2037998069, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f9472lambda$2037998069 = ComposableLambda3.composableLambdaInstance(-2037998069, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.bottomsheet.ComposableSingletons$ReorderCuratedListBottomSheetKt$lambda$-2037998069$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2037998069, i2, -1, "com.robinhood.shared.portfolio.lists.ui.bottomsheet.ComposableSingletons$ReorderCuratedListBottomSheetKt.lambda$-2037998069.<anonymous> (ReorderCuratedListBottomSheet.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39419R.string.reorder_curated_list_bottom_sheet_title, composer, 0), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2037998069$lib_lists_ui_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m25606getLambda$2037998069$lib_lists_ui_externalDebug() {
        return f9472lambda$2037998069;
    }
}
