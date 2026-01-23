package com.robinhood.android.acats.acatsclawbackdetails;

import bonfire.proto.idl.acats.p027v1.AcatsClawbackDetailsRowDto;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferBonusRemovalDetailsDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsDataState;", "", "throwable", "", "title", "", "items", "", "Lbonfire/proto/idl/acats/v1/AcatsClawbackDetailsRowDto;", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)V", "getThrowable", "()Ljava/lang/Throwable;", "getTitle", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class CreateTransferBonusRemovalDetailsDataState {
    public static final int $stable = 8;
    private final List<AcatsClawbackDetailsRowDto> items;
    private final Throwable throwable;
    private final String title;

    public CreateTransferBonusRemovalDetailsDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateTransferBonusRemovalDetailsDataState copy$default(CreateTransferBonusRemovalDetailsDataState createTransferBonusRemovalDetailsDataState, Throwable th, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            th = createTransferBonusRemovalDetailsDataState.throwable;
        }
        if ((i & 2) != 0) {
            str = createTransferBonusRemovalDetailsDataState.title;
        }
        if ((i & 4) != 0) {
            list = createTransferBonusRemovalDetailsDataState.items;
        }
        return createTransferBonusRemovalDetailsDataState.copy(th, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<AcatsClawbackDetailsRowDto> component3() {
        return this.items;
    }

    public final CreateTransferBonusRemovalDetailsDataState copy(Throwable throwable, String title, List<AcatsClawbackDetailsRowDto> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        return new CreateTransferBonusRemovalDetailsDataState(throwable, title, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateTransferBonusRemovalDetailsDataState)) {
            return false;
        }
        CreateTransferBonusRemovalDetailsDataState createTransferBonusRemovalDetailsDataState = (CreateTransferBonusRemovalDetailsDataState) other;
        return Intrinsics.areEqual(this.throwable, createTransferBonusRemovalDetailsDataState.throwable) && Intrinsics.areEqual(this.title, createTransferBonusRemovalDetailsDataState.title) && Intrinsics.areEqual(this.items, createTransferBonusRemovalDetailsDataState.items);
    }

    public int hashCode() {
        Throwable th = this.throwable;
        return ((((th == null ? 0 : th.hashCode()) * 31) + this.title.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "CreateTransferBonusRemovalDetailsDataState(throwable=" + this.throwable + ", title=" + this.title + ", items=" + this.items + ")";
    }

    public CreateTransferBonusRemovalDetailsDataState(Throwable th, String title, List<AcatsClawbackDetailsRowDto> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.throwable = th;
        this.title = title;
        this.items = items;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public /* synthetic */ CreateTransferBonusRemovalDetailsDataState(Throwable th, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : th, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<AcatsClawbackDetailsRowDto> getItems() {
        return this.items;
    }
}
