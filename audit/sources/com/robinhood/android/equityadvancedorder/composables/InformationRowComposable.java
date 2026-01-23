package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: InformationRowComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$InformationRowComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InformationRowComposable {
    public static final InformationRowComposable INSTANCE = new InformationRowComposable();

    /* renamed from: lambda$-117790200, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8909lambda$117790200 = ComposableLambda3.composableLambdaInstance(-117790200, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$InformationRowComposableKt$lambda$-117790200$1
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
                ComposerKt.traceEventStart(-117790200, i, -1, "com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$InformationRowComposableKt.lambda$-117790200.<anonymous> (InformationRowComposable.kt:126)");
            }
            StringResource.Companion companion = StringResource.INSTANCE;
            InformationRowComposable3.InformationRowComposable(new EquityOrderFormRowState.Information("testTag", companion.invoke("Market price"), companion.invoke("$12.34"), new EquityOrderFormRowState.Icon(ServerToBentoAssetMapper2.QUESTION_16, companion.invoke("Info"), EquityOrderFormRowState.Icon.IconId.BACKUP_WITHHOLDING), false, null, null, false, false, 496, null), null, null, composer, StringResource.$stable, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-117790200$lib_equity_advanced_order_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13769getLambda$117790200$lib_equity_advanced_order_externalDebug() {
        return f8909lambda$117790200;
    }
}
