package com.robinhood.shared.onboarding.lib.menuofoption;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.store.AsyncResult;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MenuOfOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDataState;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsViewState;", "stateProvider", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsStateProvider;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsStateProvider;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;)V", "job", "Lkotlinx/coroutines/Job;", "poll", "", "args", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "stopPolling", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class MenuOfOptionsDuxo extends BaseDuxo<MenuOfOptionsDataState, MenuOfOptionsViewState> {
    public static final int $stable = 8;
    private Job job;
    private final BaseSortingHatStore sortingHatStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MenuOfOptionsDuxo(MenuOfOptionsDuxo3 stateProvider, BaseSortingHatStore sortingHatStore, AppType appType, DuxoBundle duxoBundle) {
        super(new MenuOfOptionsDataState(null, appType, 1, 0 == true ? 1 : 0), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.sortingHatStore = sortingHatStore;
    }

    /* compiled from: MenuOfOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1", m3645f = "MenuOfOptionsDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1 */
    static final class C392501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SortingHatQueryArgs $args;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C392501(SortingHatQueryArgs sortingHatQueryArgs, Continuation<? super C392501> continuation) {
            super(2, continuation);
            this.$args = sortingHatQueryArgs;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MenuOfOptionsDuxo.this.new C392501(this.$args, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C392501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MenuOfOptionsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1$1", m3645f = "MenuOfOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AsyncResult<? extends SortingHatRecord>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MenuOfOptionsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(MenuOfOptionsDuxo menuOfOptionsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = menuOfOptionsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AsyncResult<SortingHatRecord> asyncResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(asyncResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(AsyncResult<? extends SortingHatRecord> asyncResult, Continuation<? super Unit> continuation) {
                return invoke2((AsyncResult<SortingHatRecord>) asyncResult, continuation);
            }

            /* compiled from: MenuOfOptionsDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1$1$1", m3645f = "MenuOfOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsDuxo$poll$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C507321 extends ContinuationImpl7 implements Function2<MenuOfOptionsDataState, Continuation<? super MenuOfOptionsDataState>, Object> {
                final /* synthetic */ AsyncResult<SortingHatRecord> $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C507321(AsyncResult<SortingHatRecord> asyncResult, Continuation<? super C507321> continuation) {
                    super(2, continuation);
                    this.$it = asyncResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C507321 c507321 = new C507321(this.$it, continuation);
                    c507321.L$0 = obj;
                    return c507321;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(MenuOfOptionsDataState menuOfOptionsDataState, Continuation<? super MenuOfOptionsDataState> continuation) {
                    return ((C507321) create(menuOfOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return MenuOfOptionsDataState.copy$default((MenuOfOptionsDataState) this.L$0, this.$it, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.applyMutation(new C507321((AsyncResult) this.L$0, null));
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<AsyncResult<SortingHatRecord>> flowPollSortingHatExperience = MenuOfOptionsDuxo.this.sortingHatStore.pollSortingHatExperience(this.$args);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MenuOfOptionsDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowPollSortingHatExperience, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void poll(SortingHatQueryArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        super.onCreate();
        this.job = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C392501(args, null), 3, null);
    }

    public final void stopPolling() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }
}
