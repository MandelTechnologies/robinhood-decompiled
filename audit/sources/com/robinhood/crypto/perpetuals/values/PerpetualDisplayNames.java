package com.robinhood.crypto.perpetuals.values;

import com.robinhood.crypto.models.perpetuals.p288db.MarginMode;
import com.robinhood.crypto.models.perpetuals.p288db.OrderSide;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerpetualDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\f\"\u0015\u0010\r\u001a\u00020\u0001*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m3636d2 = {"displayName", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/db/MarginMode;", "getDisplayName", "(Lcom/robinhood/crypto/models/perpetuals/db/MarginMode;)Lcom/robinhood/utils/resource/StringResource;", "lowerCaseDisplayName", "getLowerCaseDisplayName", "shortDisplayName", "getShortDisplayName", "lowerCaseShortDisplayName", "getLowerCaseShortDisplayName", "Lcom/robinhood/crypto/models/perpetuals/db/OrderSide;", "(Lcom/robinhood/crypto/models/perpetuals/db/OrderSide;)Lcom/robinhood/utils/resource/StringResource;", "lowercaseDisplayName", "getLowercaseDisplayName", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.crypto.perpetuals.values.PerpetualDisplayNamesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PerpetualDisplayNames {

    /* compiled from: PerpetualDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.PerpetualDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MarginMode.values().length];
            try {
                iArr[MarginMode.CROSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginMode.ISOLATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OrderSide.values().length];
            try {
                iArr2[OrderSide.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderSide.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final StringResource getDisplayName(MarginMode marginMode) {
        Intrinsics.checkNotNullParameter(marginMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.cross_margin_full_name, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.isolated_margin_full_name, new Object[0]);
    }

    public static final StringResource getLowerCaseDisplayName(MarginMode marginMode) {
        Intrinsics.checkNotNullParameter(marginMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.cross_margin_lowercase_full_name, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.isolated_margin_lowercase_full_name, new Object[0]);
    }

    public static final StringResource getShortDisplayName(MarginMode marginMode) {
        Intrinsics.checkNotNullParameter(marginMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.cross_margin_short_name, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.isolated_margin_short_name, new Object[0]);
    }

    public static final StringResource getLowerCaseShortDisplayName(MarginMode marginMode) {
        Intrinsics.checkNotNullParameter(marginMode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[marginMode.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.cross_margin_lowercase_short_name, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.isolated_margin_lowercase_short_name, new Object[0]);
    }

    public static final StringResource getDisplayName(OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_side_long, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_side_short, new Object[0]);
    }

    public static final StringResource getLowercaseDisplayName(OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(orderSide, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[orderSide.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_side_lowercase_long, new Object[0]);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C33018R.string.order_side_lowercase_short, new Object[0]);
    }
}
