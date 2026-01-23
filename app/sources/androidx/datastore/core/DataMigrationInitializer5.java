package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "T"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m3645f = "DataMigrationInitializer.kt", m3646l = {45}, m3647m = "invokeSuspend")
/* renamed from: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1, reason: use source file name */
/* loaded from: classes4.dex */
final class DataMigrationInitializer5 extends ContinuationImpl7 implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ DataMigration<T> $migration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer5(DataMigration<T> dataMigration, Continuation<? super DataMigrationInitializer5> continuation) {
        super(1, continuation);
        this.$migration = dataMigration;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DataMigrationInitializer5(this.$migration, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((DataMigrationInitializer5) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp(this) == coroutine_suspended) {
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
