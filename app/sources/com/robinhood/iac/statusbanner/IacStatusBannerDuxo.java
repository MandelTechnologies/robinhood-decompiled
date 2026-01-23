package com.robinhood.iac.statusbanner;

import android.view.View;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacStatusBanner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IacStatusBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/iac/statusbanner/IacStatusBannerDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/iac/statusbanner/IacStatusBannerViewState;", "hostView", "Landroid/view/View;", "statusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "<init>", "(Landroid/view/View;Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;)V", "postBannerTapped", "", "receiptUuid", "Ljava/util/UUID;", "action", "", "postBannerDismissed", "method", "Lcom/robinhood/models/api/IacDismissMethod;", "setIacBanner", "statusBanner", "Lcom/robinhood/models/db/IacStatusBanner;", "lib-iac-status-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class IacStatusBannerDuxo extends ViewDuxo<IacStatusBannerViewState> {
    private final IacStatusBannerStore statusBannerStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IacStatusBannerDuxo(View hostView, IacStatusBannerStore statusBannerStore) {
        super(hostView, new IacStatusBannerViewState(null, 1, 0 == true ? 1 : 0), null, 4, null);
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Intrinsics.checkNotNullParameter(statusBannerStore, "statusBannerStore");
        this.statusBannerStore = statusBannerStore;
    }

    public final void postBannerTapped(UUID receiptUuid, String action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleHost.DefaultImpls.bind$default(this, this.statusBannerStore.postTapped(receiptUuid, action), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void postBannerDismissed(UUID receiptUuid, IacDismissMethod method) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(method, "method");
        LifecycleHost.DefaultImpls.bind$default(this, this.statusBannerStore.postDismissed(receiptUuid, method), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    public final void setIacBanner(final IacStatusBanner statusBanner) {
        Intrinsics.checkNotNullParameter(statusBanner, "statusBanner");
        applyMutation(new Function1() { // from class: com.robinhood.iac.statusbanner.IacStatusBannerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IacStatusBannerDuxo.setIacBanner$lambda$0(statusBanner, (IacStatusBannerViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IacStatusBannerViewState setIacBanner$lambda$0(IacStatusBanner iacStatusBanner, IacStatusBannerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(iacStatusBanner);
    }
}
