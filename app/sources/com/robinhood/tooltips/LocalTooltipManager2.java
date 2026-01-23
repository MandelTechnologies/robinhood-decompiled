package com.robinhood.tooltips;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import com.robinhood.hammer.android.EntryPoints;
import com.robinhood.utils.p409ui.context.BaseContexts;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LocalTooltipManager.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0004R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerCompositionLocal;", "", "delegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/tooltips/TooltipManager;", "<init>", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)V", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/tooltips/TooltipManager;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "value", "EntryPoint", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.tooltips.TooltipManagerCompositionLocal, reason: use source file name */
/* loaded from: classes12.dex */
public final class LocalTooltipManager2 {
    public static final int $stable = 0;
    private final CompositionLocal6<TooltipManager> delegate;

    /* compiled from: LocalTooltipManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManagerCompositionLocal$EntryPoint;", "", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.tooltips.TooltipManagerCompositionLocal$EntryPoint */
    /* loaded from: classes21.dex */
    public interface EntryPoint {
        TooltipManager getTooltipManager();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalTooltipManager2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TooltipManager _init_$lambda$0() {
        return null;
    }

    public LocalTooltipManager2(CompositionLocal6<TooltipManager> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ LocalTooltipManager2(CompositionLocal6 compositionLocal6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.tooltips.TooltipManagerCompositionLocal$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalTooltipManager2._init_$lambda$0();
            }
        }) : compositionLocal6);
    }

    @JvmName
    public final TooltipManager getCurrent(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1034246894, i, -1, "com.robinhood.tooltips.TooltipManagerCompositionLocal.<get-current> (LocalTooltipManager.kt:21)");
        }
        TooltipManager tooltipManager = (TooltipManager) composer.consume(this.delegate);
        if (tooltipManager == null) {
            tooltipManager = ((EntryPoint) EntryPoints.entryPoint(BaseContexts.requireActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())))).getTooltipManager();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tooltipManager;
    }

    public final ProvidedValue<TooltipManager> provides(TooltipManager value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.provides(value);
    }
}
