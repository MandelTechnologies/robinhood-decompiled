package com.robinhood.android.microgramsdui;

import com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramEmbeddedSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.microgramsdui.MicrogramEmbeddedSectionKt$sam$com_robinhood_android_libdesignsystem_serverui_experimental_microgram_MicrogramResourceLoader$0, reason: use source file name */
/* loaded from: classes8.dex */
final class MicrogramEmbeddedSection8 implements MicrogramResourceLoader, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    MicrogramEmbeddedSection8(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof MicrogramResourceLoader) && (obj instanceof FunctionAdapter)) {
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

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader
    public final /* synthetic */ byte[] load(String str) {
        return (byte[]) this.function.invoke(str);
    }
}
