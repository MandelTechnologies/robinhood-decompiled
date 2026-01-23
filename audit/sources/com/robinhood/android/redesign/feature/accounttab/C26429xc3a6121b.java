package com.robinhood.android.redesign.feature.accounttab;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$2$tabScrollConnection$1$7 */
/* loaded from: classes5.dex */
/* synthetic */ class C26429xc3a6121b extends FunctionReferenceImpl implements Function3<Float, Float, Float, Float> {
    public static final C26429xc3a6121b INSTANCE = new C26429xc3a6121b();

    C26429xc3a6121b() {
        super(3, Intrinsics.Kotlin.class, "calculateTabHeightProgress", "AccountSelectorComposable$calculateTabHeightProgress(FFF)F", 0);
    }

    public final Float invoke(float f, float f2, float f3) {
        return Float.valueOf(AccountSelectorComposableKt.AccountSelectorComposable$calculateTabHeightProgress(f, f2, f3));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Float invoke(Float f, Float f2, Float f3) {
        return invoke(f.floatValue(), f2.floatValue(), f3.floatValue());
    }
}
