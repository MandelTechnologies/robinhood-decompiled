package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.OrderStatus;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OrderStatusDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/OrderStatus;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/OrderStatus;)Lcom/robinhood/utils/resource/StringResource;", "lowercaseDisplayName", "getLowercaseDisplayName", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.OrderStatusDisplayNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OrderStatusDisplayNames {

    /* compiled from: OrderStatusDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.OrderStatusDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderStatus.values().length];
            try {
                iArr[OrderStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStatus.UNCONFIRMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStatus.CONFIRMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStatus.FILLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderStatus.PARTIALLY_FILLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderStatus.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderStatus.EXPIRED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderStatus.CANCELLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderStatus.PENDING_CANCEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[OrderStatus.REJECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getDisplayName(OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[orderStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_placed, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_filled, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_partially_filled, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_failed, new Object[0]);
            case 8:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_expired, new Object[0]);
            case 9:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_cancelled, new Object[0]);
            case 10:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending_cancel, new Object[0]);
            case 11:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_rejected, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final StringResource getLowercaseDisplayName(OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[orderStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending_lowercase, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_placed_lowercase, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_filled_lowercase, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_partially_filled_lowercase, new Object[0]);
            case 7:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_failed_lowercase, new Object[0]);
            case 8:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_expired_lowercase, new Object[0]);
            case 9:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_cancelled_lowercase, new Object[0]);
            case 10:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_pending_cancel_lowercase, new Object[0]);
            case 11:
                return StringResource.INSTANCE.invoke(C33018R.string.order_status_rejected_lowercase, new Object[0]);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
