package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.accountcenter.views.ProfilePageStatus;
import com.robinhood.android.accountcenter.views.ProfileViewDuxo;
import com.robinhood.android.common.udf.ViewDuxo;
import com.robinhood.android.regiongate.AccountCenterBubbleRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ProfilePageStore;
import com.robinhood.librobinhood.data.store.ProfileStore;
import com.robinhood.models.p320db.ProfilePage;
import com.robinhood.udf.UiEvent;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ProfileViewDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileViewDuxo;", "Lcom/robinhood/android/common/udf/ViewDuxo;", "Lcom/robinhood/android/accountcenter/views/ProfileViewState;", "profilePageStore", "Lcom/robinhood/librobinhood/data/store/ProfilePageStore;", "profileStore", "Lcom/robinhood/librobinhood/data/store/ProfileStore;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "hostView", "Landroid/view/View;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ProfilePageStore;Lcom/robinhood/librobinhood/data/store/ProfileStore;Lcom/robinhood/android/regiongate/RegionGateProvider;Landroid/view/View;)V", "onStart", "", "selectAsset", "assetId", "", "toggleDisclosureState", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class ProfileViewDuxo extends ViewDuxo<ProfileViewState> {
    public static final int $stable = 8;
    private final ProfilePageStore profilePageStore;
    private final ProfileStore profileStore;
    private final RegionGateProvider regionGateProvider;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ProfileViewDuxo(ProfilePageStore profilePageStore, ProfileStore profileStore, RegionGateProvider regionGateProvider, View hostView) {
        Intrinsics.checkNotNullParameter(profilePageStore, "profilePageStore");
        Intrinsics.checkNotNullParameter(profileStore, "profileStore");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        Object[] objArr = 0 == true ? 1 : 0;
        super(hostView, new ProfileViewState(null, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), objArr, 4, null);
        this.profilePageStore = profilePageStore;
        this.profileStore = profileStore;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C83131(null), 3, null);
        Observable<UiEvent<Unit>> observableFilter = this.profileStore.streamSavedProfileEvent().filter(new Predicate() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo.onStart.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(UiEvent<Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !it.getConsumed();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFilter, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.onStart$lambda$1(this.f$0, (UiEvent) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RegionGateProvider.DefaultImpls.streamRegionGateState$default(this.regionGateProvider, AccountCenterBubbleRegionGate.INSTANCE, false, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.onStart$lambda$3(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* compiled from: ProfileViewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.accountcenter.views.ProfileViewDuxo$onStart$1", m3645f = "ProfileViewDuxo.kt", m3646l = {27, 31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.accountcenter.views.ProfileViewDuxo$onStart$1 */
    static final class C83131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C83131(Continuation<? super C83131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewDuxo.this.new C83131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProfilePageStore profilePageStore = ProfileViewDuxo.this.profilePageStore;
                this.label = 1;
                if (profilePageStore.refreshProfilePage(false, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Flow flowFilterNotNull = FlowKt.filterNotNull(ProfileViewDuxo.this.profilePageStore.streamProfilePage());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ProfileViewDuxo.this, null);
            this.label = 2;
        }

        /* compiled from: ProfileViewDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "profilePage", "Lcom/robinhood/models/db/ProfilePage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.accountcenter.views.ProfileViewDuxo$onStart$1$1", m3645f = "ProfileViewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.accountcenter.views.ProfileViewDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ProfilePage, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ProfileViewDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProfileViewDuxo profileViewDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = profileViewDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ProfilePage profilePage, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(profilePage, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final ProfilePage profilePage = (ProfilePage) this.L$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$onStart$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ProfileViewDuxo.C83131.AnonymousClass1.invokeSuspend$lambda$0(profilePage, (ProfileViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ProfileViewState invokeSuspend$lambda$0(ProfilePage profilePage, ProfileViewState profileViewState) {
                return ProfileViewState.copy$default(profileViewState, null, new ProfilePageStatus.Success(profilePage), null, null, false, null, false, 125, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(ProfileViewDuxo profileViewDuxo, final UiEvent uiEvent) {
        profileViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.onStart$lambda$1$lambda$0(uiEvent, (ProfileViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewState onStart$lambda$1$lambda$0(UiEvent uiEvent, ProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileViewState.copy$default(applyMutation, uiEvent, null, null, null, false, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(ProfileViewDuxo profileViewDuxo, final boolean z) {
        profileViewDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.onStart$lambda$3$lambda$2(z, (ProfileViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewState onStart$lambda$3$lambda$2(boolean z, ProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileViewState.copy$default(applyMutation, null, null, null, null, false, null, z, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewState selectAsset$lambda$4(String str, ProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileViewState.copy$default(applyMutation, null, null, null, str, false, null, false, 119, null);
    }

    public final void selectAsset(final String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.selectAsset$lambda$4(assetId, (ProfileViewState) obj);
            }
        });
    }

    public final void toggleDisclosureState() {
        applyMutation(new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileViewDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileViewDuxo.toggleDisclosureState$lambda$5((ProfileViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProfileViewState toggleDisclosureState$lambda$5(ProfileViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return ProfileViewState.copy$default(applyMutation, null, null, null, null, !applyMutation.getExpandDisclosure(), null, false, 111, null);
    }
}
