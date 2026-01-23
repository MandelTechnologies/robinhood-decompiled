package com.robinhood.android.paycheckhub.p213ui;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckHubViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/PaycheckHubSubtitleState;", "", "isEarlyPayIconVisible", "", "content", "", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(ZLjava/util/List;)V", "()Z", "getContent", "()Ljava/util/List;", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckHubSubtitleState, reason: use source file name */
/* loaded from: classes11.dex */
public final class PaycheckHubViewState2 {
    public static final int $stable = 8;
    private final List<StringResource> content;
    private final boolean isEarlyPayIconVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public PaycheckHubViewState2(boolean z, List<? extends StringResource> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.isEarlyPayIconVisible = z;
        this.content = content;
    }

    /* renamed from: isEarlyPayIconVisible, reason: from getter */
    public final boolean getIsEarlyPayIconVisible() {
        return this.isEarlyPayIconVisible;
    }

    public final List<StringResource> getContent() {
        return this.content;
    }
}
