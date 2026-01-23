package com.robinhood.android.gold.sage;

import gold.proto.p464v1.GetSageRateResponse;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageRateViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateViewState;", "", "<init>", "()V", "Loading", "Loaded", "Companion", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loaded;", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loading;", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class GoldSageRateViewState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Loaded loadingMock = new Loaded(new GetSageRateResponse("", "----", CollectionsKt.emptyList(), CollectionsKt.emptyList(), null, null, null, 112, null));

    public /* synthetic */ GoldSageRateViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: GoldSageRateViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loading;", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends GoldSageRateViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1189948698;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private GoldSageRateViewState() {
    }

    /* compiled from: GoldSageRateViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loaded;", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState;", "sageRateResponse", "Lgold/proto/v1/GetSageRateResponse;", "<init>", "(Lgold/proto/v1/GetSageRateResponse;)V", "getSageRateResponse", "()Lgold/proto/v1/GetSageRateResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends GoldSageRateViewState {
        public static final int $stable = 8;
        private final GetSageRateResponse sageRateResponse;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, GetSageRateResponse getSageRateResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                getSageRateResponse = loaded.sageRateResponse;
            }
            return loaded.copy(getSageRateResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final GetSageRateResponse getSageRateResponse() {
            return this.sageRateResponse;
        }

        public final Loaded copy(GetSageRateResponse sageRateResponse) {
            Intrinsics.checkNotNullParameter(sageRateResponse, "sageRateResponse");
            return new Loaded(sageRateResponse);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.sageRateResponse, ((Loaded) other).sageRateResponse);
        }

        public int hashCode() {
            return this.sageRateResponse.hashCode();
        }

        public String toString() {
            return "Loaded(sageRateResponse=" + this.sageRateResponse + ")";
        }

        public final GetSageRateResponse getSageRateResponse() {
            return this.sageRateResponse;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(GetSageRateResponse sageRateResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(sageRateResponse, "sageRateResponse");
            this.sageRateResponse = sageRateResponse;
        }
    }

    /* compiled from: GoldSageRateViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Companion;", "", "<init>", "()V", "loadingMock", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loaded;", "getLoadingMock", "()Lcom/robinhood/android/gold/sage/GoldSageRateViewState$Loaded;", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Loaded getLoadingMock() {
            return GoldSageRateViewState.loadingMock;
        }
    }
}
