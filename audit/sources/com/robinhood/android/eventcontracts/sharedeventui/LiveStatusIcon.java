package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LiveStatusIcon.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LiveStatusIconKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LiveStatusIcon {
    public static final LiveStatusIcon INSTANCE = new LiveStatusIcon();
    private static Function2<Composer, Integer, Unit> lambda$1622320102 = ComposableLambda3.composableLambdaInstance(1622320102, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LiveStatusIconKt$lambda$1622320102$1
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
                ComposerKt.traceEventStart(1622320102, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LiveStatusIconKt.lambda$1622320102.<anonymous> (LiveStatusIcon.kt:112)");
            }
            LiveStatusIcon5.m14380LiveStatusIconPZHvWI(null, 0.0f, 0L, null, composer, 0, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$42250022 = ComposableLambda3.composableLambdaInstance(42250022, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LiveStatusIconKt$lambda$42250022$1
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
                ComposerKt.traceEventStart(42250022, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.ComposableSingletons$LiveStatusIconKt.lambda$42250022.<anonymous> (LiveStatusIcon.kt:109)");
            }
            CompositionLocal3.CompositionLocalProvider(LiveStatusIcon5.getLocalLiveStatusIconAnimation().provides(LiveStatusIcon5.rememberLiveStatusIconAnimation(composer, 0)), LiveStatusIcon.INSTANCE.getLambda$1622320102$lib_shared_event_ui_externalDebug(), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1622320102$lib_shared_event_ui_externalDebug() {
        return lambda$1622320102;
    }

    public final Function2<Composer, Integer, Unit> getLambda$42250022$lib_shared_event_ui_externalDebug() {
        return lambda$42250022;
    }
}
