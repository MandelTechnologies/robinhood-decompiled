package com.robinhood.scarlet.registry;

import android.util.AttributeSet;
import android.view.View;
import com.robinhood.reflect.Classes;
import com.robinhood.reflect.Classes2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.StyleResource;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.scarlet.view.DefStyleProvider;
import com.robinhood.scarlet.view.LayoutTags;
import com.robinhood.scarlet.view.UnqualifiedClassTag;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: DefStyleRegistry.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB1\b\u0002\u0012&\u0010\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0005J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004J$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002J\"\u0010\u0018\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002R.\u0010\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/DefStyleRegistry;", "", "sourceMapping", "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "<init>", "(Ljava/util/Map;)V", "resolvedMapping", "", "", "getForView", "view", "getForClass", "clazz", "getForLayoutTag", "tagName", "attrs", "Landroid/util/AttributeSet;", "getOrResolve", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "checkCompanion", "Builder", "Companion", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class DefStyleRegistry {
    private final Map<String, List<ResourceReferences4<StyleResource>>> resolvedMapping;
    private final Map<Class<? extends View>, List<ResourceReferences4<StyleResource>>> sourceMapping;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ DefStyleRegistry(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DefStyleRegistry(Map<Class<? extends View>, ? extends List<? extends ResourceReferences4<StyleResource>>> map) {
        this.sourceMapping = map;
        this.resolvedMapping = new LinkedHashMap();
    }

    public final List<ResourceReferences4<StyleResource>> getForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return getForClass(view.getClass());
    }

    public final List<ResourceReferences4<StyleResource>> getForClass(Class<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Map<String, List<ResourceReferences4<StyleResource>>> map = this.resolvedMapping;
        String name = clazz.getName();
        List<ResourceReferences4<StyleResource>> listResolve = map.get(name);
        if (listResolve == null) {
            listResolve = resolve(clazz);
            map.put(name, listResolve);
        }
        return listResolve;
    }

    public final List<ResourceReferences4<StyleResource>> getForLayoutTag(String tagName, AttributeSet attrs) {
        Class<? extends View> clsForNameOrNull;
        List<ResourceReferences4<StyleResource>> listEmptyList;
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        String viewName = LayoutTags.INSTANCE.getViewName(tagName, attrs);
        if (viewName == null) {
            return CollectionsKt.emptyList();
        }
        Map<String, List<ResourceReferences4<StyleResource>>> map = this.resolvedMapping;
        List<ResourceReferences4<StyleResource>> list = map.get(viewName);
        if (list == null) {
            UnqualifiedClassTag unqualifiedClassTagFrom = UnqualifiedClassTag.INSTANCE.from(viewName, attrs);
            if (unqualifiedClassTagFrom == null || (clsForNameOrNull = unqualifiedClassTagFrom.getImplementationClass()) == null) {
                clsForNameOrNull = Classes.INSTANCE.forNameOrNull(viewName, View.class);
            }
            if (clsForNameOrNull == null || (listEmptyList = getForClass(clsForNameOrNull)) == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            list = listEmptyList;
            map.put(viewName, list);
        }
        return list;
    }

    private final List<ResourceReferences4<StyleResource>> getOrResolve(Class<?> clazz) {
        Map<String, List<ResourceReferences4<StyleResource>>> map = this.resolvedMapping;
        String name = clazz.getName();
        List<ResourceReferences4<StyleResource>> listResolve = map.get(name);
        if (listResolve == null) {
            listResolve = resolve(clazz);
            map.put(name, listResolve);
        }
        return listResolve;
    }

    private final List<ResourceReferences4<StyleResource>> resolve(Class<?> clazz) {
        List<ResourceReferences4<StyleResource>> listCheckCompanion = this.sourceMapping.get(clazz);
        if (listCheckCompanion != null || (listCheckCompanion = checkCompanion(clazz)) != null) {
            return listCheckCompanion;
        }
        Class<? super Object> superclass = clazz.getSuperclass();
        List<ResourceReferences4<StyleResource>> orResolve = superclass != null ? getOrResolve(superclass) : null;
        return orResolve == null ? CollectionsKt.emptyList() : orResolve;
    }

    private final List<ResourceReferences4<StyleResource>> checkCompanion(Class<?> clazz) {
        String name = clazz.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!StringsKt.startsWith$default(name, "com.robinhood", false, 2, (Object) null)) {
            return null;
        }
        Field declaredFieldOrNull = Classes2.getDeclaredFieldOrNull(clazz, "Companion");
        Object obj = declaredFieldOrNull != null ? declaredFieldOrNull.get(null) : null;
        DefStyleProvider defStyleProvider = obj instanceof DefStyleProvider ? (DefStyleProvider) obj : null;
        if (defStyleProvider == null) {
            return null;
        }
        return INSTANCE.defStyleToList(defStyleProvider.getDefStyleAttr(), defStyleProvider.getDefStyleRes());
    }

    /* compiled from: DefStyleRegistry.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ)\u0010\u000b\u001a\u00020\u0000\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0086\bJ*\u0010\u000b\u001a\u00020\u00002\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u0010J)\u0010\u000b\u001a\u00020\u0000\"\n\b\u0000\u0010\u000e\u0018\u0001*\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0003\u0010\u0011\u001a\u00020\u0010H\u0086\bJ\u0006\u0010\u0012\u001a\u00020\u0013R.\u0010\u0004\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/DefStyleRegistry$Builder;", "", "<init>", "()V", "mapping", "", "Ljava/lang/Class;", "Landroid/view/View;", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "add", "clazz", "defStyle", "T", "defStyleAttr", "", "defStyleRes", "build", "Lcom/robinhood/scarlet/registry/DefStyleRegistry;", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private final Map<Class<? extends View>, List<ResourceReferences4<StyleResource>>> mapping = new LinkedHashMap();

        public final Builder add(Class<? extends View> clazz, List<? extends ResourceReferences4<StyleResource>> defStyle) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(defStyle, "defStyle");
            this.mapping.put(clazz, defStyle);
            return this;
        }

        public final /* synthetic */ <T extends View> Builder add(List<? extends ResourceReferences4<StyleResource>> defStyle) {
            Intrinsics.checkNotNullParameter(defStyle, "defStyle");
            Intrinsics.reifiedOperationMarker(4, "T");
            return add(View.class, defStyle);
        }

        public static /* synthetic */ Builder add$default(Builder builder, Class cls, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            return builder.add(cls, i, i2);
        }

        public final Builder add(Class<? extends View> clazz, int defStyleAttr, int defStyleRes) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            return add(clazz, DefStyleRegistry.INSTANCE.defStyleToList(defStyleAttr, defStyleRes));
        }

        public static /* synthetic */ Builder add$default(Builder builder, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            return builder.add(View.class, i, i2);
        }

        public final /* synthetic */ <T extends View> Builder add(int defStyleAttr, int defStyleRes) {
            Intrinsics.reifiedOperationMarker(4, "T");
            return add(View.class, defStyleAttr, defStyleRes);
        }

        public final DefStyleRegistry build() {
            return new DefStyleRegistry(this.mapping, null);
        }
    }

    /* compiled from: DefStyleRegistry.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\tH\u0002J%\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0086\bø\u0001\u0000J\u0006\u0010\u0012\u001a\u00020\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/scarlet/registry/DefStyleRegistry$Companion;", "", "<init>", "()V", "defStyleToList", "", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "Lcom/robinhood/scarlet/util/resource/StyleResource;", "defStyleAttr", "", "defStyleRes", "buildWith", "Lcom/robinhood/scarlet/registry/DefStyleRegistry;", "block", "Lkotlin/Function1;", "Lcom/robinhood/scarlet/registry/DefStyleRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "empty", "lib-scarlet_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ResourceReferences4<StyleResource>> defStyleToList(int defStyleAttr, int defStyleRes) {
            List listCreateListBuilder = CollectionsKt.createListBuilder(2);
            if (defStyleAttr != 0) {
                listCreateListBuilder.add(new ThemedResourceReference(ResourceType.STYLE.INSTANCE, defStyleAttr));
            }
            if (defStyleRes != 0) {
                listCreateListBuilder.add(new DirectResourceReference(ResourceType.STYLE.INSTANCE, defStyleRes));
            }
            return CollectionsKt.build(listCreateListBuilder);
        }

        public final DefStyleRegistry buildWith(Function1<? super Builder, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Builder builder = new Builder();
            block.invoke(builder);
            return builder.build();
        }

        public final DefStyleRegistry empty() {
            return new DefStyleRegistry(MapsKt.emptyMap(), null);
        }
    }
}
