package com.robinhood.android.taxcenter.viewdocument;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DocumentDownloadComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt$lambda$-921187833$1, reason: use source file name */
/* loaded from: classes9.dex */
final class DocumentDownloadComposable3 implements Function2<Composer, Integer, Unit> {
    public static final DocumentDownloadComposable3 INSTANCE = new DocumentDownloadComposable3();

    DocumentDownloadComposable3() {
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
            ComposerKt.traceEventStart(-921187833, i, -1, "com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt.lambda$-921187833.<anonymous> (DocumentDownloadComposable.kt:69)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt$lambda$-921187833$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.taxcenter.viewdocument.ComposableSingletons$DocumentDownloadComposableKt$lambda$-921187833$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        DocumentDownloadComposable4.DocumentDownloadComposable("filename.pdf", function0, (Function0) objRememberedValue2, composer, 438);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
