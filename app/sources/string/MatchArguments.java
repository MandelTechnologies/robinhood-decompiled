package string;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Match.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lstring/MatchArguments;", "", "", "text", "regexPattern", "", "regexOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "getRegexPattern", "Ljava/util/List;", "getRegexOptions", "()Ljava/util/List;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
final /* data */ class MatchArguments {
    private final List<Object> regexOptions;
    private final String regexPattern;
    private final String text;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchArguments)) {
            return false;
        }
        MatchArguments matchArguments = (MatchArguments) other;
        return Intrinsics.areEqual(this.text, matchArguments.text) && Intrinsics.areEqual(this.regexPattern, matchArguments.regexPattern) && Intrinsics.areEqual(this.regexOptions, matchArguments.regexOptions);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.regexPattern.hashCode()) * 31) + this.regexOptions.hashCode();
    }

    public String toString() {
        return "MatchArguments(text=" + this.text + ", regexPattern=" + this.regexPattern + ", regexOptions=" + this.regexOptions + ")";
    }

    public MatchArguments(String text, String regexPattern, List<? extends Object> regexOptions) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(regexPattern, "regexPattern");
        Intrinsics.checkNotNullParameter(regexOptions, "regexOptions");
        this.text = text;
        this.regexPattern = regexPattern;
        this.regexOptions = regexOptions;
    }

    public final String getText() {
        return this.text;
    }

    public final String getRegexPattern() {
        return this.regexPattern;
    }

    public final List<Object> getRegexOptions() {
        return this.regexOptions;
    }
}
