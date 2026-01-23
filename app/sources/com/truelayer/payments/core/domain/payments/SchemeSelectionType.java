package com.truelayer.payments.core.domain.payments;

import kotlin.Metadata;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "", "Companion", "InstantOnly", "InstantPreferred", "UserSelected", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantOnly;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantPreferred;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$UserSelected;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface SchemeSelectionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantOnly;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class InstantOnly implements SchemeSelectionType {
        public static final InstantOnly INSTANCE = new InstantOnly();

        private InstantOnly() {
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$InstantPreferred;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class InstantPreferred implements SchemeSelectionType {
        public static final InstantPreferred INSTANCE = new InstantPreferred();

        private InstantPreferred() {
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$UserSelected;", "Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType;", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class UserSelected implements SchemeSelectionType {
        public static final UserSelected INSTANCE = new UserSelected();

        private UserSelected() {
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/truelayer/payments/core/domain/payments/SchemeSelectionType$Companion;", "", "()V", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
