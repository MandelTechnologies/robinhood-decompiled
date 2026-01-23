package com.robinhood.android.securitycenter.p251ui.data.sharing;

import com.jakewharton.rxrelay2.PublishRelay;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.ccpa.CcpaStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.identi.OptOutConsentStatus;
import io.reactivex.Completable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DataSharingPermissionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/sharing/DataSharingPermissionsDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/data/sharing/DataSharingPermissionsViewState;", "ccpaStore", "Lcom/robinhood/ccpa/CcpaStore;", "<init>", "(Lcom/robinhood/ccpa/CcpaStore;)V", "optOutStatusRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "", "kotlin.jvm.PlatformType", "onCreate", "", "onToggledCheckChanged", "isOptingIn", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DataSharingPermissionsDuxo extends OldBaseDuxo<DataSharingPermissionsViewState> {
    public static final int $stable = 8;
    private final CcpaStore ccpaStore;
    private final PublishRelay<Boolean> optOutStatusRelay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataSharingPermissionsDuxo(CcpaStore ccpaStore) {
        super(new DataSharingPermissionsViewState(null, null, 3, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(ccpaStore, "ccpaStore");
        this.ccpaStore = ccpaStore;
        PublishRelay<Boolean> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.optOutStatusRelay = publishRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, this.ccpaStore.getCcpaOptOutStatus(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataSharingPermissionsDuxo.onCreate$lambda$1(this.f$0, (OptOutConsentStatus) obj);
            }
        });
        PublishRelay<Boolean> publishRelay = this.optOutStatusRelay;
        final CcpaStore ccpaStore = this.ccpaStore;
        Completable completableSwitchMapCompletable = publishRelay.switchMapCompletable(new Function() { // from class: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsDuxo.onCreate.2
            public final Completable apply(boolean z) {
                return ccpaStore.updateCcpaOptOutStatus(z);
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply(((Boolean) obj).booleanValue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSwitchMapCompletable, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(DataSharingPermissionsDuxo dataSharingPermissionsDuxo, final OptOutConsentStatus optOutConsentStatus) {
        Intrinsics.checkNotNullParameter(optOutConsentStatus, "optOutConsentStatus");
        dataSharingPermissionsDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataSharingPermissionsDuxo.onCreate$lambda$1$lambda$0(optOutConsentStatus, (DataSharingPermissionsViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataSharingPermissionsViewState onCreate$lambda$1$lambda$0(OptOutConsentStatus optOutConsentStatus, DataSharingPermissionsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(null, optOutConsentStatus);
    }

    public final void onToggledCheckChanged(final boolean isOptingIn) {
        applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.sharing.DataSharingPermissionsDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DataSharingPermissionsDuxo.onToggledCheckChanged$lambda$2(isOptingIn, (DataSharingPermissionsViewState) obj);
            }
        });
        this.optOutStatusRelay.accept(Boolean.valueOf(isOptingIn));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataSharingPermissionsViewState onToggledCheckChanged$lambda$2(boolean z, DataSharingPermissionsViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(Boolean.valueOf(z), null);
    }
}
