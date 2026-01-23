package com.squareup.workflow1.p415ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Named.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m3636d2 = {"Lcom/squareup/workflow1/ui/Named;", "", "W", "Lcom/squareup/workflow1/ui/Compatible;", "wrapped", "", "name", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getWrapped", "()Ljava/lang/Object;", "Ljava/lang/String;", "getName", "compatibilityKey", "getCompatibilityKey", "wf1-core-common"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Named<W> implements Compatible {
    private final String compatibilityKey;
    private final String name;
    private final W wrapped;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Named)) {
            return false;
        }
        Named named = (Named) other;
        return Intrinsics.areEqual(this.wrapped, named.wrapped) && Intrinsics.areEqual(this.name, named.name);
    }

    public int hashCode() {
        return (this.wrapped.hashCode() * 31) + this.name.hashCode();
    }

    public Named(W wrapped, String name) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        Intrinsics.checkNotNullParameter(name, "name");
        this.wrapped = wrapped;
        this.name = name;
        if (StringsKt.isBlank(name)) {
            throw new IllegalArgumentException("name must not be blank.");
        }
        this.compatibilityKey = Compatible.INSTANCE.keyFor(wrapped, name);
    }

    public final W getWrapped() {
        return this.wrapped;
    }

    @Override // com.squareup.workflow1.p415ui.Compatible
    public String getCompatibilityKey() {
        return this.compatibilityKey;
    }

    public String toString() {
        return super.toString() + ": " + getCompatibilityKey();
    }
}
