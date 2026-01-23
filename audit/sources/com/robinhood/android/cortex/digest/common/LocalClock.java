package com.robinhood.android.cortex.digest.common;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;

/* compiled from: LocalClock.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/common/ClockCompositionLocal;", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "j$/time/Clock", "delegate", "<init>", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)V", "value", "Landroidx/compose/runtime/ProvidedValue;", "provides", "(Lj$/time/Clock;)Landroidx/compose/runtime/ProvidedValue;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lj$/time/Clock;", "current", "lib-cortex-digest-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.ClockCompositionLocal, reason: use source file name */
/* loaded from: classes2.dex */
public final class LocalClock {
    public static final int $stable = 0;
    private final CompositionLocal6<Clock> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Clock _init_$lambda$0() {
        return null;
    }

    public LocalClock(CompositionLocal6<Clock> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ LocalClock(CompositionLocal6 compositionLocal6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.cortex.digest.common.ClockCompositionLocal$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalClock._init_$lambda$0();
            }
        }) : compositionLocal6);
    }

    @JvmName
    public final Clock getCurrent(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1947274507, i, -1, "com.robinhood.android.cortex.digest.common.ClockCompositionLocal.<get-current> (LocalClock.kt:25)");
        }
        Clock clock = (Clock) composer.consume(this.delegate);
        if (clock == null) {
            clock = LocalClock3.clockEntryPoint((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).clock();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return clock;
    }

    public final ProvidedValue<Clock> provides(Clock value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.provides(value);
    }
}
