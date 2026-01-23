package com.robinhood.android.support.appointments;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.appointments.ComposableSingletons$AppointmentsSchedulingDatetimePickerComposableKt */
/* loaded from: classes9.dex */
public final class C28868x18e1cb76 {
    public static final C28868x18e1cb76 INSTANCE = new C28868x18e1cb76();

    /* renamed from: lambda$-2000527975, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9252lambda$2000527975 = ComposableLambda3.composableLambdaInstance(-2000527975, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.appointments.ComposableSingletons$AppointmentsSchedulingDatetimePickerComposableKt$lambda$-2000527975$1
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
                ComposerKt.traceEventStart(-2000527975, i, -1, "com.robinhood.android.support.appointments.ComposableSingletons$AppointmentsSchedulingDatetimePickerComposableKt.lambda$-2000527975.<anonymous> (AppointmentsSchedulingDatetimePickerComposable.kt:269)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2000527975$feature_support_externalRelease, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m19048getLambda$2000527975$feature_support_externalRelease() {
        return f9252lambda$2000527975;
    }
}
