package com.robinhood.android.transfers.ach.p265ui.posttransfer;

import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AchTransferInstantDepositViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/transfers/ach/ui/posttransfer/Detail;", "", "textRes", "", "formatArgs", "", "", "learnMoreIntentKey", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "<init>", "(ILjava/util/List;Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;)V", "getTextRes", "()I", "getFormatArgs", "()Ljava/util/List;", "getLearnMoreIntentKey", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "feature-legacy-ach-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Detail {
    public static final int $stable = 8;
    private final List<String> formatArgs;
    private final LegacyIntentKey learnMoreIntentKey;
    private final int textRes;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Detail copy$default(Detail detail, int i, List list, LegacyIntentKey legacyIntentKey, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = detail.textRes;
        }
        if ((i2 & 2) != 0) {
            list = detail.formatArgs;
        }
        if ((i2 & 4) != 0) {
            legacyIntentKey = detail.learnMoreIntentKey;
        }
        return detail.copy(i, list, legacyIntentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTextRes() {
        return this.textRes;
    }

    public final List<String> component2() {
        return this.formatArgs;
    }

    /* renamed from: component3, reason: from getter */
    public final LegacyIntentKey getLearnMoreIntentKey() {
        return this.learnMoreIntentKey;
    }

    public final Detail copy(int textRes, List<String> formatArgs, LegacyIntentKey learnMoreIntentKey) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new Detail(textRes, formatArgs, learnMoreIntentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Detail)) {
            return false;
        }
        Detail detail = (Detail) other;
        return this.textRes == detail.textRes && Intrinsics.areEqual(this.formatArgs, detail.formatArgs) && Intrinsics.areEqual(this.learnMoreIntentKey, detail.learnMoreIntentKey);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.textRes) * 31) + this.formatArgs.hashCode()) * 31;
        LegacyIntentKey legacyIntentKey = this.learnMoreIntentKey;
        return iHashCode + (legacyIntentKey == null ? 0 : legacyIntentKey.hashCode());
    }

    public String toString() {
        return "Detail(textRes=" + this.textRes + ", formatArgs=" + this.formatArgs + ", learnMoreIntentKey=" + this.learnMoreIntentKey + ")";
    }

    public Detail(int i, List<String> formatArgs, LegacyIntentKey legacyIntentKey) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.textRes = i;
        this.formatArgs = formatArgs;
        this.learnMoreIntentKey = legacyIntentKey;
    }

    public /* synthetic */ Detail(int i, List list, LegacyIntentKey legacyIntentKey, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, (i2 & 4) != 0 ? null : legacyIntentKey);
    }

    public final int getTextRes() {
        return this.textRes;
    }

    public final List<String> getFormatArgs() {
        return this.formatArgs;
    }

    public final LegacyIntentKey getLearnMoreIntentKey() {
        return this.learnMoreIntentKey;
    }
}
