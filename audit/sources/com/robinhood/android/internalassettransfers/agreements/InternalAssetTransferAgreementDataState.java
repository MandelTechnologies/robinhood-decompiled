package com.robinhood.android.internalassettransfers.agreements;

import com.robinhood.android.agreements.models.UiAgreementWithContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState;", "", "fetchAgreement", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "signAgreement", "<init>", "(Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;)V", "getFetchAgreement", "()Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "getSignAgreement", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LcenState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferAgreementDataState {
    public static final int $stable = 0;
    private final LcenState fetchAgreement;
    private final LcenState signAgreement;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalAssetTransferAgreementDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InternalAssetTransferAgreementDataState copy$default(InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState, LcenState lcenState, LcenState lcenState2, int i, Object obj) {
        if ((i & 1) != 0) {
            lcenState = internalAssetTransferAgreementDataState.fetchAgreement;
        }
        if ((i & 2) != 0) {
            lcenState2 = internalAssetTransferAgreementDataState.signAgreement;
        }
        return internalAssetTransferAgreementDataState.copy(lcenState, lcenState2);
    }

    /* renamed from: component1, reason: from getter */
    public final LcenState getFetchAgreement() {
        return this.fetchAgreement;
    }

    /* renamed from: component2, reason: from getter */
    public final LcenState getSignAgreement() {
        return this.signAgreement;
    }

    public final InternalAssetTransferAgreementDataState copy(LcenState fetchAgreement, LcenState signAgreement) {
        Intrinsics.checkNotNullParameter(fetchAgreement, "fetchAgreement");
        Intrinsics.checkNotNullParameter(signAgreement, "signAgreement");
        return new InternalAssetTransferAgreementDataState(fetchAgreement, signAgreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferAgreementDataState)) {
            return false;
        }
        InternalAssetTransferAgreementDataState internalAssetTransferAgreementDataState = (InternalAssetTransferAgreementDataState) other;
        return Intrinsics.areEqual(this.fetchAgreement, internalAssetTransferAgreementDataState.fetchAgreement) && Intrinsics.areEqual(this.signAgreement, internalAssetTransferAgreementDataState.signAgreement);
    }

    public int hashCode() {
        return (this.fetchAgreement.hashCode() * 31) + this.signAgreement.hashCode();
    }

    public String toString() {
        return "InternalAssetTransferAgreementDataState(fetchAgreement=" + this.fetchAgreement + ", signAgreement=" + this.signAgreement + ")";
    }

    public InternalAssetTransferAgreementDataState(LcenState fetchAgreement, LcenState signAgreement) {
        Intrinsics.checkNotNullParameter(fetchAgreement, "fetchAgreement");
        Intrinsics.checkNotNullParameter(signAgreement, "signAgreement");
        this.fetchAgreement = fetchAgreement;
        this.signAgreement = signAgreement;
    }

    public /* synthetic */ InternalAssetTransferAgreementDataState(LcenState lcenState, LcenState lcenState2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LcenState.None.INSTANCE : lcenState, (i & 2) != 0 ? LcenState.None.INSTANCE : lcenState2);
    }

    public final LcenState getFetchAgreement() {
        return this.fetchAgreement;
    }

    public final LcenState getSignAgreement() {
        return this.signAgreement;
    }

    /* compiled from: InternalAssetTransferAgreementViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "", "Loading", "Content", "Error", "None", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Content;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Error;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Loading;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$None;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface LcenState {

        /* compiled from: InternalAssetTransferAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Loading;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements LcenState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return -130457780;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: InternalAssetTransferAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Content;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "<init>", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;)V", "getAgreement", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Content implements LcenState {
            public static final int $stable = 8;
            private final UiAgreementWithContent agreement;

            public static /* synthetic */ Content copy$default(Content content, UiAgreementWithContent uiAgreementWithContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiAgreementWithContent = content.agreement;
                }
                return content.copy(uiAgreementWithContent);
            }

            /* renamed from: component1, reason: from getter */
            public final UiAgreementWithContent getAgreement() {
                return this.agreement;
            }

            public final Content copy(UiAgreementWithContent agreement) {
                Intrinsics.checkNotNullParameter(agreement, "agreement");
                return new Content(agreement);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Content) && Intrinsics.areEqual(this.agreement, ((Content) other).agreement);
            }

            public int hashCode() {
                return this.agreement.hashCode();
            }

            public String toString() {
                return "Content(agreement=" + this.agreement + ")";
            }

            public Content(UiAgreementWithContent agreement) {
                Intrinsics.checkNotNullParameter(agreement, "agreement");
                this.agreement = agreement;
            }

            public final UiAgreementWithContent getAgreement() {
                return this.agreement;
            }
        }

        /* compiled from: InternalAssetTransferAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$Error;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements LcenState {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: InternalAssetTransferAgreementViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState$None;", "Lcom/robinhood/android/internalassettransfers/agreements/InternalAssetTransferAgreementDataState$LcenState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements LcenState {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 2075814696;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }
    }
}
