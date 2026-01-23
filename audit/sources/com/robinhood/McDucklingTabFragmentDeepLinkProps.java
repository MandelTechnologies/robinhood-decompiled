package com.robinhood;

import io.reactivex.subjects.BehaviorSubject;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: McDucklingTabFragmentDeepLinkProps.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u0018\u0010\r\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/McDucklingTabFragmentDeepLinkProps;", "", "showCardActionsFromLink", "Lio/reactivex/subjects/BehaviorSubject;", "", "getShowCardActionsFromLink", "()Lio/reactivex/subjects/BehaviorSubject;", "setShowCardActionsFromLink", "(Lio/reactivex/subjects/BehaviorSubject;)V", "scrollToFromLink", "", "getScrollToFromLink", "setScrollToFromLink", "source", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "feature-lib-mcduckling-deep-link"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface McDucklingTabFragmentDeepLinkProps {
    BehaviorSubject<String> getScrollToFromLink();

    BehaviorSubject<Unit> getShowCardActionsFromLink();

    String getSource();

    void setScrollToFromLink(BehaviorSubject<String> behaviorSubject);

    void setShowCardActionsFromLink(BehaviorSubject<Unit> behaviorSubject);

    void setSource(String str);
}
