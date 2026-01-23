package com.robinhood.android.acatsin.agreement;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInAgreementComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.agreement.ComposableSingletons$AcatsInAgreementComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInAgreementComposable8 {
    public static final AcatsInAgreementComposable8 INSTANCE = new AcatsInAgreementComposable8();

    /* renamed from: lambda$-1829126614, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8607lambda$1829126614 = ComposableLambda3.composableLambdaInstance(-1829126614, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.agreement.ComposableSingletons$AcatsInAgreementComposableKt$lambda$-1829126614$1
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
                ComposerKt.traceEventStart(-1829126614, i, -1, "com.robinhood.android.acatsin.agreement.ComposableSingletons$AcatsInAgreementComposableKt.lambda$-1829126614.<anonymous> (AcatsInAgreementComposable.kt:110)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.agreement_title, composer, 0), TestTag3.testTag(Modifier.INSTANCE, AcatsInAgreementComposable.TitleTestTag), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleSmall(), composer, 48, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1829126614$lib_acats_ui_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m10700getLambda$1829126614$lib_acats_ui_externalDebug() {
        return f8607lambda$1829126614;
    }
}
