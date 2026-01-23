package com.twilio.twilsock.commands;

import com.twilio.twilsock.client.Twilsock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel3;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel8;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.Semaphore6;

/* compiled from: CommandsScheduler.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u000bH\u0086@¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u0018\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/twilio/twilsock/commands/CommandsScheduler;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "twilsock", "Lcom/twilio/twilsock/client/Twilsock;", "config", "Lcom/twilio/twilsock/commands/CommandsConfig;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/twilio/twilsock/client/Twilsock;Lcom/twilio/twilsock/commands/CommandsConfig;)V", "commandsChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/twilio/twilsock/commands/BaseCommand;", "getConfig", "()Lcom/twilio/twilsock/commands/CommandsConfig;", "post", "T", "command", "(Lcom/twilio/twilsock/commands/BaseCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDispatch", "Lkotlinx/coroutines/Job;", "twilsock_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CommandsScheduler {
    private final Channel<BaseCommand<?>> commandsChannel;
    private final CommandsConfig config;
    private final CoroutineScope coroutineScope;
    private final Twilsock twilsock;

    public CommandsScheduler(CoroutineScope coroutineScope, Twilsock twilsock, CommandsConfig config) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(twilsock, "twilsock");
        Intrinsics.checkNotNullParameter(config, "config");
        this.coroutineScope = coroutineScope;
        this.twilsock = twilsock;
        this.config = config;
        this.commandsChannel = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        startDispatch();
    }

    public final CommandsConfig getConfig() {
        return this.config;
    }

    public final <T> Object post(BaseCommand<T> baseCommand, Continuation<? super T> continuation) {
        baseCommand.startTimer();
        if (!Channel5.m28810isSuccessimpl(this.commandsChannel.mo8337trySendJP2dKIU(baseCommand))) {
            throw new IllegalStateException("trySend on UNLIMITED channel is always success");
        }
        return baseCommand.awaitResult(continuation);
    }

    /* compiled from: CommandsScheduler.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.twilio.twilsock.commands.CommandsScheduler$startDispatch$1", m3645f = "CommandsScheduler.kt", m3646l = {55}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.twilio.twilsock.commands.CommandsScheduler$startDispatch$1 */
    static final class C435181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        C435181(Continuation<? super C435181> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C435181 c435181 = CommandsScheduler.this.new C435181(continuation);
            c435181.L$0 = obj;
            return c435181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x0020, B:17:0x0069, B:19:0x0071, B:14:0x0056, B:20:0x0084, B:13:0x004e), top: B:27:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0084 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x0020, B:17:0x0069, B:19:0x0071, B:14:0x0056, B:20:0x0084, B:13:0x004e), top: B:27:0x0008 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0066 -> B:17:0x0069). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Channel8 channel8;
            CommandsScheduler commandsScheduler;
            Semaphore semaphore;
            Channel3 it;
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    Semaphore semaphoreSemaphore$default = Semaphore6.Semaphore$default(CommandsScheduler.this.getConfig().getMaxParallelCommands(), 0, 2, null);
                    channel8 = CommandsScheduler.this.commandsChannel;
                    commandsScheduler = CommandsScheduler.this;
                    semaphore = semaphoreSemaphore$default;
                    it = channel8.iterator();
                    coroutineScope = coroutineScope2;
                    this.L$0 = coroutineScope;
                    this.L$1 = semaphore;
                    this.L$2 = commandsScheduler;
                    this.L$3 = channel8;
                    this.L$4 = it;
                    this.label = 1;
                    obj = it.hasNext(this);
                    if (obj == coroutine_suspended) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Channel3) this.L$4;
                    channel8 = (Channel8) this.L$3;
                    commandsScheduler = (CommandsScheduler) this.L$2;
                    semaphore = (Semaphore) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CommandsScheduler2(semaphore, (BaseCommand) it.next(), commandsScheduler, null), 3, null);
                        this.L$0 = coroutineScope;
                        this.L$1 = semaphore;
                        this.L$2 = commandsScheduler;
                        this.L$3 = channel8;
                        this.L$4 = it;
                        this.label = 1;
                        obj = it.hasNext(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.INSTANCE;
                            ChannelsKt.cancelConsumed(channel8, null);
                            return Unit.INSTANCE;
                        }
                    }
                }
            } finally {
            }
        }
    }

    private final Job startDispatch() {
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435181(null), 3, null);
    }
}
