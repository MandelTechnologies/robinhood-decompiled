package com.robinhood.contentful.render;

import com.robinhood.contentful.markdown.ContentRenderer;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Node;

/* compiled from: EntryRenderer.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0002:\u0001\u000bJ(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/contentful/render/EntryRenderer;", "T", "", "render", "Lorg/commonmark/node/Node;", "value", "renderer", "Lcom/robinhood/contentful/markdown/ContentRenderer;", "repository", "Lcom/robinhood/contentful/repository/ContentRepository;", "(Ljava/lang/Object;Lcom/robinhood/contentful/markdown/ContentRenderer;Lcom/robinhood/contentful/repository/ContentRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Registry", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public interface EntryRenderer<T> {
    Object render(T t, ContentRenderer contentRenderer, ContentRepository contentRepository, Continuation<? super Node> continuation);

    /* compiled from: EntryRenderer.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0002\u000b\fB!\b\u0002\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\b\b\u0001\u0010\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u0004H\u0086\u0002R\u001e\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "", "mapping", "", "Ljava/lang/reflect/Type;", "Lcom/robinhood/contentful/render/EntryRenderer;", "<init>", "(Ljava/util/Map;)V", "get", "T", "type", "Builder", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Registry {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Map<Type, EntryRenderer<?>> mapping;

        public /* synthetic */ Registry(Map map, DefaultConstructorMarker defaultConstructorMarker) {
            this(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Registry(Map<Type, ? extends EntryRenderer<?>> map) {
            this.mapping = map;
        }

        public final <T> EntryRenderer<T> get(Type type2) {
            Intrinsics.checkNotNullParameter(type2, "type");
            EntryRenderer<T> entryRenderer = (EntryRenderer) this.mapping.get(type2);
            if (entryRenderer != null) {
                return entryRenderer;
            }
            throw new NoSuchElementException("No renderer for entry of type " + type2 + "; options are: " + this.mapping);
        }

        /* compiled from: EntryRenderer.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0007J#\u0010\b\u001a\u00020\t\"\n\b\u0001\u0010\f\u0018\u0001*\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0007H\u0086\bJ\u0006\u0010\r\u001a\u00020\u000eR\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/contentful/render/EntryRenderer$Registry$Builder;", "", "<init>", "()V", "mapping", "", "Ljava/lang/reflect/Type;", "Lcom/robinhood/contentful/render/EntryRenderer;", "bind", "", "type", "renderer", "T", "build", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Builder {
            private final Map<Type, EntryRenderer<?>> mapping = new LinkedHashMap();

            public final void bind(Type type2, EntryRenderer<?> renderer) {
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                this.mapping.put(type2, renderer);
            }

            public final /* synthetic */ <T> void bind(EntryRenderer<? super T> renderer) {
                Intrinsics.checkNotNullParameter(renderer, "renderer");
                Types types = Types.INSTANCE;
                Intrinsics.needClassReification();
                bind(new TypeToken<T>() { // from class: com.robinhood.contentful.render.EntryRenderer$Registry$Builder$bind$$inlined$typeLiteral$1
                }.getType(), renderer);
            }

            public final Registry build() {
                return new Registry(this.mapping, null);
            }
        }

        /* compiled from: EntryRenderer.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/contentful/render/EntryRenderer$Registry$Companion;", "", "<init>", "()V", "buildWith", "Lcom/robinhood/contentful/render/EntryRenderer$Registry;", "block", "Lkotlin/Function1;", "Lcom/robinhood/contentful/render/EntryRenderer$Registry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Registry buildWith(Function1<? super Builder, Unit> block) {
                Intrinsics.checkNotNullParameter(block, "block");
                Builder builder = new Builder();
                block.invoke(builder);
                return builder.build();
            }
        }
    }
}
