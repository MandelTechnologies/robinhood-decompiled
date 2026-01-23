package com.robinhood.android.acatsin.bonusInfo;

import com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore;
import com.robinhood.models.api.bonfire.ApiAcatsBonusModalContentResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsBonusInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "fetchModal", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsBonusInfoDuxo extends BaseDuxo4<AcatsBonusInfoViewState> {
    public static final int $stable = 8;
    private final AcatsBonusStore acatsBonusStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsBonusInfoDuxo(AcatsBonusStore acatsBonusStore, DuxoBundle duxoBundle) {
        super(AcatsBonusInfoViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsBonusStore = acatsBonusStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        fetchModal();
    }

    public final void fetchModal() {
        LifecycleHost.DefaultImpls.bind$default(this, this.acatsBonusStore.getBonusModal(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsBonusInfoDuxo.fetchModal$lambda$0(this.f$0, (ApiAcatsBonusModalContentResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsBonusInfoDuxo.fetchModal$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchModal$lambda$0(AcatsBonusInfoDuxo acatsBonusInfoDuxo, ApiAcatsBonusModalContentResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        acatsBonusInfoDuxo.applyMutation(new AcatsBonusInfoDuxo2(response, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchModal$lambda$1(AcatsBonusInfoDuxo acatsBonusInfoDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        acatsBonusInfoDuxo.applyMutation(new AcatsBonusInfoDuxo3(null));
        return Unit.INSTANCE;
    }
}
