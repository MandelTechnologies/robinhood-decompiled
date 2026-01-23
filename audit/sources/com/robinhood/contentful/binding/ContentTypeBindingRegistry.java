package com.robinhood.contentful.binding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

/* compiled from: ContentTypeBindingRegistry.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0005R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "", "bindings", "", "Lkotlin/Pair;", "Ljava/lang/Class;", "", "<init>", "(Ljava/util/List;)V", "byId", "", "byType", "getType", "contentTypeId", "getId", "type", "Builder", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ContentTypeBindingRegistry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, Class<?>> byId;
    private final Map<Class<?>, String> byType;

    public ContentTypeBindingRegistry(List<? extends Tuples2<? extends Class<?>, String>> bindings) {
        Intrinsics.checkNotNullParameter(bindings, "bindings");
        List<? extends Tuples2<? extends Class<?>, String>> list = bindings;
        Map<String, Class<?>> map = MapsKt.toMap(SequencesKt.map(CollectionsKt.asSequence(list), new Function1() { // from class: com.robinhood.contentful.binding.ContentTypeBindingRegistry$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ContentTypeBindingRegistry.byId$lambda$0((Tuples2) obj);
            }
        }));
        this.byId = map;
        Map<Class<?>, String> map2 = MapsKt.toMap(list);
        this.byType = map2;
        if (map2.size() == map.size()) {
            return;
        }
        throw new IllegalArgumentException(("Content type ID type pairings must be unique: " + bindings).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 byId$lambda$0(Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        return new Tuples2((String) tuples2.component2(), (Class) tuples2.component1());
    }

    public final Class<?> getType(String contentTypeId) {
        Intrinsics.checkNotNullParameter(contentTypeId, "contentTypeId");
        return this.byId.get(contentTypeId);
    }

    public final String getId(Class<?> type2) {
        Intrinsics.checkNotNullParameter(type2, "type");
        return this.byType.get(type2);
    }

    /* compiled from: ContentTypeBindingRegistry.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\f\u001a\u00020\bJ\u001d\u0010\t\u001a\u00020\n\"\n\b\u0000\u0010\r\u0018\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\bH\u0086\bJ\u0006\u0010\u000e\u001a\u00020\u000fR$\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry$Builder;", "", "<init>", "()V", "bindings", "", "Lkotlin/Pair;", "Ljava/lang/Class;", "", "bind", "", "type", "contentTypeId", "T", "build", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder {
        private final List<Tuples2<Class<?>, String>> bindings = new ArrayList();

        public final void bind(Class<?> type2, String contentTypeId) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(contentTypeId, "contentTypeId");
            this.bindings.add(new Tuples2<>(type2, contentTypeId));
        }

        public final /* synthetic */ <T> void bind(String contentTypeId) {
            Intrinsics.checkNotNullParameter(contentTypeId, "contentTypeId");
            Intrinsics.reifiedOperationMarker(4, "T");
            bind(Object.class, contentTypeId);
        }

        public final ContentTypeBindingRegistry build() {
            return new ContentTypeBindingRegistry(this.bindings);
        }
    }

    /* compiled from: ContentTypeBindingRegistry.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry$Companion;", "", "<init>", "()V", "buildWith", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry;", "block", "Lkotlin/Function1;", "Lcom/robinhood/contentful/binding/ContentTypeBindingRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentTypeBindingRegistry buildWith(Function1<? super Builder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }
    }
}
