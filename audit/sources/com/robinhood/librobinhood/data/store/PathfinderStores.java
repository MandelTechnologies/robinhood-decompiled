package com.robinhood.librobinhood.data.store;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

/* compiled from: PathfinderStores.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PartialUserViewState;", "", "type_context", "Lcom/robinhood/librobinhood/data/store/PartialUserViewState$TypeContext;", "sequence", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/PartialUserViewState$TypeContext;I)V", "getType_context", "()Lcom/robinhood/librobinhood/data/store/PartialUserViewState$TypeContext;", "getSequence", "()I", "TypeContext", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.PartialUserViewState, reason: use source file name */
/* loaded from: classes13.dex */
public final class PathfinderStores {
    private final int sequence;
    private final TypeContext type_context;

    public PathfinderStores(TypeContext typeContext, int i) {
        this.type_context = typeContext;
        this.sequence = i;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final TypeContext getType_context() {
        return this.type_context;
    }

    /* compiled from: PathfinderStores.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PartialUserViewState$TypeContext;", "", "page", "", "<init>", "(Ljava/lang/String;)V", "getPage", "()Ljava/lang/String;", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.PartialUserViewState$TypeContext */
    public static final class TypeContext {
        private final String page;

        public TypeContext(String str) {
            this.page = str;
        }

        public final String getPage() {
            return this.page;
        }
    }
}
