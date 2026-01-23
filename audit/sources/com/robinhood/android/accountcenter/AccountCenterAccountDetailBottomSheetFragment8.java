package com.robinhood.android.accountcenter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountCenterAccountDetailBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.ComposableSingletons$AccountCenterAccountDetailBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountCenterAccountDetailBottomSheetFragment8 {
    public static final AccountCenterAccountDetailBottomSheetFragment8 INSTANCE = new AccountCenterAccountDetailBottomSheetFragment8();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1481746412 = ComposableLambda3.composableLambdaInstance(1481746412, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.accountcenter.ComposableSingletons$AccountCenterAccountDetailBottomSheetFragmentKt$lambda$1481746412$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1481746412, i, -1, "com.robinhood.android.accountcenter.ComposableSingletons$AccountCenterAccountDetailBottomSheetFragmentKt.lambda$1481746412.<anonymous> (AccountCenterAccountDetailBottomSheetFragment.kt:168)");
            }
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), 1, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1481746412$feature_account_center_externalDebug() {
        return lambda$1481746412;
    }
}
