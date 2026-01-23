package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.p011ui.state.ToggleableState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferCustomSelectionStateProvider.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/EquityRow;", "", "instrumentId", "", "title", "subtitle", "checkboxState", "Landroidx/compose/ui/state/ToggleableState;", "shareString", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;Lcom/robinhood/utils/resource/StringResource;)V", "getInstrumentId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getCheckboxState", "()Landroidx/compose/ui/state/ToggleableState;", "getShareString", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EquityRow {
    public static final int $stable = StringResource.$stable;
    private final ToggleableState checkboxState;
    private final String instrumentId;
    private final StringResource shareString;
    private final String subtitle;
    private final String title;

    public static /* synthetic */ EquityRow copy$default(EquityRow equityRow, String str, String str2, String str3, ToggleableState toggleableState, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = equityRow.instrumentId;
        }
        if ((i & 2) != 0) {
            str2 = equityRow.title;
        }
        if ((i & 4) != 0) {
            str3 = equityRow.subtitle;
        }
        if ((i & 8) != 0) {
            toggleableState = equityRow.checkboxState;
        }
        if ((i & 16) != 0) {
            stringResource = equityRow.shareString;
        }
        StringResource stringResource2 = stringResource;
        String str4 = str3;
        return equityRow.copy(str, str2, str4, toggleableState, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component4, reason: from getter */
    public final ToggleableState getCheckboxState() {
        return this.checkboxState;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getShareString() {
        return this.shareString;
    }

    public final EquityRow copy(String instrumentId, String title, String subtitle, ToggleableState checkboxState, StringResource shareString) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
        Intrinsics.checkNotNullParameter(shareString, "shareString");
        return new EquityRow(instrumentId, title, subtitle, checkboxState, shareString);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EquityRow)) {
            return false;
        }
        EquityRow equityRow = (EquityRow) other;
        return Intrinsics.areEqual(this.instrumentId, equityRow.instrumentId) && Intrinsics.areEqual(this.title, equityRow.title) && Intrinsics.areEqual(this.subtitle, equityRow.subtitle) && this.checkboxState == equityRow.checkboxState && Intrinsics.areEqual(this.shareString, equityRow.shareString);
    }

    public int hashCode() {
        return (((((((this.instrumentId.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.checkboxState.hashCode()) * 31) + this.shareString.hashCode();
    }

    public String toString() {
        return "EquityRow(instrumentId=" + this.instrumentId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", checkboxState=" + this.checkboxState + ", shareString=" + this.shareString + ")";
    }

    public EquityRow(String instrumentId, String title, String subtitle, ToggleableState checkboxState, StringResource shareString) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(checkboxState, "checkboxState");
        Intrinsics.checkNotNullParameter(shareString, "shareString");
        this.instrumentId = instrumentId;
        this.title = title;
        this.subtitle = subtitle;
        this.checkboxState = checkboxState;
        this.shareString = shareString;
    }

    public final String getInstrumentId() {
        return this.instrumentId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final ToggleableState getCheckboxState() {
        return this.checkboxState;
    }

    public final StringResource getShareString() {
        return this.shareString;
    }
}
