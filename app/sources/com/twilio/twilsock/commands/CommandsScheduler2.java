package com.twilio.twilsock.commands;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* compiled from: CommandsScheduler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.twilio.twilsock.commands.CommandsScheduler$startDispatch$1$1$1", m3645f = "CommandsScheduler.kt", m3646l = {52, 41}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.twilio.twilsock.commands.CommandsScheduler$startDispatch$1$1$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CommandsScheduler2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseCommand<?> $command;
    final /* synthetic */ Semaphore $semaphore;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ CommandsScheduler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommandsScheduler2(Semaphore semaphore, BaseCommand<?> baseCommand, CommandsScheduler commandsScheduler, Continuation<? super CommandsScheduler2> continuation) {
        super(2, continuation);
        this.$semaphore = semaphore;
        this.$command = baseCommand;
        this.this$0 = commandsScheduler;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommandsScheduler2 commandsScheduler2 = new CommandsScheduler2(this.$semaphore, this.$command, this.this$0, continuation);
        commandsScheduler2.L$0 = obj;
        return commandsScheduler2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommandsScheduler2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(1:(8:6|40|7|23|24|29|30|31)(2:11|12))(1:13))(3:14|(1:17)|21)|42|18|38|19|(6:22|23|24|29|30|31)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r0 = r1;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Semaphore semaphore;
        CommandsScheduler commandsScheduler;
        BaseCommand<?> baseCommand;
        Semaphore semaphore2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                semaphore = this.$semaphore;
                BaseCommand<?> baseCommand2 = this.$command;
                commandsScheduler = this.this$0;
                this.L$0 = coroutineScope;
                this.L$1 = semaphore;
                this.L$2 = baseCommand2;
                this.L$3 = commandsScheduler;
                this.label = 1;
                if (semaphore.acquire(this) != coroutine_suspended) {
                    baseCommand = baseCommand2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                semaphore2 = (Semaphore) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Result.m28550constructorimpl(obj);
                } catch (Throwable th) {
                    th = th;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m28550constructorimpl(ResultKt.createFailure(th));
                        semaphore = semaphore2;
                        Unit unit = Unit.INSTANCE;
                        semaphore.release();
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        semaphore = semaphore2;
                        semaphore.release();
                        throw th;
                    }
                }
                semaphore = semaphore2;
                Unit unit2 = Unit.INSTANCE;
                semaphore.release();
                return Unit.INSTANCE;
            }
            CommandsScheduler commandsScheduler2 = (CommandsScheduler) this.L$3;
            baseCommand = (BaseCommand) this.L$2;
            Semaphore semaphore3 = (Semaphore) this.L$1;
            ResultKt.throwOnFailure(obj);
            commandsScheduler = commandsScheduler2;
            semaphore = semaphore3;
            baseCommand.execute(commandsScheduler.twilsock);
            Result.Companion companion2 = Result.INSTANCE;
            this.L$0 = semaphore;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            obj = baseCommand.awaitResult(this);
            if (obj != coroutine_suspended) {
                semaphore2 = semaphore;
                Result.m28550constructorimpl(obj);
                semaphore = semaphore2;
                Unit unit22 = Unit.INSTANCE;
                semaphore.release();
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            semaphore.release();
            throw th;
        }
    }
}
