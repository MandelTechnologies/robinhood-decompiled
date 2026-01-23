package com.robinhood.android.acats.plaid.transfer.unsupported;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.acats.C7376R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsInPlaidUnsupportedAssetsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsFragmentKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsFragment3 {
    public static final AcatsInPlaidUnsupportedAssetsFragment3 INSTANCE = new AcatsInPlaidUnsupportedAssetsFragment3();

    /* renamed from: lambda$-588156973, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8605lambda$588156973 = ComposableLambda3.composableLambdaInstance(-588156973, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsFragmentKt$lambda$-588156973$1
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
                ComposerKt.traceEventStart(-588156973, i, -1, "com.robinhood.android.acats.plaid.transfer.unsupported.ComposableSingletons$AcatsInPlaidUnsupportedAssetsFragmentKt.lambda$-588156973.<anonymous> (AcatsInPlaidUnsupportedAssetsFragment.kt:71)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7376R.string.acats_plaid_unsupported_assets_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-588156973$lib_acats_plaid_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m10674getLambda$588156973$lib_acats_plaid_externalDebug() {
        return f8605lambda$588156973;
    }
}
