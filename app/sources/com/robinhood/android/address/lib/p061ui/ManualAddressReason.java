package com.robinhood.android.address.lib.p061ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ManualAddressReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "", "<init>", "()V", "UserAction", "Error", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$UserAction;", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class ManualAddressReason {
    public /* synthetic */ ManualAddressReason(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ManualAddressReason() {
    }

    /* compiled from: ManualAddressReason.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/ManualAddressReason$UserAction;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "<init>", "()V", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UserAction extends ManualAddressReason {
        public static final UserAction INSTANCE = new UserAction();

        private UserAction() {
            super(null);
        }
    }

    /* compiled from: ManualAddressReason.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason;", "<init>", "()V", "Generic", "CashManagementShippingAddressLength", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error$CashManagementShippingAddressLength;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error$Generic;", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Error extends ManualAddressReason {
        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
            super(null);
        }

        /* compiled from: ManualAddressReason.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error$Generic;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error;", "<init>", "()V", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Generic extends Error {
            public static final Generic INSTANCE = new Generic();

            private Generic() {
                super(null);
            }
        }

        /* compiled from: ManualAddressReason.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error$CashManagementShippingAddressLength;", "Lcom/robinhood/android/address/lib/ui/ManualAddressReason$Error;", "<init>", "()V", "feature-lib-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class CashManagementShippingAddressLength extends Error {
            public static final CashManagementShippingAddressLength INSTANCE = new CashManagementShippingAddressLength();

            private CashManagementShippingAddressLength() {
                super(null);
            }
        }
    }
}
