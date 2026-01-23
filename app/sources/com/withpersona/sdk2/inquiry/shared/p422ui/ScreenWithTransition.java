package com.withpersona.sdk2.inquiry.shared.p422ui;

import com.robinhood.android.navigation.compose.NavTransition2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenWithTransition.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenWithTransition;", "", "screen", NavTransition2.KEY_TRANSITION, "Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenTransition;", "<init>", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenTransition;)V", "getScreen", "()Ljava/lang/Object;", "getTransition", "()Lcom/withpersona/sdk2/inquiry/shared/ui/ScreenTransition;", "shared_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ScreenWithTransition {
    private final Object screen;
    private final ScreenWithTransition2 transition;

    public ScreenWithTransition(Object screen, ScreenWithTransition2 transition) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.screen = screen;
        this.transition = transition;
    }

    public final Object getScreen() {
        return this.screen;
    }

    public final ScreenWithTransition2 getTransition() {
        return this.transition;
    }
}
