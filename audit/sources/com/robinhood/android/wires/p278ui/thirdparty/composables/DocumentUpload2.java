package com.robinhood.android.wires.p278ui.thirdparty.composables;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DocumentUpload.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"DocumentUpload", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-wires_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.wires.ui.thirdparty.composables.DocumentUploadKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class DocumentUpload2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocumentUpload$lambda$0(int i, Composer composer, int i2) {
        DocumentUpload(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DocumentUpload(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1455547005);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1455547005, i, -1, "com.robinhood.android.wires.ui.thirdparty.composables.DocumentUpload (DocumentUpload.kt:5)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.wires.ui.thirdparty.composables.DocumentUploadKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocumentUpload2.DocumentUpload$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
