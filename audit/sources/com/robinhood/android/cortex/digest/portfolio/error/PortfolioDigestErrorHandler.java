package com.robinhood.android.cortex.digest.portfolio.error;

import android.content.Context;
import com.robinhood.android.common.util.p090rx.ContextErrorHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0014J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005H\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/error/PortfolioDigestErrorHandler;", "Lcom/robinhood/android/common/util/rx/ContextErrorHandler;", "", "onShowError", "Lkotlin/Function1;", "", "", "context", "Landroid/content/Context;", "<init>", "(Lkotlin/jvm/functions/Function1;Landroid/content/Context;)V", "showShortError", "message", "showLongError", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PortfolioDigestErrorHandler extends ContextErrorHandler<Object> {
    public static final int $stable = ContextErrorHandler.$stable;
    private final Function1<String, Unit> onShowError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PortfolioDigestErrorHandler(Function1<? super String, Unit> onShowError, Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(onShowError, "onShowError");
        Intrinsics.checkNotNullParameter(context, "context");
        this.onShowError = onShowError;
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler
    protected void showShortError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        showLongError(message);
    }

    @Override // com.robinhood.android.common.util.p090rx.ContextErrorHandler
    protected void showLongError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.onShowError.invoke(message);
    }
}
