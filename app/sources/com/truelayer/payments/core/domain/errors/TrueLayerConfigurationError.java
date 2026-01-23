package com.truelayer.payments.core.domain.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrueLayerConfigurationError.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0006\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "message", "", "(Ljava/lang/String;)V", "AlreadyInitialised", "InvalidParameter", "NotInitialised", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$AlreadyInitialised;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$InvalidParameter;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$NotInitialised;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public abstract class TrueLayerConfigurationError extends IllegalArgumentException {
    public /* synthetic */ TrueLayerConfigurationError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private TrueLayerConfigurationError(String str) {
        super(str);
    }

    /* compiled from: TrueLayerConfigurationError.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$InvalidParameter;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class InvalidParameter extends TrueLayerConfigurationError {
        private final String description;
        private final String name;

        public static /* synthetic */ InvalidParameter copy$default(InvalidParameter invalidParameter, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invalidParameter.name;
            }
            if ((i & 2) != 0) {
                str2 = invalidParameter.description;
            }
            return invalidParameter.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public final InvalidParameter copy(String name, String description) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            return new InvalidParameter(name, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvalidParameter)) {
                return false;
            }
            InvalidParameter invalidParameter = (InvalidParameter) other;
            return Intrinsics.areEqual(this.name, invalidParameter.name) && Intrinsics.areEqual(this.description, invalidParameter.description);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.description.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidParameter(name=" + this.name + ", description=" + this.description + ")";
        }

        public final String getName() {
            return this.name;
        }

        public /* synthetic */ InvalidParameter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2);
        }

        public final String getDescription() {
            return this.description;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidParameter(String name, String description) {
            super("Invalid parameter provided ``. " + description, null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(description, "description");
            this.name = name;
            this.description = description;
        }
    }

    /* compiled from: TrueLayerConfigurationError.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$NotInitialised;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class NotInitialised extends TrueLayerConfigurationError {
        private final String name;

        public static /* synthetic */ NotInitialised copy$default(NotInitialised notInitialised, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notInitialised.name;
            }
            return notInitialised.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final NotInitialised copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new NotInitialised(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NotInitialised) && Intrinsics.areEqual(this.name, ((NotInitialised) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NotInitialised(name=" + this.name + ")";
        }

        public final String getName() {
            return this.name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotInitialised(String name) {
            super("`" + name + "` was not initialised. Please initialise `" + name + "` configuration before using the TrueLayer SDK.", null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }
    }

    /* compiled from: TrueLayerConfigurationError.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError$AlreadyInitialised;", "Lcom/truelayer/payments/core/domain/errors/TrueLayerConfigurationError;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class AlreadyInitialised extends TrueLayerConfigurationError {
        private final String name;

        public static /* synthetic */ AlreadyInitialised copy$default(AlreadyInitialised alreadyInitialised, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = alreadyInitialised.name;
            }
            return alreadyInitialised.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final AlreadyInitialised copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new AlreadyInitialised(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AlreadyInitialised) && Intrinsics.areEqual(this.name, ((AlreadyInitialised) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "AlreadyInitialised(name=" + this.name + ")";
        }

        public final String getName() {
            return this.name;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyInitialised(String name) {
            super("`" + name + "` is already set & initialised & cannot be updated.", null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }
    }
}
