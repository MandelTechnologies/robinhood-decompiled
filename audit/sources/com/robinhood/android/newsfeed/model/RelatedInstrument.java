package com.robinhood.android.newsfeed.model;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RelatedInstrument.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/model/RelatedInstrument;", "", "id", "Ljava/util/UUID;", "symbol", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-lib-newsfeed_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class RelatedInstrument {
    public static final int $stable = 8;
    private final UUID id;
    private final String symbol;

    public static /* synthetic */ RelatedInstrument copy$default(RelatedInstrument relatedInstrument, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = relatedInstrument.id;
        }
        if ((i & 2) != 0) {
            str = relatedInstrument.symbol;
        }
        return relatedInstrument.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final RelatedInstrument copy(UUID id, String symbol) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new RelatedInstrument(id, symbol);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedInstrument)) {
            return false;
        }
        RelatedInstrument relatedInstrument = (RelatedInstrument) other;
        return Intrinsics.areEqual(this.id, relatedInstrument.id) && Intrinsics.areEqual(this.symbol, relatedInstrument.symbol);
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.symbol.hashCode();
    }

    public String toString() {
        return "RelatedInstrument(id=" + this.id + ", symbol=" + this.symbol + ")";
    }

    public RelatedInstrument(UUID id, String symbol) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.id = id;
        this.symbol = symbol;
    }

    public final UUID getId() {
        return this.id;
    }

    public final String getSymbol() {
        return this.symbol;
    }
}
