package com.robinhood.android.transfers.p271ui.composecomponents;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OutgoingWireMemoEntryScreen.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData;", "", "titleText", "Lcom/robinhood/utils/resource/StringResource;", "memoText", "", "subtitleText", "memoHint", "primaryButtonText", "secondaryButtonText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getTitleText", "()Lcom/robinhood/utils/resource/StringResource;", "getMemoText", "()Ljava/lang/String;", "getSubtitleText", "getMemoHint", "getPrimaryButtonText", "getSecondaryButtonText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OutgoingWireMemoEntryData {
    private final StringResource memoHint;
    private final String memoText;
    private final StringResource primaryButtonText;
    private final StringResource secondaryButtonText;
    private final StringResource subtitleText;
    private final StringResource titleText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    public static /* synthetic */ OutgoingWireMemoEntryData copy$default(OutgoingWireMemoEntryData outgoingWireMemoEntryData, StringResource stringResource, String str, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, StringResource stringResource5, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = outgoingWireMemoEntryData.titleText;
        }
        if ((i & 2) != 0) {
            str = outgoingWireMemoEntryData.memoText;
        }
        if ((i & 4) != 0) {
            stringResource2 = outgoingWireMemoEntryData.subtitleText;
        }
        if ((i & 8) != 0) {
            stringResource3 = outgoingWireMemoEntryData.memoHint;
        }
        if ((i & 16) != 0) {
            stringResource4 = outgoingWireMemoEntryData.primaryButtonText;
        }
        if ((i & 32) != 0) {
            stringResource5 = outgoingWireMemoEntryData.secondaryButtonText;
        }
        StringResource stringResource6 = stringResource4;
        StringResource stringResource7 = stringResource5;
        return outgoingWireMemoEntryData.copy(stringResource, str, stringResource2, stringResource3, stringResource6, stringResource7);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitleText() {
        return this.titleText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMemoText() {
        return this.memoText;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getMemoHint() {
        return this.memoHint;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final OutgoingWireMemoEntryData copy(StringResource titleText, String memoText, StringResource subtitleText, StringResource memoHint, StringResource primaryButtonText, StringResource secondaryButtonText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(memoHint, "memoHint");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        return new OutgoingWireMemoEntryData(titleText, memoText, subtitleText, memoHint, primaryButtonText, secondaryButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutgoingWireMemoEntryData)) {
            return false;
        }
        OutgoingWireMemoEntryData outgoingWireMemoEntryData = (OutgoingWireMemoEntryData) other;
        return Intrinsics.areEqual(this.titleText, outgoingWireMemoEntryData.titleText) && Intrinsics.areEqual(this.memoText, outgoingWireMemoEntryData.memoText) && Intrinsics.areEqual(this.subtitleText, outgoingWireMemoEntryData.subtitleText) && Intrinsics.areEqual(this.memoHint, outgoingWireMemoEntryData.memoHint) && Intrinsics.areEqual(this.primaryButtonText, outgoingWireMemoEntryData.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, outgoingWireMemoEntryData.secondaryButtonText);
    }

    public int hashCode() {
        int iHashCode = this.titleText.hashCode() * 31;
        String str = this.memoText;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.subtitleText.hashCode()) * 31) + this.memoHint.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + this.secondaryButtonText.hashCode();
    }

    public String toString() {
        return "OutgoingWireMemoEntryData(titleText=" + this.titleText + ", memoText=" + this.memoText + ", subtitleText=" + this.subtitleText + ", memoHint=" + this.memoHint + ", primaryButtonText=" + this.primaryButtonText + ", secondaryButtonText=" + this.secondaryButtonText + ")";
    }

    public OutgoingWireMemoEntryData(StringResource titleText, String str, StringResource subtitleText, StringResource memoHint, StringResource primaryButtonText, StringResource secondaryButtonText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(subtitleText, "subtitleText");
        Intrinsics.checkNotNullParameter(memoHint, "memoHint");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.titleText = titleText;
        this.memoText = str;
        this.subtitleText = subtitleText;
        this.memoHint = memoHint;
        this.primaryButtonText = primaryButtonText;
        this.secondaryButtonText = secondaryButtonText;
    }

    public final StringResource getTitleText() {
        return this.titleText;
    }

    public final String getMemoText() {
        return this.memoText;
    }

    public final StringResource getSubtitleText() {
        return this.subtitleText;
    }

    public final StringResource getMemoHint() {
        return this.memoHint;
    }

    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final StringResource getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* compiled from: OutgoingWireMemoEntryScreen.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData$Companion;", "", "<init>", "()V", "withMemoText", "Lcom/robinhood/android/transfers/ui/composecomponents/OutgoingWireMemoEntryData;", "memoText", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OutgoingWireMemoEntryData withMemoText(String memoText) {
            StringResource.Companion companion = StringResource.INSTANCE;
            return new OutgoingWireMemoEntryData(companion.invoke(C30065R.string.outgoing_wire_memo_entry_title, new Object[0]), memoText, companion.invoke(C30065R.string.outgoing_wire_memo_entry_subtitle, new Object[0]), companion.invoke(C30065R.string.outgoing_wire_memo_entry_hint, new Object[0]), companion.invoke(C30065R.string.outgoing_wire_memo_entry_save_button, new Object[0]), companion.invoke(C30065R.string.outgoing_wire_memo_entry_skip_button, new Object[0]));
        }
    }
}
