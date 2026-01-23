package com.robinhood.android.securitycenter.p251ui.devices;

import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.models.api.ApiTrustedDevice;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedDeviceTypes.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"labelResId", "", "Lcom/robinhood/models/api/ApiTrustedDevice$Type;", "getLabelResId", "(Lcom/robinhood/models/api/ApiTrustedDevice$Type;)I", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.devices.TrustedDeviceTypesKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class TrustedDeviceTypes {

    /* compiled from: TrustedDeviceTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.TrustedDeviceTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTrustedDevice.Type.values().length];
            try {
                iArr[ApiTrustedDevice.Type.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTrustedDevice.Type.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTrustedDevice.Type.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getLabelResId(ApiTrustedDevice.Type type2) {
        Intrinsics.checkNotNullParameter(type2, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            return C28186R.string.trusted_device_detail_device_type_mobile;
        }
        if (i == 2) {
            return C28186R.string.trusted_device_detail_device_type_web;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C28186R.string.trusted_device_detail_device_type_unknown;
    }
}
