package com.robinhood.android.acats.acatsclawbackdetails;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferBonusRemovalDetails.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.acatsclawbackdetails.ComposableSingletons$CreateTransferBonusRemovalDetailsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class CreateTransferBonusRemovalDetails {
    public static final CreateTransferBonusRemovalDetails INSTANCE = new CreateTransferBonusRemovalDetails();

    /* renamed from: lambda$-866421750, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8597lambda$866421750 = ComposableLambda3.composableLambdaInstance(-866421750, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.ComposableSingletons$CreateTransferBonusRemovalDetailsKt$lambda$-866421750$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-866421750, i, -1, "com.robinhood.android.acats.acatsclawbackdetails.ComposableSingletons$CreateTransferBonusRemovalDetailsKt.lambda$-866421750.<anonymous> (CreateTransferBonusRemovalDetails.kt:84)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-402852555, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8596lambda$402852555 = ComposableLambda3.composableLambdaInstance(-402852555, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.acatsclawbackdetails.ComposableSingletons$CreateTransferBonusRemovalDetailsKt$lambda$-402852555$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-402852555, i, -1, "com.robinhood.android.acats.acatsclawbackdetails.ComposableSingletons$CreateTransferBonusRemovalDetailsKt.lambda$-402852555.<anonymous> (CreateTransferBonusRemovalDetails.kt:111)");
            }
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-402852555$feature_acats_clawback_details_externalDebug */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m1693x7c883f30() {
        return f8596lambda$402852555;
    }

    /* renamed from: getLambda$-866421750$feature_acats_clawback_details_externalDebug */
    public final Function2<Composer, Integer, Unit> m1694xdd45486f() {
        return f8597lambda$866421750;
    }
}
