package com.google.accompanist.pager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pager.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/google/accompanist/pager/PagerScopeImpl;", "Lcom/google/accompanist/pager/PagerScope;", "Lcom/google/accompanist/pager/PagerState;", "state", "<init>", "(Lcom/google/accompanist/pager/PagerState;)V", "Lcom/google/accompanist/pager/PagerState;", "pager_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final class PagerScopeImpl implements PagerScope {
    private final PagerState state;

    public PagerScopeImpl(PagerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
    }
}
