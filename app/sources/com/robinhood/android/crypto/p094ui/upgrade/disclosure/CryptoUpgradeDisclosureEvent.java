package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "", "<init>", "()V", "ShowError", "OnUpgradeSucceeded", "OnUpgradePendingResidencyDocument", "OnUpgradeUnderReview", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradePendingResidencyDocument;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradeSucceeded;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradeUnderReview;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$ShowError;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoUpgradeDisclosureEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoUpgradeDisclosureEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoUpgradeDisclosureEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$ShowError;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowError extends CryptoUpgradeDisclosureEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ ShowError copy$default(ShowError showError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = showError.error;
            }
            return showError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final ShowError copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new ShowError(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowError) && Intrinsics.areEqual(this.error, ((ShowError) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ShowError(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowError(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    private CryptoUpgradeDisclosureEvent() {
    }

    /* compiled from: CryptoUpgradeDisclosureEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradeSucceeded;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OnUpgradeSucceeded extends CryptoUpgradeDisclosureEvent {
        public static final int $stable = 0;
        public static final OnUpgradeSucceeded INSTANCE = new OnUpgradeSucceeded();

        public boolean equals(Object other) {
            return this == other || (other instanceof OnUpgradeSucceeded);
        }

        public int hashCode() {
            return 1907897234;
        }

        public String toString() {
            return "OnUpgradeSucceeded";
        }

        private OnUpgradeSucceeded() {
            super(null);
        }
    }

    /* compiled from: CryptoUpgradeDisclosureEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradePendingResidencyDocument;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "documentId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getDocumentId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OnUpgradePendingResidencyDocument extends CryptoUpgradeDisclosureEvent {
        public static final int $stable = 8;
        private final UUID documentId;

        public static /* synthetic */ OnUpgradePendingResidencyDocument copy$default(OnUpgradePendingResidencyDocument onUpgradePendingResidencyDocument, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = onUpgradePendingResidencyDocument.documentId;
            }
            return onUpgradePendingResidencyDocument.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getDocumentId() {
            return this.documentId;
        }

        public final OnUpgradePendingResidencyDocument copy(UUID documentId) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            return new OnUpgradePendingResidencyDocument(documentId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnUpgradePendingResidencyDocument) && Intrinsics.areEqual(this.documentId, ((OnUpgradePendingResidencyDocument) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "OnUpgradePendingResidencyDocument(documentId=" + this.documentId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnUpgradePendingResidencyDocument(UUID documentId) {
            super(null);
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            this.documentId = documentId;
        }

        public final UUID getDocumentId() {
            return this.documentId;
        }
    }

    /* compiled from: CryptoUpgradeDisclosureEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent$OnUpgradeUnderReview;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OnUpgradeUnderReview extends CryptoUpgradeDisclosureEvent {
        public static final int $stable = 0;
        public static final OnUpgradeUnderReview INSTANCE = new OnUpgradeUnderReview();

        public boolean equals(Object other) {
            return this == other || (other instanceof OnUpgradeUnderReview);
        }

        public int hashCode() {
            return 1403161921;
        }

        public String toString() {
            return "OnUpgradeUnderReview";
        }

        private OnUpgradeUnderReview() {
            super(null);
        }
    }
}
