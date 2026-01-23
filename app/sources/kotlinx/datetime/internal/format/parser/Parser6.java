package kotlinx.datetime.internal.format.parser;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Parser.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B-\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0004¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\r"}, m3636d2 = {"Lkotlinx/datetime/internal/format/parser/ParserStructure;", "Output", "", "operations", "", "Lkotlinx/datetime/internal/format/parser/ParserOperation;", "followedBy", "(Ljava/util/List;Ljava/util/List;)V", "getFollowedBy", "()Ljava/util/List;", "getOperations", "toString", "", "kotlinx-datetime"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: kotlinx.datetime.internal.format.parser.ParserStructure, reason: use source file name */
/* loaded from: classes14.dex */
public final class Parser6<Output> {
    private final List<Parser6<Output>> followedBy;
    private final List<ParserOperation<Output>> operations;

    /* JADX WARN: Multi-variable type inference failed */
    public Parser6(List<? extends ParserOperation<? super Output>> operations2, List<? extends Parser6<? super Output>> followedBy) {
        Intrinsics.checkNotNullParameter(operations2, "operations");
        Intrinsics.checkNotNullParameter(followedBy, "followedBy");
        this.operations = operations2;
        this.followedBy = followedBy;
    }

    public final List<ParserOperation<Output>> getOperations() {
        return this.operations;
    }

    public final List<Parser6<Output>> getFollowedBy() {
        return this.followedBy;
    }

    public String toString() {
        return CollectionsKt.joinToString$default(this.operations, ", ", null, null, 0, null, null, 62, null) + '(' + CollectionsKt.joinToString$default(this.followedBy, ";", null, null, 0, null, null, 62, null) + ')';
    }
}
