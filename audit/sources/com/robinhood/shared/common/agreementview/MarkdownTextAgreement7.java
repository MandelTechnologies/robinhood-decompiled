package com.robinhood.shared.common.agreementview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownTextAgreement.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/common/agreementview/SecondaryButton;", "", "buttonText", "", "onClick", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getButtonText", "()Ljava/lang/String;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "lib-agreement-view_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.common.agreementview.SecondaryButton, reason: use source file name */
/* loaded from: classes26.dex */
public final class MarkdownTextAgreement7 {
    public static final int $stable = 0;
    private final String buttonText;
    private final Function0<Unit> onClick;

    public MarkdownTextAgreement7(String buttonText, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.buttonText = buttonText;
        this.onClick = onClick;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }
}
