package com.robinhood.android.rollover401k;

import com.robinhood.models.serverdriven.experimental.api.RetirementRollover401KOptionDetailOpenAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kBasicScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0003JA\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/Rollover401kContent;", "", "title", "", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/RetirementRollover401KOptionDetailOpenAction;", Footer.f10637type, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getContent", "()Ljava/util/List;", "getFooter", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Rollover401kContent {
    public static final int $stable = 8;
    private final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> content;
    private final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> footer;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rollover401kContent copy$default(Rollover401kContent rollover401kContent, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rollover401kContent.title;
        }
        if ((i & 2) != 0) {
            list = rollover401kContent.content;
        }
        if ((i & 4) != 0) {
            list2 = rollover401kContent.footer;
        }
        return rollover401kContent.copy(str, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> component2() {
        return this.content;
    }

    public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> component3() {
        return this.footer;
    }

    public final Rollover401kContent copy(String title, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> content, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> footer) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer, "footer");
        return new Rollover401kContent(title, content, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rollover401kContent)) {
            return false;
        }
        Rollover401kContent rollover401kContent = (Rollover401kContent) other;
        return Intrinsics.areEqual(this.title, rollover401kContent.title) && Intrinsics.areEqual(this.content, rollover401kContent.content) && Intrinsics.areEqual(this.footer, rollover401kContent.footer);
    }

    public int hashCode() {
        String str = this.title;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.content.hashCode()) * 31) + this.footer.hashCode();
    }

    public String toString() {
        return "Rollover401kContent(title=" + this.title + ", content=" + this.content + ", footer=" + this.footer + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Rollover401kContent(String str, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> content, List<? extends UIComponent<? extends RetirementRollover401KOptionDetailOpenAction>> footer) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.title = str;
        this.content = content;
        this.footer = footer;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> getContent() {
        return this.content;
    }

    public final List<UIComponent<RetirementRollover401KOptionDetailOpenAction>> getFooter() {
        return this.footer;
    }
}
