package kotlin.p481io.path;

import com.plaid.internal.EnumC7081g;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;

/* compiled from: PathTreeWalk.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", "", "dfsIterator", "()Ljava/util/Iterator;", "bfsIterator", "iterator", "start", "Ljava/nio/file/Path;", "", "Lkotlin/io/path/PathWalkOption;", "options", "[Lkotlin/io/path/PathWalkOption;", "", "getFollowLinks", "()Z", "followLinks", "Ljava/nio/file/LinkOption;", "getLinkOptions", "()[Ljava/nio/file/LinkOption;", "linkOptions", "getIncludeDirectories", "includeDirectories", "isBFS", "kotlin-stdlib-jdk7"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class PathTreeWalk implements Sequence<Path> {
    private final PathWalkOption[] options;
    private final Path start;

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFollowLinks() {
        return ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] getLinkOptions() {
        return PathTreeWalk3.INSTANCE.toLinkOptions(getFollowLinks());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getIncludeDirectories() {
        return ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    private final boolean isBFS() {
        return ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST);
    }

    @Override // kotlin.sequences.Sequence
    /* renamed from: iterator */
    public Iterator<Path> iterator2() {
        return isBFS() ? bfsIterator() : dfsIterator();
    }

    /* compiled from: PathTreeWalk.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", m3645f = "PathTreeWalk.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: kotlin.io.path.PathTreeWalk$dfsIterator$1 */
    static final class C458441 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super Path>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C458441(Continuation<? super C458441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C458441 c458441 = PathTreeWalk.this.new C458441(continuation);
            c458441.L$0 = obj;
            return c458441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super Path> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C458441) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
        
            if (r8.yield(r11, r14) == r0) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01dc -> B:39:0x0150). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01de -> B:39:0x0150). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PathRecursiveFunctions, FileSystemLoopException {
            SequenceBuilder2 sequenceBuilder2;
            ArrayDeque arrayDeque;
            PathTreeWalk2 pathTreeWalk2;
            PathTreeWalk4 pathTreeWalk4;
            PathTreeWalk pathTreeWalk;
            Path path;
            PathTreeWalk2 pathTreeWalk22;
            Path pathM3649m;
            SequenceBuilder2 sequenceBuilder22;
            PathTreeWalk4 pathTreeWalk42;
            PathTreeWalk pathTreeWalk3;
            ArrayDeque arrayDeque2;
            ArrayDeque arrayDeque3;
            LinkOption[] linkOptionArr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                arrayDeque = new ArrayDeque();
                pathTreeWalk2 = new PathTreeWalk2(PathTreeWalk.this.getFollowLinks());
                pathTreeWalk4 = new PathTreeWalk4(PathTreeWalk.this.start, PathTreeWalk5.keyOf(PathTreeWalk.this.start, PathTreeWalk.this.getLinkOptions()), null);
                pathTreeWalk = PathTreeWalk.this;
                path = pathTreeWalk4.getPath();
                if (pathTreeWalk4.getParent() != null) {
                    PathRecursiveFunctions2.checkFileName(path);
                }
                LinkOption[] linkOptions = pathTreeWalk.getLinkOptions();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                    if (!PathTreeWalk5.createsCycle(pathTreeWalk4)) {
                        if (pathTreeWalk.getIncludeDirectories()) {
                            this.L$0 = sequenceBuilder2;
                            this.L$1 = arrayDeque;
                            this.L$2 = pathTreeWalk2;
                            this.L$3 = pathTreeWalk4;
                            this.L$4 = pathTreeWalk;
                            this.L$5 = path;
                            this.label = 1;
                            if (sequenceBuilder2.yield(path, this) != coroutine_suspended) {
                                pathTreeWalk22 = pathTreeWalk2;
                                pathM3649m = path;
                                sequenceBuilder22 = sequenceBuilder2;
                                pathTreeWalk42 = pathTreeWalk4;
                                pathTreeWalk3 = pathTreeWalk;
                                arrayDeque2 = arrayDeque;
                            }
                        }
                        LinkOption[] linkOptions2 = pathTreeWalk.getLinkOptions();
                        linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
                        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                            pathTreeWalk4.setContentIterator(pathTreeWalk2.readEntries(pathTreeWalk4).iterator());
                            arrayDeque.addLast(pathTreeWalk4);
                        }
                        arrayDeque3 = arrayDeque;
                        while (!arrayDeque3.isEmpty()) {
                        }
                        return Unit.INSTANCE;
                    }
                    PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline3.m3658m();
                    throw PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline2.m3657m(path.toString());
                }
                if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = arrayDeque;
                    this.L$2 = pathTreeWalk2;
                    this.label = 2;
                }
                arrayDeque3 = arrayDeque;
                while (!arrayDeque3.isEmpty()) {
                }
                return Unit.INSTANCE;
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Path pathM3649m2 = DirectoryEntriesReader$$ExternalSyntheticApiModelOutline0.m3649m(this.L$5);
                        PathTreeWalk pathTreeWalk5 = (PathTreeWalk) this.L$4;
                        PathTreeWalk4 pathTreeWalk43 = (PathTreeWalk4) this.L$3;
                        PathTreeWalk2 pathTreeWalk23 = (PathTreeWalk2) this.L$2;
                        ArrayDeque arrayDeque4 = (ArrayDeque) this.L$1;
                        SequenceBuilder2 sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        ArrayDeque arrayDeque5 = arrayDeque4;
                        Path path2 = pathM3649m2;
                        pathTreeWalk2 = pathTreeWalk23;
                        PathTreeWalk pathTreeWalk6 = pathTreeWalk5;
                        arrayDeque3 = arrayDeque5;
                        PathTreeWalk4 next = pathTreeWalk43;
                        sequenceBuilder2 = sequenceBuilder23;
                        LinkOption[] linkOptions3 = pathTreeWalk6.getLinkOptions();
                        LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(linkOptions3, linkOptions3.length);
                        if (Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length))) {
                            next.setContentIterator(pathTreeWalk2.readEntries(next).iterator());
                            arrayDeque3.addLast(next);
                        }
                        while (!arrayDeque3.isEmpty()) {
                            Iterator<PathTreeWalk4> contentIterator = ((PathTreeWalk4) arrayDeque3.last()).getContentIterator();
                            Intrinsics.checkNotNull(contentIterator);
                            if (contentIterator.hasNext()) {
                                next = contentIterator.next();
                                pathTreeWalk6 = PathTreeWalk.this;
                                path2 = next.getPath();
                                if (next.getParent() != null) {
                                    PathRecursiveFunctions2.checkFileName(path2);
                                }
                                LinkOption[] linkOptions4 = pathTreeWalk6.getLinkOptions();
                                LinkOption[] linkOptionArr4 = (LinkOption[]) Arrays.copyOf(linkOptions4, linkOptions4.length);
                                if (Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length))) {
                                    if (!PathTreeWalk5.createsCycle(next)) {
                                        if (pathTreeWalk6.getIncludeDirectories()) {
                                            this.L$0 = sequenceBuilder2;
                                            this.L$1 = arrayDeque3;
                                            this.L$2 = pathTreeWalk2;
                                            this.L$3 = next;
                                            this.L$4 = pathTreeWalk6;
                                            this.L$5 = path2;
                                            this.label = 3;
                                            if (sequenceBuilder2.yield(path2, this) != coroutine_suspended) {
                                                pathTreeWalk23 = pathTreeWalk2;
                                                pathM3649m2 = path2;
                                                arrayDeque4 = arrayDeque3;
                                                pathTreeWalk5 = pathTreeWalk6;
                                                sequenceBuilder23 = sequenceBuilder2;
                                                pathTreeWalk43 = next;
                                                ArrayDeque arrayDeque52 = arrayDeque4;
                                                Path path22 = pathM3649m2;
                                                pathTreeWalk2 = pathTreeWalk23;
                                                PathTreeWalk pathTreeWalk62 = pathTreeWalk5;
                                                arrayDeque3 = arrayDeque52;
                                                PathTreeWalk4 next2 = pathTreeWalk43;
                                                sequenceBuilder2 = sequenceBuilder23;
                                            }
                                        }
                                        LinkOption[] linkOptions32 = pathTreeWalk62.getLinkOptions();
                                        LinkOption[] linkOptionArr32 = (LinkOption[]) Arrays.copyOf(linkOptions32, linkOptions32.length);
                                        if (Files.isDirectory(path22, (LinkOption[]) Arrays.copyOf(linkOptionArr32, linkOptionArr32.length))) {
                                        }
                                        while (!arrayDeque3.isEmpty()) {
                                        }
                                    } else {
                                        PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline3.m3658m();
                                        throw PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline2.m3657m(path22.toString());
                                    }
                                } else if (Files.exists(path22, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                                    this.L$0 = sequenceBuilder2;
                                    this.L$1 = arrayDeque3;
                                    this.L$2 = pathTreeWalk2;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.label = 4;
                                    if (sequenceBuilder2.yield(path22, this) == coroutine_suspended) {
                                    }
                                } else {
                                    continue;
                                }
                                return coroutine_suspended;
                            }
                            arrayDeque3.removeLast();
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                pathTreeWalk2 = (PathTreeWalk2) this.L$2;
                arrayDeque3 = (ArrayDeque) this.L$1;
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                while (!arrayDeque3.isEmpty()) {
                }
                return Unit.INSTANCE;
            }
            pathM3649m = DirectoryEntriesReader$$ExternalSyntheticApiModelOutline0.m3649m(this.L$5);
            pathTreeWalk3 = (PathTreeWalk) this.L$4;
            pathTreeWalk42 = (PathTreeWalk4) this.L$3;
            pathTreeWalk22 = (PathTreeWalk2) this.L$2;
            arrayDeque2 = (ArrayDeque) this.L$1;
            sequenceBuilder22 = (SequenceBuilder2) this.L$0;
            ResultKt.throwOnFailure(obj);
            SequenceBuilder2 sequenceBuilder24 = sequenceBuilder22;
            path = pathM3649m;
            pathTreeWalk2 = pathTreeWalk22;
            pathTreeWalk4 = pathTreeWalk42;
            sequenceBuilder2 = sequenceBuilder24;
            arrayDeque = arrayDeque2;
            pathTreeWalk = pathTreeWalk3;
            LinkOption[] linkOptions22 = pathTreeWalk.getLinkOptions();
            linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions22, linkOptions22.length);
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            }
            arrayDeque3 = arrayDeque;
            while (!arrayDeque3.isEmpty()) {
            }
            return Unit.INSTANCE;
        }
    }

    private final Iterator<Path> dfsIterator() {
        return SequencesKt.iterator(new C458441(null));
    }

    /* compiled from: PathTreeWalk.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", m3645f = "PathTreeWalk.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: kotlin.io.path.PathTreeWalk$bfsIterator$1 */
    static final class C458431 extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super Path>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        C458431(Continuation<? super C458431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C458431 c458431 = PathTreeWalk.this.new C458431(continuation);
            c458431.L$0 = obj;
            return c458431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super Path> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C458431) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f8 -> B:11:0x007f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fa -> B:11:0x007f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws PathRecursiveFunctions, FileSystemLoopException {
            ArrayDeque arrayDeque;
            PathTreeWalk2 pathTreeWalk2;
            SequenceBuilder2 sequenceBuilder2;
            PathTreeWalk4 pathTreeWalk4;
            Path path;
            PathTreeWalk pathTreeWalk;
            LinkOption[] linkOptionArr;
            SequenceBuilder2 sequenceBuilder22;
            ArrayDeque arrayDeque2;
            PathTreeWalk2 pathTreeWalk22;
            PathTreeWalk4 pathTreeWalk42;
            PathTreeWalk pathTreeWalk3;
            Path pathM3649m;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder23 = (SequenceBuilder2) this.L$0;
                ArrayDeque arrayDeque3 = new ArrayDeque();
                PathTreeWalk2 pathTreeWalk23 = new PathTreeWalk2(PathTreeWalk.this.getFollowLinks());
                arrayDeque3.addLast(new PathTreeWalk4(PathTreeWalk.this.start, PathTreeWalk5.keyOf(PathTreeWalk.this.start, PathTreeWalk.this.getLinkOptions()), null));
                arrayDeque = arrayDeque3;
                pathTreeWalk2 = pathTreeWalk23;
                sequenceBuilder2 = sequenceBuilder23;
            } else if (i == 1) {
                pathM3649m = DirectoryEntriesReader$$ExternalSyntheticApiModelOutline0.m3649m(this.L$5);
                pathTreeWalk3 = (PathTreeWalk) this.L$4;
                pathTreeWalk42 = (PathTreeWalk4) this.L$3;
                pathTreeWalk22 = (PathTreeWalk2) this.L$2;
                arrayDeque2 = (ArrayDeque) this.L$1;
                sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
                ArrayDeque arrayDeque4 = arrayDeque2;
                path = pathM3649m;
                pathTreeWalk2 = pathTreeWalk22;
                pathTreeWalk = pathTreeWalk3;
                arrayDeque = arrayDeque4;
                pathTreeWalk4 = pathTreeWalk42;
                sequenceBuilder2 = sequenceBuilder22;
                LinkOption[] linkOptions = pathTreeWalk.getLinkOptions();
                linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                    arrayDeque.addAll(pathTreeWalk2.readEntries(pathTreeWalk4));
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pathTreeWalk2 = (PathTreeWalk2) this.L$2;
                arrayDeque = (ArrayDeque) this.L$1;
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (!arrayDeque.isEmpty()) {
                pathTreeWalk4 = (PathTreeWalk4) arrayDeque.removeFirst();
                pathTreeWalk = PathTreeWalk.this;
                path = pathTreeWalk4.getPath();
                if (pathTreeWalk4.getParent() != null) {
                    PathRecursiveFunctions2.checkFileName(path);
                }
                LinkOption[] linkOptions2 = pathTreeWalk.getLinkOptions();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptions2, linkOptions2.length);
                if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                    if (!PathTreeWalk5.createsCycle(pathTreeWalk4)) {
                        if (pathTreeWalk.getIncludeDirectories()) {
                            this.L$0 = sequenceBuilder2;
                            this.L$1 = arrayDeque;
                            this.L$2 = pathTreeWalk2;
                            this.L$3 = pathTreeWalk4;
                            this.L$4 = pathTreeWalk;
                            this.L$5 = path;
                            this.label = 1;
                            if (sequenceBuilder2.yield(path, this) != coroutine_suspended) {
                                pathTreeWalk22 = pathTreeWalk2;
                                pathM3649m = path;
                                arrayDeque2 = arrayDeque;
                                pathTreeWalk3 = pathTreeWalk;
                                sequenceBuilder22 = sequenceBuilder2;
                                pathTreeWalk42 = pathTreeWalk4;
                                ArrayDeque arrayDeque42 = arrayDeque2;
                                path = pathM3649m;
                                pathTreeWalk2 = pathTreeWalk22;
                                pathTreeWalk = pathTreeWalk3;
                                arrayDeque = arrayDeque42;
                                pathTreeWalk4 = pathTreeWalk42;
                                sequenceBuilder2 = sequenceBuilder22;
                            }
                        }
                        LinkOption[] linkOptions3 = pathTreeWalk.getLinkOptions();
                        linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions3, linkOptions3.length);
                        if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                        }
                        while (!arrayDeque.isEmpty()) {
                        }
                    } else {
                        PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline3.m3658m();
                        throw PathTreeWalk$bfsIterator$1$$ExternalSyntheticApiModelOutline2.m3657m(path.toString());
                    }
                } else if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = arrayDeque;
                    this.L$2 = pathTreeWalk2;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    if (sequenceBuilder2.yield(path, this) == coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    private final Iterator<Path> bfsIterator() {
        return SequencesKt.iterator(new C458431(null));
    }
}
