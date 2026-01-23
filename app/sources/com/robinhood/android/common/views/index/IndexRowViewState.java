package com.robinhood.android.common.views.index;

import android.content.Context;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.indexes.models.p159db.IndexCloseValue;
import com.robinhood.android.indexes.models.p159db.IndexValue;
import com.robinhood.utils.android.C41827R;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexRowViewDuxo.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003JO\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010(\u001a\u00020\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/views/index/IndexRowViewState;", "", "indexId", "Ljava/util/UUID;", "displayName", "", "symbol", "indexValue", "Lcom/robinhood/android/indexes/models/db/IndexValue;", "indexCloseValue", "Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/indexes/models/db/IndexValue;Lcom/robinhood/android/indexes/models/db/IndexCloseValue;Lcom/robinhood/android/common/util/SecurityViewMode;)V", "getIndexId", "()Ljava/util/UUID;", "getDisplayName", "()Ljava/lang/String;", "getSymbol", "getIndexValue", "()Lcom/robinhood/android/indexes/models/db/IndexValue;", "getIndexCloseValue", "()Lcom/robinhood/android/indexes/models/db/IndexCloseValue;", "getViewMode", "()Lcom/robinhood/android/common/util/SecurityViewMode;", "isStale", "", "()Z", "getPriceInfo", "Lcom/robinhood/android/common/util/SecurityViewMode$FormatInfo;", "context", "Landroid/content/Context;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IndexRowViewState {
    public static final int $stable = 8;
    private final String displayName;
    private final IndexCloseValue indexCloseValue;
    private final UUID indexId;
    private final IndexValue indexValue;
    private final String symbol;
    private final SecurityViewMode viewMode;

    public static /* synthetic */ IndexRowViewState copy$default(IndexRowViewState indexRowViewState, UUID uuid, String str, String str2, IndexValue indexValue, IndexCloseValue indexCloseValue, SecurityViewMode securityViewMode, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = indexRowViewState.indexId;
        }
        if ((i & 2) != 0) {
            str = indexRowViewState.displayName;
        }
        if ((i & 4) != 0) {
            str2 = indexRowViewState.symbol;
        }
        if ((i & 8) != 0) {
            indexValue = indexRowViewState.indexValue;
        }
        if ((i & 16) != 0) {
            indexCloseValue = indexRowViewState.indexCloseValue;
        }
        if ((i & 32) != 0) {
            securityViewMode = indexRowViewState.viewMode;
        }
        IndexCloseValue indexCloseValue2 = indexCloseValue;
        SecurityViewMode securityViewMode2 = securityViewMode;
        return indexRowViewState.copy(uuid, str, str2, indexValue, indexCloseValue2, securityViewMode2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getIndexId() {
        return this.indexId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* renamed from: component4, reason: from getter */
    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    /* renamed from: component5, reason: from getter */
    public final IndexCloseValue getIndexCloseValue() {
        return this.indexCloseValue;
    }

    /* renamed from: component6, reason: from getter */
    public final SecurityViewMode getViewMode() {
        return this.viewMode;
    }

    public final IndexRowViewState copy(UUID indexId, String displayName, String symbol, IndexValue indexValue, IndexCloseValue indexCloseValue, SecurityViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        return new IndexRowViewState(indexId, displayName, symbol, indexValue, indexCloseValue, viewMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexRowViewState)) {
            return false;
        }
        IndexRowViewState indexRowViewState = (IndexRowViewState) other;
        return Intrinsics.areEqual(this.indexId, indexRowViewState.indexId) && Intrinsics.areEqual(this.displayName, indexRowViewState.displayName) && Intrinsics.areEqual(this.symbol, indexRowViewState.symbol) && Intrinsics.areEqual(this.indexValue, indexRowViewState.indexValue) && Intrinsics.areEqual(this.indexCloseValue, indexRowViewState.indexCloseValue) && this.viewMode == indexRowViewState.viewMode;
    }

    public int hashCode() {
        UUID uuid = this.indexId;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.displayName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IndexValue indexValue = this.indexValue;
        int iHashCode4 = (iHashCode3 + (indexValue == null ? 0 : indexValue.hashCode())) * 31;
        IndexCloseValue indexCloseValue = this.indexCloseValue;
        return ((iHashCode4 + (indexCloseValue != null ? indexCloseValue.hashCode() : 0)) * 31) + this.viewMode.hashCode();
    }

    public String toString() {
        return "IndexRowViewState(indexId=" + this.indexId + ", displayName=" + this.displayName + ", symbol=" + this.symbol + ", indexValue=" + this.indexValue + ", indexCloseValue=" + this.indexCloseValue + ", viewMode=" + this.viewMode + ")";
    }

    public IndexRowViewState(UUID uuid, String str, String str2, IndexValue indexValue, IndexCloseValue indexCloseValue, SecurityViewMode viewMode) {
        Intrinsics.checkNotNullParameter(viewMode, "viewMode");
        this.indexId = uuid;
        this.displayName = str;
        this.symbol = str2;
        this.indexValue = indexValue;
        this.indexCloseValue = indexCloseValue;
        this.viewMode = viewMode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IndexRowViewState(UUID uuid, String str, String str2, IndexValue indexValue, IndexCloseValue indexCloseValue, SecurityViewMode securityViewMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SecurityViewMode securityViewMode2;
        IndexCloseValue indexCloseValue2;
        uuid = (i & 1) != 0 ? null : uuid;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        indexValue = (i & 8) != 0 ? null : indexValue;
        if ((i & 16) != 0) {
            securityViewMode2 = securityViewMode;
            indexCloseValue2 = null;
        } else {
            securityViewMode2 = securityViewMode;
            indexCloseValue2 = indexCloseValue;
        }
        this(uuid, str, str2, indexValue, indexCloseValue2, securityViewMode2);
    }

    public final UUID getIndexId() {
        return this.indexId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final IndexValue getIndexValue() {
        return this.indexValue;
    }

    public final IndexCloseValue getIndexCloseValue() {
        return this.indexCloseValue;
    }

    public final SecurityViewMode getViewMode() {
        return this.viewMode;
    }

    public final boolean isStale() {
        IndexValue indexValue = this.indexValue;
        boolean z = false;
        if (indexValue != null && !indexValue.isStaleForUi()) {
            z = true;
        }
        return !z;
    }

    public final SecurityViewMode.FormatInfo getPriceInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.indexValue == null) {
            return null;
        }
        String string2 = context.getString(C41827R.string.general_label_n_a);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SecurityViewMode securityViewMode = this.viewMode;
        BigDecimal value = this.indexValue.getValue();
        IndexCloseValue indexCloseValue = this.indexCloseValue;
        return securityViewMode.getFormatInfoForIndexOption(value, indexCloseValue != null ? indexCloseValue.getCloseValue() : null, string2);
    }
}
