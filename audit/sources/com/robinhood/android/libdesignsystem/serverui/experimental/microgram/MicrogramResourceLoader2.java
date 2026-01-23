package com.robinhood.android.libdesignsystem.serverui.experimental.microgram;

import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MicrogramResourceLoader.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"LocalMicrogramResourceLoader", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/microgram/MicrogramResourceLoader;", "getLocalMicrogramResourceLoader", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoaderKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MicrogramResourceLoader2 {
    private static final CompositionLocal6<MicrogramResourceLoader> LocalMicrogramResourceLoader = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoaderKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new MicrogramResourceLoader() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoaderKt$LocalMicrogramResourceLoader$1$1
                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.microgram.MicrogramResourceLoader
                public final byte[] load(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            };
        }
    });

    public static final CompositionLocal6<MicrogramResourceLoader> getLocalMicrogramResourceLoader() {
        return LocalMicrogramResourceLoader;
    }
}
