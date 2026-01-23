package array;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JoinToString.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Larray/JoinToStringArguments;", "", "", "elementsToJoin", "", "separator", "prefix", "postfix", "", "limit", "truncated", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElementsToJoin", "()Ljava/util/List;", "Ljava/lang/String;", "getSeparator", "getPrefix", "getPostfix", "I", "getLimit", "getTruncated", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
final /* data */ class JoinToStringArguments {
    private final List<Object> elementsToJoin;
    private final int limit;
    private final String postfix;
    private final String prefix;
    private final String separator;
    private final String truncated;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinToStringArguments)) {
            return false;
        }
        JoinToStringArguments joinToStringArguments = (JoinToStringArguments) other;
        return Intrinsics.areEqual(this.elementsToJoin, joinToStringArguments.elementsToJoin) && Intrinsics.areEqual(this.separator, joinToStringArguments.separator) && Intrinsics.areEqual(this.prefix, joinToStringArguments.prefix) && Intrinsics.areEqual(this.postfix, joinToStringArguments.postfix) && this.limit == joinToStringArguments.limit && Intrinsics.areEqual(this.truncated, joinToStringArguments.truncated);
    }

    public int hashCode() {
        return (((((((((this.elementsToJoin.hashCode() * 31) + this.separator.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.postfix.hashCode()) * 31) + Integer.hashCode(this.limit)) * 31) + this.truncated.hashCode();
    }

    public String toString() {
        return "JoinToStringArguments(elementsToJoin=" + this.elementsToJoin + ", separator=" + this.separator + ", prefix=" + this.prefix + ", postfix=" + this.postfix + ", limit=" + this.limit + ", truncated=" + this.truncated + ")";
    }

    public JoinToStringArguments(List<? extends Object> elementsToJoin, String separator, String prefix, String postfix, int i, String truncated) {
        Intrinsics.checkNotNullParameter(elementsToJoin, "elementsToJoin");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        this.elementsToJoin = elementsToJoin;
        this.separator = separator;
        this.prefix = prefix;
        this.postfix = postfix;
        this.limit = i;
        this.truncated = truncated;
    }

    public final List<Object> getElementsToJoin() {
        return this.elementsToJoin;
    }

    public final String getSeparator() {
        return this.separator;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getPostfix() {
        return this.postfix;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final String getTruncated() {
        return this.truncated;
    }
}
