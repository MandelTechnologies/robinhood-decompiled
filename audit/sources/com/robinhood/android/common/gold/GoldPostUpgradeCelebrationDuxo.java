package com.robinhood.android.common.gold;

import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationViewState;
import com.robinhood.android.common.gold.store.GoldPostUpgradeCelebrationStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldPostUpgradeCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "goldPostUpgradeCelebrationStore", "Lcom/robinhood/android/common/gold/store/GoldPostUpgradeCelebrationStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/common/gold/store/GoldPostUpgradeCelebrationStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "fetchPostUpgradeCelebration", "", "source", "", "feature-lib-gold_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class GoldPostUpgradeCelebrationDuxo extends BaseDuxo4<GoldPostUpgradeCelebrationViewState> {
    public static final int $stable = 8;
    private final GoldPostUpgradeCelebrationStore goldPostUpgradeCelebrationStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldPostUpgradeCelebrationDuxo(GoldPostUpgradeCelebrationStore goldPostUpgradeCelebrationStore, DuxoBundle duxoBundle) {
        super(GoldPostUpgradeCelebrationViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldPostUpgradeCelebrationStore, "goldPostUpgradeCelebrationStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldPostUpgradeCelebrationStore = goldPostUpgradeCelebrationStore;
    }

    public final void fetchPostUpgradeCelebration(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_POST_UPGRADE_CELEBRATION_LOADING, true);
        super.onStart();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.goldPostUpgradeCelebrationStore.streamPostUpgradeCelebration(source), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldPostUpgradeCelebrationDuxo.fetchPostUpgradeCelebration$lambda$0(this.f$0, (UiPostTransferPage.PostTransferGoldCelebration) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldPostUpgradeCelebrationDuxo.fetchPostUpgradeCelebration$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPostUpgradeCelebration$lambda$0(GoldPostUpgradeCelebrationDuxo goldPostUpgradeCelebrationDuxo, UiPostTransferPage.PostTransferGoldCelebration goldCelebration) {
        Intrinsics.checkNotNullParameter(goldCelebration, "goldCelebration");
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_POST_UPGRADE_CELEBRATION_LOADING, false);
        goldPostUpgradeCelebrationDuxo.applyMutation(new GoldPostUpgradeCelebrationDuxo2(goldCelebration, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchPostUpgradeCelebration$lambda$1(GoldPostUpgradeCelebrationDuxo goldPostUpgradeCelebrationDuxo, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IdlingResourceCounters2.setBusy(IdlingResourceType.GOLD_POST_UPGRADE_CELEBRATION_LOADING, false);
        goldPostUpgradeCelebrationDuxo.applyMutation(new GoldPostUpgradeCelebrationDuxo3(error, null));
        return Unit.INSTANCE;
    }
}
