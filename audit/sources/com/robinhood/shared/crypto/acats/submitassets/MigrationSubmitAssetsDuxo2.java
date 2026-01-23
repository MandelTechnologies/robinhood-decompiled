package com.robinhood.shared.crypto.acats.submitassets;

import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MigrationSubmitAssetsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "", "Error", "NavigateToConfirmation", "RetriableError", "NonRetriableError", "NonRetriableContactSupportError", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$Error;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NavigateToConfirmation;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NonRetriableContactSupportError;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NonRetriableError;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$RetriableError;", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent, reason: use source file name */
/* loaded from: classes6.dex */
public interface MigrationSubmitAssetsDuxo2 {

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$Error;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent$Error, reason: from toString */
    public static final /* data */ class Error implements MigrationSubmitAssetsDuxo2 {
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

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NavigateToConfirmation;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "migrationId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getMigrationId", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent$NavigateToConfirmation, reason: from toString */
    public static final /* data */ class NavigateToConfirmation implements MigrationSubmitAssetsDuxo2 {
        public static final int $stable = 8;
        private final UUID migrationId;

        public static /* synthetic */ NavigateToConfirmation copy$default(NavigateToConfirmation navigateToConfirmation, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = navigateToConfirmation.migrationId;
            }
            return navigateToConfirmation.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getMigrationId() {
            return this.migrationId;
        }

        public final NavigateToConfirmation copy(UUID migrationId) {
            Intrinsics.checkNotNullParameter(migrationId, "migrationId");
            return new NavigateToConfirmation(migrationId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToConfirmation) && Intrinsics.areEqual(this.migrationId, ((NavigateToConfirmation) other).migrationId);
        }

        public int hashCode() {
            return this.migrationId.hashCode();
        }

        public String toString() {
            return "NavigateToConfirmation(migrationId=" + this.migrationId + ")";
        }

        public NavigateToConfirmation(UUID migrationId) {
            Intrinsics.checkNotNullParameter(migrationId, "migrationId");
            this.migrationId = migrationId;
        }

        public final UUID getMigrationId() {
            return this.migrationId;
        }
    }

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$RetriableError;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "errorMessage", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getErrorMessage", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent$RetriableError, reason: from toString */
    public static final /* data */ class RetriableError implements MigrationSubmitAssetsDuxo2 {
        public static final int $stable = StringResource.$stable;
        private final StringResource errorMessage;

        public static /* synthetic */ RetriableError copy$default(RetriableError retriableError, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = retriableError.errorMessage;
            }
            return retriableError.copy(stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getErrorMessage() {
            return this.errorMessage;
        }

        public final RetriableError copy(StringResource errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new RetriableError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RetriableError) && Intrinsics.areEqual(this.errorMessage, ((RetriableError) other).errorMessage);
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "RetriableError(errorMessage=" + this.errorMessage + ")";
        }

        public RetriableError(StringResource errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public final StringResource getErrorMessage() {
            return this.errorMessage;
        }
    }

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NonRetriableError;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent$NonRetriableError */
    public static final /* data */ class NonRetriableError implements MigrationSubmitAssetsDuxo2 {
        public static final int $stable = 0;
        public static final NonRetriableError INSTANCE = new NonRetriableError();

        public boolean equals(Object other) {
            return this == other || (other instanceof NonRetriableError);
        }

        public int hashCode() {
            return 2084655056;
        }

        public String toString() {
            return "NonRetriableError";
        }

        private NonRetriableError() {
        }
    }

    /* compiled from: MigrationSubmitAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent$NonRetriableContactSupportError;", "Lcom/robinhood/shared/crypto/acats/submitassets/MigrationSubmitAssetsEvent;", "deeplink", "", "<init>", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsEvent$NonRetriableContactSupportError, reason: from toString */
    public static final /* data */ class NonRetriableContactSupportError implements MigrationSubmitAssetsDuxo2 {
        public static final int $stable = 0;
        private final String deeplink;

        public static /* synthetic */ NonRetriableContactSupportError copy$default(NonRetriableContactSupportError nonRetriableContactSupportError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nonRetriableContactSupportError.deeplink;
            }
            return nonRetriableContactSupportError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public final NonRetriableContactSupportError copy(String deeplink) {
            return new NonRetriableContactSupportError(deeplink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NonRetriableContactSupportError) && Intrinsics.areEqual(this.deeplink, ((NonRetriableContactSupportError) other).deeplink);
        }

        public int hashCode() {
            String str = this.deeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NonRetriableContactSupportError(deeplink=" + this.deeplink + ")";
        }

        public NonRetriableContactSupportError(String str) {
            this.deeplink = str;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }
    }
}
