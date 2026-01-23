package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GoogleMap.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.google.maps.android.compose.ComposableSingletons$GoogleMapKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class GoogleMap2 {
    public static final GoogleMap2 INSTANCE = new GoogleMap2();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f8594lambda1 = ComposableLambda3.composableLambdaInstance(-830281933, false, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposableSingletons$GoogleMapKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830281933, i, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda-1.<anonymous> (GoogleMap.kt:91)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f8595lambda2 = ComposableLambda3.composableLambdaInstance(-186221473, false, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.ComposableSingletons$GoogleMapKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-186221473, i, -1, "com.google.maps.android.compose.ComposableSingletons$GoogleMapKt.lambda-2.<anonymous> (GoogleMap.kt:250)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$maps_compose_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m9314getLambda1$maps_compose_release() {
        return f8594lambda1;
    }
}
