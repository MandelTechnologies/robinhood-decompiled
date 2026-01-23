package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: DataMigrationInitializer.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "api", "Landroidx/datastore/core/InitializerApi;"}, m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", m3645f = "DataMigrationInitializer.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1, reason: use source file name */
/* loaded from: classes.dex */
final class DataMigrationInitializer2<T> extends ContinuationImpl7 implements Function2<InitializerApi<T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<DataMigration<T>> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataMigrationInitializer2(List<? extends DataMigration<T>> list, Continuation<? super DataMigrationInitializer2> continuation) {
        super(2, continuation);
        this.$migrations = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DataMigrationInitializer2 dataMigrationInitializer2 = new DataMigrationInitializer2(this.$migrations, continuation);
        dataMigrationInitializer2.L$0 = obj;
        return dataMigrationInitializer2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InitializerApi<T> initializerApi, Continuation<? super Unit> continuation) {
        return ((DataMigrationInitializer2) create(initializerApi, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InitializerApi initializerApi = (InitializerApi) this.L$0;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.INSTANCE;
            List<DataMigration<T>> list = this.$migrations;
            this.label = 1;
            if (companion.runMigrations(list, initializerApi, this) == coroutine_suspended) {
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
