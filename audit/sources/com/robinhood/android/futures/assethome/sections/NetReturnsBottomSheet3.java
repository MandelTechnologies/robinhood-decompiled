package com.robinhood.android.futures.assethome.sections;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NetReturnsBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.assethome.sections.ComposableSingletons$NetReturnsBottomSheetKt$lambda$848361911$1, reason: use source file name */
/* loaded from: classes3.dex */
final class NetReturnsBottomSheet3 implements Function2<Composer, Integer, Unit> {
    public static final NetReturnsBottomSheet3 INSTANCE = new NetReturnsBottomSheet3();

    NetReturnsBottomSheet3() {
    }

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
            ComposerKt.traceEventStart(848361911, i, -1, "com.robinhood.android.futures.assethome.sections.ComposableSingletons$NetReturnsBottomSheetKt.lambda$848361911.<anonymous> (NetReturnsBottomSheet.kt:190)");
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        NetReturnsBottomSheetViewState netReturnsBottomSheetViewState = new NetReturnsBottomSheetViewState(companion.invoke("+$155.00"), companion.invoke("Past week's P&L"), companion.invoke("+$160.00"), companion.invoke("-$2.00"), companion.invoke("-$3.00"));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.assethome.sections.ComposableSingletons$NetReturnsBottomSheetKt$lambda$848361911$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        NetReturnsBottomSheet4.NetReturnsBottomSheet(netReturnsBottomSheetViewState, null, null, (Function0) objRememberedValue, composer, StringResource.$stable | 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
