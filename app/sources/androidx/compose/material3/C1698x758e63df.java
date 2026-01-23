package androidx.compose.material3;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color3;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextFieldDefaults.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: androidx.compose.material3.TextFieldDefaults$sam$androidx_compose_ui_graphics_ColorProducer$0 */
/* loaded from: classes4.dex */
final class C1698x758e63df implements Color3, FunctionAdapter {
    private final /* synthetic */ Function0 function;

    C1698x758e63df(Function0 function0) {
        this.function = function0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Color3) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.p011ui.graphics.Color3
    /* renamed from: invoke-0d7_KjU */
    public final /* synthetic */ long mo5580invoke0d7_KjU() {
        return ((Color) this.function.invoke()).getValue();
    }
}
