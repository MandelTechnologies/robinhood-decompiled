package okio.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceBuilder2;
import okio.FileSystem;
import okio.Path;

/* compiled from: FileSystem.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m3645f = "FileSystem.kt", m3646l = {75}, m3647m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: use source file name */
/* loaded from: classes25.dex */
final class FileSystem3 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super Path>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileSystem3(FileSystem fileSystem, Path path, Continuation<? super FileSystem3> continuation) {
        super(2, continuation);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileSystem3 fileSystem3 = new FileSystem3(this.$this_commonDeleteRecursively, this.$fileOrDirectory, continuation);
        fileSystem3.L$0 = obj;
        return fileSystem3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SequenceBuilder2<? super Path> sequenceBuilder2, Continuation<? super Unit> continuation) {
        return ((FileSystem3) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SequenceBuilder2 sequenceBuilder2 = (SequenceBuilder2) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            ArrayDeque arrayDeque = new ArrayDeque();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem2.collectRecursively(sequenceBuilder2, fileSystem, arrayDeque, path, false, true, this) == coroutine_suspended) {
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
