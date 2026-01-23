package com.robinhood.android.acats.acatsclawbackdetails;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CreateTransferBonusRemovalDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "", "Content", "Failure", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Content;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Failure;", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface CreateTransferBonusRemovalDetailsViewState {

    /* compiled from: CreateTransferBonusRemovalDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Content;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "loading", "", "title", "", "bulletList", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsItem;", "<init>", "(ZLjava/lang/String;Lkotlinx/collections/immutable/ImmutableList;)V", "getLoading", "()Z", "getTitle", "()Ljava/lang/String;", "getBulletList", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content implements CreateTransferBonusRemovalDetailsViewState {
        public static final int $stable = 0;
        private final ImmutableList<CreateTransferBonusRemovalDetailsItem> bulletList;
        private final boolean loading;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, boolean z, String str, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                z = content.loading;
            }
            if ((i & 2) != 0) {
                str = content.title;
            }
            if ((i & 4) != 0) {
                immutableList = content.bulletList;
            }
            return content.copy(z, str, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<CreateTransferBonusRemovalDetailsItem> component3() {
            return this.bulletList;
        }

        public final Content copy(boolean loading, String title, ImmutableList<CreateTransferBonusRemovalDetailsItem> bulletList) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bulletList, "bulletList");
            return new Content(loading, title, bulletList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return this.loading == content.loading && Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.bulletList, content.bulletList);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.loading) * 31) + this.title.hashCode()) * 31) + this.bulletList.hashCode();
        }

        public String toString() {
            return "Content(loading=" + this.loading + ", title=" + this.title + ", bulletList=" + this.bulletList + ")";
        }

        public Content(boolean z, String title, ImmutableList<CreateTransferBonusRemovalDetailsItem> bulletList) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bulletList, "bulletList");
            this.loading = z;
            this.title = title;
            this.bulletList = bulletList;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ImmutableList<CreateTransferBonusRemovalDetailsItem> getBulletList() {
            return this.bulletList;
        }
    }

    /* compiled from: CreateTransferBonusRemovalDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState$Failure;", "Lcom/robinhood/android/acats/acatsclawbackdetails/CreateTransferBonusRemovalDetailsViewState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-clawback-details_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Failure implements CreateTransferBonusRemovalDetailsViewState {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.throwable;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Failure copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Failure(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.throwable, ((Failure) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Failure(throwable=" + this.throwable + ")";
        }

        public Failure(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
