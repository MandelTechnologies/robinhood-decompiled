package com.robinhood.utils.extensions;

import android.renderscript.BaseObj;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RenderScript.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0005H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m3636d2 = {"use", "R", "T", "Landroid/renderscript/BaseObj;", "block", "Lkotlin/Function1;", "(Landroid/renderscript/BaseObj;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-utils-android_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.extensions.RenderScriptKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class RenderScript {
    public static final <T extends BaseObj, R> R use(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(t);
        } finally {
            InlineMarker.finallyStart(1);
            t.destroy();
            InlineMarker.finallyEnd(1);
        }
    }
}
