package com.robinhood.android.trade.configuration.disclosure;

import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderConfigurationDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/trade/configuration/disclosure/OrderConfigurationDisclosureViewState;", "", "title", "", "content", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-trade-configuration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderConfigurationDisclosureViewState {
    public static final int $stable = 8;
    private final MarkdownContent content;
    private final String title;

    public static /* synthetic */ OrderConfigurationDisclosureViewState copy$default(OrderConfigurationDisclosureViewState orderConfigurationDisclosureViewState, String str, MarkdownContent markdownContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderConfigurationDisclosureViewState.title;
        }
        if ((i & 2) != 0) {
            markdownContent = orderConfigurationDisclosureViewState.content;
        }
        return orderConfigurationDisclosureViewState.copy(str, markdownContent);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final MarkdownContent getContent() {
        return this.content;
    }

    public final OrderConfigurationDisclosureViewState copy(String title, MarkdownContent content) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new OrderConfigurationDisclosureViewState(title, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderConfigurationDisclosureViewState)) {
            return false;
        }
        OrderConfigurationDisclosureViewState orderConfigurationDisclosureViewState = (OrderConfigurationDisclosureViewState) other;
        return Intrinsics.areEqual(this.title, orderConfigurationDisclosureViewState.title) && Intrinsics.areEqual(this.content, orderConfigurationDisclosureViewState.content);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        MarkdownContent markdownContent = this.content;
        return iHashCode + (markdownContent == null ? 0 : markdownContent.hashCode());
    }

    public String toString() {
        return "OrderConfigurationDisclosureViewState(title=" + this.title + ", content=" + this.content + ")";
    }

    public OrderConfigurationDisclosureViewState(String title, MarkdownContent markdownContent) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.content = markdownContent;
    }

    public final String getTitle() {
        return this.title;
    }

    public final MarkdownContent getContent() {
        return this.content;
    }
}
