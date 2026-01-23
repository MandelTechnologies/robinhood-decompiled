package com.robinhood.android.prompts;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PromptsHandlingComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.prompts.PromptsHandlingComposableKt$PromptsHandlingScreenPreview$1$1, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PromptsHandlingComposable7 extends FunctionReferenceImpl implements Function1<Integer, String> {
    PromptsHandlingComposable7(Object obj) {
        super(1, obj, Context.class, "getString", "getString(I)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i) {
        return ((Context) this.receiver).getString(i);
    }
}
