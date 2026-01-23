package com.robinhood.android.doc.p109ui.residency;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocUploadVerifyResidencyViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "", "<init>", "()V", "Loading", "Loaded", "VerifyResult", "Error", "Result", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Error;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Loaded;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Loading;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$VerifyResult;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public abstract class DocUploadVerifyResidencyViewState {
    public static final int $stable = 0;

    public /* synthetic */ DocUploadVerifyResidencyViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DocUploadVerifyResidencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Loading;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends DocUploadVerifyResidencyViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private DocUploadVerifyResidencyViewState() {
    }

    /* compiled from: DocUploadVerifyResidencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Loaded;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "hasCryptoAccount", "", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/ResidentialAddress;", "<init>", "(ZLcom/robinhood/models/ui/identi/ResidentialAddress;)V", "getHasCryptoAccount", "()Z", "getAddress", "()Lcom/robinhood/models/ui/identi/ResidentialAddress;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends DocUploadVerifyResidencyViewState {
        public static final int $stable = 8;
        private final ResidentialAddress address;
        private final boolean hasCryptoAccount;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, boolean z, ResidentialAddress residentialAddress, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loaded.hasCryptoAccount;
            }
            if ((i & 2) != 0) {
                residentialAddress = loaded.address;
            }
            return loaded.copy(z, residentialAddress);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getHasCryptoAccount() {
            return this.hasCryptoAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final ResidentialAddress getAddress() {
            return this.address;
        }

        public final Loaded copy(boolean hasCryptoAccount, ResidentialAddress address) {
            Intrinsics.checkNotNullParameter(address, "address");
            return new Loaded(hasCryptoAccount, address);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return this.hasCryptoAccount == loaded.hasCryptoAccount && Intrinsics.areEqual(this.address, loaded.address);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.hasCryptoAccount) * 31) + this.address.hashCode();
        }

        public String toString() {
            return "Loaded(hasCryptoAccount=" + this.hasCryptoAccount + ", address=" + this.address + ")";
        }

        public final ResidentialAddress getAddress() {
            return this.address;
        }

        public final boolean getHasCryptoAccount() {
            return this.hasCryptoAccount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(boolean z, ResidentialAddress address) {
            super(null);
            Intrinsics.checkNotNullParameter(address, "address");
            this.hasCryptoAccount = z;
            this.address = address;
        }
    }

    /* compiled from: DocUploadVerifyResidencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$VerifyResult;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "event", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result;", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class VerifyResult extends DocUploadVerifyResidencyViewState {
        public static final int $stable = 8;
        private final UiEvent<Result> event;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VerifyResult copy$default(VerifyResult verifyResult, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = verifyResult.event;
            }
            return verifyResult.copy(uiEvent);
        }

        public final UiEvent<Result> component1() {
            return this.event;
        }

        public final VerifyResult copy(UiEvent<Result> event) {
            Intrinsics.checkNotNullParameter(event, "event");
            return new VerifyResult(event);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifyResult) && Intrinsics.areEqual(this.event, ((VerifyResult) other).event);
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        public String toString() {
            return "VerifyResult(event=" + this.event + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyResult(UiEvent<Result> event) {
            super(null);
            Intrinsics.checkNotNullParameter(event, "event");
            this.event = event;
        }

        public final UiEvent<Result> getEvent() {
            return this.event;
        }
    }

    /* compiled from: DocUploadVerifyResidencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Error;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState;", "throwable", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getThrowable", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends DocUploadVerifyResidencyViewState {
        public static final int $stable = 8;
        private final UiEvent<Throwable> throwable;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, UiEvent uiEvent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = error.throwable;
            }
            return error.copy(uiEvent);
        }

        public final UiEvent<Throwable> component1() {
            return this.throwable;
        }

        public final Error copy(UiEvent<Throwable> throwable) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(UiEvent<Throwable> throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final UiEvent<Throwable> getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: DocUploadVerifyResidencyViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result;", "", "<init>", "()V", "Continue", "Ineligible", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result$Continue;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result$Ineligible;", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Result {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: DocUploadVerifyResidencyViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result$Continue;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Continue extends Result {
            public static final int $stable = 0;
            public static final Continue INSTANCE = new Continue();

            private Continue() {
                super(null);
            }
        }

        private Result() {
        }

        /* compiled from: DocUploadVerifyResidencyViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result$Ineligible;", "Lcom/robinhood/android/doc/ui/residency/DocUploadVerifyResidencyViewState$Result;", PlaceTypes.ADDRESS, "Lcom/robinhood/models/ui/identi/ResidentialAddress;", "<init>", "(Lcom/robinhood/models/ui/identi/ResidentialAddress;)V", "getAddress", "()Lcom/robinhood/models/ui/identi/ResidentialAddress;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Ineligible extends Result {
            public static final int $stable = 8;
            private final ResidentialAddress address;

            public static /* synthetic */ Ineligible copy$default(Ineligible ineligible, ResidentialAddress residentialAddress, int i, Object obj) {
                if ((i & 1) != 0) {
                    residentialAddress = ineligible.address;
                }
                return ineligible.copy(residentialAddress);
            }

            /* renamed from: component1, reason: from getter */
            public final ResidentialAddress getAddress() {
                return this.address;
            }

            public final Ineligible copy(ResidentialAddress address) {
                Intrinsics.checkNotNullParameter(address, "address");
                return new Ineligible(address);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Ineligible) && Intrinsics.areEqual(this.address, ((Ineligible) other).address);
            }

            public int hashCode() {
                return this.address.hashCode();
            }

            public String toString() {
                return "Ineligible(address=" + this.address + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Ineligible(ResidentialAddress address) {
                super(null);
                Intrinsics.checkNotNullParameter(address, "address");
                this.address = address;
            }

            public final ResidentialAddress getAddress() {
                return this.address;
            }
        }
    }
}
