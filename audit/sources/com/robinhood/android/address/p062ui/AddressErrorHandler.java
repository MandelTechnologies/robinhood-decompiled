package com.robinhood.android.address.p062ui;

import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressErrorHandler.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00040\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/address/ui/AddressErrorHandler;", "T", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "fragment", "Lcom/robinhood/android/address/ui/AbstractAddressFragment;", "<init>", "(Lcom/robinhood/android/address/ui/AbstractAddressFragment;)V", "fragmentRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "handleUnknownHttpError", "", "throwable", "", "feature-address_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public class AddressErrorHandler<T> extends ActivityErrorHandler<T> {
    private final WeakReference<AbstractAddressFragment> fragmentRef;

    /* JADX WARN: Illegal instructions before constructor call */
    public AddressErrorHandler(AbstractAddressFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        super(fragmentActivityRequireActivity, false, 0, null, 14, null);
        this.fragmentRef = new WeakReference<>(fragment);
    }

    @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler, com.robinhood.android.util.p275rx.AbsErrorHandler
    protected boolean handleUnknownHttpError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        AbstractAddressFragment abstractAddressFragment = this.fragmentRef.get();
        if (abstractAddressFragment != null) {
            abstractAddressFragment.logError(throwable);
        }
        return super.handleUnknownHttpError(throwable);
    }
}
