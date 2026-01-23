package com.robinhood.shared.common.etpcomposition;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhvFundBreakdownSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.etpcomposition.ComposableSingletons$RhvFundBreakdownSectionKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class RhvFundBreakdownSection {
    public static final RhvFundBreakdownSection INSTANCE = new RhvFundBreakdownSection();

    /* renamed from: lambda$-2069865896, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9388lambda$2069865896 = ComposableLambda3.composableLambdaInstance(-2069865896, false, RhvFundBreakdownSection2.INSTANCE);

    /* renamed from: lambda$-342029071, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9389lambda$342029071 = ComposableLambda3.composableLambdaInstance(-342029071, false, RhvFundBreakdownSection3.INSTANCE);

    /* renamed from: getLambda$-2069865896$lib_etp_composition_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24825getLambda$2069865896$lib_etp_composition_externalDebug() {
        return f9388lambda$2069865896;
    }

    /* renamed from: getLambda$-342029071$lib_etp_composition_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m24826getLambda$342029071$lib_etp_composition_externalDebug() {
        return f9389lambda$342029071;
    }
}
