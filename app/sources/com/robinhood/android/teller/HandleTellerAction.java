package com.robinhood.android.teller;

import android.app.Activity;
import android.os.Bundle;
import com.robinhood.utils.extensions.Bundles;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleTellerAction.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"handleTellerAction", "", "Landroid/app/Activity;", "args", "Landroid/os/Bundle;", "key", "", "lib-teller_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.teller.HandleTellerActionKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class HandleTellerAction {

    /* compiled from: HandleTellerAction.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.teller.HandleTellerActionKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TellerErrorAction.values().length];
            try {
                iArr[TellerErrorAction.DISMISS_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TellerErrorAction.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TellerErrorAction.EXIT_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean handleTellerAction(Activity activity, Bundle bundle, String key) {
        TellerErrorAction tellerErrorAction;
        int i;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        if (bundle != null && (tellerErrorAction = (TellerErrorAction) Bundles.getTypedSerializable(bundle, key)) != null && (i = WhenMappings.$EnumSwitchMapping$0[tellerErrorAction.ordinal()]) != 1 && i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            activity.finish();
        }
        return true;
    }
}
