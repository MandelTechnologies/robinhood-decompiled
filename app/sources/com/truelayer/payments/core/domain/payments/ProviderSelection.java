package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rJ\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "", "providerId", "", "getProviderId", "()Ljava/lang/String;", "schemeSelectionType", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "getSchemeSelectionType", "()Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "copyWithProviderId", "Companion", "PreSelected", "UserSelected", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface ProviderSelection {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    ProviderSelection copyWithProviderId(String providerId);

    String getProviderId();

    SchemeSelectionType getSchemeSelectionType();

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderSelection$UserSelected;", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "providerId", "", "schemeSelectionType", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;)V", "getProviderId", "()Ljava/lang/String;", "getSchemeSelectionType", "()Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "component1", "component2", "copy", "copyWithProviderId", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class UserSelected implements ProviderSelection {
        private final String providerId;
        private final SchemeSelectionType schemeSelectionType;

        public static /* synthetic */ UserSelected copy$default(UserSelected userSelected, String str, SchemeSelectionType schemeSelectionType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userSelected.providerId;
            }
            if ((i & 2) != 0) {
                schemeSelectionType = userSelected.schemeSelectionType;
            }
            return userSelected.copy(str, schemeSelectionType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final SchemeSelectionType getSchemeSelectionType() {
            return this.schemeSelectionType;
        }

        public final UserSelected copy(String providerId, SchemeSelectionType schemeSelectionType) {
            Intrinsics.checkNotNullParameter(schemeSelectionType, "schemeSelectionType");
            return new UserSelected(providerId, schemeSelectionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserSelected)) {
                return false;
            }
            UserSelected userSelected = (UserSelected) other;
            return Intrinsics.areEqual(this.providerId, userSelected.providerId) && Intrinsics.areEqual(this.schemeSelectionType, userSelected.schemeSelectionType);
        }

        public int hashCode() {
            String str = this.providerId;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.schemeSelectionType.hashCode();
        }

        public String toString() {
            return "UserSelected(providerId=" + this.providerId + ", schemeSelectionType=" + this.schemeSelectionType + ")";
        }

        public UserSelected(String str, SchemeSelectionType schemeSelectionType) {
            Intrinsics.checkNotNullParameter(schemeSelectionType, "schemeSelectionType");
            this.providerId = str;
            this.schemeSelectionType = schemeSelectionType;
        }

        public /* synthetic */ UserSelected(String str, SchemeSelectionType schemeSelectionType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, schemeSelectionType);
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public String getProviderId() {
            return this.providerId;
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public SchemeSelectionType getSchemeSelectionType() {
            return this.schemeSelectionType;
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public ProviderSelection copyWithProviderId(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return copy$default(this, providerId, null, 2, null);
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderSelection$PreSelected;", "Lcom/truelayer/payments/core/domain/payments/ProviderSelection;", "providerId", "", "schemeSelectionType", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "(Ljava/lang/String;Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;)V", "getProviderId", "()Ljava/lang/String;", "getSchemeSelectionType", "()Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "component1", "component2", "copy", "copyWithProviderId", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class PreSelected implements ProviderSelection {
        private final String providerId;
        private final SchemeSelectionType schemeSelectionType;

        public static /* synthetic */ PreSelected copy$default(PreSelected preSelected, String str, SchemeSelectionType schemeSelectionType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = preSelected.providerId;
            }
            if ((i & 2) != 0) {
                schemeSelectionType = preSelected.schemeSelectionType;
            }
            return preSelected.copy(str, schemeSelectionType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final SchemeSelectionType getSchemeSelectionType() {
            return this.schemeSelectionType;
        }

        public final PreSelected copy(String providerId, SchemeSelectionType schemeSelectionType) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(schemeSelectionType, "schemeSelectionType");
            return new PreSelected(providerId, schemeSelectionType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreSelected)) {
                return false;
            }
            PreSelected preSelected = (PreSelected) other;
            return Intrinsics.areEqual(this.providerId, preSelected.providerId) && Intrinsics.areEqual(this.schemeSelectionType, preSelected.schemeSelectionType);
        }

        public int hashCode() {
            return (this.providerId.hashCode() * 31) + this.schemeSelectionType.hashCode();
        }

        public String toString() {
            return "PreSelected(providerId=" + this.providerId + ", schemeSelectionType=" + this.schemeSelectionType + ")";
        }

        public PreSelected(String providerId, SchemeSelectionType schemeSelectionType) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            Intrinsics.checkNotNullParameter(schemeSelectionType, "schemeSelectionType");
            this.providerId = providerId;
            this.schemeSelectionType = schemeSelectionType;
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public String getProviderId() {
            return this.providerId;
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public SchemeSelectionType getSchemeSelectionType() {
            return this.schemeSelectionType;
        }

        @Override // com.truelayer.payments.core.domain.payments.ProviderSelection
        public ProviderSelection copyWithProviderId(String providerId) {
            Intrinsics.checkNotNullParameter(providerId, "providerId");
            return copy$default(this, providerId, null, 2, null);
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/ProviderSelection$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
