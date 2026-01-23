package com.robinhood.android.securitycenter.p251ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SecurityCenterComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.securitycenter.ui.ComposableSingletons$SecurityCenterComposableKt$lambda$-1727763825$1 */
/* loaded from: classes5.dex */
final class C28189x83e91379 implements Function2<Composer, Integer, Unit> {
    public static final C28189x83e91379 INSTANCE = new C28189x83e91379();

    C28189x83e91379() {
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
            ComposerKt.traceEventStart(-1727763825, i, -1, "com.robinhood.android.securitycenter.ui.ComposableSingletons$SecurityCenterComposableKt.lambda$-1727763825.<anonymous> (SecurityCenterComposable.kt:462)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.ComposableSingletons$SecurityCenterComposableKt$lambda$-1727763825$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        SecurityCenterComposableKt.SuccessPasskeysBottomSheetContent((Function0) objRememberedValue, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
