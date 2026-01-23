package com.robinhood.android.common.history.p082ui;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: HistoryFilterHeader.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/CustomNamedHistoryFilter;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "historyFilter", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getHistoryFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CustomNamedHistoryFilter {
    public static final int $stable = StringResource.$stable;
    private final HistoryFilter historyFilter;
    private final StringResource label;

    public static /* synthetic */ CustomNamedHistoryFilter copy$default(CustomNamedHistoryFilter customNamedHistoryFilter, StringResource stringResource, HistoryFilter historyFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = customNamedHistoryFilter.label;
        }
        if ((i & 2) != 0) {
            historyFilter = customNamedHistoryFilter.historyFilter;
        }
        return customNamedHistoryFilter.copy(stringResource, historyFilter);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final HistoryFilter getHistoryFilter() {
        return this.historyFilter;
    }

    public final CustomNamedHistoryFilter copy(StringResource label, HistoryFilter historyFilter) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(historyFilter, "historyFilter");
        return new CustomNamedHistoryFilter(label, historyFilter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomNamedHistoryFilter)) {
            return false;
        }
        CustomNamedHistoryFilter customNamedHistoryFilter = (CustomNamedHistoryFilter) other;
        return Intrinsics.areEqual(this.label, customNamedHistoryFilter.label) && this.historyFilter == customNamedHistoryFilter.historyFilter;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.historyFilter.hashCode();
    }

    public String toString() {
        return "CustomNamedHistoryFilter(label=" + this.label + ", historyFilter=" + this.historyFilter + ")";
    }

    public CustomNamedHistoryFilter(StringResource label, HistoryFilter historyFilter) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(historyFilter, "historyFilter");
        this.label = label;
        this.historyFilter = historyFilter;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final HistoryFilter getHistoryFilter() {
        return this.historyFilter;
    }
}
