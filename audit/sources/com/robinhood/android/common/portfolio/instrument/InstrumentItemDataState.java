package com.robinhood.android.common.portfolio.instrument;

import com.robinhood.android.models.portfolio.InstrumentDetails3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: InstrumentListItemDuxo.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/instrument/InstrumentItemDataState;", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "<init>", "(Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;)V", "getDetails", "()Lcom/robinhood/android/models/portfolio/InstrumentListItemDetails;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InstrumentItemDataState {
    public static final int $stable = 8;
    private final InstrumentDetails3 details;

    /* JADX WARN: Multi-variable type inference failed */
    public InstrumentItemDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InstrumentItemDataState copy$default(InstrumentItemDataState instrumentItemDataState, InstrumentDetails3 instrumentDetails3, int i, Object obj) {
        if ((i & 1) != 0) {
            instrumentDetails3 = instrumentItemDataState.details;
        }
        return instrumentItemDataState.copy(instrumentDetails3);
    }

    /* renamed from: component1, reason: from getter */
    public final InstrumentDetails3 getDetails() {
        return this.details;
    }

    public final InstrumentItemDataState copy(InstrumentDetails3 details) {
        return new InstrumentItemDataState(details);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InstrumentItemDataState) && Intrinsics.areEqual(this.details, ((InstrumentItemDataState) other).details);
    }

    public int hashCode() {
        InstrumentDetails3 instrumentDetails3 = this.details;
        if (instrumentDetails3 == null) {
            return 0;
        }
        return instrumentDetails3.hashCode();
    }

    public String toString() {
        return "InstrumentItemDataState(details=" + this.details + ")";
    }

    public InstrumentItemDataState(InstrumentDetails3 instrumentDetails3) {
        this.details = instrumentDetails3;
    }

    public /* synthetic */ InstrumentItemDataState(InstrumentDetails3 instrumentDetails3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : instrumentDetails3);
    }

    public final InstrumentDetails3 getDetails() {
        return this.details;
    }
}
