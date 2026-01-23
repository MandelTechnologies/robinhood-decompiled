package com.robinhood.android.acatsin.partials.option;

import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialOptionAssetEvent.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "", "<init>", "()V", "PopulateEditUiEvent", "InvalidDateEvent", "NetworkErrorEvent", "OptionValidationFailureEvent", "OptionValidatedEvent", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$InvalidDateEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$NetworkErrorEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$OptionValidatedEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$OptionValidationFailureEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$PopulateEditUiEvent;", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInPartialOptionAssetEvent {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInPartialOptionAssetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInPartialOptionAssetEvent() {
    }

    /* compiled from: AcatsInPartialOptionAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$PopulateEditUiEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;)V", "getAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PopulateEditUiEvent extends AcatsInPartialOptionAssetEvent {
        public static final int $stable = 8;
        private final UiAcatsAsset.OptionAsset asset;

        public static /* synthetic */ PopulateEditUiEvent copy$default(PopulateEditUiEvent populateEditUiEvent, UiAcatsAsset.OptionAsset optionAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAsset = populateEditUiEvent.asset;
            }
            return populateEditUiEvent.copy(optionAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAcatsAsset.OptionAsset getAsset() {
            return this.asset;
        }

        public final PopulateEditUiEvent copy(UiAcatsAsset.OptionAsset asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            return new PopulateEditUiEvent(asset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PopulateEditUiEvent) && Intrinsics.areEqual(this.asset, ((PopulateEditUiEvent) other).asset);
        }

        public int hashCode() {
            return this.asset.hashCode();
        }

        public String toString() {
            return "PopulateEditUiEvent(asset=" + this.asset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopulateEditUiEvent(UiAcatsAsset.OptionAsset asset) {
            super(null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final UiAcatsAsset.OptionAsset getAsset() {
            return this.asset;
        }
    }

    /* compiled from: AcatsInPartialOptionAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$InvalidDateEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InvalidDateEvent extends AcatsInPartialOptionAssetEvent {
        public static final int $stable = 0;
        public static final InvalidDateEvent INSTANCE = new InvalidDateEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof InvalidDateEvent);
        }

        public int hashCode() {
            return -1045084886;
        }

        public String toString() {
            return "InvalidDateEvent";
        }

        private InvalidDateEvent() {
            super(null);
        }
    }

    /* compiled from: AcatsInPartialOptionAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$NetworkErrorEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NetworkErrorEvent extends AcatsInPartialOptionAssetEvent {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ NetworkErrorEvent copy$default(NetworkErrorEvent networkErrorEvent, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = networkErrorEvent.throwable;
            }
            return networkErrorEvent.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final NetworkErrorEvent copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new NetworkErrorEvent(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkErrorEvent) && Intrinsics.areEqual(this.throwable, ((NetworkErrorEvent) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "NetworkErrorEvent(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkErrorEvent(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: AcatsInPartialOptionAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$OptionValidationFailureEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionValidationFailureEvent extends AcatsInPartialOptionAssetEvent {
        public static final int $stable = 0;
        public static final OptionValidationFailureEvent INSTANCE = new OptionValidationFailureEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof OptionValidationFailureEvent);
        }

        public int hashCode() {
            return 311242611;
        }

        public String toString() {
            return "OptionValidationFailureEvent";
        }

        private OptionValidationFailureEvent() {
            super(null);
        }
    }

    /* compiled from: AcatsInPartialOptionAssetEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent$OptionValidatedEvent;", "Lcom/robinhood/android/acatsin/partials/option/AcatsInPartialOptionAssetEvent;", "asset", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "<init>", "(Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;)V", "getAsset", "()Lcom/robinhood/android/acatsin/partials/UiAcatsAsset$OptionAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-acats-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionValidatedEvent extends AcatsInPartialOptionAssetEvent {
        public static final int $stable = 8;
        private final UiAcatsAsset.OptionAsset asset;

        public static /* synthetic */ OptionValidatedEvent copy$default(OptionValidatedEvent optionValidatedEvent, UiAcatsAsset.OptionAsset optionAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                optionAsset = optionValidatedEvent.asset;
            }
            return optionValidatedEvent.copy(optionAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAcatsAsset.OptionAsset getAsset() {
            return this.asset;
        }

        public final OptionValidatedEvent copy(UiAcatsAsset.OptionAsset asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            return new OptionValidatedEvent(asset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionValidatedEvent) && Intrinsics.areEqual(this.asset, ((OptionValidatedEvent) other).asset);
        }

        public int hashCode() {
            return this.asset.hashCode();
        }

        public String toString() {
            return "OptionValidatedEvent(asset=" + this.asset + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OptionValidatedEvent(UiAcatsAsset.OptionAsset asset) {
            super(null);
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final UiAcatsAsset.OptionAsset getAsset() {
            return this.asset;
        }
    }
}
