package com.robinhood.android.support.call.banner;

import android.view.View;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.SupportPhoneIssueStore;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallBannerDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/support/call/banner/SupportCallBannerDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/support/call/banner/SupportCallBannerViewState;", "supportPhoneIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;Lcom/robinhood/shared/security/auth/AuthManager;Landroid/view/View;)V", "issueIdRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "onStart", "", "setIssueId", "issueId", "cancelIssue", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportCallBannerDuxo extends ViewDuxo<SupportCallBannerViewState> {
    public static final int $stable = 8;
    private final AuthManager authManager;
    private final BehaviorRelay<UUID> issueIdRelay;
    private final SupportPhoneIssueStore supportPhoneIssueStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCallBannerDuxo(SupportPhoneIssueStore supportPhoneIssueStore, AuthManager authManager, View hostView) {
        super(hostView, new SupportCallBannerViewState(null, false, null, authManager.isLoggedIn(), 7, null), null, 4, null);
        Intrinsics.checkNotNullParameter(supportPhoneIssueStore, "supportPhoneIssueStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.supportPhoneIssueStore = supportPhoneIssueStore;
        this.authManager = authManager;
        BehaviorRelay<UUID> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.issueIdRelay = behaviorRelayCreate;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        Observable observableSwitchMap = Observable.just(Boolean.valueOf(this.authManager.isLoggedIn())).switchMap(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Issue.Phone> apply(Boolean isLoggedIn) {
                Intrinsics.checkNotNullParameter(isLoggedIn, "isLoggedIn");
                if (isLoggedIn.booleanValue()) {
                    Observable<T> observableDistinctUntilChanged = SupportCallBannerDuxo.this.issueIdRelay.distinctUntilChanged();
                    final SupportCallBannerDuxo supportCallBannerDuxo = SupportCallBannerDuxo.this;
                    return observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo.onStart.1.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Issue.Phone> apply(UUID issueId) {
                            Intrinsics.checkNotNullParameter(issueId, "issueId");
                            return supportCallBannerDuxo.supportPhoneIssueStore.streamPhoneIssue(issueId);
                        }
                    });
                }
                return ObservablesKt.filterIsPresent(SupportCallBannerDuxo.this.supportPhoneIssueStore.streamLoggedOutPhoneIssue());
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.onStart$lambda$1(this.f$0, (Issue.Phone) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SupportCallBannerDuxo supportCallBannerDuxo, final Issue.Phone phone) {
        supportCallBannerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.onStart$lambda$1$lambda$0(phone, (SupportCallBannerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallBannerViewState onStart$lambda$1$lambda$0(Issue.Phone phone, SupportCallBannerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallBannerViewState.copy$default(applyMutation, null, false, phone, false, 11, null);
    }

    public final void setIssueId(UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        this.issueIdRelay.accept(issueId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallBannerViewState cancelIssue$lambda$2(SupportCallBannerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallBannerViewState.copy$default(applyMutation, null, true, null, false, 13, null);
    }

    public final void cancelIssue() {
        applyMutation(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.cancelIssue$lambda$2((SupportCallBannerViewState) obj);
            }
        });
        SupportPhoneIssueStore supportPhoneIssueStore = this.supportPhoneIssueStore;
        UUID value = this.issueIdRelay.getValue();
        Intrinsics.checkNotNull(value);
        LifecycleHost.DefaultImpls.bind$default(this, supportPhoneIssueStore.cancelIssue(value), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.cancelIssue$lambda$4(this.f$0, (Issue) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.cancelIssue$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelIssue$lambda$4(SupportCallBannerDuxo supportCallBannerDuxo, Issue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        supportCallBannerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.cancelIssue$lambda$4$lambda$3((SupportCallBannerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallBannerViewState cancelIssue$lambda$4$lambda$3(SupportCallBannerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallBannerViewState.copy$default(applyMutation, null, false, null, false, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelIssue$lambda$6(SupportCallBannerDuxo supportCallBannerDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        supportCallBannerDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.support.call.banner.SupportCallBannerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportCallBannerDuxo.cancelIssue$lambda$6$lambda$5(t, (SupportCallBannerViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportCallBannerViewState cancelIssue$lambda$6$lambda$5(Throwable th, SupportCallBannerViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return SupportCallBannerViewState.copy$default(applyMutation, new UiEvent(th), false, null, false, 12, null);
    }
}
