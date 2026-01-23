package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import com.robinhood.staticcontent.model.OtherMarkdown;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownStateProvider.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDataState;", "", "otherMarkdown", "Lcom/robinhood/staticcontent/model/OtherMarkdown;", "requestComplete", "", "<init>", "(Lcom/robinhood/staticcontent/model/OtherMarkdown;Z)V", "getOtherMarkdown", "()Lcom/robinhood/staticcontent/model/OtherMarkdown;", "getRequestComplete", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class OtherMarkdownDataState {
    public static final int $stable = 8;
    private final OtherMarkdown otherMarkdown;
    private final boolean requestComplete;

    /* JADX WARN: Multi-variable type inference failed */
    public OtherMarkdownDataState() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OtherMarkdownDataState copy$default(OtherMarkdownDataState otherMarkdownDataState, OtherMarkdown otherMarkdown, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            otherMarkdown = otherMarkdownDataState.otherMarkdown;
        }
        if ((i & 2) != 0) {
            z = otherMarkdownDataState.requestComplete;
        }
        return otherMarkdownDataState.copy(otherMarkdown, z);
    }

    /* renamed from: component1, reason: from getter */
    public final OtherMarkdown getOtherMarkdown() {
        return this.otherMarkdown;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequestComplete() {
        return this.requestComplete;
    }

    public final OtherMarkdownDataState copy(OtherMarkdown otherMarkdown, boolean requestComplete) {
        return new OtherMarkdownDataState(otherMarkdown, requestComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherMarkdownDataState)) {
            return false;
        }
        OtherMarkdownDataState otherMarkdownDataState = (OtherMarkdownDataState) other;
        return Intrinsics.areEqual(this.otherMarkdown, otherMarkdownDataState.otherMarkdown) && this.requestComplete == otherMarkdownDataState.requestComplete;
    }

    public int hashCode() {
        OtherMarkdown otherMarkdown = this.otherMarkdown;
        return ((otherMarkdown == null ? 0 : otherMarkdown.hashCode()) * 31) + Boolean.hashCode(this.requestComplete);
    }

    public String toString() {
        return "OtherMarkdownDataState(otherMarkdown=" + this.otherMarkdown + ", requestComplete=" + this.requestComplete + ")";
    }

    public OtherMarkdownDataState(OtherMarkdown otherMarkdown, boolean z) {
        this.otherMarkdown = otherMarkdown;
        this.requestComplete = z;
    }

    public /* synthetic */ OtherMarkdownDataState(OtherMarkdown otherMarkdown, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : otherMarkdown, (i & 2) != 0 ? false : z);
    }

    public final OtherMarkdown getOtherMarkdown() {
        return this.otherMarkdown;
    }

    public final boolean getRequestComplete() {
        return this.requestComplete;
    }
}
