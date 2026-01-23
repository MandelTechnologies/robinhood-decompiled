package com.robinhood.android.margin.p174ui.instant;

import com.robinhood.android.margin.p174ui.instant.InstantUpgradeSplashDuxo;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeSplashDuxo2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.ReferralCode;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantUpgradeSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeSplashState;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "<init>", "(Lcom/robinhood/librobinhood/util/PersistentCacheManager;)V", "onStart", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class InstantUpgradeSplashDuxo extends OldBaseDuxo<InstantUpgradeSplashDuxo2> {
    public static final int $stable = 8;
    private final PersistentCacheManager persistentCacheManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstantUpgradeSplashDuxo(PersistentCacheManager persistentCacheManager) {
        super(InstantUpgradeSplashDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        this.persistentCacheManager = persistentCacheManager;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable<ReferralCode> observableDoOnSubscribe = this.persistentCacheManager.getReferralCode().doOnSubscribe(new C210731());
        Intrinsics.checkNotNullExpressionValue(observableDoOnSubscribe, "doOnSubscribe(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeSplashDuxo.onStart$lambda$1(this.f$0, (ReferralCode) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeSplashDuxo.onStart$lambda$3(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: InstantUpgradeSplashDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$onStart$1 */
    static final class C210731<T> implements Consumer {
        C210731() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final InstantUpgradeSplashDuxo2 accept$lambda$0(InstantUpgradeSplashDuxo2 applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return InstantUpgradeSplashDuxo2.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            InstantUpgradeSplashDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$onStart$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return InstantUpgradeSplashDuxo.C210731.accept$lambda$0((InstantUpgradeSplashDuxo2) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(InstantUpgradeSplashDuxo instantUpgradeSplashDuxo, final ReferralCode referralCode) {
        instantUpgradeSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeSplashDuxo.onStart$lambda$1$lambda$0(referralCode, (InstantUpgradeSplashDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeSplashDuxo2 onStart$lambda$1$lambda$0(ReferralCode referralCode, InstantUpgradeSplashDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(referralCode);
        return new InstantUpgradeSplashDuxo2.ShowInstantSplash(referralCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(InstantUpgradeSplashDuxo instantUpgradeSplashDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        instantUpgradeSplashDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeSplashDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstantUpgradeSplashDuxo.onStart$lambda$3$lambda$2(it, (InstantUpgradeSplashDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InstantUpgradeSplashDuxo2 onStart$lambda$3$lambda$2(Throwable th, InstantUpgradeSplashDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return new InstantUpgradeSplashDuxo2.Error(new UiEvent(th));
    }
}
