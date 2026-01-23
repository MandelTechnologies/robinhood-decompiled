package com.robinhood.compose.bento.component.text;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Markdown.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0004R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/text/MarkwonCompositionLocal;", "", "delegate", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lio/noties/markwon/Markwon;", "<init>", "(Landroidx/compose/runtime/ProvidableCompositionLocal;)V", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Lio/noties/markwon/Markwon;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "value", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.MarkwonCompositionLocal, reason: use source file name */
/* loaded from: classes15.dex */
public final class Markdown4 {
    public static final int $stable = 0;
    private final CompositionLocal6<Markwon> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public Markdown4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Markwon _init_$lambda$0() {
        return null;
    }

    public Markdown4(CompositionLocal6<Markwon> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    public /* synthetic */ Markdown4(CompositionLocal6 compositionLocal6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.compose.bento.component.text.MarkwonCompositionLocal$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Markdown4._init_$lambda$0();
            }
        }) : compositionLocal6);
    }

    @JvmName
    public final Markwon getCurrent(Composer composer, int i) {
        ComponentCallbacks2 componentCallbacks2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1156372486, i, -1, "com.robinhood.compose.bento.component.text.MarkwonCompositionLocal.<get-current> (Markdown.kt:37)");
        }
        Markwon markwon = (Markwon) composer.consume(this.delegate);
        if (markwon == null) {
            Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            markwon = ((Markdown2) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).markwon();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return markwon;
    }

    public final ProvidedValue<Markwon> provides(Markwon value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.provides(value);
    }
}
