package com.robinhood.compose.bento.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoTabBar.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/TabPreviewData;", "", "state", "Lcom/robinhood/compose/bento/component/BentoTabBarState;", "isCrypto", "", "isDay", "isShowPlaceholder", "<init>", "(Lcom/robinhood/compose/bento/component/BentoTabBarState;ZZZ)V", "getState", "()Lcom/robinhood/compose/bento/component/BentoTabBarState;", "()Z", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.TabPreviewData, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoTabBar7 {
    private final boolean isCrypto;
    private final boolean isDay;
    private final boolean isShowPlaceholder;
    private final BentoTabBarState state;

    public BentoTabBar7(BentoTabBarState state, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        this.isCrypto = z;
        this.isDay = z2;
        this.isShowPlaceholder = z3;
    }

    public final BentoTabBarState getState() {
        return this.state;
    }

    /* renamed from: isCrypto, reason: from getter */
    public final boolean getIsCrypto() {
        return this.isCrypto;
    }

    /* renamed from: isDay, reason: from getter */
    public final boolean getIsDay() {
        return this.isDay;
    }

    /* renamed from: isShowPlaceholder, reason: from getter */
    public final boolean getIsShowPlaceholder() {
        return this.isShowPlaceholder;
    }
}
