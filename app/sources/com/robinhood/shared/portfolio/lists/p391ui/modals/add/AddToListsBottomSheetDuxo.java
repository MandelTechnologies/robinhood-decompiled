package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.contracts.AddToListsBottomSheetKey;
import com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetEvent;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.utils.extensions.Throwables;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AddToListsBottomSheetDuxo.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u001eB1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0015H\u0016J4\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetViewState;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "updateListCheckedState", "listId", "Ljava/util/UUID;", "checkedListIds", "Lkotlinx/collections/immutable/ImmutableSet;", "userListIdsWithSecurity", "shouldCheck", "", "Companion", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class AddToListsBottomSheetDuxo extends BaseDuxo3<AddToListsBottomSheetDataState, AddToListsBottomSheetViewState, AddToListsBottomSheetEvent> implements HasSavedState {
    private final CuratedListStore curatedListStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddToListsBottomSheetDuxo(CuratedListStore curatedListStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, SavedStateHandle savedStateHandle, AddToListsBottomSheetStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new AddToListsBottomSheetDataState(((AddToListsBottomSheetKey) companion.getArgs(savedStateHandle)).isSingleSelect(), ((AddToListsBottomSheetKey) companion.getArgs(savedStateHandle)).getSecurity(), null, null, null, null, 60, null), stateProvider, duxoBundle);
        this.curatedListStore = curatedListStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().launchWhenStarted(new C394401(null));
    }

    /* compiled from: AddToListsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1 */
    static final class C394401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C394401(Continuation<? super C394401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394401 c394401 = AddToListsBottomSheetDuxo.this.new C394401(continuation);
            c394401.L$0 = obj;
            return c394401;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C394401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            UUID id = ((AddToListsBottomSheetKey) AddToListsBottomSheetDuxo.INSTANCE.getArgs((HasSavedState) AddToListsBottomSheetDuxo.this)).getSecurity().getId();
            AddToListsBottomSheetDuxo.this.curatedListStore.refreshFollowedLists(false);
            ListItemIdToUserListIdsStore.refresh$default(AddToListsBottomSheetDuxo.this.listItemIdToUserListIdsStore, false, 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AddToListsBottomSheetDuxo.this, id, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AddToListsBottomSheetDuxo.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: AddToListsBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {49}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ UUID $securityId;
            int label;
            final /* synthetic */ AddToListsBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = addToListsBottomSheetDuxo;
                this.$securityId = uuid;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$securityId, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        final Flow<List<UUID>> flowStreamCo = this.this$0.listItemIdToUserListIdsStore.streamCo(this.$securityId);
                        Flow<Set<? extends UUID>> flow = new Flow<Set<? extends UUID>>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                                public static final class AnonymousClass1 extends ContinuationImpl {
                                    Object L$0;
                                    int label;
                                    /* synthetic */ Object result;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                    public final Object invokeSuspend(Object obj) {
                                        this.result = obj;
                                        this.label |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.$this_unsafeFlow = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object emit(Object obj, Continuation continuation) {
                                    AnonymousClass1 anonymousClass1;
                                    if (continuation instanceof AnonymousClass1) {
                                        anonymousClass1 = (AnonymousClass1) continuation;
                                        int i = anonymousClass1.label;
                                        if ((i & Integer.MIN_VALUE) != 0) {
                                            anonymousClass1.label = i - Integer.MIN_VALUE;
                                        } else {
                                            anonymousClass1 = new AnonymousClass1(continuation);
                                        }
                                    }
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = anonymousClass1.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        Set set = CollectionsKt.toSet((List) obj);
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(set, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                                Object objCollect = flowStreamCo.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                            }
                        };
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    this.this$0.submit(new AddToListsBottomSheetEvent.Error(th));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AddToListsBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$2", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Set<? extends UUID>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AddToListsBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.this$0 = addToListsBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Set<? extends UUID> set, Continuation<? super Unit> continuation) {
                    return invoke2((Set<UUID>) set, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Set<UUID> set, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(set, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AddToListsBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$2$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$1$2$1, reason: invalid class name and collision with other inner class name */
                static final class C507441 extends ContinuationImpl7 implements Function2<AddToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState>, Object> {
                    final /* synthetic */ Set<UUID> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507441(Set<UUID> set, Continuation<? super C507441> continuation) {
                        super(2, continuation);
                        this.$it = set;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507441 c507441 = new C507441(this.$it, continuation);
                        c507441.L$0 = obj;
                        return c507441;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AddToListsBottomSheetDataState addToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState> continuation) {
                        return ((C507441) create(addToListsBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AddToListsBottomSheetDataState.copy$default((AddToListsBottomSheetDataState) this.L$0, false, null, null, this.$it, null, null, 55, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507441((Set) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AddToListsBottomSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AddToListsBottomSheetDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = addToListsBottomSheetDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<List<CuratedList>> flowStreamFollowedCuratedListsInOrder = this.this$0.curatedListStore.streamFollowedCuratedListsInOrder();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowStreamFollowedCuratedListsInOrder, anonymousClass1, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } catch (Throwable th) {
                    if (!Throwables.isNetworkRelated(th)) {
                        throw th;
                    }
                    this.this$0.submit(new AddToListsBottomSheetEvent.Error(th));
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AddToListsBottomSheetDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/db/CuratedList;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends CuratedList>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AddToListsBottomSheetDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = addToListsBottomSheetDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends CuratedList> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<CuratedList>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<CuratedList> list, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AddToListsBottomSheetDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2$1$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$onCreate$1$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C507451 extends ContinuationImpl7 implements Function2<AddToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState>, Object> {
                    final /* synthetic */ List<CuratedList> $it;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C507451(List<CuratedList> list, Continuation<? super C507451> continuation) {
                        super(2, continuation);
                        this.$it = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C507451 c507451 = new C507451(this.$it, continuation);
                        c507451.L$0 = obj;
                        return c507451;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AddToListsBottomSheetDataState addToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState> continuation) {
                        return ((C507451) create(addToListsBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AddToListsBottomSheetDataState.copy$default((AddToListsBottomSheetDataState) this.L$0, false, null, null, null, this.$it, null, 47, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C507451((List) this.L$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* compiled from: AddToListsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$updateListCheckedState$1", m3645f = "AddToListsBottomSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetDuxo$updateListCheckedState$1 */
    static final class C394411 extends ContinuationImpl7 implements Function2<AddToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState>, Object> {
        final /* synthetic */ ImmutableSet<UUID> $checkedListIds;
        final /* synthetic */ UUID $listId;
        final /* synthetic */ boolean $shouldCheck;
        final /* synthetic */ ImmutableSet<UUID> $userListIdsWithSecurity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C394411(ImmutableSet<UUID> immutableSet, ImmutableSet<UUID> immutableSet2, boolean z, UUID uuid, Continuation<? super C394411> continuation) {
            super(2, continuation);
            this.$checkedListIds = immutableSet;
            this.$userListIdsWithSecurity = immutableSet2;
            this.$shouldCheck = z;
            this.$listId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C394411 c394411 = new C394411(this.$checkedListIds, this.$userListIdsWithSecurity, this.$shouldCheck, this.$listId, continuation);
            c394411.L$0 = obj;
            return c394411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AddToListsBottomSheetDataState addToListsBottomSheetDataState, Continuation<? super AddToListsBottomSheetDataState> continuation) {
            return ((C394411) create(addToListsBottomSheetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set setMinus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AddToListsBottomSheetDataState addToListsBottomSheetDataState = (AddToListsBottomSheetDataState) this.L$0;
            ImmutableSet<UUID> immutableSet = this.$checkedListIds;
            if (immutableSet == null) {
                immutableSet = this.$userListIdsWithSecurity;
            }
            if (this.$shouldCheck) {
                setMinus = SetsKt.plus(immutableSet, this.$listId);
            } else {
                setMinus = SetsKt.minus(immutableSet, this.$listId);
            }
            return AddToListsBottomSheetDataState.copy$default(addToListsBottomSheetDataState, false, null, setMinus, null, null, null, 59, null);
        }
    }

    public final void updateListCheckedState(UUID listId, ImmutableSet<UUID> checkedListIds, ImmutableSet<UUID> userListIdsWithSecurity, boolean shouldCheck) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(userListIdsWithSecurity, "userListIdsWithSecurity");
        applyMutation(new C394411(checkedListIds, userListIdsWithSecurity, shouldCheck, listId, null));
    }

    /* compiled from: AddToListsBottomSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDuxo;", "Lcom/robinhood/shared/portfolio/contracts/AddToListsBottomSheetKey;", "<init>", "()V", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AddToListsBottomSheetDuxo, AddToListsBottomSheetKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AddToListsBottomSheetKey getArgs(SavedStateHandle savedStateHandle) {
            return (AddToListsBottomSheetKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AddToListsBottomSheetKey getArgs(AddToListsBottomSheetDuxo addToListsBottomSheetDuxo) {
            return (AddToListsBottomSheetKey) DuxoCompanion.DefaultImpls.getArgs(this, addToListsBottomSheetDuxo);
        }
    }
}
