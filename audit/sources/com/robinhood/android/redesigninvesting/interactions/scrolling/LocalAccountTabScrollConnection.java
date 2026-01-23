package com.robinhood.android.redesigninvesting.interactions.scrolling;

import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: LocalAccountTabScrollConnection.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0019\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalAccountTabScrollConnection", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getLocalAccountTabScrollConnection", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-interactions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollConnectionKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class LocalAccountTabScrollConnection {
    private static final CompositionLocal6<NestedScrollModifier> LocalAccountTabScrollConnection = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.LocalAccountTabScrollConnectionKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LocalAccountTabScrollConnection.LocalAccountTabScrollConnection$lambda$0();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestedScrollModifier LocalAccountTabScrollConnection$lambda$0() {
        return null;
    }

    public static final CompositionLocal6<NestedScrollModifier> getLocalAccountTabScrollConnection() {
        return LocalAccountTabScrollConnection;
    }
}
