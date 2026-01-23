package com.robinhood.compose.common;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.compose.common.C11933R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: SwipeToDeleteRow.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/compose/common/SwipeToDeleteRowDefaults;", "", "<init>", "()V", "state", "Lcom/robinhood/compose/common/SwipeToDeleteRowState;", "getState", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/common/SwipeToDeleteRowState;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.common.SwipeToDeleteRowDefaults, reason: use source file name */
/* loaded from: classes15.dex */
public final class SwipeToDeleteRow {
    public static final int $stable = 0;
    public static final SwipeToDeleteRow INSTANCE = new SwipeToDeleteRow();

    private SwipeToDeleteRow() {
    }

    @JvmName
    public final SwipeToDeleteRowState getState(Composer composer, int i) {
        composer.startReplaceGroup(-207887668);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-207887668, i, -1, "com.robinhood.compose.common.SwipeToDeleteRowDefaults.<get-state> (SwipeToDeleteRow.kt:78)");
        }
        SwipeToDeleteRowState swipeToDeleteRowState = new SwipeToDeleteRowState(StringResources_androidKt.stringResource(C11933R.string.swipe_to_delete_label, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return swipeToDeleteRowState;
    }
}
