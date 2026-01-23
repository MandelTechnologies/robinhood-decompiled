package com.robinhood.android.equities.equityscreener.crud.create;

import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateScreenerDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/equities/equityscreener/crud/create/CreateScreenerDataState;", "", "presets", "", "Lcom/robinhood/equityscreener/models/db/Screener;", "<init>", "(Ljava/util/List;)V", "getPresets", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateScreenerDataState {
    public static final int $stable = 8;
    private final List<Screener> presets;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateScreenerDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateScreenerDataState copy$default(CreateScreenerDataState createScreenerDataState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = createScreenerDataState.presets;
        }
        return createScreenerDataState.copy(list);
    }

    public final List<Screener> component1() {
        return this.presets;
    }

    public final CreateScreenerDataState copy(List<Screener> presets) {
        return new CreateScreenerDataState(presets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateScreenerDataState) && Intrinsics.areEqual(this.presets, ((CreateScreenerDataState) other).presets);
    }

    public int hashCode() {
        List<Screener> list = this.presets;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "CreateScreenerDataState(presets=" + this.presets + ")";
    }

    public CreateScreenerDataState(List<Screener> list) {
        this.presets = list;
    }

    public /* synthetic */ CreateScreenerDataState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<Screener> getPresets() {
        return this.presets;
    }
}
