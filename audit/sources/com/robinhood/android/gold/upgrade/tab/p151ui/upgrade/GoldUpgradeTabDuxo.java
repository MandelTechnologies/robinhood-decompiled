package com.robinhood.android.gold.upgrade.tab.p151ui.upgrade;

import com.robinhood.android.gold.upgrade.tab.model.ApiGoldUpgradeTab;
import com.robinhood.android.gold.upgrade.tab.p151ui.upgrade.GoldUpgradeTabState;
import com.robinhood.android.gold.upgrade.tab.store.GoldUpgradeTabStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* compiled from: GoldUpgradeTabDuxo.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState;", "goldUpgradeTabStore", "Lcom/robinhood/android/gold/upgrade/tab/store/GoldUpgradeTabStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/gold/upgrade/tab/store/GoldUpgradeTabStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "onRefreshRequested", "feature-gold-upgrade-tab_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldUpgradeTabDuxo extends BaseDuxo4<GoldUpgradeTabState> {
    public static final int $stable = 8;
    private final GoldUpgradeTabStore goldUpgradeTabStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldUpgradeTabDuxo(GoldUpgradeTabStore goldUpgradeTabStore, DuxoBundle duxoBundle) {
        super(GoldUpgradeTabState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(goldUpgradeTabStore, "goldUpgradeTabStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.goldUpgradeTabStore = goldUpgradeTabStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        onRefreshRequested();
    }

    /* compiled from: GoldUpgradeTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1", m3645f = "GoldUpgradeTabDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1 */
    static final class C181621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C181621(Continuation<? super C181621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldUpgradeTabDuxo.this.new C181621(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C181621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GoldUpgradeTabStore goldUpgradeTabStore = GoldUpgradeTabDuxo.this.goldUpgradeTabStore;
                this.label = 1;
                obj = goldUpgradeTabStore.getGoldUpgradeTab(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiGoldUpgradeTab apiGoldUpgradeTab = (ApiGoldUpgradeTab) obj;
            if (apiGoldUpgradeTab == null) {
                GoldUpgradeTabDuxo.this.applyMutation(new AnonymousClass1(null));
            } else {
                GoldUpgradeTabDuxo.this.applyMutation(new AnonymousClass2(apiGoldUpgradeTab, null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: GoldUpgradeTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1$1", m3645f = "GoldUpgradeTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldUpgradeTabState, Continuation<? super GoldUpgradeTabState>, Object> {
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldUpgradeTabState goldUpgradeTabState, Continuation<? super GoldUpgradeTabState> continuation) {
                return ((AnonymousClass1) create(goldUpgradeTabState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return GoldUpgradeTabState.Error.INSTANCE;
            }
        }

        /* compiled from: GoldUpgradeTabDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1$2", m3645f = "GoldUpgradeTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<GoldUpgradeTabState, Continuation<? super GoldUpgradeTabState>, Object> {
            final /* synthetic */ ApiGoldUpgradeTab $apiResult;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ApiGoldUpgradeTab apiGoldUpgradeTab, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$apiResult = apiGoldUpgradeTab;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$apiResult, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(GoldUpgradeTabState goldUpgradeTabState, Continuation<? super GoldUpgradeTabState> continuation) {
                return ((AnonymousClass2) create(goldUpgradeTabState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new GoldUpgradeTabState.Success(this.$apiResult);
            }
        }
    }

    public final void onRefreshRequested() {
        Timber.INSTANCE.mo3350d("onRefreshRequested()", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C181621(null), 3, null);
        applyMutation(new C181632(null));
    }

    /* compiled from: GoldUpgradeTabDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/tab/ui/upgrade/GoldUpgradeTabState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$2", m3645f = "GoldUpgradeTabDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.tab.ui.upgrade.GoldUpgradeTabDuxo$onRefreshRequested$2 */
    static final class C181632 extends ContinuationImpl7 implements Function2<GoldUpgradeTabState, Continuation<? super GoldUpgradeTabState>, Object> {
        int label;

        C181632(Continuation<? super C181632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C181632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GoldUpgradeTabState goldUpgradeTabState, Continuation<? super GoldUpgradeTabState> continuation) {
            return ((C181632) create(goldUpgradeTabState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return GoldUpgradeTabState.Loading.INSTANCE;
        }
    }
}
