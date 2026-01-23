package com.robinhood.android.advisory.history.trade;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AdvisorTradeDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/LineItem;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LineItem {
    public static final int $stable = StringResource.$stable;
    private final StringResource label;
    private final StringResource value;

    public static /* synthetic */ LineItem copy$default(LineItem lineItem, StringResource stringResource, StringResource stringResource2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = lineItem.label;
        }
        if ((i & 2) != 0) {
            stringResource2 = lineItem.value;
        }
        return lineItem.copy(stringResource, stringResource2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getValue() {
        return this.value;
    }

    public final LineItem copy(StringResource label, StringResource value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new LineItem(label, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineItem)) {
            return false;
        }
        LineItem lineItem = (LineItem) other;
        return Intrinsics.areEqual(this.label, lineItem.label) && Intrinsics.areEqual(this.value, lineItem.value);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "LineItem(label=" + this.label + ", value=" + this.value + ")";
    }

    public LineItem(StringResource label, StringResource value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getValue() {
        return this.value;
    }
}
