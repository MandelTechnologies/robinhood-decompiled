package com.robinhood.android.supportchat;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.conversations.TwilioManager;
import com.robinhood.android.supportchat.SupportChatListDataState;
import com.robinhood.android.supportchat.SupportChatListEvent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p355ui.SimpleChatIssue;
import com.robinhood.models.p355ui.SimpleChatIssue2;
import com.robinhood.models.p355ui.pathfinder.messaging.AgentChat;
import com.robinhood.models.p355ui.pathfinder.messaging.SupportChat;
import com.robinhood.models.supportchat.p353db.SocketChatMessage;
import com.robinhood.store.supportchat.ChatExceptions;
import com.robinhood.store.supportchat.SupportChatStore;
import com.robinhood.store.supportchat.salesforce.SalesforceChatStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: SupportChatListDuxo.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0019\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u001a\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015J\u001e\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0\u001c*\u00020 H\u0002J\u000e\u0010!\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0015J(\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020#0\u001d0\u001c*\u00020 2\b\b\u0002\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/supportchat/SupportChatListDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/supportchat/SupportChatListDataState;", "Lcom/robinhood/android/supportchat/SupportChatListViewState;", "Lcom/robinhood/android/supportchat/SupportChatListEvent;", "salesforceChatStore", "Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;", "twilioManager", "Lcom/robinhood/android/lib/conversations/TwilioManager;", "supportChatStore", "Lcom/robinhood/store/supportchat/SupportChatStore;", "stateProvider", "Lcom/robinhood/android/supportchat/SupportChatListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/store/supportchat/salesforce/SalesforceChatStore;Lcom/robinhood/android/lib/conversations/TwilioManager;Lcom/robinhood/store/supportchat/SupportChatStore;Lcom/robinhood/android/supportchat/SupportChatListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "initializeChatList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSupportChatListStreams", "onSupportChatListLoaded", "Lkotlinx/coroutines/Job;", "observeSupportChatList", "observeMessagePreviews", "streamPreviewMessage", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;", "Lcom/robinhood/models/ui/pathfinder/messaging/AgentChat$AgentChatConversation;", "observeUnreadMessageCounts", "streamUnreadMessageCount", "", "isActiveChat", "", "refresh", "feature-support-chat_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SupportChatListDuxo extends BaseDuxo3<SupportChatListDataState, SupportChatListViewState, SupportChatListEvent> {
    public static final int $stable = 8;
    private final SalesforceChatStore salesforceChatStore;
    private final SupportChatStore supportChatStore;
    private final TwilioManager twilioManager;

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo", m3645f = "SupportChatListDuxo.kt", m3646l = {82, 94}, m3647m = "initializeSupportChatListStreams")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$initializeSupportChatListStreams$1 */
    static final class C291141 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291141(Continuation<? super C291141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatListDuxo.this.initializeSupportChatListStreams(this);
        }
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo", m3645f = "SupportChatListDuxo.kt", m3646l = {EnumC7081g.f2777x89a9e432}, m3647m = "refresh")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$refresh$1 */
    static final class C291221 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C291221(Continuation<? super C291221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportChatListDuxo.this.refresh(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportChatListDuxo(SalesforceChatStore salesforceChatStore, TwilioManager twilioManager, SupportChatStore supportChatStore, SupportChatListStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new SupportChatListDataState(SupportChatListDataState.SupportChatListLoadStatus.Loading.INSTANCE, null, null, false, false, 30, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(salesforceChatStore, "salesforceChatStore");
        Intrinsics.checkNotNullParameter(twilioManager, "twilioManager");
        Intrinsics.checkNotNullParameter(supportChatStore, "supportChatStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.salesforceChatStore = salesforceChatStore;
        this.twilioManager = twilioManager;
        this.supportChatStore = supportChatStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C291201(null));
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onCreate$1", m3645f = "SupportChatListDuxo.kt", m3646l = {52}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onCreate$1 */
    static final class C291201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291201(Continuation<? super C291201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListDuxo.this.new C291201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportChatListDuxo supportChatListDuxo = SupportChatListDuxo.this;
                this.label = 1;
                if (supportChatListDuxo.initializeChatList(this) == coroutine_suspended) {
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

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$initializeChatList$2", m3645f = "SupportChatListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE, 70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$initializeChatList$2 */
    static final class C291132 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        int label;

        C291132(Continuation<? super C291132> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListDuxo.this.new C291132(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((C291132) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        
            if (r5.initializeSupportChatListStreams(r4) == r0) goto L19;
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
                if (SupportChatListDuxo.this.supportChatStore.hasAnySupportChat()) {
                    SupportChatListDuxo supportChatListDuxo = SupportChatListDuxo.this;
                    this.label = 1;
                    Object objOnSupportChatListLoaded = supportChatListDuxo.onSupportChatListLoaded(this);
                    if (objOnSupportChatListLoaded != coroutine_suspended) {
                        return objOnSupportChatListLoaded;
                    }
                } else {
                    SupportChatListDuxo supportChatListDuxo2 = SupportChatListDuxo.this;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public final Object initializeChatList(Continuation<Object> continuation) {
        return CoroutineScope2.coroutineScope(new C291132(null), continuation);
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$initializeSupportChatListStreams$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$initializeSupportChatListStreams$2 */
    static final class C291152 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291152(Continuation<? super C291152> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291152 c291152 = new C291152(continuation);
            c291152.L$0 = obj;
            return c291152;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
            return ((C291152) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, SupportChatListDataState.SupportChatListLoadStatus.Loading.INSTANCE, null, null, false, false, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (onSupportChatListLoaded(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeSupportChatListStreams(Continuation<? super Unit> continuation) {
        C291141 c291141;
        if (continuation instanceof C291141) {
            c291141 = (C291141) continuation;
            int i = c291141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291141.label = i - Integer.MIN_VALUE;
            } else {
                c291141 = new C291141(continuation);
            }
        }
        Object obj = c291141.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291141.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                applyMutation(new C291152(null));
                SupportChatStore supportChatStore = this.supportChatStore;
                c291141.label = 1;
                if (supportChatStore.refreshSupportChatList(c291141) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            c291141.label = 2;
        } catch (Throwable unused) {
            applyMutation(new SupportChatListDuxo2(null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2 */
    static final class C291212 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C291212(Continuation<? super C291212> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C291212 c291212 = SupportChatListDuxo.this.new C291212(continuation);
            c291212.L$0 = obj;
            return c291212;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((C291212) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$1", m3645f = "SupportChatListDuxo.kt", m3646l = {102}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<List<SupportChat>> flowPollSupportChatList = this.this$0.supportChatStore.pollSupportChatList();
                    C505511 c505511 = new C505511(null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowPollSupportChatList, c505511, this) == coroutine_suspended) {
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

            /* compiled from: SupportChatListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Lcom/robinhood/models/ui/pathfinder/messaging/SupportChat;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$1$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C505511 extends ContinuationImpl7 implements Function2<List<? extends SupportChat>, Continuation<? super Unit>, Object> {
                int label;

                C505511(Continuation<? super C505511> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C505511(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(List<? extends SupportChat> list, Continuation<? super Unit> continuation) {
                    return invoke2((List<SupportChat>) list, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(List<SupportChat> list, Continuation<? super Unit> continuation) {
                    return ((C505511) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SupportChatListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SupportChatListDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(SupportChatListDuxo.this, null), 3, null);
                return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(SupportChatListDuxo.this, null), 3, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$2", m3645f = "SupportChatListDuxo.kt", m3646l = {105}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
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
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportChatListDuxo supportChatListDuxo = this.this$0;
                    this.label = 1;
                    if (supportChatListDuxo.observeSupportChatList(this) == coroutine_suspended) {
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

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$3", m3645f = "SupportChatListDuxo.kt", m3646l = {108}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportChatListDuxo supportChatListDuxo = this.this$0;
                    this.label = 1;
                    if (supportChatListDuxo.observeMessagePreviews(this) == coroutine_suspended) {
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

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$4", m3645f = "SupportChatListDuxo.kt", m3646l = {111}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$onSupportChatListLoaded$2$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportChatListDuxo supportChatListDuxo = this.this$0;
                    this.label = 1;
                    if (supportChatListDuxo.observeUnreadMessageCounts(this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSupportChatListLoaded(Continuation<? super Job> continuation) {
        return CoroutineScope2.coroutineScope(new C291212(null), continuation);
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2", m3645f = "SupportChatListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2 */
    static final class C291182 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291182(Continuation<? super C291182> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListDuxo.this.new C291182(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<List<SupportChat>> flowStreamSupportChatList = SupportChatListDuxo.this.supportChatStore.streamSupportChatList();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<List<? extends SimpleChatIssue>>() { // from class: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super List<? extends SimpleChatIssue>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamSupportChatList.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$invokeSuspend$$inlined$map$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                List list = (List) obj;
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(SimpleChatIssue2.toSimpleUiModel((SupportChat) it.next()));
                                }
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
                });
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SupportChatListDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chats", "", "Lcom/robinhood/models/ui/SimpleChatIssue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<List<? extends SimpleChatIssue>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends SimpleChatIssue> list, Continuation<? super Unit> continuation) {
                return invoke2((List<SimpleChatIssue>) list, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<SimpleChatIssue> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                this.this$0.submit(SupportChatListEvent.ManualChatListRefreshComplete.INSTANCE);
                this.this$0.applyMutation(new AnonymousClass1(list, null));
                return Unit.INSTANCE;
            }

            /* compiled from: SupportChatListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$2$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeSupportChatList$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
                final /* synthetic */ List<SimpleChatIssue> $chats;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(List<SimpleChatIssue> list, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chats = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chats, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
                    return ((AnonymousClass1) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, new SupportChatListDataState.SupportChatListLoadStatus.Success(this.$chats), null, null, false, false, 30, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeSupportChatList(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291182(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2", m3645f = "SupportChatListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2 */
    static final class C291172 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291172(Continuation<? super C291172> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListDuxo.this.new C291172(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(SupportChatListDuxo.this.supportChatStore.streamSupportChatList(), new C29106xf7cd2ce3(null, SupportChatListDuxo.this));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(SupportChatListDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    SupportChatListDuxo.this.applyMutation(new AnonymousClass3(null));
                } else {
                    if (!ChatExceptions.isChatException(th)) {
                        throw th;
                    }
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "chatToPreviewMessages", "", "", "Lcom/robinhood/models/supportchat/db/SocketChatMessage;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<String, ? extends SocketChatMessage>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends SocketChatMessage> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<String, SocketChatMessage>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<String, SocketChatMessage> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SupportChatListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$2$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
                final /* synthetic */ Map<String, SocketChatMessage> $chatToPreviewMessages;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<String, SocketChatMessage> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$chatToPreviewMessages = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$chatToPreviewMessages, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
                    return ((AnonymousClass1) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, null, this.$chatToPreviewMessages, null, true, false, 5, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$3", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeMessagePreviews$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
                return ((AnonymousClass3) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, null, null, null, true, true, 7, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeMessagePreviews(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291172(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Tuples2<String, SocketChatMessage>> streamPreviewMessage(AgentChat.AgentChatConversation agentChatConversation) {
        if (agentChatConversation instanceof AgentChat.AgentChatConversation.AgentChatSalesforceChat) {
            final UUID id = ((AgentChat.AgentChatConversation.AgentChatSalesforceChat) agentChatConversation).getId();
            if (id != null) {
                final Flow<SocketChatMessage> flowStreamPreviewMessage = this.salesforceChatStore.streamPreviewMessage(id);
                return new Flow<Tuples2<? extends String, ? extends SocketChatMessage>>() { // from class: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$1$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends SocketChatMessage>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamPreviewMessage.collect(new C291092(flowCollector, id), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$1$$inlined$map$1$2 */
                    public static final class C291092<T> implements FlowCollector {
                        final /* synthetic */ UUID $id$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$1$$inlined$map$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$1$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C291092.this.emit(null, this);
                            }
                        }

                        public C291092(FlowCollector flowCollector, UUID uuid) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$id$inlined = uuid;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$id$inlined.toString(), (SocketChatMessage) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                };
            }
            return FlowKt.emptyFlow();
        }
        if (agentChatConversation instanceof AgentChat.AgentChatConversation.AgentChatTwilioChat) {
            final String id2 = ((AgentChat.AgentChatConversation.AgentChatTwilioChat) agentChatConversation).getId();
            if (id2 != null) {
                final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.twilioManager.streamPreviewMessage(id2)), Integer.MAX_VALUE, null, 2, null);
                return new Flow<Tuples2<? extends String, ? extends SocketChatMessage>>() { // from class: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$3$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends SocketChatMessage>> flowCollector, Continuation continuation) {
                        Object objCollect = flowBuffer$default.collect(new C291102(flowCollector, id2), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$3$$inlined$map$1$2 */
                    public static final class C291102<T> implements FlowCollector {
                        final /* synthetic */ String $id$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$3$$inlined$map$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamPreviewMessage$lambda$3$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C291102.this.emit(null, this);
                            }
                        }

                        public C291102(FlowCollector flowCollector, String str) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$id$inlined = str;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$id$inlined, (SocketChatMessage) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                };
            }
            return FlowKt.emptyFlow();
        }
        return FlowKt.emptyFlow();
    }

    /* compiled from: SupportChatListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2", m3645f = "SupportChatListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2 */
    static final class C291192 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C291192(Continuation<? super C291192> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportChatListDuxo.this.new C291192(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C291192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.transformLatest(SupportChatListDuxo.this.supportChatStore.streamSupportChatList(), new C29108xf1c157b9(null, SupportChatListDuxo.this)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(SupportChatListDuxo.this, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
                    if (ChatExceptions.isChatException(th)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    } else {
                        throw th;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SupportChatListDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "agentChatToUnreadMessageCount", "", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2$2", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Map<String, ? extends Long>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportChatListDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportChatListDuxo supportChatListDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportChatListDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends Long> map, Continuation<? super Unit> continuation) {
                return invoke2((Map<String, Long>) map, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Map<String, Long> map, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: SupportChatListDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/supportchat/SupportChatListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2$2$1", m3645f = "SupportChatListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$observeUnreadMessageCounts$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportChatListDataState, Continuation<? super SupportChatListDataState>, Object> {
                final /* synthetic */ Map<String, Long> $agentChatToUnreadMessageCount;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Map<String, Long> map, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$agentChatToUnreadMessageCount = map;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$agentChatToUnreadMessageCount, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(SupportChatListDataState supportChatListDataState, Continuation<? super SupportChatListDataState> continuation) {
                    return ((AnonymousClass1) create(supportChatListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return SupportChatListDataState.copy$default((SupportChatListDataState) this.L$0, null, null, this.$agentChatToUnreadMessageCount, false, false, 27, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((Map) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUnreadMessageCounts(Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScope2.coroutineScope(new C291192(null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    static /* synthetic */ Flow streamUnreadMessageCount$default(SupportChatListDuxo supportChatListDuxo, AgentChat.AgentChatConversation agentChatConversation, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return supportChatListDuxo.streamUnreadMessageCount(agentChatConversation, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Tuples2<String, Long>> streamUnreadMessageCount(AgentChat.AgentChatConversation agentChatConversation, boolean z) {
        if (agentChatConversation instanceof AgentChat.AgentChatConversation.AgentChatSalesforceChat) {
            if (!z) {
                return FlowKt.flowOf(Tuples4.m3642to(String.valueOf(((AgentChat.AgentChatConversation.AgentChatSalesforceChat) agentChatConversation).getId()), 0L));
            }
            final UUID id = ((AgentChat.AgentChatConversation.AgentChatSalesforceChat) agentChatConversation).getId();
            if (id != null) {
                final Flow<Integer> flowStreamUnreadMessageCount = this.salesforceChatStore.streamUnreadMessageCount(id);
                return new Flow<Tuples2<? extends String, ? extends Long>>() { // from class: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$5$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends Long>> flowCollector, Continuation continuation) {
                        Object objCollect = flowStreamUnreadMessageCount.collect(new AnonymousClass2(flowCollector, id), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$5$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ UUID $id$inlined;
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$5$$inlined$map$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$5$$inlined$map$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, UUID uuid) {
                            this.$this_unsafeFlow = flowCollector;
                            this.$id$inlined = uuid;
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
                                Tuples2 tuples2M3642to = Tuples4.m3642to(this.$id$inlined.toString(), boxing.boxLong(((Number) obj).intValue()));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
                };
            }
            return FlowKt.emptyFlow();
        }
        if (!(agentChatConversation instanceof AgentChat.AgentChatConversation.AgentChatTwilioChat)) {
            return FlowKt.emptyFlow();
        }
        if (!z) {
            return FlowKt.flowOf(Tuples4.m3642to(String.valueOf(((AgentChat.AgentChatConversation.AgentChatTwilioChat) agentChatConversation).getId()), 0L));
        }
        final String id2 = ((AgentChat.AgentChatConversation.AgentChatTwilioChat) agentChatConversation).getId();
        if (id2 != null) {
            final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.twilioManager.streamUnreadMessageCount(id2)), Integer.MAX_VALUE, null, 2, null);
            return new Flow<Tuples2<? extends String, ? extends Long>>() { // from class: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$7$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Tuples2<? extends String, ? extends Long>> flowCollector, Continuation continuation) {
                    Object objCollect = flowBuffer$default.collect(new AnonymousClass2(flowCollector, id2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$7$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ String $id$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$7$$inlined$map$1$2", m3645f = "SupportChatListDuxo.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.supportchat.SupportChatListDuxo$streamUnreadMessageCount$lambda$7$$inlined$map$1$2$1, reason: invalid class name */
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

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$id$inlined = str;
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
                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$id$inlined, boxing.boxLong(((Number) obj).longValue()));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
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
            };
        }
        return FlowKt.emptyFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refresh(Continuation<? super Unit> continuation) {
        C291221 c291221;
        if (continuation instanceof C291221) {
            c291221 = (C291221) continuation;
            int i = c291221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c291221.label = i - Integer.MIN_VALUE;
            } else {
                c291221 = new C291221(continuation);
            }
        }
        Object obj = c291221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c291221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            SupportChatStore supportChatStore = this.supportChatStore;
            c291221.label = 1;
            if (supportChatStore.refreshSupportChatList(c291221) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        submit(SupportChatListEvent.ManualChatListRefreshComplete.INSTANCE);
        return Unit.INSTANCE;
    }
}
