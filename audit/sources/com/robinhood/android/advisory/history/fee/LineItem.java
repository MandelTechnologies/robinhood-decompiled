package com.robinhood.android.advisory.history.fee;

import com.robinhood.models.advisory.p304db.fee.AdvisoryFee;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: AdvisoryFeeDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/LineItem;", "", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "value", "bottomSheet", "Lcom/robinhood/models/advisory/db/fee/AdvisoryFee$AdvisoryFeeBottomSheet;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/advisory/db/fee/AdvisoryFee$AdvisoryFeeBottomSheet;)V", "getLabel", "()Lcom/robinhood/utils/resource/StringResource;", "getValue", "getBottomSheet", "()Lcom/robinhood/models/advisory/db/fee/AdvisoryFee$AdvisoryFeeBottomSheet;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class LineItem {
    public static final int $stable = 8;
    private final AdvisoryFee.AdvisoryFeeBottomSheet bottomSheet;
    private final StringResource label;
    private final StringResource value;

    public static /* synthetic */ LineItem copy$default(LineItem lineItem, StringResource stringResource, StringResource stringResource2, AdvisoryFee.AdvisoryFeeBottomSheet advisoryFeeBottomSheet, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = lineItem.label;
        }
        if ((i & 2) != 0) {
            stringResource2 = lineItem.value;
        }
        if ((i & 4) != 0) {
            advisoryFeeBottomSheet = lineItem.bottomSheet;
        }
        return lineItem.copy(stringResource, stringResource2, advisoryFeeBottomSheet);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final AdvisoryFee.AdvisoryFeeBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final LineItem copy(StringResource label, StringResource value, AdvisoryFee.AdvisoryFeeBottomSheet bottomSheet) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        return new LineItem(label, value, bottomSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineItem)) {
            return false;
        }
        LineItem lineItem = (LineItem) other;
        return Intrinsics.areEqual(this.label, lineItem.label) && Intrinsics.areEqual(this.value, lineItem.value) && Intrinsics.areEqual(this.bottomSheet, lineItem.bottomSheet);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.value.hashCode()) * 31;
        AdvisoryFee.AdvisoryFeeBottomSheet advisoryFeeBottomSheet = this.bottomSheet;
        return iHashCode + (advisoryFeeBottomSheet == null ? 0 : advisoryFeeBottomSheet.hashCode());
    }

    public String toString() {
        return "LineItem(label=" + this.label + ", value=" + this.value + ", bottomSheet=" + this.bottomSheet + ")";
    }

    public LineItem(StringResource label, StringResource value, AdvisoryFee.AdvisoryFeeBottomSheet advisoryFeeBottomSheet) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.label = label;
        this.value = value;
        this.bottomSheet = advisoryFeeBottomSheet;
    }

    public final StringResource getLabel() {
        return this.label;
    }

    public final StringResource getValue() {
        return this.value;
    }

    public final AdvisoryFee.AdvisoryFeeBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }
}
