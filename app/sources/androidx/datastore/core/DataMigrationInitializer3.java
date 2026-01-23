package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DataMigrationInitializer.kt */
@Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.datastore.core.DataMigrationInitializer$Companion", m3645f = "DataMigrationInitializer.kt", m3646l = {42, 57}, m3647m = "runMigrations")
/* renamed from: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1, reason: use source file name */
/* loaded from: classes.dex */
final class DataMigrationInitializer3<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer3(DataMigrationInitializer.Companion companion, Continuation<? super DataMigrationInitializer3> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runMigrations(null, null, this);
    }
}
