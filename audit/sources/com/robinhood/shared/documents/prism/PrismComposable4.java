package com.robinhood.shared.documents.prism;

import android.content.Context;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PrismComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.documents.prism.PrismComposableKt$PrismComposable$2$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class PrismComposable4 extends FunctionReferenceImpl implements Function0<Unit> {
    PrismComposable4(Object obj) {
        super(0, obj, ContextsUiExtensions.class, "openAppSystemSettings", "openAppSystemSettings(Landroid/content/Context;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ContextsUiExtensions.openAppSystemSettings((Context) this.receiver);
    }
}
