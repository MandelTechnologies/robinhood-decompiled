package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0006\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/contentful/model/EntryResource;", "T", "", "Lcom/robinhood/contentful/model/EntityResource;", "sys", "Lcom/robinhood/contentful/model/EntryMetadata;", "value", "<init>", "(Lcom/robinhood/contentful/model/EntryMetadata;Ljava/lang/Object;)V", "getSys", "()Lcom/robinhood/contentful/model/EntryMetadata;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(Lcom/robinhood/contentful/model/EntryMetadata;Ljava/lang/Object;)Lcom/robinhood/contentful/model/EntryResource;", "equals", "", "other", "hashCode", "", "toString", "", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class EntryResource<T> extends ContentResource4 {
    private final EntryMetadata<T> sys;
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryResource copy$default(EntryResource entryResource, EntryMetadata resourceMetadata6, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            resourceMetadata6 = entryResource.sys;
        }
        if ((i & 2) != 0) {
            obj = entryResource.value;
        }
        return entryResource.copy(resourceMetadata6, obj);
    }

    public final EntryMetadata<T> component1() {
        return this.sys;
    }

    public final T component2() {
        return this.value;
    }

    public final EntryResource<T> copy(EntryMetadata<T> sys, T value) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(value, "value");
        return new EntryResource<>(sys, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryResource)) {
            return false;
        }
        EntryResource entryResource = (EntryResource) other;
        return Intrinsics.areEqual(this.sys, entryResource.sys) && Intrinsics.areEqual(this.value, entryResource.value);
    }

    public int hashCode() {
        return (this.sys.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "EntryResource(sys=" + this.sys + ", value=" + this.value + ")";
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public EntryMetadata<T> getSys() {
        return this.sys;
    }

    public final T getValue() {
        return this.value;
    }

    public EntryResource(EntryMetadata<T> sys, T value) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(value, "value");
        this.sys = sys;
        this.value = value;
    }
}
