package com.robinhood.compose.bento.component.cards;

import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCelebrationCard.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/cards/SecondaryRow;", "", SduiFeatureDiscovery3.INFO_TAG, "", "metadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getInfo", "()Ljava/lang/String;", "getMetadata", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SecondaryRow {
    public static final int $stable = 0;
    private final String info;
    private final String metadata;

    public static /* synthetic */ SecondaryRow copy$default(SecondaryRow secondaryRow, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = secondaryRow.info;
        }
        if ((i & 2) != 0) {
            str2 = secondaryRow.metadata;
        }
        return secondaryRow.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    public final SecondaryRow copy(String info, String metadata) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new SecondaryRow(info, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryRow)) {
            return false;
        }
        SecondaryRow secondaryRow = (SecondaryRow) other;
        return Intrinsics.areEqual(this.info, secondaryRow.info) && Intrinsics.areEqual(this.metadata, secondaryRow.metadata);
    }

    public int hashCode() {
        return (this.info.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "SecondaryRow(info=" + this.info + ", metadata=" + this.metadata + ")";
    }

    public SecondaryRow(String info, String metadata) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.info = info;
        this.metadata = metadata;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getMetadata() {
        return this.metadata;
    }
}
