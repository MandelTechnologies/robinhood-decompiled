package com.robinhood.compose.bento.component;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TopBarScrollState.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.TopBarScrollState$Companion$Saver$2, reason: use source file name */
/* loaded from: classes15.dex */
/* synthetic */ class TopBarScrollState2 extends FunctionReferenceImpl implements Function1<Float, TopBarScrollState> {
    public static final TopBarScrollState2 INSTANCE = new TopBarScrollState2();

    TopBarScrollState2() {
        super(1, TopBarScrollState.class, "<init>", "<init>(F)V", 0);
    }

    public final TopBarScrollState invoke(float f) {
        return new TopBarScrollState(f);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TopBarScrollState invoke(Float f) {
        return invoke(f.floatValue());
    }
}
