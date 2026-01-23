package com.robinhood.android.crypto.tab.p093ui.interest;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeInterestDataState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/interest/TextWithPartialHighlight;", "", "preHighlight", "Lcom/robinhood/utils/resource/StringResource;", "highlight", "postHighlight", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getPreHighlight", "()Lcom/robinhood/utils/resource/StringResource;", "getHighlight", "getPostHighlight", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextWithPartialHighlight {
    public static final int $stable = StringResource.$stable;
    private final StringResource highlight;
    private final StringResource postHighlight;
    private final StringResource preHighlight;

    public static /* synthetic */ TextWithPartialHighlight copy$default(TextWithPartialHighlight textWithPartialHighlight, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = textWithPartialHighlight.preHighlight;
        }
        if ((i & 2) != 0) {
            stringResource2 = textWithPartialHighlight.highlight;
        }
        if ((i & 4) != 0) {
            stringResource3 = textWithPartialHighlight.postHighlight;
        }
        return textWithPartialHighlight.copy(stringResource, stringResource2, stringResource3);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getPreHighlight() {
        return this.preHighlight;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getHighlight() {
        return this.highlight;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getPostHighlight() {
        return this.postHighlight;
    }

    public final TextWithPartialHighlight copy(StringResource preHighlight, StringResource highlight, StringResource postHighlight) {
        Intrinsics.checkNotNullParameter(preHighlight, "preHighlight");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        Intrinsics.checkNotNullParameter(postHighlight, "postHighlight");
        return new TextWithPartialHighlight(preHighlight, highlight, postHighlight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextWithPartialHighlight)) {
            return false;
        }
        TextWithPartialHighlight textWithPartialHighlight = (TextWithPartialHighlight) other;
        return Intrinsics.areEqual(this.preHighlight, textWithPartialHighlight.preHighlight) && Intrinsics.areEqual(this.highlight, textWithPartialHighlight.highlight) && Intrinsics.areEqual(this.postHighlight, textWithPartialHighlight.postHighlight);
    }

    public int hashCode() {
        return (((this.preHighlight.hashCode() * 31) + this.highlight.hashCode()) * 31) + this.postHighlight.hashCode();
    }

    public String toString() {
        return "TextWithPartialHighlight(preHighlight=" + this.preHighlight + ", highlight=" + this.highlight + ", postHighlight=" + this.postHighlight + ")";
    }

    public TextWithPartialHighlight(StringResource preHighlight, StringResource highlight, StringResource postHighlight) {
        Intrinsics.checkNotNullParameter(preHighlight, "preHighlight");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        Intrinsics.checkNotNullParameter(postHighlight, "postHighlight");
        this.preHighlight = preHighlight;
        this.highlight = highlight;
        this.postHighlight = postHighlight;
    }

    public final StringResource getPreHighlight() {
        return this.preHighlight;
    }

    public final StringResource getHighlight() {
        return this.highlight;
    }

    public final StringResource getPostHighlight() {
        return this.postHighlight;
    }
}
